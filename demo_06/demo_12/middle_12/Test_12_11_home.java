package middle_12;

import demo_06.Interface;

public class Test_12_11_home
{
  public static void main( String[] args )
  {
    Calc11 calc = new Calc11( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc11.create();
        save.execute();

     });
   }
 }