package demo_06;

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