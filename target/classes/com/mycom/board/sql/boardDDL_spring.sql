-- hr ���� board table
--spring���� ����
create table board(
  no number(5) constraint board_no_pk primary key,
  writerName varchar2(60),
  title varchar2(120),
  content varchar2(200)
);

-- board ���̺��� �� ��ȣ �뵵�� ������ ����
create sequence boardno_seq
start with 1
increment by 1
nocache;

--PL/SQL�� FOR�� �̿��ؼ� ���̵����� �Է�
DECLARE
-- �����: ����, TRIGER ��
-- ������ Ÿ�� := �ʱⰪ;
  v_i number :=1;
BEGIN
-- �����
  WHILE v_i<=10
  LOOP
    insert into board(no, writerName, title, content)
    values(boardno_seq.nextval, '�ۼ���'||v_i, '����'||v_i, '����'||v_i);
    v_i := v_i+1;
  END LOOP;
  commit;
END;
/
-- 
select *from board;