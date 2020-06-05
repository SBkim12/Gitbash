import java.util.*;

public class BJ2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int n=2;
		int plus=1;
		int ans;
		while(true) {
			if(num==1) {
				System.out.print("1/1");
				break;
			}else if(plus>=num) {
				int res = plus-num;
				n-=1;
				if(n%2==0) {
					System.out.print((n-res)+"/"+(res+1));
					break;
				}else {
					System.out.print((res+1)+"/"+(n-res));
					break;
				}
			}
			plus+=n;
			n++;


		}

	}
}
