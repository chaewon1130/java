package com.pcwk.cmn;

public class SawonVO extends DTO {
	private int empno;       // 사번
	private String ename;    // 이름
	private String hiredate; // 입사일
	private int deptno;      // 부서번호
	
	public SawonVO() {
		
	}

	public SawonVO(int empno, String ename, String hiredate, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getDeptno() {
		return deptno;
	}

	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "SawonVO [empno=" + empno + ", ename=" + ename + ", hiredate=" 				+ hiredate + ", deptno=" + deptno
				+ ", toString()=" + super.toString() + "]";
	}
	
}