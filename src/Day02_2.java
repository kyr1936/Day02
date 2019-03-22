
public class Day02_2 {
	
	public static void main(String[] args) {
		int num = 1;
		num = num+1;
		System.out.println(num);
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);
		int r = num++; // num을 r에 넣은 다음 ++ 증가시켜라
		System.out.println("num : " + num);
		System.out.println("r : " + r);
		r = ++num;
		System.out.println("num : " + num);
		System.out.println("r : " + r);
		
		System.out.println(num++); //5
		
		num=0;
		num = ++num + num++;
		System.out.println(num);
		
		
		
		
		
		
	}

}
