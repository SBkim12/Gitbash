import java.util.Scanner;

public class BJ2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		int[] floor = new int[test];
		int[] room = new int[test];
		for(int i=0; i<test; i++) {
			floor[i] = sc.nextInt();
			room[i] = sc.nextInt();
		}

		for(int i=0; i<test; i++) {
			System.out.println();
		}
	}
}