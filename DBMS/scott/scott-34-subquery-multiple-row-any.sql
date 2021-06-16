-- ��������: ������ ��������(multi-row subquery)
-- ���� ��� ���� ���� �� ������ ��������
-- ������ ������: in, any, some, all, exists


-- [any, some]
-- ���������� ��ȯ�� ���� ��� �� 
-- ���������� ���ǽ��� ����� ����� �ϳ���  true�̸�
-- �������� ���ǽ���  true�� ��ȯ
-- �񱳿����ڸ� ���: =, >, <, ....

-- �� �μ��� �ְ� �޿���
SELECT max(sal) FROM emp;
SELECT max(sal) FROM emp GROUP BY deptno;
SELECT deptno, max(sal) FROM emp GROUP BY deptno ORDER BY deptno;
SELECT * FROM emp ORDER BY  deptno, sal desc;

-- [any]
-- �� �μ��� �ְ� �޿��� ������ �޿��� �޴� ��� ����
-- ������������ �񱳿�����(=)�� any, some�� in�� ����
SELECT * 
FROM emp
WHERE sal = any (SELECT max(sal) FROM emp GROUP BY deptno);

-- [some]
SELECT * 
FROM emp
WHERE sal = some (SELECT max(sal) FROM emp GROUP BY deptno);

-- [����1] 
-- 30�� �μ� ������� �ִ� �޿����� ���� �޿��� �޴� ��� ����

-- 30�� �μ��� �޿� ����: 950 <= sal >= 2850
SELECT sal FROM emp WHERE deptno = 30 ORDER BY sal desc;

-- 30�� �μ��� �ִ� �޿��� �޴� ������� ���� �޿��� �޴� ��� ��� ����
SELECT * 
FROM emp
WHERE sal < ANY (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

SELECT * 
FROM emp
WHERE sal < SOME (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

-- max() �Լ��� ���
-- 30�� �μ��� �ִ� �޿��� �޴� ����� �޿���
SELECT max(sal) FROM emp WHERE deptno = 30;

SELECT * 
FROM emp
WHERE sal < (SELECT max(sal) FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

-- [����]
-- 30�� �μ��� �ּ� �޿��� �޴� ������� ���� �޿��� �޴� ��� ���
-- any, min
SELECT sal FROM emp WHERE deptno = 30 ORDER BY sal;
SELECT ename, sal FROM emp WHERE sal > 950 ORDER BY sal;

SELECT * 
FROM emp
WHERE sal > ANY (SELECT sal FROM emp WHERE deptno = 30)
ORDER BY sal, empno;

-- min
SELECT min(sal) FROM emp WHERE deptno = 30;
SELECT * 
FROM emp
WHERE sal > (SELECT min(sal) FROM emp WHERE deptno = 30)
ORDER BY sal, empno;
