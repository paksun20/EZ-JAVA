-- ��������(self join)

-- ���������� ���� �ʰԵǸ� ������̺�(emp)�� ���� ���纻�� ����� ������ �ؾ� �Ѵ�.
-- ������ ������̺� ������ �߻��ϰ� �Ǹ� emp_mgr�� ����� ������ �ݿ��ؾ� �ϴ� ���ŷο��� �߻�
-- ���� ���̺��� �����ϴ� ���ŷο��� �߻�
CREATE TABLE emp_mgr AS SELECT * FROM emp;

-- ���(empno)�� �Ŵ���(mgr)
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp_mgr m
WHERE e.mgr = m.empno;

-- ��������
SELECT '[self join]', e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr = m.empno
ORDER BY 2;
