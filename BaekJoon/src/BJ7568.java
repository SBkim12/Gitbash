import java.util.*;

public class BJ7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		int[] tall = new int[test];
		int[] height = new int[test];
		int[] ans = new int[test];
		for(int i=0; i<test; i++) {
			tall[i] = sc.nextInt();
			height[i] = sc.nextInt();
		}

		for(int i=0; i<test; i++) {
			int level=1;
			for(int j=0; j<test; j++) {
				if(tall[i]<tall[j] && height[i]<height[j]) {
					level++;
				}
			}
			ans[i]=level;
		}
		for(int i=0; i<test; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
