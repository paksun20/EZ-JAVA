-- ���� ������
-- ������(INTERSECT)
-- �÷��� ������ Ÿ���� ��ġ�ؾ� ��
-- ���� �� ����Ǵ� �����͸� ����

-- INTERSECT
SELECT empno, ename, sal, deptno FROM emp
INTERSECT
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10;

-- INTERSECT
SELECT empno, ename, sal, deptno FROM emp
INTERSECT
SELECT empno, ename, sal, deptno FROM emp2;

-- INTERSECT
SELECT empno, ename, deptno FROM emp
INTERSECT
SELECT empno, ename, deptno FROM emp2;

-- INTERSECT
SELECT job FROM emp
INTERSECT
SELECT job FROM emp2;



