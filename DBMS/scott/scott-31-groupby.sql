-- GROUP BY
-- ������� ���ϴ� �÷����� ��� ���

-- �μ��� ������� ��� �޿���
SELECT avg(sal) FROM emp WHERE deptno = 10;
SELECT avg(sal) FROM emp WHERE deptno = 20;
SELECT avg(sal) FROM emp WHERE deptno = 30;

-- ���տ�����(������)
-- union all
SELECT avg(sal),  '10' as deptno FROM emp WHERE deptno = 10
UNION ALL
SELECT avg(sal),  '20' as deptno FROM emp WHERE deptno = 20
UNION ALL 
SELECT avg(sal),  '30' as deptno FROM emp WHERE deptno = 30
UNION ALL 
SELECT avg(sal),  '40' as deptno FROM emp WHERE deptno = 40;

-- GROUP BY
-- �μ��� ������� ��� �޿���
SELECT avg(sal), deptno FROM emp GROUP BY deptno;
SELECT deptno, avg(sal) FROM emp GROUP BY deptno;
SELECT deptno, avg(sal) FROM emp GROUP BY deptno ORDER BY deptno;

-- �μ���(deptno), ��å��(job) ��� �޿���, ����(�μ���, ��å��)
SELECT deptno, job, avg(sal) FROM emp GROUP BY deptno, job ORDER BY deptno;

-- ����: �������� job�� GROUP BY�� �÷����� �������� �ʾұ� ����
-- SELECT deptno, job, avg(sal) FROM emp GROUP BY deptno ORDER BY deptno;

-------------------------------------------------------
-- [����1] �μ����� ������� �޿� �Ѿ�
-------------------------------------------------------
SELECT deptno, sum(sal) FROM emp GROUP BY deptno ORDER BY deptno;


-------------------------------------------------------
-- [����2] �μ����� ������� �� 
-------------------------------------------------------
SELECT deptno, count(*) FROM emp GROUP BY deptno ORDER BY deptno;


-------------------------------------------------------
-- [����3] �μ����� ������� ��, �޿��Ѿ�,  ��ձ޿���
-------------------------------------------------------
SELECT deptno, count(*), sum(sal), avg(sal) FROM emp GROUP BY deptno ORDER BY deptno;




