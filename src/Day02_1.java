import java.util.Scanner;

public class Day02_1 {
	
	public static void main(String[] args) {
		int num = 10;
		int num2 = 10;
		System.out.println(num == num2);
		System.out.println(num != num2);
		double d = 10;
		System.out.println(d == num);
		String str1 = "10";
		String str2= "10";
		//System.out.println(str1 == num);
		System.out.println(str1 == str2);
		/* Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		String str3 = sc.next();
		System.out.println(str1 == str3); // String type은 == 사용 XX */
		
		char ch = 'a';
		System.out.println(ch==1);
		
		int n1 = 3;
		int n2 = 5;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(~n1);
		System.out.println(n1 << 2);
		
		
		
		
		
		
		
		
	}

}
