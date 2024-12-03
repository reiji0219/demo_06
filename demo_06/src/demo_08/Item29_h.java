package demo_08;

import java.util.function.Consumer;
import demo_06.Interface;

public class Item29_h implements Interface
{
  @Override
public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc29_h calc;

  public Item29_h id(String id) {
   this.id = id;
   return this;
  }

  public Item29_h name(String name) {
  this.name = name;
  return this;
  }

  public Item29_h price(double price) {
    this.price = price;
    return this;
  }

  public Item29_h tax(double tax) {
    this.tax = tax;
    return this;
  }

  public Item29_h calc( Calc29_h calc ) {
    this.calc = calc;
    return this;
  }

  public static void save(Consumer<Item29_h> con) {
    Item29_h item = new Item29_h();
    con.accept(item);
    indi("save :" + item);
  }

  public void display(){
    indi( "表示内容 :" + name );

    double calcInTax = calcTax( price, tax );
      indi( "税込み価格は" + calcInTax + "円です" );

    calc.display();
  }

  public static double calcTax( double Price, double tax ){
    return( Price * tax );
  }

  @Override
public String toString() {
    return ("Item29_h :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax);
  }

  public static void indi(String s0) {
    System.out.println(s0);
  }
}