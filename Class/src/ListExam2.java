import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListExam2 {

	public static void main(String[] args) {
		Set<String> rList = new HashSet<String>();

		rList.add("��ü�������α׷���");
		rList.add("�ϴ�");
		rList.add("MongoDB");

		Iterator<String> it = rList.iterator();
		
		
		
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("��ü�������α׷���")) {
			System.out.println("<" + str + ">");
			}else {
			System.out.println(str);
			}
		}
	}
}