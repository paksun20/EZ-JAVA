-- ���ƿ��� ������ ��¥�� ���ϴ� �Լ�
-- next_day(��¥������, ���Ϲ���)

-- ���� ��¥�� �������� ���ƿ��� ������ ��¥��?
SELECT sysdate, next_day(sysdate, '�ݿ���') FROM dual;
SELECT sysdate, next_day(sysdate, '������') FROM dual;
SELECT sysdate, next_day(sysdate, '������') FROM dual;

-- ���� ������ ��¥�� ���ϴ� �Լ�
-- last_day(��¥������)
SELECT sysdate, last_day(sysdate) FROM dual;
SELECT '21/10/15', last_day('21/10/15') FROM dual;