-----------------------------------------------------------
-- ��������(sub-query)
-- SELECT�� �ȿ� SELECT ��
-- ���������� ������� ����Ͽ� ��������(main query)�� ����
-- ��������: ���������� �� ���� �ڷ����� ���ƾ� �ϸ� ������ ��ġ�ؾ� �Ѵ�.
-- ��������: ��� �� ���� ���������� ������ ������ ȣȯ �����ؾ� �Ѵ�.
-----------------------------------------------------------
-- [���� ����� �ϳ��� ������ ��������]
-- ũ��: >
-- ũ�ų� ����: >=
-- ����: =
-- �۴�: <
--�۰ų� ����: <=
-- ���� �ʴ�: !=, <>, ^=
-----------------------------------------------------------

-- ��� �̸��� 'JONES' �� ����� �޿�
SELECT ename, sal as "�޿�" FROM emp WHERE ename = 'JONES';

--  JONES ����� �޿�(2975)���� �� ���� �޿��� �޴� ���
SELECT * FROM emp WHERE sal > 2975;

--  JONES ����� �޿�(2975)���� �� ���� �޿��� �޴� ���
-- ����: ���������� �̿��Ͽ� ����� ���
SELECT ename, sal FROM emp
WHERE sal > (SELECT sal 
                        FROM emp 
                        WHERE ename = 'JONES');
                        

-- ��� ���̺���  �̸��� 'ALLEN'�� ����� �߰� ���纸�� ���� �߰� ������ �޴� �������
-- �߰� �ߴ�(EMP.COMM)
SELECT ename, comm FROM emp WHERE ename = 'ALLEN';
SELECT * FROM emp WHERE comm > 300;

SELECT * FROM emp WHERE comm > (SELECT comm FROM emp WHERE ename = 'ALLEN');

-- ������ ���������� ��¥�� ������
--���(MARTIN)���� ���� �Ի��� ��� ���
SELECT ename, hiredate FROM emp WHERE ename = 'MARTIN';
SELECT * FROM emp WHERE hiredate < '81/09/28';
SELECT * 
    FROM emp 
    WHERE hiredate < (SELECT hiredate FROM emp WHERE ename = 'MARTIN');

-- [����1]    
-- �μ��ڵ尡 20�� ���� ��� �� 
-- ��ü ����� ��� �޿����� ���� �޿��� �޴�
-- ��� ������ �Ҽ� �μ� ����    
SELECT *
FROM emp e, dept d
WHERE e.deptno = d.deptno AND e.deptno = 20;

SELECT avg(sal) FROM emp;

SELECT ename, sal, deptno FROM emp ORDER BY deptno,sal;

SELECT e.empno, e.ename, e.sal, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno 
AND e.deptno = 20
AND e.sal > (SELECT avg(sal) FROM emp);


--[����2]
-- ��ü ����� ��� �޿����� �۰ų� ���� �޿��� �ް� �ִ� 
-- 30�� �μ��� ��� �� �μ��� ����
SELECT e.empno, e.ename, e.sal, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno 
AND e.deptno = 30
AND e.sal <= (SELECT avg(sal) FROM emp);


