-- ��������: ������ ��������(multi-row subquery)
-- ���� ��� ���� ���� �� ������ ��������
-- ������ ������: in, any, some, all, exists


-- [exists]
-- ���������� ��ȯ�� ���� ����� �ϳ� �̻� �����ϸ� true
-- ���������� ��ȯ�� ���� ����� �������� ������ false
-- ���������� ���������� ���������� ����

-- ����
SELECT deptno, dname FROM dept WHERE deptno = 10;
SELECT * FROM emp
WHERE exists (SELECT deptno, dname FROM dept WHERE deptno = 10);

SELECT deptno, dname FROM dept WHERE deptno = 10;
SELECT * FROM emp
WHERE exists (SELECT deptno, dname FROM dept WHERE deptno = 10)
AND deptno = 10;

-- �������� ����
SELECT deptno, dname FROM dept WHERE deptno = 60;
SELECT * FROM emp
WHERE exists (SELECT deptno, dname FROM dept WHERE deptno = 60);


