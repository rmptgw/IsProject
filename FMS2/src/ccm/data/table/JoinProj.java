package ccm.data.table;

import java.util.Date;

public class JoinProj
{
	/*
	 * 
	 * 	  JNUM BIGINT NOT NULL AUTO_INCREMENT, #참여번호
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
	
	private int jNum;
	private Date joinDate;
	
	public int getjNum() { return jNum; }
	public void setjNum(int jNum) { this.jNum = jNum; }
	public Date getJoinDate() { return joinDate; }
	public void setJoinDate(Date joinDate) { this.joinDate = joinDate; }
}
