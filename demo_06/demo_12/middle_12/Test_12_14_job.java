package middle_12;

import demo_06.Interface;

public class Test_12_14_job
{ 
  public static void main( String[] args )
  { 
    Calc14 calc = new Calc14( "Poly-morphism" );
    calc.process( () -> { 
        System.out.println( "関心事を記述" );

      Interface save = Calc14.create();
        save.execute();
    });
  }
}