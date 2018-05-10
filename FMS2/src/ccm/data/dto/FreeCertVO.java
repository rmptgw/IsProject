package ccm.data.dto;

import java.sql.Timestamp;

public class FreeCertVO
{
	/*
	CNUM BIGINT NOT NULL, #자격증번호
  FID VARCHAR(15) NOT NULL, #프리랜서아이디
  GETDATE DATE NOT NULL, #취득일
	*/
	
	private Integer cNum;
	private String fID;
	private Timestamp getDate;
	
	public Integer getcNum() {
		return cNum;
	}
	public void setcNum(Integer cNum) {
		this.cNum = cNum;
	}
	public String getfID() {
		return fID;
	}
	public void setfID(String fID) {
		this.fID = fID;
	}
	public Timestamp getGetDate() {
		return getDate;
	}
	public void setGetDate(Timestamp getDate) {
		this.getDate = getDate;
	}
}
