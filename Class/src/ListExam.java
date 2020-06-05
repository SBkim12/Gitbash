import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		List<String> rList = new ArrayList<String>();

		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");
		rList.add("바보");

		//배열크긱 출력
		System.out.println("배열의 크기 " + rList.size());	
		for(int i=0; i<rList.size(); i++) {
			System.out.println("[" + i +"]번째 배열 기억공간: " + rList.get(i));
		}
		//List컬렉션을 통해 젖아된 데이터를 가져올때 for문을 쓰지 않고, while문을 쓰길 권장함
	
		Iterator<String> it = rList.iterator();
		System.out.println("<" + it.next() + ">");
		while(it.hasNext()) {
			System.out.println("이름 : "+ it.next());
		
		}
	}
}