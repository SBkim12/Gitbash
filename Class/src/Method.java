import java.util.Scanner;

public class Method {
	//무조건 자바 시작할 때 실행되는 첫번째 함수(메서드)
	public static void main(String[] args) {
		
		System.out.println("main함수 호출 시작!!");
		
		Scanner sc = new Scanner(System.in);
		
		int res = sum(sc.nextInt(), sc.nextInt());
		
		System.out.println("sum함수 실행 결과 : " + res);
		
		System.out.println("main함수 호출 끝!!");

	}
	public static int sum(int i1, int i2) {
		System.out.println("sum함수 호출 시작!!");
		
		int sum =0;
		
		for(int i=i1; i<=i2; i++) {
			sum+=1;
		}
		System.out.println("sum함수 호출 끝!!");
	
		return sum;
	}

}
