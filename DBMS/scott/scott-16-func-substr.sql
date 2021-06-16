-- substr : ���ڿ� ���� �Լ�

-- substr(������, ������ġ, �������)
-- ���ڿ��� ������ 1���� 
-- ������̸� �����ϸ� ���ڿ��� ������
-- ������ġ�� ���̳ʽ�(minus)�� �ְԵǸ� ������ ��ġ���� ����

-- 1��° ��ġ���� 2���� ���ڸ� ����
SELECT job, substr(job, 1, 2) FROM emp;

-- 5��° ��ġ���� 3���� ���ڸ� ����
SELECT job, substr(job, 5, 3) FROM emp;

-- ������̸� ����
-- 5��° ��ġ���� ���ڿ��� ������ ����
SELECT job, substr(job, 5) FROM emp;

-- ������ġ�� minus(-) �� ���
-- ���ڿ� ������ ����
SELECT job, substr(job, -1) FROM emp;
SELECT job, substr(job, -2) FROM emp;
SELECT job, substr(job, -3) FROM emp;
SELECT job, substr(job, -4) FROM emp;

SELECT job, substr(job, -4, 2) FROM emp;

-- ������ġ�� ���ڿ��� length���� ������ null
SELECT job, substr(job, -20) FROM emp; 

-- ��ü�� ����
SELECT job, substr(job, -length(job)) FROM emp; 

