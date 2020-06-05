import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapExam3 {

	public static void main(String[] args) {
		List<Map<String, String>> rList = new ArrayList<>();
		Map<String, String> pMap = new HashMap<>();
		
		pMap.put("name", "이협건");
		pMap.put("email", "hglee@");
		pMap.put("dept", "데이터분석과");
		pMap.put("addr", "서울");
		
		rList.add(pMap);
		
		//pMap = null;//반드시 널값으로 메모리르 지워야한다.(변수의 재사용을 위해서)
		
		//pMap = new HashMap<>();
		
		pMap.put("name", "홍길동");
		pMap.put("email", "g.hong@");
		pMap.put("dept", "경기");
		pMap.put("addr", "시작");
		
		rList.add(pMap);
		
		pMap = null;
		
		Iterator<Map<String,String>> it = rList.iterator();
		while(it.hasNext()) {
			Map<String, String> rMap = it.next();
			
			System.out.println("####### 반복 시작!! ##########");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));
		
			rMap = null;
			System.out.println("###### 반복 끝!!! ##########");
			System.out.println();
		}
	}

}
