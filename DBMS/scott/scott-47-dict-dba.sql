-- ������ ����(Data Dictionary)
-- �����ͺ��̽� ����� ����
-- �����ͺ��̽� ���� ����

SELECT * FROM DICT ORDER BY 1;

-- �����ͺ��̽� ���� ������ ���� �������� ��ü ����
DESC dba_tables;
SELECT * FROM dba_tables;

-- ����� ����
SELECT * FROM dba_users;
SELECT * FROM dba_users WHERE username = 'SCOTT';
