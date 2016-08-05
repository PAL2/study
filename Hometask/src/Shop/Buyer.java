package Shop;

import java.util.concurrent.BlockingQueue;

/**
 * Class creates a thread in which the buyer takes cash register, shows a set of
 * goods and frees cash register.
 */
public class Buyer implements Runnable {
	String name;
	BlockingQueue<?> bq;

	public Buyer(BlockingQueue<?> bq, String name) {
		this.name = name;
		this.bq = bq;

		new Thread(this);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		// displays a message that the buyer took cash register
		System.out.println(name + " занял кассу " + Thread.currentThread().getName());
		for (int i = 1; i < Math.random() * 10 + 1; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			// displays a set of the products
			System.out.println(name + " купил " + Goods.getGoods());
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// displays a message that the buyer frees cash register
		System.out.println(name + " освободил кассу " + Thread.currentThread().getName());
	}
}