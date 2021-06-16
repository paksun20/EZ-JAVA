-- NULL  ó��
-- �������� ���� ����ִ� ����
-- �������� ���� �������� �ʴ� ����
-- * NULL�� ��������� �ϸ� NULL�� �ȴ�.

-- ���ҵ�:  sal * 12
SELECT ename, sal, sal*12 as annsal, comm FROM emp;

-- �Ѽҵ�:  sal * 12 + comm
SELECT ename, sal, sal*12+comm as annsal, comm FROM emp;

-- comm�� null�� ���
SELECT * FROM emp WHERE comm = NULL;   -- �ڷᰡ �˻����� ����
SELECT * FROM emp WHERE comm IS NULL;

-- comm�� null�� �ƴ� ���
SELECT * FROM emp WHERE comm != NULL;   -- �ڷᰡ �˻����� ����
SELECT * FROM emp WHERE comm IS NOT NULL;

-- AND �����ڿ�  IS NULL�� ���� ���
SELECT * FROM emp WHERE comm IS NULL AND sal > null;  -- �ڷᰡ �˻����� ����

-- AND ����:
-- �ǿ���1 AND �ǿ���2
-- true AND true -> true
-- true AND false -> false
-- true AND NULL -> NULL
-- NULL AND NULL -> NULL

-- OR ����:
-- �ǿ���1 OR �ǿ���2
-- true OR true -> true
-- true OR false -> true
-- true OR NULL -> true
-- false OR NULL -> NULL
-- NULL OR false -> NULL
-- NULL OR NULL -> NULL
SELECT * FROM emp WHERE comm IS NULL OR sal >= 5000;
SELECT * FROM emp WHERE comm =  NULL OR sal >= 5000;
SELECT * FROM emp WHERE sal > 5000 OR comm = NULL; 
SELECT * FROM emp WHERE sal >= 5000 OR comm = NULL; 
