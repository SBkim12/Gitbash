import java.util.Scanner;

public class BJ10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long hap=1;
		for(int i=1; i<=n; i++) {
			hap*=i;
		}
		System.out.println(hap);
	}
}