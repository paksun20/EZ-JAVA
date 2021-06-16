-- �ܺ�����(outer join)
--    -> ���� �ܺ� ����(left outer join)
--    -> ������ �ܺ� ����(right outer join)
--    -> ���� �ܺ� ����(full outer join)

INSERT INTO emp VALUES(8000, 'Shyun', 'Arch', 1000, to_date('2021-03-30', 'YYYY-MM-DD'),4000, null, 10);

-- ���� �ܺ� ����(left outer join)
-- ���ʿ� �ִ� ����(���̺�) �������� ������ ������ ���� ���� ���
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr = m.empno(+)
ORDER BY e.empno;

-- ������ �ܺ� ����(right outer join)
-- �����ʿ� �ִ� ����(���̺�) �������� ���� ������ ���� ���� ���
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr(+) = m.empno
ORDER BY e.empno;

SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp m, emp e
WHERE m.empno = e.mgr(+)
ORDER BY e.empno;

