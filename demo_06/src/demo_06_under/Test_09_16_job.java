package demo_06_under;

import demo_06.Interface;

public class Test_09_16_job 
{
    public static void main( String[] args )
    {
    	Calc16 calc = new Calc16( "Poly-morphism" );
    	calc.process( () -> {

    		Interface save = Calc16.create();
    			save.execute();
    		
    		
    	});
    
    }
}