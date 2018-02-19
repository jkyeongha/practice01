package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요 : ");
		
		Scanner scanner = new Scanner( System.in );
		
		int number = scanner.nextInt();
		int sum=0;
		
		if(number%2==0) {
			
			for(int i=1; i<=number; i++) {
				if(i%2==0) {
					sum+=i;
				}
			}
			
		}else {
			
			for(int i=1; i<=number; i++) {
				if(i%2!=0) {
					sum+=i;
				}
			}
			
		}
		
		System.out.println("결과 값 : "+sum);
		
		scanner.close();
	}

}
