-- ���� �����͸� ��¥ �����ͷ� ��ȯ �ϴ� �Լ�
-- to_date(���ڿ�, ��¥����)

SELECT to_date('2020-09-07', 'YYYY-MM-DD') FROM dual;
SELECT to_date('2020/09/10', 'YYYY/MM/DD') FROM dual;
SELECT to_date('2020.09.10', 'YYYY.MM.DD') FROM dual;
SELECT to_date('09-07-2021', 'MM-DD-YYYY') FROM dual;