import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExam2 {

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
		
		for(int i=0; i<rList.size(); i++) {
		System.out.println(rList.get(i));
		}
	}

}
