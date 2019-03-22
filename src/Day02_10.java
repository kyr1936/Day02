import java.util.Scanner;

public class Day02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 급여 입력
		// 1. 정규직  
		//      의료보험 1.2%  고용보험 0.5%  산재보험 0.3%  국민연금 2%
		// 2.계약직
		//		3.3% 0.033
		// 3. 일용직
	    //		소개비 10%
		// 실 급여를 출력
		
		 Scanner sc = new Scanner(System.in);
		 int sal=0; // 급여를 담을 변수
		 int select=0; // 유형을 담을 변수
		 double result = 0.0;
		  System.out.println("급여 입력");
		 sal = sc.nextInt();
		 System.out.println("1.정규직 2.계약직 3.일용직");
		 select = sc.nextInt();
		
		 
		/* switch(select) {
		 case 1: 
			 System.out.println(sal-(int)(sal*0.04) + "원");
			 break;
		 case 2:
			 System.out.println(sal-(int)(sal*0.033) + "원");
			 break;
		 case 3:
			 System.out.println(sal-(int)(sal*0.1)+ "원");
			 break;
		 default:
			
		 }
		*/
		 switch(select) {
		 case 1: 
			 result = sal-(sal*0.04);
			 break;
		 case 2:
			 result = sal-(sal*0.033);
			 break;
		 case 3:
			 result = sal-(sal*0.1);
			 break;
		 default:
			
		 } System.out.println(result +"원");
		
		
		 
		 
		 
		 
		 
		
		
	}

}
