-- ����(join)

-- īƼ�þ� �����μ�, ũ�ν� ����, ���� ����
SELECT * FROM emp, dept ORDER BY emp.empno, emp.deptno, dept.deptno;

-- �����(equal join), ��������, ��������, �ܼ�����
SELECT * FROM emp, dept WHERE emp.deptno = dept.deptno ORDER BY empno;

-- ���̺� ����
SELECT emp.empno, emp.ename, emp.job, emp.deptno, dept.dname 
FROM emp, dept 
WHERE emp.deptno = dept.deptno 
ORDER BY empno;

-- ���̺��� ��Ī
SELECT e.empno, e.ename, e.job, e.deptno, d.dname 
FROM emp e, dept d 
WHERE e.deptno = d.deptno 
ORDER BY empno;

-- �޿��� 3000 �̸��̸鼭 ���絵 ���� ���
SELECT e.empno, e.ename, e.job, e.deptno, d.dname, e.sal, e.comm
FROM emp e, dept d 
WHERE e.deptno = d.deptno 
AND e.sal < 3000
AND e.comm is null
ORDER BY e.empno;
