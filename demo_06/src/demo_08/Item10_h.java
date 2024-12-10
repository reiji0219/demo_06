package demo_08;

import java.util.function.Consumer;
import demo_06.Interface;

public class Item10_h implements Interface
{
  @Override
public void execute(){
    indi( "Labda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc10_h calc;


  public Item10_h id( String id ){
    this.id = id;
    return this;
  }

  public Item10_h name( String name ){
    this.name = name;
    return this;
  }

  public Item10_h price( double price ){
    this.price = price;
    return this;
  }

  public Item10_h tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item10_h calc( Calc10_h calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item10_h> con ){
    Item10_h item = new Item10_h();
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
    return( "Item10_h :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}