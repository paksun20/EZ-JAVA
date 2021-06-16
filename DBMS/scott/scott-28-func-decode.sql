-- DECODE �Լ�
-- DECODE(column, ����1, ���1, ����2, ���2, ..., ���N)
-- IF, SWITCH-CASE���� ����

SELECT empno, ename, job, sal FROM emp;

-- ��å�� MANAGER�� ��� : �޿��� 10%�� �λ��� �޿��� ���
-- ��å�� SALESMAN�� ��� : �޿��� 5%�� �λ��� �޿��� ���
-- ��å�� ANALYST�� ��� :  �޿��� 0%�� �λ��� �޿��� ���
-- ��������  :  �޿��� 3%�� �λ��� �޿��� ���

SELECT empno, ename, job, sal,
    DECODE(job, 
        'MANAGER', sal * 1.1,
        'SALESMAN', sal * 1.05,
        'ANALYST', sal, 
        sal * 1.03) as upsal
FROM emp;


