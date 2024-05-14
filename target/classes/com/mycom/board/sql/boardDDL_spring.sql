-- hr 유저 board table
--spring에서 연동
create table board(
  no number(5) constraint board_no_pk primary key,
  writerName varchar2(60),
  title varchar2(120),
  content varchar2(200)
);

-- board 테이블의 글 번호 용도의 시퀀스 생성
create sequence boardno_seq
start with 1
increment by 1
nocache;

--PL/SQL의 FOR문 이용해서 더미데이터 입력
DECLARE
-- 선언부: 변수, TRIGER 등
-- 변수명 타입 := 초기값;
  v_i number :=1;
BEGIN
-- 실행부
  WHILE v_i<=10
  LOOP
    insert into board(no, writerName, title, content)
    values(boardno_seq.nextval, '작성자'||v_i, '제목'||v_i, '내용'||v_i);
    v_i := v_i+1;
  END LOOP;
  commit;
END;
/
-- 
select *from board;