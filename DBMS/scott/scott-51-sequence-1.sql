-- ������(sequence)
-- ����: ���������� ����Ǵ� �Ϸù�ȣ
/*
CREATE SEQUENCE �������̸�
  INCREMENT BY n      -- ������(�⺻�� 1)
  START WITH n        -- ���۰�(�⺻�� 1)
  MAXVALUE n          -- �ִ밪
  MINVALUE n          -- �ּҰ�
  CYCLE | NOCYCLE     -- �ִ밪�� �������� �� ���۰����� �ٽ� ������ ������ ����
  CACHE n | NOCACHE   -- ������ ��ȣ�� �޸𸮿� �̸� �Ҵ��� ���� ���� �������� ����(�⺻���� 20)
*/

-- ������ ����
CREATE SEQUENCE dept_sequence
    INCREMENT BY 10
    START WITH 10
    MAXVALUE 90
    MINVALUE 0
    CYCLE
    CACHE 2;

-- ������ ����
-- START WITH�� ������ �� ����.
ALTER SEQUENCE dept_sequence
    INCREMENT BY 1
    -- START WITH 10
    MAXVALUE 99
    MINVALUE 0
    NOCYCLE
    CACHE 2;

-- ������ ����    
DROP SEQUENCE dept_sequence;

SELECT * FROM user_sequences;    

-- ������ȣ ����
SELECT dept_sequence.nextval FROM dual;

-- ����� ���� ��ȣ ��ȸ
SELECT dept_sequence.currval FROM dual;

CREATE TABLE DEPT_SEQ AS SELECT * FROM DEPT WHERE 1 <> 1;
SELECT * FROM DEPT_SEQ;
INSERT INTO DEPT_SEQ VALUES(dept_sequence.nextval, 'DBA', 'SEONGNAM');
SELECT * FROM DEPT_SEQ;
