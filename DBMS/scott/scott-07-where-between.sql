
-- sal ���� 2000���� 3000 ������ ���� �˻�
SELECT * FROM emp WHERE sal >= 2000 AND sal <= 3000;

-- BETWEEN �ּҰ� AND �ִ밪
SELECT * FROM emp WHERE sal  BETWEEN 2000 AND 3000;

-- NOT BETWEEN �ּҰ� AND �ִ밪
SELECT * FROM emp WHERE sal NOT  BETWEEN 2000 AND 3000;