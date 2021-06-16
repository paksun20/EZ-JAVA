-- ���������� �̿��� �Է�
-- ���������� �̿��Ͽ� INSERT�� �ϴ� ��� VALUES������ ����
-- �÷��� ������ ��ġ
-- �÷��� �ڷ����� ��ġ



-- salgrade(1) : 700 ~ 1200
SELECT e.* 
FROM emp e, salgrade s
WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 1;

-- ���(emp2) ���̺� �޿���� salgrade(1) ����� �Է�
INSERT INTO emp2 
    SELECT e.* 
    FROM emp e, salgrade s
    WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 1;

-- ���(emp2) ���̺� �޿���� salgrade(2) ����� �Է�
 SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal 
    FROM emp e, salgrade s
    WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 2;
    
INSERT INTO emp2 (empno, ename, job, mgr, hiredate, sal)
    SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal 
    FROM emp e, salgrade s
    WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 2;

-- ���������� �̿��Ͽ� INSERT�� �ϴ� ��� VALUES������ ����
-- ����: VALUES�� �������� ����
INSERT INTO emp2 (empno, ename, job, mgr, hiredate, sal)
    VALUES(
        SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal
        FROM emp e, salgrade s
        WHERE sal BETWEEN s.losal AND s.hisal AND s.grade = 3
    );
    
SELECT * FROM emp2;    
