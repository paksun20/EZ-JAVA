
package section05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
    		new Student("ȫ�浿", "����", 90),
    		new Student("�����", "����", 80),
    		new Student("ȫ�濵", "����", 90),
    		new Student("ȫ���", "����", 90),
      		new Student("�����", "����", 40),
    		new Student("������", "����", 30)
    		);

    public static double avg(Predicate<Student>Predicate) {
		int count = 0, sum=0;
		for(Student student : list) {
			if(Predicate.test(student)) {
				count++;
				sum+= student.getScore();
			}
		}

		 return (double)sum / count;
	}

    
    
    public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("����������� : " + maleAvg);
		
		double femaleAvg = avg(
				t -> {
					return  t.getSex().equals("����");
				});
		System.out.println("����������� : " + femaleAvg);
		
		double animaleAvg = avg(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getSex().equals("����");	  		
					}
		});
		
		System.out.println("�߼�������� : " + animaleAvg);

	}
	

}
