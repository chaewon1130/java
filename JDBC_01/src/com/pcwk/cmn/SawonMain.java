package com.pcwk.cmn;

public class SawonMain {

	private SawonDao dao;
	private SawonVO sawon01;
	
	public SawonMain() {
		dao = new SawonDao();
		// int empno, String ename, String hiredate, int deptno
		sawon01 = new SawonVO(9001, "카카오", "", 20);
	}
	
	public void doSave() {
		int flag = dao.doSave(sawon01);
		if(flag == 1) {
			System.out.println("-----------------------");
			System.out.println("- 등 록 성 공 -");
			System.out.println("-----------------------");
		}else {
			System.out.println("-----------------------");
			System.out.println("- 등 록 실 패 -");
			System.out.println("-----------------------");
		}
	}
	
	public void doDelete() {
		int flag = dao.doDelete(sawon01);
		if(flag == 1) {
			System.out.println("-----------------------");
			System.out.println("- 삭 제 성 공 -");
			System.out.println("-----------------------");
		}else {
			System.out.println("-----------------------");
			System.out.println("- 삭 제 실 패 -");
			System.out.println("-----------------------");
		}
	}
	
	public void doSelectOne() {
		SawonVO outVO = dao.doSelectOne(sawon01);
		if(outVO != null) {
			System.out.println("-----------------------");
			System.out.println("- 조 회 성 공 -");
			System.out.println("-----------------------");
		}else {
			System.out.println("-----------------------");
			System.out.println("- 조 회 실 패 -");
			System.out.println("-----------------------");
		}
	}
	
	public static void main(String[] args) {
		SawonMain main = new SawonMain();
		main.doDelete();
		main.doSave();
		main.doSelectOne();		
	}

}
