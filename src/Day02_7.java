import java.util.Scanner;

public class Day02_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 한 글자를 입력하세요");
		String str = sc.next();
		char ch = str.charAt(0);
		System.out.println(ch);
		
		// 입력된 글자가 대문자인지, 소문자인지, 알파벳이 아닙니다.
		if(ch>=65 && ch<=90) {
			System.out.println(ch + " : 대문자");
		} else if(ch<=122 && ch>=97) {
			System.out.println(ch + " : 소문자");
		} else 
			System.out.println(ch + " : 알파벳이 아닙니다");
		
	
		
		
	}

}
