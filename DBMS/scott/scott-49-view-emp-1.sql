-- ���̺� ��(Table View)
-- ���� ���̺�(Virtual Table)
-- CREATE VIEW ���̸� (�÷�1, �÷�2, ...) AS (SELECT ��);

-- ��� ���̺��� �μ��ڵ尡 30�� ���
SELECT * FROM emp WHERE deptno = 30;

-- ��������
SELECT * 
    FROM (SELECT * FROM emp WHERE deptno = 30);
    
-- ���̺� ��(��������)
CREATE VIEW emp_dept30
AS (SELECT * FROM emp WHERE deptno = 30);

SELECT * FROM emp_dept30;

INSERT INTO emp_dept30 (empno, ename, job, deptno)
    VALUES(9210, 'e9210', 'student', 30);

DELETE FROM emp_dept30 WHERE empno = 9210;
commit;

-- ����(DICT)�� ���� �� Ȯ��
SELECT * FROM USER_VIEWS;

