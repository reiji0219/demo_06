package upper_12;

import demo_06.Interface;

public class Test_12_04_job03
{
  public static void main( String[] args )
  {
    Calc03_03 calc = new Calc03_03( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc03_03.create();
        save.execute();

    });
  }
}