-- NULL ó���Լ�
-- nvl2 : �÷� �Ǵ� �����Ͱ�  NULL�� ���ȭ �ƴ� ��� ���� ��ü ���� ����
-- nvl2(������, NULL�� �ƴҰܿ� ��ü��, NULL�� ��� ��ü��)

-- nvl2: NULL�̸� 'X', NULL�� �ƴϸ� 'O'
SELECT ename, sal, comm,   nvl2(comm, 'O', 'X') comm2 FROM emp;

-- comm�� NULL�̸� ����� ���� ����
SELECT ename, sal, comm,   nvl2(comm, 'O', 'X') comm2 ,
    nvl2(comm, sal*12+comm, sal*12)
FROM emp;

-- comm�� NULL�̸� �⺻��(10)�� ����
SELECT ename, sal, comm,   nvl2(comm, 'O', 'X') comm2 ,
    nvl2(comm, sal*12+comm, sal*12 + nvl(comm, 10) )
FROM emp;
