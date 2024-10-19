package demo_07;

import demo_06.Interface;

public class Test_10_17_home
{
  public static void main( String[] args )
  {
	  Calc17 calc = new Calc17(  "Poly-morphis" );
	    calc.process( () -> {
	      System.out.println( "関心事を記述" );
	
	      Interface save = Calc17.create();
	        save.execute();


    });

  } 
}

