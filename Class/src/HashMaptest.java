import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMaptest {

	public static void main(String[] args) {
		List<HashMap<String, String>> arr = new ArrayList<>();
		
		HashMap<String, String> pMap = new HashMap<>();
		
		pMap.put("�̸�", "��¹�");
		pMap.put("�ּ�", "��õ");
		pMap.put("����", "23");
		pMap.put("����", "���л�");
		
		arr.add(pMap);
		
		pMap = null;
		
		pMap = new HashMap<>();
		
		pMap.put("�̸�", "��â��");
		pMap.put("�ּ�", "����");
		pMap.put("����", "23");
		pMap.put("����", "���л�");
		
		arr.add(pMap);
		
		pMap = null;
		
		Iterator<HashMap<String, String>> it = arr.iterator();
		while(it.hasNext()) {
			HashMap<String, String> rMap = it.next();
			
			System.out.println(rMap.get("�̸�"));
			System.out.println(rMap.get("�ּ�"));
			System.out.println(rMap.get("����"));
			System.out.println(rMap.get("����"));
			System.out.println();
			pMap = null;
		}

	}

}
