package com.pcwk.cmn;

import java.util.List;

import org.apache.log4j.Logger;

public class SawonMain {
	final Logger LOG = Logger.getLogger(getClass());
	private SawonDao dao;
	private SawonVO sawon01;
	private SearchVO search01;
	
	public SawonMain() {
		dao = new SawonDao();
		// int empno, String ename, String hiredate, int deptno
		sawon01 = new SawonVO(9001, "카카오", "", 20);
		// String searchDiv, String searchWord, int pageSize, int pageNum
		search01 = new SearchVO("", "", 10, 1);
	}
	
	public void doSave() {
		int flag = dao.doSave(sawon01);
		if(flag == 1) {
			LOG.debug("-----------------------");
			LOG.debug("- 등 록 성 공 -");
			LOG.debug("-----------------------");
		}else {
			LOG.debug("-----------------------");
			LOG.debug("- 등 록 실 패 -");
			LOG.debug("-----------------------");
		}
	}
	
	public void doDelete() {
		int flag = dao.doDelete(sawon01);
		if(flag == 1) {
			LOG.debug("-----------------------");
			LOG.debug("- 삭 제 성 공 -");
			LOG.debug("-----------------------");
		}else {
			LOG.debug("-----------------------");
			LOG.debug("- 삭 제 실 패 -");
			LOG.debug("-----------------------");
		}
	}
	
	public void doSelectOne() {
		SawonVO outVO = dao.doSelectOne(sawon01);
		if(outVO != null) {
			LOG.debug("-----------------------");
			LOG.debug("- 조 회 성 공 -");
			LOG.debug("-----------------------");
		}else {
			LOG.debug("-----------------------");
			LOG.debug("- 조 회 실 패 -");
			LOG.debug("-----------------------");
		}
	}
	
	public void doUpdate() {
		sawon01.setEname("KAKAO_U");
		sawon01.setDeptno(22);
		
		int flag = dao.doUpdate(sawon01);
		if(flag == 1) {
			LOG.debug("-----------------------");
			LOG.debug("- 수 정 성 공 -");
			LOG.debug("-----------------------");
		}else {
			LOG.debug("-----------------------");
			LOG.debug("- 수 정 실 패 -");
			LOG.debug("-----------------------");
		}
	}
	
	public void upsert() {
		int flag = dao.upsert(sawon01);
		if(flag == 1) {
			LOG.debug("-----------------------");
			LOG.debug("- UPSERT 성 공 -");
			LOG.debug("-----------------------");
		}else {
			LOG.debug("-----------------------");
			LOG.debug("- UPSERT 실 패 -");
			LOG.debug("-----------------------");
		}
	}
	
	public void doRetrieve(){
		search01.setPageSize(10);
		search01.setPageNum(1);
		search01.setSearchDiv("30");
		search01.setSearchWord("10");
		List<SawonVO> list = dao.doRetrieve(search01);
		if(list.size() > 0) {
			for(SawonVO vo : list) {
				LOG.debug("vo : " + vo);
			}
		}else {
			LOG.debug("-----------------------");
			LOG.debug("---- 목 록 조 회 실 패 ----");
			LOG.debug("-----------------------");
		}
	}
	
	public void totalCount() {
		int totalCnt = dao.totalCount(search01);
		if(totalCnt > 0) {
			LOG.debug("-----------------------");
			LOG.debug("---- 총 글수(성공) : " + totalCnt);
			LOG.debug("-----------------------");			
		}else {
			LOG.debug("-----------------------");
			LOG.debug("---- 총 글수 : " + totalCnt);
			LOG.debug("-----------------------");	
		}
	}
	
	public static void main(String[] args) {
		SawonMain main = new SawonMain();
		main.doDelete();
		main.doSave();
		main.doSelectOne();	
//		main.doUpdate();
//		main.upsert();
		main.doRetrieve();
		main.totalCount();
	}

}
