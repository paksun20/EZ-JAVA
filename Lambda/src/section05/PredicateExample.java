/*
 * [Predicate �Լ��� �������̽�]
 * - Predicate<T>     : boolean test(T t)
 * - BiPredicate<T,U> : boolean test(T t, U u)
 * - DoublePredicate  : boolean test(double value)
 * - IntPredicate     : boolean test(int value)
 * - LongPredicate    : boolean test(long value)
 */
package section05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", "����", 91),
			new Student("�����", "����", 90),
			new Student("����ġ", "����", 91),
			new Student("���ϳ�", "����", 95),
			new Student("��浿", "����", 92),
			new Student("������", "����", 40),
			new Student("�����", "����", 50)
	);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		
		return (double)sum / count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("�����������:" + maleAvg);

		double femaleAvg = avg(
			(Student t) -> { 
				return t.getSex().equals("����");
		});
		System.out.println("�����������:" + femaleAvg);

		double aniAvg = avg(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getSex().equals("����");
			}
		});
		System.out.println("�����������:" + aniAvg);

	}

}
