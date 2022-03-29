package com.pcwk.cmn;

import java.util.List;

/**
 * <pre>
 * 모든 DAO는 WorkDiv를 implements 받을 것
 * @author ITSC
 * </pre>
 */
public interface WorkDiv<T> {

	/**
	 * <pre>
	 * 목록조회
	 * @param dto
	 * @return List<DTO>
	 * </pre>
	 */
	public abstract List<T> doRetrieve(DTO dto);
	
	/**
	 * <pre>
	 * 도서등록
	 * @param dto
	 * @return 1(성공) / 0(실패)
	 * </pre>
	 */
	public abstract int doSave(T dto);
	
	/**
	 * <pre>
	 * 도서삭제
	 * @param dto
	 * @return 1(성공) / 0(실패)
	 * </pre>
	 */
	public int doDelete(T dto);
	
	/**
	 * <pre>
	 * 단건조회
	 * @param dto
	 * @return DTO
	 * </pre>
	 */
	public T doSelectOne(T dto);
	
	/**
	 * <pre>
	 * 도서수정 : delete, insert
	 * @param dto
	 * @return 1(성공) / 0(실패)
	 * </pre>
	 */
	public int doUpdate(T dto);	
	
	default String excelDown(String path) {
		return "download_path";
	}
}