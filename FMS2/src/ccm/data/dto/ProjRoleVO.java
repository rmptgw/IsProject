package ccm.data.dto;

public class ProjRoleVO
{
	/*
	
	RNUM BIGINT NOT NULL AUTO_INCREMENT, #역할 번호
  RNAME VARCHAR(12) NOT NULL, #역할 이름
  REQNUM INT NOT NULL, #필요 인원
  PNUM BIGINT NULL, #프로젝트 번호
	
	*/
	private Integer rNum;
	private String rName;
	private Integer reqNum;
	private Integer pNum;
	
	public Integer getrNum() {
		return rNum;
	}
	public void setrNum(Integer rNum) {
		this.rNum = rNum;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public Integer getReqNum() {
		return reqNum;
	}
	public void setReqNum(Integer reqNum) {
		this.reqNum = reqNum;
	}
	public Integer getpNum() {
		return pNum;
	}
	public void setpNum(Integer pNum) {
		this.pNum = pNum;
	}
}
