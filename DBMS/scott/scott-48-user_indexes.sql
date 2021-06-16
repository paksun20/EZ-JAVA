-- �ε���(index)
-- ����, ����
-- �ӵ�, ���� �˻�
-- ������ �˻� ���� ���
-- �ε����� ��뿩�� :
--  -> Table Full Scan : ����Ž��, ó������ ������ �˻�
--  -> Index Scan : �ε����� ���ؼ� �˻�
-- �ε��� ���� �����ͺ��̽� ����: USER_INDEXES, USER_IND_COLUMNS

-- [ USER_INDEXES ]
-- ����� ������ ������ �ε��� ����
SELECT * FROM USER_INDEXES;


-- [ USER_IND_COLUMNS ]
-- ����� ������ ������ �ε����� �÷� ����
SELECT * FROM USER_IND_COLUMNS;

SELECT a.index_name, a.table_name, b.column_name
FROM user_indexes a, user_ind_columns b
WHERE a.index_name = b.index_name;




