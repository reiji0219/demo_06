package demo_08;

import demo_06.Interface;

public class Test_12_03_job
{
  public static void main( String[] args )
  {
    Calc03h calc = new Calc03h( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc03h.create();
        save.execute();
    });
  }
}