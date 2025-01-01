package middle_11;

import demo_06.Interface;

public class Test_11_20_home03
{
  public static void main( String[] args )
  {
    Calc20_3 calc = new Calc20_3( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc20_3.create();
        save.execute();

    });
  }
}