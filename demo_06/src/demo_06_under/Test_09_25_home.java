package demo_06_under;

public class Test_09_25_home 
{
	public static void main( String[] args )
	{
		Item25.save( item -> {
			item.id( "掛け算" )
				  .name( "税込み価格" )
				  .price( 980 )
				  .tax( 1.1 );
		});
		
	}
	
	
}
