/*
 * Java 7
 * try-with-resources
 * try(....)
 * try�� ����� �Ǹ� �ڵ����� ���ҽ��� ����
 * interface AutoCloseable�� ���� ��ü ����
 */
package filecontrol;

public class FileInputStreamExample2 {

	public static void main(String[] args) {
		try(FileInputStream	fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("����ó�� ���ܹ߻�");
		}
		/*
		finally {
			if(fis != null) { // �ʿ����, �ڵ����� fis.close()�� ȣ���
				// fis.close();
				try {
					fis.close();
				}
				catch(Exception e) {
				}
			}
		}
		*/
		
		System.out.println("����ó�� �Ϸ�");
	}
}
