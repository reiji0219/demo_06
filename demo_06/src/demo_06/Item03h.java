package demo_06;

import java.util.function.Consumer;

public class Item03h implements Interface
{
	@Override
	public void execute() {
		indi( "Lambda" );
		
	}
	
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc03h calc;
	
	
	public Item03h id(String id) {
		this.id = id;
		return this;
	}
	public Item03h name(String name) {
		this.name = name;
		return this;
	}
	public Item03h price(double price) {
		this.price = price;
		return this;
	}
	public Item03h tax(double tax) {
		this.tax = tax;
		return this;
	}
	public Item03h calc( Calc03h calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item03h> con ) {
		Item03h item = new Item03h();
		con.accept( item );
		indi( "save :" + item );
	}

	public String getId() {
		return id;
	}
	
	public void display() {
		indi( "表示内容 :" + name );
		
		double calcInTax = calcTax( price, tax );
		indi( "税込み価格は" + calcInTax + "円です" );

		calc.display();
	}

	public static double calcTax( double price, double tax ) {
		return( price * tax );
	}
	
	@Override
	public String toString() {
		return "Item03h [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
}