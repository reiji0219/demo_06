package upper_12;

import java.util.function.Consumer;
import demo_06.Interface;

public class Item01_job implements Interface
{
  @Override
  public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc01_job calc;


  public Item01_job id( String id ){
    this.id = id;
    return this;
  }

  public Item01_job name( String name ){
    this.name = name;
    return this;
  }

  public Item01_job price( double price ){
    this.price = price;
    return this;
  }

  public Item01_job tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item01_job calc( Calc01_job calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item01_job> con ){
    Item01_job item = new Item01_job();
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
    return( "Item01_job :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}