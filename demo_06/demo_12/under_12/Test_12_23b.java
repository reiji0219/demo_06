package under_12;

import demo_06.Interface;

public class Test_12_23b
{ 
  public static void main( String[] args )
  { 
    Calc23b calc = new Calc23b( "Poly-morphism" );
    calc.process( () -> { 
      System.out.println( "関心事を記述" );

      Interface save = Calc23b.create();
      	save.execute();
    });
  }
}

