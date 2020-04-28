create or replace procedure random_question(t in out SYS_REFCURSOR) is
begin
  open t for select * from(select * from question order by dbms_random.value(1,1000))where rownum<10;
end random_question;
/
