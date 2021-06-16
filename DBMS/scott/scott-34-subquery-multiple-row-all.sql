-- ��������: ������ ��������(multi-row subquery)
-- ���� ��� ���� ���� �� ������ ��������
-- ������ ������: in, any, some, all, exists


-- [all]
-- ���������� ��ȯ�� ���� ����� 
-- ���������� ���ǽ��� ����� ����� ���(all) ������
-- �������� ���ǽ���  true�� ��ȯ
-- �񱳿����ڸ� ���: =, >, <, >=, <=, !=, ...


-- 30�� �μ��� �޿� ����: 950 <= sal >= 2850
SELECT sal FROM emp WHERE deptno = 30 ORDER BY sal;

-- 30�� �μ� ������� �ּ� �޿����� �� ���� �޿��� �޴� ��� ����
SELECT * 
FROM emp
WHERE sal < ALL (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

-- 30�� �μ� ������� �ִ� �޿����� �� ���� �޿��� �޴� ��� ����
SELECT * 
FROM emp
WHERE sal > ALL (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;
