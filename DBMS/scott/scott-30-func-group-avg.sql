-- AVG(column)
-- ��հ��� ���ϴ� �Լ�

-- ��ü ����� ��� �޿���?
SELECT avg(sal) FROM emp;

-- �μ��� 30�� ������� ��� �޿���?
SELECT avg(sal) FROM emp WHERE deptno = 30;

-- �ɼ�: distinct, all
-- avg(distinct column) : �ߺ������ʹ� �ϳ��� ����
-- avg(all column) : �ߺ������� �����ؼ� ��� ����
-- avg(column) :  �ߺ������� �����ؼ� ��� ����

-- �μ��� 30�� ������� ��� �޿���? (�ߺ������� ����)
SELECT avg(sal), avg(distinct sal) FROM emp WHERE deptno = 30;
