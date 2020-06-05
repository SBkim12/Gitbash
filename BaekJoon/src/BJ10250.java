import java.util.Scanner;

public class BJ10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		String pass = sc.nextLine();
		for(int i=0; i<test; i++) {
			String M = sc.nextLine();
			

			String[] d = M.split(" ");

			double a = Double.parseDouble(d[0]);
			int b = Integer.parseInt(d[1]);
			int c = Integer.parseInt(d[2]);

			if(c%a==0) {
				System.out.printf("%d%02d",(int)a,(int)Math.ceil(c/a));
			}
			else {
				System.out.printf("%d%02d",(int)(c%a),(int)Math.ceil(c/a));

			}
		}

	}
}
