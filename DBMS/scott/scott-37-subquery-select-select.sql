-- �������� : SELECT���� SELECT
-- ��Į�� ��������(scalar subquery)
-- SELECT���� �ϳ��� �� ������ ����� ���
-- SELECT�� ����ϴ� ���������� �ݵ�� �ϳ��� ����� ��ȯ�ϵ��� �ؾ� �Ѵ�.

-- �޿����
SELECT grade FROM salgrade;

-- ����� �޿� ���
SELECT e.empno, e.ename, e.sal, s.grade 
FROM emp e, salgrade s
WHERE e.sal BETWEEN s.losal and s.hisal;

SELECT grade FROM salgrade WHERE 800 BETWEEN losal AND hisal;
SELECT grade FROM salgrade WHERE 1300 BETWEEN losal AND hisal;
SELECT grade FROM salgrade WHERE 2000 BETWEEN losal AND hisal;

-- ����
SELECT e.empno, e.ename, e.sal, (SELECT grade FROM salgrade WHERE e.sal BETWEEN losal AND hisal) as salgrade
FROM emp e;

-- ����: ���� ����� ������ �ȵȴ�.
SELECT e.empno, e.ename, e.sal, (SELECT grade FROM salgrade) as salgrade FROM emp e;

-- ����: ���� �÷��� ������ �� ����.
SELECT e.empno, e.ename, e.sal, (SELECT grade, losal, hisal FROM salgrade WHERE e.sal BETWEEN losal AND hisal) as salgrade
FROM emp e;


