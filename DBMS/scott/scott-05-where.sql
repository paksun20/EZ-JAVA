
-- ��ȸ ���ǽľ��� ��� ���̺��� ������ �˻�
SELECT * FROM emp;

-- ��ȸ ���ǰ˻�: deptno�� 30�� ���� �˻�
SELECT * FROM emp WHERE deptno = 30;

-- �μ��ڵ尡 30�̰� ������ 'SALESMAN'�� ��� : AND
SELECT * FROM emp WHERE deptno = 30 AND JOB = 'SALESMAN';

-- �μ��ڵ尡 30�̰ų� ������ 'SALESMAN'�� ��� : OR
SELECT * FROM emp WHERE deptno = 30 OR JOB = 'SALESMAN';

-- ��������ڸ� �˻� ���ǿ� �ֱ�
-- ���ҵ��� SAL * 12 = 36000
SELECT * FROM emp WHERE (SAL * 12) = 36000;       -- ����                                         
SELECT ENAME, SAL, SAL *12 FROM emp WHERE (sal * 12)  > 36000;  -- ũ��
SELECT ENAME, SAL, SAL *12 FROM emp WHERE (sal * 12)  >= 36000;  -- ũ�ų� ����
SELECT ENAME, SAL, SAL *12 FROM emp WHERE (sal * 12)  < 36000;    -- �۴�
SELECT ENAME, SAL, SAL *12 FROM emp WHERE (sal * 12)  <= 36000;  -- �۰ų� ����

-- ���� �ʴ�. : != , <>, ^=
SELECT sal, sal *12 FROM emp WHERE (sal * 12) != 36000; 
SELECT sal, sal *12 FROM emp WHERE (sal * 12) <> 36000; 
SELECT sal, sal *12 FROM emp WHERE (sal * 12) ^= 36000; 

-- �� ���� ������ : NOT
SELECT * FROM emp WHERE sal = 3000;
SELECT * FROM emp WHERE NOT sal = 3000;
SELECT * FROM emp WHERE sal != 3000;




