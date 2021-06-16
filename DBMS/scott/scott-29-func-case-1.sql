-- CASE��
-- CASE column
--            WHEN '����1' THEN ���1    
--            WHEN '����2' THEN ���2    
--            WHEN '����3' THEN ���3    
--            ELSE ���4
-- END AS ALIAS

-- ��å�� MANAGER�� ��� : �޿��� 10%�� �λ��� �޿��� ���
-- ��å�� SALESMAN�� ��� : �޿��� 5%�� �λ��� �޿��� ���
-- ��å�� ANALYST�� ��� :  �޿��� 0%�� �λ��� �޿��� ���
-- ��������  :  �޿��� 3%�� �λ��� �޿��� ���

SELECT empno, ename, job, sal,
    CASE job
                WHEN 'MANAGER' THEN sal * 1.1
                WHEN 'SALESMAN' THEN sal * 1.05
                WHEN 'ANALYST' THEN sal
                ELSE sal * 1.03
    END AS upsal
FROM emp;    