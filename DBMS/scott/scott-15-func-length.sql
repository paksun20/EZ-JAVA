-- length : ���忭 ���� ���ϱ�

SELECT ename, length(ename) FROM emp;

SELECT ename, length(ename) FROM emp WHERE length(ename) = 4;
SELECT ename, length(ename) FROM emp WHERE length(ename) >= 4;
SELECT ename, length(ename) FROM emp WHERE length(ename) <= 5;
SELECT ename, length(ename) FROM emp WHERE length(ename) < 7;

-- dual�� ����Ŭ���� �����ϴ� Ư���� ���̺�
SELECT length('�ѱ�') FROM dual;
SELECT sysdate FROM dual;

SELECT lengthb('�ѱ�'), length('english') FROM dual;
SELECT lengthb('??'), length('english') FROM dual;

SELECT * FROM nls_database_parameters where parameter = 'NLS_CHARACTERSET';

SELECT ename, length(ename), lengthb(ename) FROM emp;
