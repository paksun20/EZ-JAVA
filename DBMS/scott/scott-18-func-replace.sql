-- replace :  ���ڿ��� ��ü(�ٲ�)
-- replace(���ڿ�, ã�¹��ڿ�, ��ü���ڿ�)

SELECT '010-1234-5678' tel, replace('010-1234-5678', '-', '.') telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '.') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '.') as telno from dual;

-- ��ü���ڿ��� ������� ������ ����ȿ��
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', ' ') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '/') as telno from dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '���') as telno from dual;




SELECT ename, replace(ename, 'E', '-') FROM emp;
