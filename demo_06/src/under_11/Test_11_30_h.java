package under_11;

import demo_06.Interface;

public class Test_11_30_h
{ 
  public static void main( String[] args )
  { 
    Calc30h calc = new Calc30h( "Poly-morphism" );
    calc.process( () -> { 
      System.out.println( "関心事を記述" );

      Interface save = Calc30h.create();
        save.execute();
    });
  }
}

