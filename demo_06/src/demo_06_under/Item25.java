package demo_06_under;

import java.util.function.Consumer;

public class Item25 
{
	private String id;
	private String name;
	private double price;
	private double tax;

	
	public Item25 id(String id) {
		this.id = id;
		return this;
	}
	public Item25 name(String name) {
		this.name = name;
		return this;
	}
	public Item25 price(double price) {
		this.price = price;
		return this;
	}
	public Item25 tax(double tax) {
		this.tax = tax;
		return this;
	}
	
	public static void save( Consumer<Item25> con ) {
		Item25 item = new Item25();
		con.accept(item);
		indi( "save :" + item );
	}

	
	
	
	@Override
	public String toString() {
		return "Item25 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}

	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
