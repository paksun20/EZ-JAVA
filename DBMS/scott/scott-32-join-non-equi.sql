-- �� ����(non-equi join)
-- ��Ÿ����

-- ��� ���̺�
SELECT * FROM emp;

-- �޿���� ���̺�
SELECT * FROM salgrade;

-- ����� �޿��� ���
SELECT * 
FROM emp e, salgrade s
WHERE e.sal BETWEEN s.losal AND s.hisal;

SELECT * 
FROM emp e, salgrade s
WHERE e.sal >= s.losal  AND e.sal <= s.hisal;

