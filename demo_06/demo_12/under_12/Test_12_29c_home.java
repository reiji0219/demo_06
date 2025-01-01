package under_12;

import demo_06.Interface;

public class Test_12_29c_home
{
  public static void main( String[] args )
  {
    Calc29c calc = new Calc29c( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc29c.create();
        save.execute();
    });
  }
}

