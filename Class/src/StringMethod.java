
public class StringMethod {

	public static void main(String[] args) {
		String str = " Java ������  Java ȭ����  ";
		String str1 = "Java IT Cook Book";
		System.out.println(str.length());//���ڿ� ���� ���
		System.out.println(str.indexOf("Java"));//���ڰ� ó�� ������ ��ġ�� ã����
		System.out.println(str.lastIndexOf("Java"));//���ڰ� ������ ������ ��ġ�� ã����(Ȯ���� ã���� Ȱ��)
		System.out.println(str.replace("Java", "�ڹ�"));//���ڿ��� �ٲ���
		System.out.println(str.substring(0,4));//�Ϻ� ���ڿ� ����(indexOf�� ���� Ȱ��)
		String[] answer = str.split(" "); //���ڿ� �и��ϴ� ���ø�
		
		System.out.println(str.toUpperCase());//�빮�ڷ� �ٲ�
		System.out.println(str.toLowerCase());//�ҹ��ڷ� �ٲ�
		System.out.println(str.trim());//�յ� ���� ����
		
		System.out.println(str.compareTo(str1));//�ι��ڿ� ��
		System.out.println(str1.contains("Java"));//indexOf�� ���� ���ڰ� ���Դ��� Ȯ��
		
		//equals() -> ���ڿ��� ��� �������� ==
	}

}
