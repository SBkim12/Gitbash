import java.util.*;

public class Practice81 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b,c,d;
		int hap;
		
		
		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
		a = sc.nextInt();
		System.out.print("2��° ���ڸ� �Է��ϼ��� : ");
		b = sc.nextInt();
		System.out.print("3��° ���ڸ� �Է��ϼ��� : ");
		c = sc.nextInt();
		System.out.print("4��° ���ڸ� �Է��ϼ��� : ");
		d = sc.nextInt();
		
		hap = a + b+ c+d;
		
		System.out.printf(" �հ� ==> %d \n", hap);
	}

}
