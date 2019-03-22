import java.util.Scanner;

public class Day02_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i=0;
		/*		
		System.out.println("몇 번 출력할까요?");
		int count = sc.nextInt();
		for(i=0; i<count; i++) {
			System.out.println(i + "iu");
		}
		*/
		/*
		// 단 수입력 받아 구구단 출력하기
		// 단수 * 숫자 = 결과값
		
		System.out.println("단 수를 입력하세요");
		int dan = sc.nextInt();
		
		for(i=1; i<10; i++) {
			System.out.println(dan +"*"  + i +"=" + dan*i);
		} */
		
		// 1부터 100 사이의 숫자 중에서 
		// 1, 3, 5, 7, 9 ... 출력 (~99)
		// 1. for 문 내에 if 사용하기
		// 2. if를 사용하지 않고 only for문 couninue 사용 xxx
		
		for(i=1; i<=100; i++) {
			if(i%2==1) {
			System.out.println(i);
			}
		}
		
		
		
		for(i=1; i<=100; i=i+2) {   // i+=2
			System.out.println(i);
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
