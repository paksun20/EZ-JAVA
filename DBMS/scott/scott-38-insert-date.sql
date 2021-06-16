-- INSERT : DATE TYPE

-- ���̺��� �����ϴµ� �����ʹ� �������� ����
-- TABLE: EMP -> EMP2
CREATE TABLE emp2
    AS  SELECT * FROM emp WHERE 1 != 1;
    
SELECT * FROM emp2;    
    
-- ��¥����: 'YYYY/MM/DD'
INSERT INTO emp2 VALUES (8888, 'Runner', 'Player', 8000, '2021/06/01', 500, 100, 80);    

-- ��¥����: 'YYYY-MM-DD'
INSERT INTO emp2 VALUES (9999, '��ѱ�', '�����', 9000, '1999-09-09', 500, 100, 90);    

-- ��¥����: 'YYYY-MM-DD'
INSERT INTO emp2 VALUES (7777, '����', '����', 7000, '20-01-10', NULL,  NULL, NULL);    

-- ��¥����: 'YYYY-MM-DD'
INSERT INTO emp2 VALUES (1999, '���ػ�', '���ػ�', 9000, '99-09-10', NULL,  NULL, NULL);    

-- ��¥����: 'MM-DD-YYYY'
INSERT INTO emp2 VALUES (2100, '��Ű��', '�߱�', 2000, '10-09-2009', NULL,  NULL, NULL);    -- ����

-- ��¥����: 'MM-DD-YYYY' 
-- TO_DATE(value, format)
INSERT INTO emp2 VALUES (2100, '��Ű��', '�߱�', 2000, TO_DATE('10-15-2009', 'MM-DD-YYYY'), NULL,  NULL, NULL);    

-- SYSDATE : �ý��� ��¥
INSERT INTO emp2 VALUES (3100, '��׷�', '�繫', 3000, SYSDATE, NULL,  NULL, NULL);    

