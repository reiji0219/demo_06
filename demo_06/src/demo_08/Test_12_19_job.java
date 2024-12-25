package demo_08;

import demo_06.Interface;

public class Test_12_19_job
{
  public static void main( String[] args )
  {
    Calc19 calc = new Calc19( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc19.create();
        save.execute();

     });
   }
 }

