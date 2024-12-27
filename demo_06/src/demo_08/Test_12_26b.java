package demo_08;

import demo_06.Interface;

public class Test_12_26b
{
  public static void main( String[] args )
  {
    Calc26b calc = new Calc26b( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc26b.create();
        save.execute();

     });
   }
 }

