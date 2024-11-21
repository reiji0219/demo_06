package demo_08;

import demo_06.Interface;

public class Test_11_20_home02
{
  public static void main( String[] args )
  {
    Calc20_2 calc = new Calc20_2( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc20_2.create();
        save.execute();

    });
  }
}