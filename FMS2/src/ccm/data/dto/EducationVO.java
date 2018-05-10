package ccm.data.dto;

import java.sql.Timestamp;

public class EducationVO
{
	/*
	ENUM BIGINT NOT NULL AUTO_INCREMENT, #학력번호
  SCHOOL VARCHAR(15) NOT NULL, #학교명
  DEPLOMA VARCHAR(2) NULL, #학위
  MAJOR VARCHAR(15) NOT NULL, #전공
  JOINDATE DATE NOT NULL DEFAULT NOW(), #입학일
  GRADDATE DATE NULL, #졸업일(예정일)
  FID VARCHAR(15) NULL, #프리랜서아이디
  EID VARCHAR(15) NULL, #직원아이디
	*/
	
	private Integer eNum;
	private String school;
	private String deploma;
	private String major;
	private Timestamp joinDate;
	private Timestamp gradDate;
	private String fID;
	private String eID;
	
	public Integer geteNum() {
		return eNum;
	}
	public void seteNum(Integer eNum) {
		this.eNum = eNum;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getDeploma() {
		return deploma;
	}
	public void setDeploma(String deploma) {
		this.deploma = deploma;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Timestamp getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}
	public Timestamp getGradDate() {
		return gradDate;
	}
	public void setGradDate(Timestamp gradDate) {
		this.gradDate = gradDate;
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
