import java.util.Scanner;

public class Day02_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("암호화 숫자를 입력하세요");
		int code = sc.nextInt();
		System.out.println("영어 한 글자를 입력하세요");
		String str = sc.next();
		char ch = str.charAt(0);
		
		// a -> c 97 - 122 / 65-90
		// b -> d
		// c -> e
	
		
		int temp = ch+code;
			
		if(temp>122) {
			int count = temp-122;
			count = 96+count;
			ch= (char)(count);
		} else {
			ch= (char)temp;
		} System.out.println(ch);
		
		if(temp>=65 && temp<=97) {
			int count = temp-97;
			ch = (char)(count);
		} else  {
			ch = (char)temp;
		}
			
			
			
		
		
	}

}
