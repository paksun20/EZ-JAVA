-- Ʈ�����(Transaction)
-- ����: �ϳ��� ������ �۾��� ó���ϱ� ���� ���� �����ǰ� ���ӵ� �����ͺ��̽� ��ɾ��� ����
-- 1. �ϳ��� ������ �۾� ����
-- 2. �ϳ��� �۾� �Ǵ� �����ϰ� �����Ǿ� �ִ� �۾� ������ ���� ���� �� ���� �ּ� ���� ����.
-- 3. Ʈ������� �����ϴ� ����� TCL(Transaction Control Language)
-- 4. �ϳ��� Ʈ������� ���� DML ������� �̷�� ����.
-- 5. Ŀ��(COMMIT)�� ���ؼ� Ʈ������� �Ϸ� �ȴ�.
-- 6. ���(ROLLBACK)�� ���ؼ� ����� SQL(DML)���� ���ó�� �ȴ�.

-- [Ʈ����� 1]--------------------------------------------
-- 1. �ű� �߰�
INSERT INTO dept_temp VALUES(99, 'DBA', 'SEONGNAM');

-- 2. �ڷ� ����
UPDATE dept_temp SET loc = 'SEONGNAM' WHERE deptno = 90;

-- 3. �ڷ� ����
DELETE FROM dept_temp WHERE dname = 'RnD';

-- ������ ����� �۾��� ��� ���
-- �۾��ϱ� ���� ���·� �� ����
ROLLBACK;
COMMIT;
-- [Ʈ����� 1 �Ϸ�]------------------------------------------

-- [Ʈ����� 2 ����]------------------------------------------
INSERT INTO dept_temp VALUES(88, 'SEA', 'SEONGNAM');

-- 2. �ڷ� ����
UPDATE dept_temp SET dname = 'MARKETING' WHERE deptno = 90;

SAVEPOINT tr2;

-- 3. �ڷ� ����
DELETE FROM dept_temp WHERE deptno IN (91,92,93);

ROLLBACK TO tr2;
ROLLBACK;
COMMIT;
-- [Ʈ����� 2 �Ϸ�]------------------------------------------
