package Shop;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
	public static void main(String[] args) throws InterruptedException {

		ThreadFactoryBuilder tfb = new ThreadFactoryBuilder();
		tfb.setNameFormat("№%d"); // Assignment pool of threads name
		// The creation of a queue
		BlockingQueue<Buyer> bq = new ArrayBlockingQueue<Buyer>(7);
		// Create a pool with 2 threads
		ExecutorService es = Executors.newFixedThreadPool(2, tfb.build());

		System.out.println("В магазине работает 2 кассы.");

		// Start of threads
		es.execute(new Buyer(bq, "Покупатель №1"));
		Thread.sleep(100);
		es.execute(new Buyer(bq, "Покупатель №2"));
		es.execute(new Buyer(bq, "Покупатель №3"));
		es.execute(new Buyer(bq, "Покупатель №4"));
		es.execute(new Buyer(bq, "Покупатель №5"));
		es.execute(new Buyer(bq, "Покупатель №6"));
		es.execute(new Buyer(bq, "Покупатель №7"));

		es.shutdown(); // Thread pool closing
	}
}
