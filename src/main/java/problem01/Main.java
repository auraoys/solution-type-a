package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		
		String change = Integer.toString(number);
		String comp = "";
		int length = change.length();
		int num = 0;
		
		for(int i = 0 ; i < length ; i++ ) {
			comp=change.substring(i, i+1);
			if(comp.equals("3") || comp.equals("6") || comp.equals("9")
					|| comp == "3" || comp == "6" || comp == "9") {
				num++;
			}
			
		}		
		return num;
	}
}