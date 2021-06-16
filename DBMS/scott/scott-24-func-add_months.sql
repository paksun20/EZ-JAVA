-- ��¥ �����͸� �ٷ�� �Լ�
-- sysdate : ���� ��¥
-- add_months :  ���� �ٷ�� �Լ�

-- ���� ��¥
SELECT sysdate FROM dual;
SELECT sysdate, ename FROM emp;

-- ���� ��¥
SELECT sysdate + 1 as tomorrow FROM dual;

-- ���� ��¥
SELECT sysdate - 1 as yesterday FROM dual;

-- ���� ��
SELECT add_months(sysdate, 1) FROM dual;

-- ������
SELECT add_months(sysdate, -1) FROM dual;

-- �Ի� 30���� �������
SELECT  ename, hiredate, add_months(hiredate, 30 * 12) FROM emp;

-- �Ի� 40�� �̸��� �������
SELECT  ename, hiredate, add_months(hiredate, 40 * 12) 
FROM emp 
WHERE add_months(hiredate, 40*12) > sysdate;


-- �Ի� 40�� �̻��� �������
SELECT  ename, hiredate, add_months(hiredate, 40 * 12) 
FROM emp 
WHERE add_months(hiredate, 40*12) <= sysdate;

