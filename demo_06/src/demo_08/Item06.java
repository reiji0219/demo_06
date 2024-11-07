package demo_08;

import java.util.function.Consumer;

import demo_06.Interface;

public class Item06 implements Interface 
{
	@Override
	public void execute() {
		indi("Lambda");
	}

	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc06 calc;

	public Item06 id(String id) {
		this.id = id;
		return this;
	}

	public Item06 name(String name) {
		this.name = name;
		return this;
	}

	public Item06 price(double price) {
		this.price = price;
		return this;
	}

	public Item06 tax(double tax) {
		this.tax = tax;
		return this;
	}

	public Item06 calc(Calc06 calc) {
		this.calc = calc;
		return this;
	}

	public static void save(Consumer<Item06> con) {
		Item06 item = new Item06();
		con.accept(item);
		indi("save" + item);
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

	public String toStirng() {
		return ("Item06 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax);
	}

	public static void indi(String s0) {
		System.out.println(s0);
	}

}