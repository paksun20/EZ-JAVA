-- ���� ������
-- ������(MINUS)
-- ������ �ۼ��� SELECT���� ������� ������ �ۼ���  SELECT ���� ����� �� ����� ����
-- �÷��� ������ Ÿ���� ��ġ�ؾ� ��

-- MINUS
SELECT empno, ename, sal, deptno FROM emp
MINUS
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10;

-- MINUS
SELECT empno, ename, sal, deptno FROM emp
MINUS
SELECT empno, ename, sal, deptno FROM emp2;

-- MINUS
SELECT empno, ename, deptno FROM emp
MINUS
SELECT empno, ename, deptno FROM emp2;


