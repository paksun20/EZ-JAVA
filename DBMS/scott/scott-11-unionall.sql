-- ���տ�����
-- UNION ALL(������)
-- �÷��� ������ �ڷ����� ��ġ
-- �ߺ��Ǵ� �����͵� ��� ���õ�(�ߺ��Ǵ� ���� �������� ����)


-- �ߺ��Ǵ� �����͵� ��� ���õ�
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10 or deptno = 20  -- 6���� ��
UNION ALL
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 20; -- 3���� ��

-- ������ SELECT���� ��� ����
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10
UNION ALL
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 20
UNION
SELECT empno, ename, sal, deptno FROM emp2;


