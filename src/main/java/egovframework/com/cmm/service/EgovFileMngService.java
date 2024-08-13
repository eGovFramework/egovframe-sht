package egovframework.com.cmm.service;

import java.util.List;
import java.util.Map;

/**
 * @Class Name : EgovFileMngService.java
 * @Description : 파일정보의 관리를 위한 서비스 인터페이스
 * @Modification Information
 * 
 *               <pre>
 *    수정일       수정자         수정내용
 *    -------        -------     -------------------
 *    2009. 3. 25.     이삼섭    최초생성
 *   2024.08.13  이백행          시큐어코딩 Exception 제거
 *               </pre>
 * 
 * @author 공통 서비스 개발팀 이삼섭
 * @since 2009. 3. 25.
 * @version
 * @see
 *
 */
public interface EgovFileMngService {

	/**
	 * 파일에 대한 목록을 조회한다.
	 *
	 * @param fvo
	 * @return
	 */
	public List<FileVO> selectFileInfs(FileVO fvo);

	/**
	 * 하나의 파일에 대한 정보(속성 및 상세)를 등록한다.
	 *
	 * @param fvo
	 */
	public String insertFileInf(FileVO fvo);

	/**
	 * 여러 개의 파일에 대한 정보(속성 및 상세)를 등록한다.
	 *
	 * @param fvoList
	 */
	public String insertFileInfs(List<?> fvoList);

	/**
	 * 여러 개의 파일에 대한 정보(속성 및 상세)를 수정한다.
	 *
	 * @param fvoList
	 */
	public void updateFileInfs(List<?> fvoList);

	/**
	 * 여러 개의 파일을 삭제한다.
	 *
	 * @param fvoList
	 */
	public void deleteFileInfs(List<?> fvoList);

	/**
	 * 하나의 파일을 삭제한다.
	 *
	 * @param fvo
	 */
	public void deleteFileInf(FileVO fvo);

	/**
	 * 파일에 대한 상세정보를 조회한다.
	 *
	 * @param fvo
	 * @return
	 */
	public FileVO selectFileInf(FileVO fvo);

	/**
	 * 파일 구분자에 대한 최대값을 구한다.
	 *
	 * @param fvo
	 * @return
	 */
	public int getMaxFileSN(FileVO fvo);

	/**
	 * 전체 파일을 삭제한다.
	 *
	 * @param fvo
	 */
	public void deleteAllFileInf(FileVO fvo);

	/**
	 * 파일명 검색에 대한 목록을 조회한다.
	 *
	 * @param fvo
	 * @return
	 */
	public Map<String, Object> selectFileListByFileNm(FileVO fvo);

	/**
	 * 이미지 파일에 대한 목록을 조회한다.
	 *
	 * @param vo
	 * @return
	 */
	public List<FileVO> selectImageFileList(FileVO vo);
}
