-- ���̺� ��(Table View)
-- ���� ���̺�(Virtual Table)
-- CREATE VIEW ���̸� (�÷�1, �÷�2, ...) AS (SELECT ��);

-- ��� ���̺��� �μ��ڵ尡 30�� ���
SELECT * FROM emp WHERE deptno = 20;

-- ��������
SELECT * 
    FROM (SELECT * FROM emp WHERE deptno = 20);
    
-- ���̺� ��
-- �ɼ�: ������ ����
-- WITH READ ONLY
CREATE VIEW emp_dept20
    AS (SELECT * FROM emp WHERE deptno = 20) WITH READ ONLY;

-- ���̺� �� ����
-- �䰡 ������ �����ϰ� ������ ����
CREATE OR REPLACE VIEW emp_dept20
    AS (SELECT * FROM emp WHERE deptno = 20) WITH READ ONLY;

SELECT * FROM emp_dept20;

-- ����: ORA-42399: cannot perform a DML operation on a read-only view
-- �ɼ� WITH READ ONLY�ν� �Է� �Ұ�
INSERT INTO emp_dept20 (empno, ename, job, deptno)
    VALUES(9220, 'E9220', 'student', 20);

-- ����(DICT)�� ���� �� Ȯ��
SELECT * FROM USER_VIEWS;

-- �� ����
DROP VIEW EMP_DEPT20;

