package middle_12;

import demo_06.Interface;

public class Test_12_20_job
{ 
  public static void main( String[] args )
  { 
    Calc20 calc = new Calc20( "Poly-morphism" );
    calc.process( () -> { 
      System.out.println( "関心事を記述" );

      Interface save = Calc20.create();
        save.execute();
    });
  }
}
