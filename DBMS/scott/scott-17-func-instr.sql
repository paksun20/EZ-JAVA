-- instr : ���ڿ����� Ư�� ���� ��ġ�� ã�� �Լ�
-- instr(���ڿ�, ã�����¹���, ������ġ, ����)
-- ������ zero(0)
-- ���ʿ� ã�� ������ ��ġ�� ����

SELECT job, instr(job, 'E') FROM emp;
SELECT job, instr(job, 'A') FROM emp;

-- ������ġ
SELECT job, instr(job, 'A'), instr(job, 'A', 3) FROM emp;

-- ������ġ
-- ����: �� ��° ������ ����
-- instr(job, 'A', 1, 2) : ���ڿ��� ó������ �˻��� �Ͽ� �ι�° ������ 'A'�� ��ġ�� �˻�
SELECT job, instr(job, 'A'), instr(job, 'A', 3), instr(job, 'A', 1, 2) FROM emp;

SELECT instr('02-1234-7890', '-', 1, 2) "����",  instr('031-1234-7890', '-', 1, 2) "����" FROM dual;
