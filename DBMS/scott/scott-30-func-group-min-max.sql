-- MAX(column) : �ִ밪
-- MIN(column) : �ּڰ�

-- [MAX]
-- ������̺��� ���� �޿��� ���� �޴� ����� �޿�
SELECT max(sal) FROM emp;

-- �μ��ڵ� 30�� ����� ��� ���� �޿��� ���� �޴� ����� �޿�
SELECT max(sal) FROM emp WHERE deptno = 30;

-- ������
SELECT deptno, sal FROM emp ORDER BY 1,2;
SELECT deptno, sal FROM emp WHERE deptno = 30 ORDER BY 1,2;
SELECT deptno, sal FROM emp WHERE deptno = 30 ORDER BY 1,2 desc;

-----------------------------------------------------------
-- [MIN]
-- ������̺��� ���� �޿��� ���� �޴� ����� �޿�
SELECT min(sal) FROM emp;

-- �μ��ڵ� 30�� ����� ��� ���� �޿��� ���� �޴� ����� �޿�
SELECT min(sal) FROM emp WHERE deptno = 30;

-- ������
SELECT deptno, sal FROM emp ORDER BY 1,2;
SELECT deptno, sal FROM emp WHERE deptno = 30 ORDER BY 1,2;
SELECT deptno, sal FROM emp WHERE deptno = 30 ORDER BY 1,2 desc;

-- �μ���ȣ�� 20�� ����� �Ի��� �� ���� ������ �Ի���(hiredate)?
-- min(hiredate)
SELECT min(hiredate) FROM emp WHERE deptno = 20;

-- �μ���ȣ�� 20�� ����� �Ի��� �� �ֱ� �Ի���(hiredate)?
SELECT max(hiredate) FROM emp WHERE deptno = 20;

-- �μ���ȣ�� 20�� ����� �Ի��� �� ���� ������ �Ի��ϰ� �ֱ� �Ի���(hiredate)?
SELECT min(hiredate), max(hiredate) FROM emp WHERE deptno = 20;

