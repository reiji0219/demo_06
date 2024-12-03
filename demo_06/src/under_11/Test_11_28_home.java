package under_11;

import demo_06.Interface;

public class Test_11_28_home
{ 
  public static void main( String[] args )
  {
    Calc28 calc = new Calc28( "Poly-morphism" );
    calc.process( () -> { 
     System.out.println( "関心事を記述" );

      Interface save = Calc28.create();
        save.execute();
    });
  }
}
