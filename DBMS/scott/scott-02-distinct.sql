-- distinct : �ߺ� ������ ����

-- �μ��ڵ�
SELECT deptno FROM emp;

-- �ߺ�����: �÷��� �� ���� ��� �ߺ� ����
SELECT DISTINCT deptno FROM emp;

-- ���� �������� ��� �ߺ� ����
-- job, deptno�� ���ļ� �ߺ��� ����
SELECT job, deptno FROM emp;
SELECT DISTINCT job, deptno FROM emp;
