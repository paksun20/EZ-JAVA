-- GROUP BY
-- HAVING : ����, 
--     -> ��� �׷��� �����ϴ� ���ǽ�
--     ->  GROUP BY���� ����� �׷�ȭ�� ��� �߿��� ��� �ױ��� �����ϴ� ���ǽ�

-- �μ���(deptno), ��å��(job) ��� �޿���, ����(�μ���, ��å��)
SELECT deptno, job, avg(sal) FROM emp GROUP BY deptno, job ORDER BY deptno;

-- �μ���, ��å�� ��� �޿���
-- ����: ��� �޿����� 2000���� ũ�ų� ����.
SELECT deptno, job, avg(sal) 
FROM emp 
GROUP BY deptno, job 
HAVING avg(sal) >= 2000
ORDER BY deptno;

-- ����: ��� �޿����� 2000���� ���� ��
SELECT deptno, job, avg(sal) 
FROM emp 
GROUP BY deptno, job 
HAVING avg(sal) < 2000
ORDER BY deptno;

-- ����: ��� �޿����� 2000���� ���� ��
SELECT deptno, job, avg(sal) 
FROM emp 
GROUP BY deptno, job 
HAVING avg(sal) = 3000
ORDER BY deptno;

-- �׷��� �Լ��� WHERE ���� ����� �� ����.
-- ����: WHERE  avg(sal) >= 3000
SELECT deptno, job, avg(sal) 
FROM emp 
WHERE  avg(sal) >= 3000
GROUP BY deptno, job 
ORDER BY deptno;


-------------------------------------------------------
-- �μ����� ������� ��, �޿��Ѿ�,  ��ձ޿���
-- ����1: �μ�(10,20)
-- ����2: ������� 3������ ���
-------------------------------------------------------
SELECT deptno, count(*), sum(sal), avg(sal) 
FROM emp 
 WHERE deptno IN (10, 20)
-- WHERE deptno = 10 OR deptno = 20
GROUP BY deptno 
HAVING count(*) <= 3
ORDER BY deptno;




