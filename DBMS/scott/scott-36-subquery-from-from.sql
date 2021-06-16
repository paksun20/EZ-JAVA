-- �������� : FROM���� ����ϴ� ��������
-- �ζ��� ��(inline view)
-- ���̺� ��ü�� �ƴ϶� SELECT ���� ���� �Ϻ� �����͸� �����ؼ� ���

-- �μ��� 10�� ����� ����
SELECT e.empno, e.ename, e.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno
AND e.deptno = 10;

--  ��������: �μ��� 10�� ����� ����
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM (SELECT * FROM emp WHERE deptno = 10) e, dept d
WHERE e.deptno = d.deptno;

-- ��������: �μ��� 10�� ����� ����
-- WHERE ���� �ʿ� ����
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM (SELECT * FROM emp WHERE deptno = 10) e, 
            (SELECT * FROM dept WHERE deptno = 10) d;
-- WHERE e.deptno = d.deptno;

-- �ʿ��� �÷��� ����Ͽ� �뷮�� �����ϰ� ������ ���
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM (SELECT empno, ename, deptno FROM emp WHERE deptno = 10) e, 
            (SELECT deptno, dname FROM dept WHERE deptno = 10) d;

-- WITH�� : FROM���� ����� �͵� ����
WITH
e AS (SELECT empno, ename, deptno FROM emp WHERE deptno = 10),
d AS (SELECT deptno, dname FROM dept WHERE deptno = 10)
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM e, d;


-- WITH
-- ��������: �μ��� 10�� ����� ����
WITH
e as (SELECT * FROM emp WHERE deptno = 10)
SELECT e.empno, e.ename, e.deptno, d.deptno, d.dname
FROM e, dept d
WHERE e.deptno = d.deptno;




