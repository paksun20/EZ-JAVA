/*
 * ����� ���� ���� Ŭ����
 * RuntimeException�� ����ϰ� �Ǹ� ���� ����ó���� ���� ���� Ŭ����
 */
package userexception;

public class UserRuntimeException extends RuntimeException {
	UserRuntimeException() {}
	UserRuntimeException(String message) {
		super(message);
	}
}
