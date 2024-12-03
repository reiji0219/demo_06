package demo_08;

import demo_06.Interface;

public class Test_11_29_home 
{
  public static void main(String[] args) 
  {
    Calc29_h calc = new Calc29_h( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );
      
      Interface save = Calc29_h.create();
      	save.execute();

    });
  }
}
