package Shop;

import java.util.Random;

/** All goods */
public enum Goods {
	milk("молоко"), beer("пиво"), meat("мясо"), vegetables("овощи"), fruit("фрукты"), bread("хлеб"), butter(
			"масло"), tea("чай"), coffee(
					"кофе"), water("воду"), eggs("яйца"), cookies("печенье"), cake("торт"), candy("конфеты");

	String value;

	Goods(String value) {
		this.value = value;
	}

	// Selects a random product
	public static Goods getGoods() {
		Goods[] goods = Goods.values();
		Random random = new Random();
		int index = random.nextInt(goods.length);
		return goods[index];
	}

	@Override
	public String toString() {
		return value;
	}
}
