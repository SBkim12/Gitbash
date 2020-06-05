
public class StringMethod {

	public static void main(String[] args) {
		String str = " Java 공부중  Java 화이팅  ";
		String str1 = "Java IT Cook Book";
		System.out.println(str.length());//문자열 길이 출력
		System.out.println(str.indexOf("Java"));//글자가 처음 나오는 위치를 찾아줌
		System.out.println(str.lastIndexOf("Java"));//글자가 마지막 나오는 위치를 찾아줌(확장자 찾을때 활용)
		System.out.println(str.replace("Java", "자바"));//문자열을 바꿔줌
		System.out.println(str.substring(0,4));//일부 문자열 추출(indexOf와 같이 활용)
		String[] answer = str.split(" "); //문자열 분리하는 스플릿
		
		System.out.println(str.toUpperCase());//대문자로 바꿈
		System.out.println(str.toLowerCase());//소문자로 바꿈
		System.out.println(str.trim());//앞뒤 공백 제거
		
		System.out.println(str.compareTo(str1));//두문자열 비교
		System.out.println(str1.contains("Java"));//indexOf로 만든 글자가 나왔는지 확인
		
		//equals() -> 문자열만 사용 나머지는 ==
	}

}
