--  �� ������ Ư�� ���ڷ� ä���
-- lpad : ���ʿ� ä���
-- rpad : �����ʿ� ä���

-- ���� ä���
-- lpad(���ڿ�, �ִ�ũ��, ä�﹮��)
SELECT job, lpad(job, 20, '#') FROM emp;
 -- �����̽�(����)���� ä���
SELECT job, lpad(job, 20, ' ') FROM emp;  
SELECT job, lpad(job, 20) FROM emp;  

-- ������ ä���
-- rpad(���ڿ�, �ִ�ũ��, ä�﹮��)
SELECT job, rpad(job, 20, '#') FROM emp;
-- �����̽�(����)���� ä���
SELECT job, rpad(job, 20, ' ') FROM emp;     
SELECT job, rpad(job, 20), length(rpad(job, 20)) FROM emp;     

-- �ֹι�ȣ
SELECT rpad('990101-', 14, '*') as "�ֹι�ȣ" FROM dual;

-- ��ȭ��ȣ
SELECT rpad('010-1234-', 13, '#') as "��ȭ��ȣ" FROM dual;
