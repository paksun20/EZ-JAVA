-- ceil : ������ ���ں��� ū ���� �߿��� ���� ���� ������ ��ȯ
-- floor : ������ ���ں��� ���� ���� �߿��� ���� ū ������ ��ȯ

-- ceil(����)
SELECT ceil(3.14) FROM dual;    -- result: 4
SELECT ceil(-3.14) FROM dual;    -- result:-3
SELECT ceil(3.0) FROM dual;    -- result: 3

-- floor(����)
SELECT floor(3.14) FROM dual;  -- result: 3
SELECT floor(3.0) FROM dual;  -- result: 3
SELECT floor(-3.14) FROM dual;  -- result: -4
