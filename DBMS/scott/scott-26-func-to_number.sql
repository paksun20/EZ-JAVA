--  ���� �����͸� ���� �����ͷ� ��ȯ�ϴ� �Լ�
-- to_number(���ڿ�������, ��������)

SELECT to_number('12345', '9999999') FROM dual;

SELECT to_number('12,345', '9,999,999') FROM dual;
SELECT to_number('12,345.678', '9,999,999.999') FROM dual;
SELECT to_number('12,345.678', '9,999,999.000') FROM dual;

