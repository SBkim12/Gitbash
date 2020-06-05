import java.util.Scanner;


public class BJ11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String pass = sc.nextLine();
		
		String plus = sc.nextLine();
		
		String[] a = plus.split("");
		
		int hap=0;
		for(int i=0; i<n; i++) {
			hap+=Integer.parseInt(a[i]);
		}
		System.out.println(hap);

	}

}
