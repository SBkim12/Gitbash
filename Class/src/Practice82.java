import java.util.*;

public class Practice82 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] aa = new int [4];
		int hap;
		
		
		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
		aa[0] = sc.nextInt();
		System.out.print("2��° ���ڸ� �Է��ϼ��� : ");
		aa[1] = sc.nextInt();
		System.out.print("3��° ���ڸ� �Է��ϼ��� : ");
		aa[2] = sc.nextInt();
		System.out.print("4��° ���ڸ� �Է��ϼ��� : ");
		aa[3] = sc.nextInt();
		
		hap = aa[0] + aa[1] + aa[2] + aa[3];
		
		System.out.printf(" �հ� ==> %d \n", hap);
	}

}
