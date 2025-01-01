package under_12;

import demo_06.Interface;

public class Test_12_24b
{
  public static void main( String[] args )
  {
    Calc24b calc = new Calc24b( "Poly-morphism" );
    calc.process( () -> { 
        System.out.println( "関心事を記述" );

      Interface save = Calc24b.create();
        save.execute();
    });
  }
}

