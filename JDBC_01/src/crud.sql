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

-- PAGING
SELECT tt1.rnum,
    tt1.empno,
    tt1.ename,
    TO_CHAR(tt1.hiredate, 'YYYY/MM/DD') AS "HIREDATE",
    tt1.deptno
FROM(
    SELECT ROWNUM AS rnum, t1.*
    FROM(
        SELECT *
        FROM SAWON
        ORDER BY HIREDATE DESC
    )t1
    WHERE ROWNUM <= (&PAGE_SIZE * (&PAGE_NUM - 1) + &PAGE_SIZE)
)tt1
WHERE rnum >= (&PAGE_SIZE * (&PAGE_NUM - 1) + 1)