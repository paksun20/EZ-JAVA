package remocon;

public class SearcherFinder2Example {

	public static void main(String[] args) {
		SearcherFinder2 sf = new SearcherFinder2();
		sf.find("�˻�����");
		sf.search("���ͳ��ּ�");
		
		Searchable2 s2 = sf;
		s2.search("���ͳ��ּ�2");
		// s2.find("�˻�����2");
		
		Finder finder = sf;
		finder.find("�˻�����2");
		// finder.search("���ͳ��ּ�2");
		
		/*
		 * ������ü�� �������̽� ������ ���� �� �������̽��� ���������� �����ȴ�.
		 * ��) �Ǽ��� -> ������
		 *   ������Ƽ�� Ÿ���� ���� �����ϴ�.
		 *   �Ǽ��� ������ ������ �Ǽ��� ������ ���������� ��ȯ�Ǵ� �Ͱ� ����.
		 */
		int x = (int)3.14f;
		System.out.println("x=" + x);
	}
}
