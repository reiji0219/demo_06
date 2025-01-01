package upper_12;

import demo_06.Interface;

public class Test_12_06_job
{ 
  public static void main( String[] args )
  {
    Calc06 calc = new Calc06( "" );
    calc.process( () -> { 
      System.out.println( "関心事を記述" );

      Interface save = Calc06.create();
        save.execute();
        
    });
  }
}

