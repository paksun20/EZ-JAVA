-- NULL ó���Լ�
-- nvl : �÷� �Ǵ� �����Ͱ�  NULL�� �ƴϸ� �״�� ��ȯ�ϰ�,  NULL�� ��� ������ �����͸� ��ȯ
-- nvl(������, ��ü��)

-- ���Ǵ� �÷��� NULL�� ������ ����� NULL
SELECT ename, sal, comm, sal + comm FROM emp;

-- nvl
SELECT ename, sal, comm, sal + comm, nvl(comm, 0) comm2, sal + nvl(comm, 0) 
FROM emp;
