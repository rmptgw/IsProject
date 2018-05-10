package ccm.data.dto;

import java.sql.Timestamp;

public class InterviewVO
{
	/*
	
	INUM BIGINT NOT NULL AUTO_INCREMENT, #면접번호
  INTVDATE DATE NOT NULL, #면접일
  LOCATION VARCHAR(15) NOT NULL, #면접장소
  REASON VARCHAR(100) NULL, #불채용사유
  STATE INT NOT NULL, #상태
  FID VARCHAR(15) NOT NULL, #프리랜서아이디
	
	*/
	private Integer iNum;
	private Timestamp intvDate;
	private String location;
	private Integer state;
	private String fID;
	
	public Integer getiNum() {
		return iNum;
	}
	public void setiNum(Integer iNum) {
		this.iNum = iNum;
	}
	public Timestamp getIntvDate() {
		return intvDate;
	}
	public void setIntvDate(Timestamp intvDate) {
		this.intvDate = intvDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getfID() {
		return fID;
	}
	public void setfID(String fID) {
		this.fID = fID;
	}
}
