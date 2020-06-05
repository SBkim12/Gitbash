import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorex {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		
		System.out.println("배열의 크기 : "+ list.size());
		
		Iterator<Integer> answer = list.iterator();
		while(answer.hasNext()) {
			Integer number = answer.next();
			
			System.out.println("숫자 : "+ number);
		}
	}

}
