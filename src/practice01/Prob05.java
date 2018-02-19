package practice01;


public class Prob05 {

	public static void main(String[] args) {
		
		
		
		for(int i=1; i<100; i++) {
			
			String str=String.valueOf(i);
			
			int clap=0;
			
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='3'||str.charAt(j)=='6'||str.charAt(j)=='9') {
					clap++;
				}
			}
			

			if(clap!=0) {
				System.out.print(i+" ");
				for(int c=0; c<clap; c++) {
					System.out.print("짝");
				}
				System.out.println();
			}
			
			
			
		}
		
	}

}
