package under_11;

import demo_06.Interface;

public class Test_11_21_h
{
  public static void main( String[] args )
  {
    Calc21_h calc = new Calc21_h( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc21_h.create();
      	save.execute();
      	
    });
  }
}
