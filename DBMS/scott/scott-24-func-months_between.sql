-- �� ��¥ ������ ���� �� ���̸� ���ϴ� �Լ�
-- months_between(��¥������1, ��¥������2)
-- ����� ���� ��

SELECT ename, hiredate, 
    months_between(hiredate, sysdate), 
    months_between(sysdate, hiredate),
    trunc(months_between(sysdate, hiredate))
FROM emp;