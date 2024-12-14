package upper_12;

import java.util.function.Consumer;
import demo_06.Interface;

public class Item06_sec implements Interface {
	@Override
	public void execute() {
		indi("Lambda");

	}

	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc06_sec calc;

	public Item06_sec id(String id) {
		this.id = id;
		return this;
	}

	public Item06_sec name(String name) {
		this.name = name;
		return this;
	}

	public Item06_sec price(double price) {
		this.price = price;
		return this;
	}

	public Item06_sec tax(double tax) {
		this.tax = tax;
		return this;
	}

	public Item06_sec calc(Calc06_sec calc) {
		this.calc = calc;
		return this;
	}

	public static void save(Consumer<Item06_sec> con) {
		Item06_sec item = new Item06_sec();
		con.accept(item);
		indi("save :" + item);
	}

	public String getId() {
		return id;
	}

	public void display() {
		indi("表示内容 :" + name);

		double calcInTax = calcTax(price, tax);
		indi("税込み価格は" + calcInTax + "円です");

		calc.display();
	}

	public static double calcTax(double price, double tax) {
		return (price * tax);
	}

	@Override
	public String toString() {
		return ("Item06_sec" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax);
	}

	public static void indi(String s0) {
		System.out.println(s0);
	}
}