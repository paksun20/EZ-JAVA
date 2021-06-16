-- ���̺� ����(ALTER TABLE)
--------------------------------------------
-- ���̺� �÷��� �߰�(ADD)
-- ALTER TABLE ���̺��̸� ADD �÷��̸� �ڷ���;
--------------------------------------------
-- ���̺� �÷� �̸��� ����(RENAME)
-- ALTER TABLE ���̺��̸� RENAME COLUMN �����÷��� TO ���÷���;
--------------------------------------------
-- ���̺� �÷��� �ڷ��� ����(MODIFY)
-- ALTER TABLE ���̺��̸� MODIFY �÷��� �ڷ���;
--   -> �ڷ����� ũ�⸦ �ø��� ���� ������ ����.
--   -> �ڷ����� ũ�⸦ ���̷��� �÷��� ���� NULL �̾�� �Ѵ�.
--------------------------------------------
-- ���̺� �÷��� ����(DROP)
-- ALTER TABLE ���̺��̸� DROP COLUMN �÷���;
--------------------------------------------


-- �л�����(STUDENT)�� �÷� ����(AGE)�� �߰�
ALTER TABLE student ADD age NUMBER(2);

-- �л�����(STUDENT)�� �÷� �̸����� HANDPHONE -> HP
ALTER TABLE student RENAME COLUMN handphone TO hp;

-- �л�����(STUDENT)�� �÷� ����(AGE)�� �ڷ����� ����(MODIFY)
-- NUMBER(2)-> NUMBER(3)
ALTER TABLE student MODIFY age NUMBER(3);
INSERT INTO student VALUES(1010,'�����','�η���','010-1010-1010',null,null,100);

-- �ڷ����� ũ�⸦ ���̷��� �÷��� ���� NULL �̾�� �Ѵ�.
-- NUMBER(3)-> NUMBER(2)
UPDATE student SET age = null WHERE age is not null;
COMMIT;
ALTER TABLE student MODIFY age NUMBER(2);

DESC student;
SELECT * FROM student;

-- ���̺� �÷��� ����(DROP)
-- ALTER TABLE ���̺��̸� DROP COLUMN �÷���;
ALTER TABLE student DROP COLUMN age;
