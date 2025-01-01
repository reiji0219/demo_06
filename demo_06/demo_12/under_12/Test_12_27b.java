package under_12;

import demo_06.Interface;

public class Test_12_27b
{
  public static void main( String[] args )
  {
    Calc27b calc = new Calc27b( "Poly-morphism" );
    calc.process( () -> {

     Interface save = Calc27b.create();
      save.execute();

    });
  }
}
