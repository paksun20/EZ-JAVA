package school;

public class StudentExample {

	public static void main(String[] args) {
		// Student student = new Student();
		Student student = new Student("�̼���", "010", 45);
		// student.setName("ȫ�浿");
		
		int age = student.getAge();
		String name = student.getName();
		
		System.out.println("> age:" + age);
		System.out.println("> name:" + name);
		
		student.information();
	}

}
