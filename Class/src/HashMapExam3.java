import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapExam3 {

	public static void main(String[] args) {
		List<Map<String, String>> rList = new ArrayList<>();
		Map<String, String> pMap = new HashMap<>();
		
		pMap.put("name", "������");
		pMap.put("email", "hglee@");
		pMap.put("dept", "�����ͺм���");
		pMap.put("addr", "����");
		
		rList.add(pMap);
		
		//pMap = null;//�ݵ�� �ΰ����� �޸𸮸� �������Ѵ�.(������ ������ ���ؼ�)
		
		//pMap = new HashMap<>();
		
		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong@");
		pMap.put("dept", "���");
		pMap.put("addr", "����");
		
		rList.add(pMap);
		
		pMap = null;
		
		Iterator<Map<String,String>> it = rList.iterator();
		while(it.hasNext()) {
			Map<String, String> rMap = it.next();
			
			System.out.println("####### �ݺ� ����!! ##########");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));
		
			rMap = null;
			System.out.println("###### �ݺ� ��!!! ##########");
			System.out.println();
		}
	}

}
