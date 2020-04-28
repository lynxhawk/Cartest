create or replace trigger users_trigger
  before insert
  on  users
  for each row

begin
  select users_id_sequence.nextval into:new.user_id from dual;  
end;
/
