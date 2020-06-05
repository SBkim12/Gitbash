import java.util.Scanner;

public class BJ2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		String[] n = line.split(" ");

		double a = Double.parseDouble(n[0]);
		double b = Double.parseDouble(n[1]);
		double c = Double.parseDouble(n[2]);


		if(a>=c) {
			System.out.print(1);
		}else {
			System.out.print((int)Math.ceil((c-a)/(a-b))+1);
		}
	}
}
