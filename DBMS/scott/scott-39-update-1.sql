-- �����ϱ� : UPDATE
-- UPDATE ���̺��
--      SET �÷�1=������1,
--              �÷�2=������2,
--              ...
--              �÷�N=������N
--     [ WHERE ����� �࿡ ���� �˻� ���� ]

-- �μ��� ��� ������ ����(SEOUL)�� ����
UPDATE dept_temp SET loc = 'SEOUL';

-- Ʈ����� ���
ROLLBACK;

SELECT * FROM dept_temp;

UPDATE dept_temp
    SET loc = 'SEONGNAM'
    WHERE deptno >= 91 AND deptno <= 94;

COMMIT;

-- dname�� ����ִ� ���� 'TEAM' + �ڽ��� �μ���ȣ�� ����
SELECT deptno, dname, 'TEAM' || deptno
    FROM dept_temp
    WHERE dname IS NULL;

UPDATE dept_temp
    SET dname = 'TEAM' || deptno, 
            loc = 'SEONGNAM'
    WHERE dname IS NULL;
    
-- [����]
-- ���(EMP2)�� �޿��� 1000������ ����� �߰� ������ 50���� ����
SELECT * FROM emp2 WHERE sal <= 1000;

UPDATE emp2
    SET comm = 50
    WHERE sal <= 1000;

    