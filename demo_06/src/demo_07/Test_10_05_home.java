package demo_07;

public class Test_10_05_home 
{
	public static void main( String[] args )
	{
		Item05.save( item -> {
			item.id( "表示内容" )
				  .name( "税込み価格" )
				  .price( 980 )
				  .tax( 1.1 );
			
			System.out.println( "掛け算 :" + item.getId());
			
			item.display();
			
		});
		
		
	}
	
}
