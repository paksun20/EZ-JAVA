-- ����(order by) : sort

-- ����Ʈ ��������(asc) : ���� ������ ū ������ ����
-- sal �÷��� �������� ������������ ����
SELECT * FROM emp ORDER BY sal;
SELECT * FROM emp ORDER BY sal ASC;

-- ORDER BY���� �÷��� ��� �÷��� �������� ����
-- EMPNO : 1��° �÷�
SELECT * FROM emp ORDER BY 1;

-- ��������(desc) : ū ������ ���� ������ ����
-- sal �÷��� �������� ������������ ����
SELECT * FROM emp ORDER BY sal DESC;

-- ORDER BY���� �÷��� ��� �÷��� �������� ����
-- SAL : 6��° �÷�
SELECT * FROM emp ORDER BY 6 DESC;

-- ORDER BY�� ���� �÷��� ����
SELECT * FROM emp ORDER BY deptno ASC, sal DESC;
SELECT deptno, sal, ename FROM emp ORDER BY deptno ASC, sal DESC;
