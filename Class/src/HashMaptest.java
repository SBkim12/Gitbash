import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMaptest {

	public static void main(String[] args) {
		List<HashMap<String, String>> arr = new ArrayList<>();
		
		HashMap<String, String> pMap = new HashMap<>();
		
		pMap.put("이름", "김승범");
		pMap.put("주소", "춘천");
		pMap.put("나이", "23");
		pMap.put("직업", "대학생");
		
		arr.add(pMap);
		
		pMap = null;
		
		pMap = new HashMap<>();
		
		pMap.put("이름", "김창영");
		pMap.put("주소", "서울");
		pMap.put("나이", "23");
		pMap.put("직업", "대학생");
		
		arr.add(pMap);
		
		pMap = null;
		
		Iterator<HashMap<String, String>> it = arr.iterator();
		while(it.hasNext()) {
			HashMap<String, String> rMap = it.next();
			
			System.out.println(rMap.get("이름"));
			System.out.println(rMap.get("주소"));
			System.out.println(rMap.get("나이"));
			System.out.println(rMap.get("직업"));
			System.out.println();
			pMap = null;
		}

	}

}
