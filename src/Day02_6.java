import java.util.Scanner;

public class Day02_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select = 3;
		if(select == 1) {
			System.out.println("select 1");
		} else if(select == 2) {
				System.out.println("select 2");
		} else if(select == 3) {
				System.out.println("select 3");
			} else {
					System.out.println("select Others");
				}
		// 국, 영, 수
		// 평균
		// 평균이 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 나머지 F
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		int avg = total/3;
		boolean check = true;
		if (avg>=90) {
			System.out.println("A");
			check = !check;
		} else if (avg>=80) {
			System.out.println("B");
		} else if (avg>=70) {
			System.out.println("C");
		} else if (avg>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
		if(check) {
			System.out.println("우수상");
		}
		
		boolean c = true;
		if(c) {
			System.out.println("true");
		} else {
			//dead code
			System.out.println("false");
		}
		
		
	}
}

