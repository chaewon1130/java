package com.pcwk.board;

import java.util.List;

import org.apache.log4j.Logger;

import com.pcwk.cmn.SearchVO;

public class BoardMain {

	final Logger LOG = Logger.getLogger(getClass());
	private BoardDao dao;
	private BoardVO board01;
	private SearchVO search01;
	
	public BoardMain() {
		dao = new BoardDao();
		board01 = new BoardVO(900001, "제목_900001", "내용_900001", 0, "", "pcwk", "", "pcwk");
		search01 = new SearchVO("", "", 10, 1);
	}
	
	public void doSave() {
		int flag = dao.doSave(board01);
		if(flag == 1) {
			LOG.debug("==================");
			LOG.debug("======등록 성공======");
			LOG.debug("==================");
		}else {
			LOG.debug("==================");
			LOG.debug("======등록 실패======");
			LOG.debug("==================");
		}
	}
	
	public void doDelete() {
		int flag = dao.doDelete(board01);
		if(flag == 1) {
			LOG.debug("==================");
			LOG.debug("======삭제 성공======");
			LOG.debug("==================");
		}else {
			LOG.debug("==================");
			LOG.debug("======삭제 실패======");
			LOG.debug("==================");
		}
	}
	
	public boolean isSameVO(BoardVO orgVO, BoardVO vsVO) {
		boolean isSame = false;
		if(orgVO.getSeq() == vsVO.getSeq()
				&& orgVO.getTitle().equals(vsVO.getTitle())
				&& orgVO.getContents().equals(vsVO.getContents())
				&& orgVO.getReadCnt() == vsVO.getReadCnt()
				&& orgVO.getRegId().equals(vsVO.getRegId())
				&& orgVO.getModId().equals(vsVO.getModId())) {
			isSame = true;
		}
		return isSame;
	}
	
	public void doSelectOne() {
		BoardVO outVO = dao.doSelectOne(board01);
		if(outVO != null && isSameVO(board01, outVO)) {
			
			LOG.debug("==================");
			LOG.debug("======조회 성공======");
			LOG.debug("==================");
		}else {
			LOG.debug("==================");
			LOG.debug("======조회 실패======");
			LOG.debug("==================");
		}
	}
	
	public void updateReadCnt() {
		int flag = dao.updateReadCnt(board01);
		BoardVO vsVO = dao.doSelectOne(board01);
		if(flag == 1 && vsVO.getReadCnt() == 1) {
			LOG.debug("==================");
			LOG.debug("=조회 count 증가 성공=");
			LOG.debug("==================");
		}else {
			LOG.debug("==================");
			LOG.debug("=조회 count 증가 실패=");
			LOG.debug("==================");
		}
		
	}
	
	public void doUpdate() {
		BoardVO outVO = dao.doSelectOne(board01); // 단건조회
		
		// 조회 데이터 수정
		outVO.setTitle(outVO.getTitle() + "_u");
		outVO.setContents(outVO.getContents() + "_u");
		outVO.setModId(outVO.getModId() + "_u");
		
		// update수행
		int flag = dao.doUpdate(outVO);
		
		// update데이터 조회
		BoardVO vsVO = dao.doSelectOne(outVO);
		
		if(flag == 1 && isSameVO(outVO, vsVO)) {
			LOG.debug("-----------------------");
			LOG.debug("- 수 정 성 공 -");
			LOG.debug("-----------------------");
		}else {
			LOG.debug("-----------------------");
			LOG.debug("- 수 정 실 패 -");
			LOG.debug("-----------------------");
		}
	}
	
	public void doRetrieve() {
		search01.setPageSize(30);
		search01.setPageNum(1);
		search01.setSearchDiv("10");
		search01.setSearchWord("77");
		List<BoardVO> list = dao.doRetrieve(search01);
		if(list.size() > 0) {
			for(BoardVO vo : list) {
				LOG.debug("vo : " + vo);
			}
		}else {
			LOG.debug("-----------------------");
			LOG.debug("---- 목 록 조 회 실 패 ----");
			LOG.debug("-----------------------");
		}
	}
	
	public static void main(String[] args) {
		BoardMain main = new BoardMain();
		//삭제
//		main.doDelete();
		//등록
//		main.doSave();
		//수정
//		main.doUpdate();
		//조회
//		main.doSelectOne();
		
//		main.updateReadCnt();
		
		main.doRetrieve();
		
	}
}