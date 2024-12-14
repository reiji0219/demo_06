package upper_12;

import demo_06.Interface;

public class Test_12_07_sec
{
  public static void main( String[] args )
  { 
    Calc07_sec calc = new Calc07_sec( "Poly-morphism" );
    calc.process( () -> { 
      System.out.println( "関心事を記述" );

      Interface save = Calc07_sec.create();
        save.execute();
    });
  }
}
