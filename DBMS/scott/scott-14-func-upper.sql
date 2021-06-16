-- ����Ŭ �����Լ�(Built-in function)
-- ������ �Լ�(single-row function) :  �����Ͱ� �� �྿ �Էµǰ� �Էµ� �� ��� ����� �ϳ��� ������ �Լ�
-- ������ �Լ�(multiple-row function) : �����Ͱ� ���� �࿡ �ԷµǾ� �ϳ��� ������ ����� ��ȯ�Ǵ� �Լ�

-- �����Լ�(String)
-- ��.�ҹ��� �ٲٴ� �Լ�
-- upper : �����͸� �빮�ڷ� ��ȯ
-- lower : �����͸� �ҹ��ڷ� ��ȯ
-- initcap : ù ���ڴ� �빮��, �������� �ҹ��� ��ȯ

SELECT ename,  upper(ename), lower(ename), initcap(ename) FROM emp;

SELECT ename,  upper(ename) ename_upper, lower(ename) ename_lower, initcap(ename) ename_initcap FROM emp;

SELECT * FROM emp WHERE  ename = 'JAMES';

SELECT * FROM emp WHERE  ename = 'james';

SELECT * FROM emp WHERE  ename = upper('james');

SELECT * FROM emp WHERE  upper(ename) = upper('James'); -- �����(���ɿ� ����)

SELECT * FROM emp WHERE  ename LIKE upper('%ame%');


