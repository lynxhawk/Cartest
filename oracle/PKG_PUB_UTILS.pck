create or replace package PKG_PUB_UTILS is

  -- Author  : LYNXHAWK
  -- Created : 2019/6/8 20:23:55
  -- Purpose : 
  
  -- Public type declarations
  TYPE REFCURSOR IS REF CURSOR; 
  --PROCEDURE random_question;
  procedure random_question(t out REFCURSOR);

end PKG_PUB_UTILS;
/
create or replace package body PKG_PUB_UTILS is

  -- Private type declarations
  --type <TypeName> is <Datatype>;
  --TYPE REFCURSOR IS REF CURSOR;
  
  -- Private constant declarations
  --<ConstantName> constant <Datatype> := <Value>;

  -- Private variable declarations
  --<VariableName> <Datatype>;

  -- Function and procedure implementations
  --function <FunctionName>(<Parameter> <Datatype>) return <Datatype> is
    --<LocalVariable> <Datatype>;
  --begin
    --<Statement>;
    --return(<Result>);
  --end;
  procedure random_question(t out REFCURSOR) is
  begin
       open t for select question_id,question_body,question_form,branch_a,branch_b,branch_c,question_key
       from
       (select 
       question_id,question_body,question_form,branch_a,branch_b,branch_c,question_key 
       from question order by dbms_random.value(1,1000))where rownum<11;
  end random_question;

--begin
  -- Initialization
  --<Statement>;
end PKG_PUB_UTILS;
/
