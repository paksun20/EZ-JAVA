-- ���̺� ����
-- �л�����(STUDENT)

CREATE TABLE student(
    sno       NUMBER(4),     -- �й�
    sname     VARCHAR2(20),  -- �̸�
    subject   VARCHAR2(20),  -- ����
    handphone VARCHAR2(15),  -- �ڵ�����ȣ
    postcd    CHAR(6),       -- �����ȣ
    address   VARCHAR2(50)   -- ���ּ�
);

DESC student;

SELECT * FROM student;

INSERT INTO student VALUES(1234, '���̴�', '��ǻ�Ͱ���', '010-1234-5678', '123456', null);
INSERT INTO student VALUES(2456, '�̻����', '����', '010-2424-2424', '2424', null);

COMMIT;

SELECT * FROM student WHERE postcd = '2424';
SELECT * FROM student WHERE postcd = '2424  ';

SELECT postcd, length(postcd), lengthb(postcd), sname, length(sname), lengthb(sname) FROM student;
