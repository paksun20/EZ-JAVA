-- CASE�� ���� ������ ���� ���ǽĸ� ����ϱ�
-- CASE
--            WHEN '����1' THEN ���1    
--            WHEN '����2' THEN ���2    
--            WHEN '����3' THEN ���3    
--            ELSE ���4
-- END AS ALIAS

SELECT empno, ename, comm,
    CASE
            WHEN comm is null THEN '�ش���� ����'
            -- WHEN comm = null THEN 'null�̸� ���ǿ� �ɸ� ����'
            WHEN comm = 0 THEN ' �������'
            WHEN comm > 0 THEN '���� : ' || comm
            ELSE '�˼�����'
    END AS comm_text
FROM emp;
            