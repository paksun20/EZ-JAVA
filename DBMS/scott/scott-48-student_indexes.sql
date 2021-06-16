/*
[ �ε��� ���� ]
CREATE INDEX �ε����̸� ON ���̺��̸�
(
    �÷��� ASC or DESC,
    �÷��� ASC or DESC,
    ...    
);

ASC  : ��������, �⺻��(default)
DESC : ��������
*/

-- ���� �ε���(single index) : �ϳ��� �÷��� �ε����� ����
-- �л��������̺��� �й�(sno)���� �ε����� ����
CREATE INDEX idx_student_sno ON student(sno);
DROP INDEX idx_student_sno;

-- �����ε���(composite index)
CREATE INDEX idx_student_sno_postcd ON student(sno, postcd);
DROP INDEX idx_student_sno_postcd;

-- �����ε���(unique index) : �ߺ������͸� ������� ����
CREATE UNIQUE INDEX idx_student_sno ON student(sno);
INSERT INTO student (sno, sname) VALUES (1010, 'endless');

----------------------------------------------------------
SELECT * FROM user_indexes;
SELECT * FROM user_ind_columns ORDER BY index_name, column_position;
SELECT * FROM student ORDER BY 1 DESC;
SELECT * FROM student ORDER BY 1 ASC;
SELECT * FROM student ORDER BY hp DESC;


 