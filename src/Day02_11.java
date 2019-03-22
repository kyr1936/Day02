import java.util.Scanner;

public class Day02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국 영 수 입력
		// 평균 90점 이상  A , 80 이상 B, 70 이상 C, 60 이상  D 그 외 F
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		
		/* int avg = (kor+eng+math)/3;
		
		int grade = avg/10;
		
		switch(grade) {
		case 10:
		case 9: 
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6: 
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		*/
		int avg = (kor+eng+math)/3;
		String grade = "";
		switch(avg/10) {
		case 10:
		case 9:
			grade ="A";
			break;
		case 8:
			grade ="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade = "D";
			break;
		default :
			grade = "F";
		} System.out.println(grade);
		
				
				
				
				
				
				

	}

}
