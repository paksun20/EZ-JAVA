package section06;

import java.util.Arrays;

public class WildCardExample2 {
	public static void registerCourse(Course<? extends Student> course) {
		System.out.println(course.getName() + "������: " 
				+ Arrays.toString(course.getStudents()));
	}

	public static void registerCourseHighStudent(Course<? super HighStudent> course) {
		System.out.println(course.getName() + "������: " 
				+ Arrays.toString(course.getStudents()));
	}


	public static void main(String[] args) {
		// student();
		// highStudent();
		superHighStudent();		
	}

	public static void student() {
		Course<Student> studentCourse = new Course<Student>("{�л�����}", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		registerCourse(studentCourse);
	}

	public static void highStudent() {
		Course<HighStudent> studentCourse = new Course<HighStudent>("{�л�����}", 5);
		studentCourse.add(new HighStudent("ǳ����"));
		studentCourse.add(new HighStudent("�̸Ű�"));
		studentCourse.add(new HighStudent("�翵��"));
		
		registerCourse(studentCourse);
	}
	
	public static void superHighStudent() {
		Course<Student> studentCourse = new Course<Student>("{�л�����}", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		registerCourseHighStudent(studentCourse);

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("{�л�����}", 5);
		highStudentCourse.add(new HighStudent("ǳ����"));
		highStudentCourse.add(new HighStudent("�̸Ű�"));
		highStudentCourse.add(new HighStudent("�翵��"));
		registerCourseHighStudent(highStudentCourse);
		
		Course<Person> personCourse = new Course<Person>("{�Ϲ��ΰ���}", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		registerCourseHighStudent(personCourse);
		// registerCourse(personCourse);
	}
}
