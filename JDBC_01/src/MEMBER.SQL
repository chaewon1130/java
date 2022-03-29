CREATE TABLE sawon
AS (
    SELECT empno,
        ename,
        hiredate,
        deptno
    FROM emp
    WHERE 1 = 2)
;