import java.util.Scanner;

public class pynum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		boolean answer = true;
        int p =0;
        int y =0;
        String[] answers = s.split("");
        for(int i=0; i<answers.length; i++){
            if(answers[i].equalsIgnoreCase("p")){
                p++;
            }else if(answers[i].equalsIgnoreCase("y")){
                y++;
            } 
        }
        System.out.print(p + " " + y);
        if(p!=y) {
        	answer = false;
        }
        System.out.println(answer);
    }
}