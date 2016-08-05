package Shop;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class ThreadFactoryBuilder {
	private String nameFormat = null;
	private ThreadFactory backingThreadFactory = null;

	public ThreadFactoryBuilder() {
	}

	// Sets the naming format to use when naming threads
	public ThreadFactoryBuilder setNameFormat(String nameFormat) {
		this.nameFormat = nameFormat;
		return this;
	}

	/**
	 * Returns a new thread factory using the options supplied during the
	 * building process.
	 */

	public ThreadFactory build() {
		return build(this);
	}

	private static ThreadFactory build(ThreadFactoryBuilder builder) {
		final String nameFormat = builder.nameFormat;
		final ThreadFactory backingThreadFactory = (builder.backingThreadFactory != null) ? builder.backingThreadFactory
				: Executors.defaultThreadFactory();
		final AtomicLong count = (nameFormat != null) ? new AtomicLong(0) : null;
		return new ThreadFactory() {
			@Override
			public Thread newThread(Runnable runnable) {
				Thread thread = backingThreadFactory.newThread(runnable);
				if (nameFormat != null) {
					thread.setName(format(nameFormat, count.getAndIncrement() + 1));
				}
				return thread;
			}
		};
	}

	private static String format(String format, Object... args) {
		return String.format(format, args);
	}
}
