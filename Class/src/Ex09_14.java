import java.util.Scanner;

public class Ex09_14 {
	
	static int cals(int v1, int v2, int op) {
		int result;
		
		switch(op) {
		case 1: result = v1 + v2; break;
		case 2: result = v1 - v2; break;
		case 3: result = v1 * v2; break;
		case 4: result = v1 / v2; break;
		default: result =0;
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int res;
		int oper, a, b;
		
		System.out.printf("����Է� (1:+, 2:-, 3:*, 4:/) : ");
		oper = sc.nextInt();
		
		System.out.printf("ù��° ���ڸ� �Է� : ");
		a = sc.nextInt();
		System.out.printf("ù��° ���ڸ� �Է� : ");
		b = sc.nextInt();
		
		res = cals(a, b, oper);
		
		System.out.printf("��� ����� : %d\n", res);
	}
}