-- to_char(���ڵ�����, ��������)

-- õ ������ ���� ��ȣ ǥ��(,)
SELECT sal, to_char(sal, '999,999') FROM emp;

-- �޷� ǥ��($)
SELECT sal, to_char(sal, '$999,999') FROM emp;

-- ���� ȭ�� ǥ��(L)
SELECT sal, to_char(sal, 'L999,999') FROM emp;

-- �Ҽ���(.)
SELECT sal, to_char(sal, '999.99') FROM emp;

-- ���ڸ��� 0���� ä��
SELECT sal, to_char(sal, '000,999.00') FROM emp;
