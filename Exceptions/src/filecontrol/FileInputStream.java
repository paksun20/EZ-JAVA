/*
 * throws�� �޼ҵ带 ȣ���� ������ ����ó���� �ϵ��� ����
 */
package filecontrol;

public class FileInputStream implements AutoCloseable {
	private String filename;
	
	public FileInputStream(String filename) {
		this.filename = filename;
	}
	
	public void read() {
		System.out.println(filename + "�� ����");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(filename + "�� ���� $$$$$$");
	}
}
