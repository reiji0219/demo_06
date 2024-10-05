package demo_06_under;

public class Test_09_29_home
{
	public static void main( String[] args ) 
	{
		Item29.save( item -> {
			item.id( "" )
				  .name( "" )
				  .price( 980 )
				  .tax( 1.1 );
			
			
		});
		
		
	}
	
}
