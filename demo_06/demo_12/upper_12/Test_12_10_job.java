package upper_12;

import demo_06.Interface;

public class Test_12_10_job
{
  public static void main( String[] args )
  {
    Calc10_job calc = new Calc10_job( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc10_job.create();
        save.execute();
    });
  }
}