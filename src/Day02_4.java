import java.util.Scanner;

public class Day02_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		if(age>19) {
			System.out.println("성년입니다.");
		
		}
		
		System.out.println("프로그램 종료");
		
		// ex1
		// 기말 시험 졸업
		// 국어, 영어, 수학 입력
		// 평균 >= 90 우등상 수여
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int ex1 = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int ex2 = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int ex3 = sc.nextInt();
		
		int total = (ex1+ex2+ex3);
		int avg = total/3;
		
		if(avg>=90) {
			System.out.println("우등상 수여");
			int num = 100;
			System.out.println(num);
			
			//95점 이상 장학금
			if(avg>=95) {
				System.out.println("장학금 수여");
				}
		} 
			System.out.println("졸업");
		

			
			
			
			
	}
}

		
		
		
		
