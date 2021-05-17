/*
 * Ŭ���� ����(��ŸŬ����)
 * Class
 * - Ŭ������ �̸�, ������ ����, �ʵ� ����, �޼ҵ� ����
 */
package section06.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample3 {

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("section06.classes.Car");

			System.out.println("class name: " + clazz.getName());
			
			System.out.println("[������ ����]");
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			for(Constructor<?> constructor : constructors) {
				System.out.println("Constructor: " + constructor.getName());
				Class<?>[] parameters = constructor.getParameterTypes();
				printParameters(parameters);
			}
			
			System.out.println("[�ʵ� ����]");
			Field[] fields = clazz.getDeclaredFields();
			for(Field field : fields) {
				System.out.println("Field: " + field.getType().getSimpleName() + " " + field.getName());
			}
			
			
			System.out.println("[�޼ҵ� ����]");
			Method[] methods = clazz.getDeclaredMethods();
			for(Method method : methods) {
				System.out.println("Mehdod: " + method.getName());
				Class<?>[] parameters = method.getParameterTypes();
				printParameters(parameters);
				System.out.println();
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SecurityException e) {}
	}
	
	static void printParameters(Class<?>[] parameters) {
		System.out.println("parameters: length=" + parameters.length);
		
		for(int i = 0; i < parameters.length; i++) {
			System.out.println("parameter: " + parameters[i].getName());
		}
	}

}
