-- �� ���ڿ� ��ġ�� �Լ�
-- concat(���ڿ�1, ���ڿ�2)
-- ���ڿ�1 +  ���ڿ�2 

-- ����� �̸��� ��ħ
SELECT empno, ename, concat(empno, ename) FROM emp;

-- ��� + '-' + �̸�
SELECT empno, ename, concat(empno, concat('-', ename)) FROM emp;

-- ��� + ':' + �̸�
SELECT empno, ename, concat(empno, concat(':', ename)) FROM emp;

--  ���ڿ� ������ ����(||) : javalang(OR)
SELECT empno, ename, empno || ename FROM emp;
SELECT empno, ename, empno || '-' || ename FROM emp;
SELECT empno, ename, empno || ':' || ename FROM emp;

