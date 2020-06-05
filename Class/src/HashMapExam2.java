import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExam2 {

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
		
		for(int i=0; i<rList.size(); i++) {
		System.out.println(rList.get(i));
		}
	}

}
