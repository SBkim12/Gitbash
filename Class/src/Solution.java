import java.util.Scanner;
public class Solution {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			long n = sc.nextLong();
	        int[] answer = {};
	        String num = Long.toString(n);
	        String[] ans = num.split("");
	        System.out.println(ans.length);
	        for(int i=0; i<ans.length; i++){
	            answer[i]=Integer.parseInt(ans[ans.length-i-1]);
	        }
	        for(int i=0; i<ans.length; i++){
	           System.out.println(answer[i]);
	        }
	    }
	}