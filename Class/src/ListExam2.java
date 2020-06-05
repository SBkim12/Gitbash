import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListExam2 {

	public static void main(String[] args) {
		Set<String> rList = new HashSet<String>();

		rList.add("객체지향프로그래밍");
		rList.add("하늘");
		rList.add("MongoDB");

		Iterator<String> it = rList.iterator();
		
		
		
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("객체지향프로그래밍")) {
			System.out.println("<" + str + ">");
			}else {
			System.out.println(str);
			}
		}
	}
}