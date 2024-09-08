package demo_06;

public class Test_09_07_home 
{
	public static void main( String[] args )
	{
		Item07.save( item -> {
			item.id( "掛け算" )
				  .name( "税込み価格" )
				  .price( 980 )
				  .tax( 1.1 );
			
			System.out.println( "計算式 :" + item.getId());
			
			item.display();
		});
		
		
		
		
		
		
	}
}
