import java.util.Scanner;

public class Day02_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		
		if(score>=60) {
			System.out.println("합격");
		} else {
				System.out.println("불합격");
		}
		
		// 회원가입 시 입력한 정보
		int id = 1234;
		int pw = 5678;
		
		// yId를 입력
		// yPw 입력
		// 로그인 성공 츨력, 로그인 실패
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요.");
		int yId = sc.nextInt();
		System.out.println("pw를 입력하세요.");
		int yPw = sc.nextInt();
		
		/* if(yId==id && yPw==pw)  {	
				System.out.println("로그인 성공");
			} else 
				System.out.println("로그인 실패");
		*/
		
		// 단일 if문
		String result= "실패";
		if(yId==id && yPw==pw) {
			result = "성공";
		}
			System.out.println(result);
	
	}
}
