package demo_08;

import demo_06.Interface;
import java.util.function.Consumer;

public class Item29b implements Interface
{
  @Override
public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc29b calc;


  public Item29b id( String id ){
    this.id = id;
    return this;
  }

  public Item29b name( String name ){
    this.name = name;
    return this;
  }

  public Item29b price( double price ){
    this.price = price;
    return this;
  }


  public Item29b tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item29b calc( Calc29b calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item29b> con ){
    Item29b item = new Item29b();
    con.accept( item );
    indi( "save :" + item );
  }

  public String getId(){
    return id;
  }

  public void display(){
    indi( "表示内容 :" + name );

    double calcInTax = calcTax( price, tax );
      indi( "税込み価格は" + calcInTax + "円です" );

    calc.display();
  }

  public static double calcTax( double price, double tax ){
    return( price * tax );
  }

  @Override
public String toString(){
    return( "Item29b :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}

