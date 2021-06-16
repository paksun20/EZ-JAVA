-- �ڷ��� ��ȯ
-- to_char : ���� �Ǵ� ��¥ �����͸� ���� �����ͷ� ��ȯ
-- to_number : ���� �����͸� ���� �����ͷ� ��ȯ
-- to_date : ���� �����͸� ��¥ �����ͷ� ��ȯ

-- NUMBER + ���ڿ�(����) -> �ڵ�����ȯ�� ���ؼ� ���ڷ� ��ȯ�Ǿ� ���
-- �Ͻ��� �� ��ȯ(IMPLICIT TYPE CONVERSION)
SELECT empno, 
    ename, 
    empno + '88'
FROM emp
WHERE empno = 7902;

-- NUMBER + ���ڿ�(�������°� �ƴ� ���) -> INVALID NUMBER ����
SELECT empno, 
    ename, 
    empno + 'HELLO'
FROM emp
WHERE empno = 7902;

-- ����Ÿ�� + ���ڿ� -> invalid number
-- plus(+)�� ���ؼ� ���ڿ������� �ν��Ͽ� ���� �߻�
SELECT empno, 
    ename, 
    ename + 'HELLO'
FROM emp
WHERE empno = 7902;

-- ����
SELECT empno, 
    ename, 
    empno || 'HELLO'
FROM emp
WHERE empno = 7902;


-- to_char : ���� �Ǵ� ��¥ �����͸� ���� �����ͷ� ��ȯ
SELECT sysdate, to_char(sysdate, 'YYYY/MM/DD') FROM dual;
SELECT sysdate, to_char(sysdate, 'YYYY-MM-DD') FROM dual;
SELECT sysdate, to_char(sysdate, 'YYYY.MM.DD') FROM dual;
SELECT sysdate, to_char(sysdate, 'YYYYMMDD') FROM dual;

SELECT sysdate, to_char(sysdate, 'CC') FROM dual; -- ����

SELECT sysdate, to_char(sysdate, 'YY') FROM dual; -- ����(�� 2�ڸ� ����)
SELECT sysdate, to_char(sysdate, 'YYYY') FROM dual; -- ����(�� 4�ڸ� ����)

SELECT sysdate, to_char(sysdate, 'MM') FROM dual; -- ��(���� 2�ڸ�)
SELECT sysdate, to_char(sysdate, 'MON') FROM dual; -- ��(�� �� �̸� ����)
SELECT sysdate, to_char(sysdate, 'MONTH') FROM dual; -- ��(�� �� �̸� ��ü)

SELECT sysdate, to_char(sysdate, 'DD') FROM dual; -- ��(���� 2�ڸ�)
SELECT sysdate, to_char(sysdate, 'DDD') FROM dual; -- ��(1�� �� ��ĥ, 1~366)

SELECT sysdate, to_char(sysdate, 'DY') FROM dual; -- ����(�� ���� �̸� ����)
SELECT sysdate, to_char(sysdate, 'DAY') FROM dual; -- ����(�� ���� �̸� ��ü)
SELECT sysdate, to_char(sysdate, 'W') FROM dual; -- ����(����  �� ��° ��, 1~5)
SELECT sysdate, to_char(sysdate, 'WW') FROM dual; -- ����(1�� �� �� ��° ��, 1~53)

-- �ð�
SELECT sysdate, to_char(sysdate, 'HH24:MI:SS') FROM dual;  -- ��:��:��
SELECT sysdate, to_char(sysdate, 'AM HH12:MI:SS') FROM dual;  -- ����/���� ��:��:��
SELECT sysdate, to_char(sysdate, 'PM HH12:MI:SS') FROM dual;  -- ����/ȣ�� ��:��:��
SELECT sysdate, to_char(sysdate, 'A.M. HH12:MI:SS') FROM dual;  -- ����/ȣ�� ��:��:��
SELECT sysdate, to_char(sysdate, 'P.M. HH12:MI:SS') FROM dual;  -- ����/ȣ�� ��:��:��
SELECT sysdate, to_char(sysdate, 'HH12:MI:SS AM') FROM dual;  -- ��:��:�� ����/����

SELECT sysdate, to_char(sysdate, 'HH24') FROM dual; -- �ð�(24�ð����� ǥ��)
SELECT sysdate, to_char(sysdate, 'HH12') FROM dual; -- �ð�(12�ð����� ǥ��)
SELECT sysdate, to_char(sysdate, 'HH') FROM dual; -- �ð�(12�ð����� ǥ��)
SELECT sysdate, to_char(sysdate, 'MI') FROM dual; -- ��
SELECT sysdate, to_char(sysdate, 'SS') FROM dual; -- ��



