package ccm.data.dto;

import java.sql.Timestamp;

public class JoinProjVO
{
	/*
	 * 
	 * JNUM BIGINT NOT NULL AUTO_INCREMENT, #참여번호
  JOINDATE DATE NULL, #투입일
  EXITDATE DATE NULL, #철수일
  ROLE VARCHAR(15) NOT NULL, #역할
  FSTATE VARCHAR(15) NOT NULL, #프리랜서 상태
  APPDATE DATE NOT NULL, #신청일
  RECDATE DATE NULL, #접수일
  PNUM BIGINT NOT NULL, #프로젝트 번호
  EID VARCHAR(15) NULL, #직원 아이디
  FID VARCHAR(15) NULL, #프리랜서 아이디
	 * 
	 */
	private Integer jNum;
	private Timestamp joinDate;
	private Timestamp exitDate;
	private String role;
	private String fState;
	private Timestamp appDate;
	private Timestamp recDate;
	private Integer pNum;
	private String eID;
	private String fID;
	
	public Integer getjNum() {
		return jNum;
	}
	public void setjNum(Integer jNum) {
		this.jNum = jNum;
	}
	public Timestamp getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}
	public Timestamp getExitDate() {
		return exitDate;
	}
	public void setExitDate(Timestamp exitDate) {
		this.exitDate = exitDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getfState() {
		return fState;
	}
	public void setfState(String fState) {
		this.fState = fState;
	}
	public Timestamp getAppDate() {
		return appDate;
	}
	public void setAppDate(Timestamp appDate) {
		this.appDate = appDate;
	}
	public Timestamp getRecDate() {
		return recDate;
	}
	public void setRecDate(Timestamp recDate) {
		this.recDate = recDate;
	}
	public Integer getpNum() {
		return pNum;
	}
	public void setpNum(Integer pNum) {
		this.pNum = pNum;
	}
	public String geteID() {
		return eID;
	}
	public void seteID(String eID) {
		this.eID = eID;
	}
	public String getfID() {
		return fID;
	}
	public void setfID(String fID) {
		this.fID = fID;
	}
}
