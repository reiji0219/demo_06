package under_12;

import demo_06.Interface;

public class Test_12_27_home
{
  public static void main( String[] args )
  {
    Calc27 calc = new Calc27( "Poly-morphism" );
    calc.process( () -> {

    Interface save = Calc27.create();
      save.execute();
    });
  }
}

