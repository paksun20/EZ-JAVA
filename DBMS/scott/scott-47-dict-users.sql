-- ������ ����(Data Dictionary)
-- �����ͺ��̽� ����� ����
-- �����ͺ��̽� ���� ����
DESC DICT;
SELECT * FROM DICT WHERE TABLE_NAME LIKE 'USER_T%' ORDER BY 1;
SELECT * FROM DICT ORDER BY 1;

-- ������ ������� ���̺� ����
DESC USER_TABLES;
SELECT * FROM USER_TABLES;

--����ڰ� ������ ��ü ����
DESC all_tables;
SELECT * FROM all_tables;

SELECT * FROM all_tables WHERE owner IN('SYS', 'SYSTEM');
SELECT * FROM all_tables WHERE owner = 'SCOTT';

-- �����ͺ��̽� ���� ������ ���� ������
-- 'SCOTT' ������ ������ ������ �����ϰ� ���� ����
DESC dba_tables;