-- ���߿� ��������(multiple-column subquery)
-- ���߿�(�÷��� ������ �� ���) ��������, ������ ��������

-- �μ����� ���� �޿��� ���� �޴� ����� �޿���
SELECT max(sal) FROM emp GROUP BY deptno;
SELECT deptno, max(sal) FROM emp GROUP BY deptno;

-- �μ����� ���� �޿��� ���� �޴� ��� ����
SELECT * FROM emp
WHERE sal in (SELECT max(sal) FROM emp GROUP BY deptno);

-- ���� : ���������� �ƴ� ��� ���߿��� ����
-- SELECT * FROM emp WHERE (deptno, sal) in (10, 2850);

-- ���߿� ��������
SELECT * FROM emp
WHERE (deptno, sal) in (SELECT deptno, max(sal) FROM emp GROUP BY deptno);

-- 10(5000), 20(10000), 30(2850)

DESC dual;
SELECT sysdate FROM dual;

-- ���߿� ��������
SELECT 10 as deptno, 5001 as maxsal FROM dual;
SELECT 20 as deptno, 10001 as maxsal FROM dual;
SELECT 30 as deptno,2850 as maxsal FROM dual;

SELECT * FROM emp
WHERE (deptno, sal) in (
    SELECT 10 as deptno, 5001 as maxsal FROM dual
    UNION
    SELECT 20 as deptno, 10001 as maxsal FROM dual
    UNION
    SELECT 30 as deptno,2850 as maxsal FROM dual);
