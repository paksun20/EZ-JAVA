-- ����� ���� �� ����
SELECT ename, sal, sal + sal + sal + sal + sal + sal + sal + sal + sal + sal + sal + sal + comm, comm FROM emp;
SELECT ename, sal, sal*12+comm, comm FROM emp;

-- �� ��� ����
SELECT ename, sal, sal*12+comm, comm, (sal*12+comm) / 12 FROM emp;


-- �÷��� ��Ī ����(�ѱ�)
SELECT ename, sal, sal*12+comm "������", comm FROM emp;
SELECT ename, sal, sal*12+comm ������, comm FROM emp;
SELECT ename, sal, sal*12+comm as "������", comm FROM emp;
SELECT ename, sal, sal*12+comm as ������, comm FROM emp;

-- �÷��� ��Ī ����(����)
SELECT ename, sal, sal*12+comm "annual", comm FROM emp;
SELECT ename, sal, sal*12+comm annual, comm FROM emp;
SELECT ename, sal, sal*12+comm as "annual", comm FROM emp;
SELECT ename, sal, sal*12+comm as annual, comm FROM emp;


