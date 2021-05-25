
package section05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
    		new Student("홍길동", "남자", 90),
    		new Student("김순희", "남자", 80),
    		new Student("홍길영", "여자", 90),
    		new Student("홍길상", "남자", 90),
      		new Student("고양이", "동물", 40),
    		new Student("강아지", "동물", 30)
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
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자평균점수 : " + maleAvg);
		
		double femaleAvg = avg(
				t -> {
					return  t.getSex().equals("여자");
				});
		System.out.println("여자평균점수 : " + femaleAvg);
		
		double animaleAvg = avg(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getSex().equals("동물");	  		
					}
		});
		
		System.out.println("중성평균점수 : " + animaleAvg);

	}
	

}
