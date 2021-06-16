-- ���������� ����� ����

--     
SELECT dname, loc FROM dept_temp WHERE deptno = 60;

-- �������� �÷��� ���������� �����Ͽ� ����
UPDATE dept_temp
    SET (dname, loc) = (SELECT dname, loc FROM dept_temp WHERE deptno = 60)
    WHERE deptno = 80;
    
UPDATE dept_temp
    SET (dname, loc) = (SELECT dname, loc FROM dept_temp WHERE deptno = 50)
    WHERE deptno in (91,92,93,94);

-- �� �÷����� ���������� �����Ͽ� ����
-- �� �÷����� �˻������� �ٸ� �� ���
UPDATE dept_temp
    SET dname = (SELECT dname FROM dept_temp WHERE deptno = 20),
           loc = (SELECT loc FROM dept_temp WHERE deptno = 30)
    WHERE deptno in (95,96);           
    