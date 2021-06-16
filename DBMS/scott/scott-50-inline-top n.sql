-- TOP-N
-- ������ ����
-- ��������, inline view, rownum Ȱ���ؼ� ó�� ����

-- ����߿��� �޿��� ���� ���� �޴� ����
SELECT empno, ename, sal FROM emp ORDER BY sal desc;

-- ����߿��� �޿��� ���� ���� �޴� �ֻ��� 5��
SELECT empno, ename, sal FROM emp ORDER BY sal desc;

-- 12c �̻󰡴��ϰ� 11g�� �������� ����
SELECT empno, ename, sal FROM emp ORDER BY sal desc
    FETCH FIRST 5 ROWS ONLY;

-- 11g
-- rownum : ���̺� ����� ���� ��ȸ�� ����(�Ϸù�ȣ)
SELECT rownum, empno, ename, sal FROM emp ORDER BY empno;
SELECT rownum, empno, ename, sal FROM emp ORDER BY sal desc;

-- �ζ��κ�(��������)�� �ϰԵǸ� �ζ��κ�� ���ο� ROWNUM�� �ο�
-- ���������� ������ ������ ROWNUM�� ��ġ
-- ���� �ο��� rownum���� ���ڵ��� ������ ������ �� �ִ�.
-- ����߿��� �޿�(sal)�� ���� ���� �޴� �ֻ��� 5��
SELECT * FROM emp ORDER BY sal desc;

SELECT rownum, empno, ename, sal 
    FROM (SELECT * 
        FROM emp
        ORDER BY sal desc)
    WHERE rownum <= 5;        

-- ���� �ڷ� �˻��� ���ؼ� ���� �˻��� �ڷ��� ������ �ڷḦ ��������
-- ���ο� �˻� ������ �����Ͽ� ���� �ֻ��� 5���� �˻�
-- sal < 3000 : 3000�� ���� �˻��� ������ �޿���
SELECT rownum, e.empno, e.ename, e.sal 
    FROM (SELECT * 
        FROM emp
        WHERE sal < 3000
        ORDER BY sal desc) e
    WHERE rownum <= 5;


    
