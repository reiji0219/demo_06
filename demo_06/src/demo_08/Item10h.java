package demo_08;

import java.util.function.Consumer;
import demo_06.Interface;

public class Item10h implements Interface
{
	@Override
	public void execute() {
		indi("Lambda");

	}

	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc10h calc;

	public Item10h id(String id) {
		this.id = id;
		return this;
	}

	public Item10h name(String name) {
		this.name = name;
		return this;
	}

	public Item10h price(double price) {
		this.price = price;
		return this;
	}

	public Item10h tax(double tax) {
		this.tax = tax;
		return this;
	}

	public Item10h calc(Calc10h calc) {
		this.calc = calc;
		return this;
	}

	public static void save(Consumer<Item10h> con) {
		Item10h item = new Item10h();
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
		return ("Item10h :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax);
	}

	public static void indi(String s0) {
		System.out.println(s0);
	}
}