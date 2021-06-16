-- COUNT(column)
-- �������� ������ ���ϴ� �Լ�

-- ������̺��� �� �����
SELECT count(*) FROM emp;
SELECT count(empno) FROM emp;
SELECT count(ename) FROM emp;

-- �÷��� null�� �ִ� ���� ������ ���Ե��� ����
SELECT count(comm) FROM emp;
SELECT count(comm) FROM emp WHERE comm is not null;


-- �ɼ�: distinct, all
-- count(distinct column) : �ߺ������ʹ� �ϳ��� ����
-- count(all column) : �ߺ������� �����ؼ� ��� ����
-- count(column) :  �ߺ������� �����ؼ� ��� ����
SELECT count(distinct sal), count(all sal), count(sal) FROM emp;
