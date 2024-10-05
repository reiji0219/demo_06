package demo_06_under;

import java.util.function.Consumer;

public class Item29 
{
	private String id;
	private String name;
	private double price;
	private double tax;
	
	public Item29 id(String id) {
		this.id = id;
		return this;
	}
	public Item29 name(String name) {
		this.name = name;
		return this;
	}
	public Item29 price(double price) {
		this.price = price;
		return this;
	}
	public Item29 tax(double tax) {
		this.tax = tax;
		return this;
	}

	public static void save( Consumer<Item29> con ) {
		Item29 item = new Item29();
		con.accept(item);
		indi( "save :" );
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Item29 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}

	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
}
