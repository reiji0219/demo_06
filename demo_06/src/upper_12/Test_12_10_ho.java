package upper_12;

import demo_06.Interface;

public class Test_12_10_ho
{
  public static void main( String[] args )
  {
    Calc10_h calc = new Calc10_h( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc10_h.create();
        save.execute();
    });
  }
}