package demo_08;

import demo_06.Interface;

public class Test_11_14_home
{
  public static void main( String[] args )
  {
    Calc14 calc = new Calc14( "" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc14.create();
        save.execute();

    });
  }
}
