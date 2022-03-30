-- INSERT(1111, 'ȫ�浿', 10)
INSERT INTO sawon (
    empno,
    ename,
    hiredate,
    deptno
) VALUES (
    :v0,
    :v1,
    SYSDATE,
    :v3
);
commit;

-- DELETE
DELETE FROM sawon
WHERE empno = :v0
;
-- UPDATE( , 'ȫU2', 20)
UPDATE sawon
SET ename = :v1,
    hiredate = SYSDATE,
    deptno = :v3
WHERE empno = :v0
;

-- selectOne
SELECT empno,
    ename,
    TO_CHAR(hiredate, 'YYYY/MM/DD HH24:MI:SS') AS "HIREDATE",
    deptno
FROM
    sawon
WHERE empno = :v0
;