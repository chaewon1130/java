SELECT *
FROM SAWON;
TRUNCATE TABLE SAWON;

-- 데이터 생성
INSERT INTO SAWON
SELECT LPAD(ROWNUM, 4, 0) AS EMPNO,
    'pcwk' || LPAD(ROWNUM, 4, 0) AS ENAME,
    SYSDATE - ROWNUM AS HIREDATE,
    DECODE(MOD(ROWNUM, 2), 0, 10, 20) AS DEPTNO
FROM dual
CONNECT BY LEVEL <= 9000
;
COMMIT;

SELECT COUNT(*)
FROM SAWON;

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
;
-- PAGE_SIZE, PAGE_NUM
-- 시작번호 : 1, 11, 21, ...
-- &PAGE_SIZE * (&PAGE_NUM - 1) + 1
-- 끝번호 : 10, 20, 30, ...
-- &PAGE_SIZE * (&PAGE_NUM - 1) + &PAGE_SIZE

SELECT COUNT(*)
FROM SAWON
ORDER BY HIREDATE DESC;


SELECT A.*, B.*
FROM(
    SELECT tt1.rnum AS NUM,
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
        WHERE ROWNUM <= 10
    )tt1
    WHERE rnum >= 1
)A
CROSS JOIN
(
    SELECT COUNT(*) AS "TOTAL_CNT"
    FROM SAWON
)B
;