-- �����ϱ� : DELETE
-- DELETE [FROM]  ���̺��̸�
-- [WHERE ������ �࿡ ���� �˻� ����]

CREATE TABLE DEPT2
    AS SELECT * FROM dept_temp;
    
DELETE FROM dept2;
DELETE dept2;

DELETE FROM dept2
    WHERE deptno = 80;

-- �μ��̸��� 'ACA'�� �����ϴ� �����͸� ����
SELECT * FROM  dept2  WHERE dname LIKE 'ACA%';    
DELETE FROM  dept2  WHERE dname LIKE 'ACA%';

-- ������̺�(EMP3)
-- �޿������ 3����̰� �޿��� 1401~2000 ���̿� �ִ� ���
-- �׸��� �μ���ȣ�� 30�� ����� ����
SELECT * FROM emp e, salgrade s
    WHERE e.sal BETWEEN s.losal AND s.hisal
    AND s.grade = 3
    AND e.deptno = 30;
    
DELETE FROM  emp3
    WHERE empno IN(
        SELECT e.empno FROM emp e, salgrade s
        WHERE e.sal BETWEEN s.losal AND s.hisal
        AND s.grade = 3
        AND e.deptno = 30);

    



