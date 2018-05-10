package ccm.data.dto;

public class ProjLangVO
{
	/*
		PNUM BIGINT NOT NULL, #프로젝트 번호
  LNUM BIGINT NOT NULL, #프로그래밍 언어 번호
	*/
	private Integer pNum;
	private Integer lNum;
	
	public Integer getpNum() {
		return pNum;
	}
	public void setpNum(Integer pNum) {
		this.pNum = pNum;
	}
	public Integer getlNum() {
		return lNum;
	}
	public void setlNum(Integer lNum) {
		this.lNum = lNum;
	}
	
}
