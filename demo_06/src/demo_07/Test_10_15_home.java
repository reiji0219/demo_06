package demo_07;

import demo_06.Interface;

public class Test_10_15_home
{
  public static void main( String[] args )
  {
    Calc15 calc = new Calc15( "Poly-morphism" );
    calc.process( () -> {
    	System.out.println( "関心事を記述" );

    	Interface save = Calc15.create();
          save.execute();

    });
  }
}