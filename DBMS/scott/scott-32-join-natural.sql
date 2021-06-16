-- ISO/ANSI: SQL-99

-- �����(��������)
SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno
ORDER BY 1,2;

-- �ڿ�����(natural join)
-- ����� �Ǵ� �� ���̺� �̸��� �ڷ����� ���� �÷�(column)�� �������� ���������� �Ѵ�.
-- deptno�� ������ ������ �����ϹǷ� ���̺� ��Ī(e, d)�� ���̸� �ȵȴ�.
SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc
FROM emp e natural join dept d
ORDER BY 1,2;

-- join ~ using
SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc
FROM emp e join dept d using(deptno)
ORDER BY 1,2;

-- join ~ on
SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc
FROM emp e join dept d on(e.deptno = d.deptno)
ORDER BY e.empno, e.deptno;


--left outer join
SELECT e.empno, e.ename, e.job, e.mgr, m.empno as mgr_empno, m.ename as mgr_ename
FROM emp e left outer join emp m on(e.mgr = m.empno)
ORDER BY e.empno;

--right outer join
SELECT e.empno, e.ename, e.job, e.mgr, m.empno as mgr_empno, m.ename as mgr_ename
FROM emp e right outer join emp m on(e.mgr = m.empno)
ORDER BY e.empno;

--full outer join
SELECT e.empno, e.ename, e.job, e.mgr, m.empno as mgr_empno, m.ename as mgr_ename
FROM emp e full outer join emp m on(e.mgr = m.empno)
ORDER BY e.empno;
