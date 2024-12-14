package upper_12;

import demo_06.Interface;

public class Test_12_04_job02
{
  public static void main( String[] args )
  {
    Calc04j calc = new Calc04j( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc04j.create();
        save.execute();
    });
  }
}