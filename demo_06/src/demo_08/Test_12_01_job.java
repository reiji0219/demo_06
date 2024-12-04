package demo_08;

import demo_06.Interface;

public class Test_12_01_job
{
  public static void main( String[] args )
  {
    Calc01_job calc = new Calc01_job( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc01_job.create();
        save.execute();

    });
  }
}