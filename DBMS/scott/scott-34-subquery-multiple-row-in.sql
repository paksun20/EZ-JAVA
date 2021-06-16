-- ��������: ������ ��������(multi-row subquery)
-- ���� ��� ���� ���� �� ������ ��������
-- ������ ������: in, any, some, all, exists


-- [in]
-- or �������� in �ȿ� ������ �ϳ��� �����Ѵ� ��
SELECT * FROM emp WHERE deptno in(10,20,30,50) ORDER BY deptno;

-- �� �μ��� �ְ� �޿���
SELECT max(sal) FROM emp;
SELECT max(sal) FROM emp GROUP BY deptno;
SELECT deptno, max(sal) FROM emp GROUP BY deptno ORDER BY deptno;
SELECT * FROM emp ORDER BY  deptno, sal desc;

-- �� �μ��� �ְ� �޿��� ������ �޿��� �޴� ��� ����
SELECT * 
FROM emp
WHERE sal in (SELECT max(sal) FROM emp GROUP BY deptno);

-- �� �μ��� ���� �޿��� ������ �޿��� �޴� ��� ����
SELECT * 
FROM emp
WHERE sal in (SELECT min(sal) FROM emp GROUP BY deptno);


