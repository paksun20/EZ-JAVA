-- ���̺��� ������ ����
-- TRUNCATE TABLE ���̺��;
-- 1. TRUNCATE�� DDL ������� ��� ����
-- 2. ������ �����͸� ������ �� ����.

-- ������ ����: DELETE DML�� ROLLBACK ���� 
SELECT * FROM student;
DELETE FROM student;
ROLLBACK;

-- TRUNCATE�� DDL�� ��� �Ұ�
TRUNCATE TABLE student2;
ROLLBACK;