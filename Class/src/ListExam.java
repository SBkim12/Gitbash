import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		List<String> rList = new ArrayList<String>();

		rList.add("������");
		rList.add("ȫ�浿");
		rList.add("�Ӳ���");
		rList.add("��浿");
		rList.add("�ٺ�");

		//�迭ũ�� ���
		System.out.println("�迭�� ũ�� " + rList.size());	
		for(int i=0; i<rList.size(); i++) {
			System.out.println("[" + i +"]��° �迭 ������: " + rList.get(i));
		}
		//List�÷����� ���� ���Ƶ� �����͸� �����ö� for���� ���� �ʰ�, while���� ���� ������
	
		Iterator<String> it = rList.iterator();
		System.out.println("<" + it.next() + ">");
		while(it.hasNext()) {
			System.out.println("�̸� : "+ it.next());
		
		}
	}
}