package ccm.data.dto;

public class ProjFWVO
{
	/*
	PNUM BIGINT NOT NULL, #프로젝트 번호
  FNUM BIGINT NOT NULL, #프레임워크 언어 번호
	*/
	
	private Integer pNum;
	private Integer fNum;
	
	public Integer getpNum() {
		return pNum;
	}
	public void setpNum(Integer pNum) {
		this.pNum = pNum;
	}
	public Integer getfNum() {
		return fNum;
	}
	public void setfNum(Integer fNum) {
		this.fNum = fNum;
	}
}
