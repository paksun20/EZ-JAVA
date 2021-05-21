package section06;

import java.util.Arrays;

public class WildCardExample3 {
	public static void registerCourse(Course<? super Worker> course) {
		System.out.println(course.getName() + "������: " 
				+ Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("{�Ϲ��ΰ���}", 5);
		personCourse.add(new Person("�Ϲ���"));
		registerCourse(personCourse);
		
		Course<Worker> workerCourse = new Course<Worker>("{�����ΰ���}", 5);
		// workerCourse.add(new Person("������"));
		workerCourse.add(new Worker("������"));
		registerCourse(workerCourse);
	}

}
