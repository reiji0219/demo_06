package demo_07;

import demo_06.Interface;

public class Test_10_09_home
{
  public static void main( String[] args )
  {
    Calc09 calc = new Calc09( "Poly-morphis" );
      calc.process( () -> {

      Interface save = Calc09.create();
        save.execute();

    });
  }
} 