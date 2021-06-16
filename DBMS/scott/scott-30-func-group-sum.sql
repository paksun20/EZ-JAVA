-- ������ �׷�ȭ �Լ�
-- SUM : �������� ��
-- COUNT : �������� ����
-- MAX : ������ �� �ִ�
-- MIN : ������ �� �ּڰ�
-- AVG : �������� ��հ�

-- sum(column)
-- ��ü ����� �޿� �Ѿ�
SELECT sum(sal) FROM emp;

-- �� �μ��� �޿� �Ѿ�
SELECT sum(sal) FROM emp WHERE deptno = 10;
SELECT sum(sal) FROM emp WHERE deptno = 20;
SELECT sum(sal) FROM emp WHERE deptno = 30;

-- sum(distinct column) : �ߺ������ʹ� �ϳ��� ����
-- sum(all column) : �ߺ������� �����ؼ� ��� ����
-- sum(column) :  �ߺ������� �����ؼ� ��� ����
SELECT sum(distinct sal), sum(all sal), sum(sal) FROM emp;

SELECT sal FROM emp ORDER BY sal;

-- [����] ������̺�(emp)���� ��� ������� ���ؼ� �޿��� �߰� ������ �հ踦 ���϶�.
SELECT sum(sal) as sal, sum(comm) as comm, sum(sal) + sum(comm) as salcomm  FROM emp;


