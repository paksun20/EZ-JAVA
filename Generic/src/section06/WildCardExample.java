package section06;

import java.util.Arrays;

public class WildCardExample {
	/*
	public static <T> void registerCourse(Course<T> course) {
		System.out.println(course.getName() + "������: " 
				+ Arrays.toString(course.getStudents()));
	}
	*/

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "������: " 
				+ Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		person();
		worker();
		student();
	}
	
	public static void person() {
		Course<Person> personCourse = new Course<Person>("{�Ϲ��ΰ���}", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);
	}

	public static void worker() {
		Course<Worker> personCourse = new Course<Worker>("{�����ΰ���}", 5);
		personCourse.add(new Worker("������"));
		personCourse.add(new Worker("ȸ���"));
		
		registerCourse(personCourse);
	}

	public static void student() {
		Course<Student> personCourse = new Course<Student>("{�л�����}", 5);
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);
	}

}
