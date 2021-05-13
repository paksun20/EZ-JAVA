package filecontrol;

public class FileInputStreamExample {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("file.txt");
			fis.read();
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("����ó�� ���ܹ߻�");
		}
		finally { 
			if(fis != null) { // Java 6
				// fis.close();
				try {
					fis.close();
				}
				catch(Exception e) {
				}
			}
		}
		
		System.out.println("����ó�� �Ϸ�");
	}
}
