import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorex {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<100; i++) {
			list.add(i);
		}
		
		System.out.println("�迭�� ũ�� : "+ list.size());
		
		Iterator<Integer> answer = list.iterator();
		while(answer.hasNext()) {
			Integer number = answer.next();
			
			System.out.println("���� : "+ number);
		}
	}

}
