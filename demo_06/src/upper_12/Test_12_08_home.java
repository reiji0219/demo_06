package upper_12;

import demo_06.Interface;

public class Test_12_08_home
{
  public static void main( String[] args )
  {
    Calc08h calc = new Calc08h( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc08h.create();
        save.execute();

    });
  }
}

