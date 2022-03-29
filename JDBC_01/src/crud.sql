-- INSERT(1111, 'ȫ�浿', 10)
INSERT INTO sawon (
    empno,
    ename,
    hiredate,
    deptno
) VALUES (
    :v0,
    :v1,
    sysdate,
    :v3
);
commit;
-- DELETE
-- UPDATE
-- selectOne
SELECT empno,
    ename,
    TO_CHAR(hiredate, 'YYYY/MM/DD HH24:MI:SS') AS "HIREDATE",
    deptno
FROM
    sawon
WHERE empno = :v0
;