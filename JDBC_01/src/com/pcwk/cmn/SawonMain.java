package com.pcwk.cmn;

public class SawonMain {

	private SawonDao dao;
	private SawonVO sawon01;
	
	public SawonMain() {
		dao = new SawonDao();
		sawon01 = new SawonVO(8888, "카카오", "", 20);
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
	
	public static void main(String[] args) {
		SawonMain main = new SawonMain();
		main.doSave();
	}

}
