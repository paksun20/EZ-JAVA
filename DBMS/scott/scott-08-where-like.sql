-- LIKE �����ڿ� ���ϵ� ī��

SELECT * FROM emp WHERE ename LIKE 'S%';
SELECT * FROM emp WHERE ename LIKE 'M%';

-- Underscore(_) : ������ ���ڿ� ��ġ
SELECT * FROM emp WHERE ename LIKE '_L%';

-- %STRING%
SELECT * FROM emp WHERE ename LIKE '%AM%';

-- NOT LIKE %STRING%
SELECT * FROM emp WHERE ename NOT LIKE '%AM%';
