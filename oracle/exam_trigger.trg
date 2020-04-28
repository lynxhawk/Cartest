create or replace trigger exam_trigger
  before insert
  on  paper
  for each row
begin
   select exam_id_sequence.nextval into:new.paper_id from dual;
end exam_trigger;
/
