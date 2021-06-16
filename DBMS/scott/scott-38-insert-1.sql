-- DML(Data Manipulation Language)
-- ������ ���۾�: ������ �˻�, �߰�, ����, ����

-- ������ �߰�(INSERT)
-- INSERT INTO  ���̺��̸� [ (�÷�1, �÷�2, ... �ø�N) ] VALUES ( ������1, ������2, ... ������N);
-- �÷��� ��õǸ� �����ʹ� �÷��� ������ �����Ͽ� ����Ǿ�� �Ѵ�.
-- �÷��� ��õ��� ������ ���̺� ���ǵ� ��� �÷��� �ش��ϴ� �����Ͱ� ����Ǿ�� �Ѵ�.

-- �ӽ� ���̺� ����
CREATE TABLE  DEPT_TEMP AS SELECT * FROM DEPT;

-- �÷��� ������� ����
INSERT INTO dept_temp VALUES (50, 'ACADEMY', 'SEONGNAM');

-- �÷� �̸��� ���
INSERT INTO dept_temp (deptno, dname, loc) VALUES (60, 'RnD', 'SEOUL');
INSERT INTO dept_temp (deptno, dname) VALUES (70, 'MARKETING');

-- ���ڿ��� ���ڷ� ��ȯ�� �� ������ �Է� ����
INSERT INTO dept_temp (deptno, dname, loc) VALUES ('90', 'TELE-MARKETING', 'DAEJEON');

-- TO_NUMBER �Լ��� �̿��Ͽ� ���ڿ��� ���ڷ� ��ȯ�ؼ� �Է�
INSERT INTO dept_temp (deptno, dname, loc) VALUES (TO_NUMBER('91', '99'),  'TEAM91', 'LOC91');

-- ����:���ڿ��� ���ڷ� ��ȯ�� �� ������ ����
INSERT INTO dept_temp (deptno, dname, loc) VALUES ('XY', 'XY-TEAM', 'XY-LOC');
INSERT INTO dept_temp (deptno, dname, loc) VALUES (TO_NUMBER('XY', '99'), 'XY-TEAM', 'XY-LOC');

-- ����: �÷��� ���� ��ġ���� ������ ����
INSERT INTO dept_temp (deptno, dname, loc) VALUES (80, 'MARKETING');
INSERT INTO dept_temp (deptno, dname) VALUES (80, 'MARKETING', 'BUSAN');

-- ����: ���ǵ� �÷��� �ڷ����� ũ�⺸�� ũ��.
INSERT INTO dept_temp (deptno, dname) VALUES (123, 'TEAM123', 'LOC123');



-- ����: PRIMARY KEY�� �����Ǿ� �ִ� ���� �ߺ�
INSERT INTO dept (deptno, dname, loc) VALUES (40, 'MARKETING', 'BUSAN');

-- ��ȸ
SELECT * FROM dept_temp;

-- NULL ������
-- VALUES ��Ͽ� �����͸� ������� ������ �ش��ϴ� �÷��� ���� NULL�� ó��(�÷� LOC)
INSERT INTO dept_temp (deptno, dname) VALUES (92, 'TEAM92');
INSERT INTO dept_temp (deptno, dname, loc) VALUES (95, NULL, 'DAEGU');
INSERT INTO dept_temp (deptno, loc) VALUES (96, 'ULSAN');

-- �÷��� ����ϸ� VALUES ��Ͽ� NULL�� ���(�÷� LOC)
INSERT INTO dept_temp (deptno, dname, loc) VALUES (93, 'TEAM93', NULL);

-- �÷��� ����ϸ� VALUES ��Ͽ� ��Ʈ��('')�� ���(�÷� LOC)
INSERT INTO dept_temp (deptno, dname, loc) VALUES (94, 'TEAM94', '');

