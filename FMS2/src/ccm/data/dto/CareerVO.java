package ccm.data.dto;

import java.sql.Timestamp;

public class CareerVO
{
	/*
	CNUM BIGINT NOT NULL AUTO_INCREMENT, #경력번호
  COMPANY VARCHAR(15) NOT NULL, #근무회사
  JOINDATE DATE NOT NULL, #입사일
  DROPDATE DATE NULL, #퇴사일(예정일)
  POSITION VARCHAR(15) NOT NULL, #직위
  JOB VARCHAR(15) NOT NULL, #담당업무
  FID VARCHAR(15) NULL, #프리랜서아이디
  EID VARCHAR(15) NULL, #직원아이디
	*/
	private Integer cNum;
	private String company;
	private Timestamp joinDate;
	private Timestamp dropDate;
	private String posision;
	private String job;
	private String fID;
	private String eID;
	
	public Integer getcNum() {
		return cNum;
	}
	public void setcNum(Integer cNum) {
		this.cNum = cNum;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Timestamp getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}
	public Timestamp getDropDate() {
		return dropDate;
	}
	public void setDropDate(Timestamp dropDate) {
		this.dropDate = dropDate;
	}
	public String getPosision() {
		return posision;
	}
	public void setPosision(String posision) {
		this.posision = posision;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getfID() {
		return fID;
	}
	public void setfID(String fID) {
		this.fID = fID;
	}
	public String geteID() {
		return eID;
	}
	public void seteID(String eID) {
		this.eID = eID;
	}
	
}
