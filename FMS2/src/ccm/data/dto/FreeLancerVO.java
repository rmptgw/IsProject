package ccm.data.dto;

import java.sql.Date;
import java.sql.Timestamp;

/***************************
 * 
 * 
 * 프리랜서 기본정보
 * int형은 nullable이어야되니까 Integer 자료형으로 쓰도록
 * 
 * 작성자 : 
 * 
 * 수정자 : 
 * 
 * 수정일 : 
 *
 *
 ***************************/

public class FreeLancerVO
{
	/*
	 * FID, FPW, NAME, PIC, BIRTH, SEX, PHONE, EMAIL, EUCLASS,
  CLASS, MARRIED, FRONTADDR, REARADDR, BANK, ACCNAME, ACCOUNT, REVISER, REVDATE
	 */
	private String fID;
	private String fPW;
	private String name;
	private String pic;
	private Date birth;
	private boolean sex;
	private String phone;
	private String email;
	private String euClass;
	private String fClass;	// class는 오류가 나서 fClass로 대체함
	private boolean married;
	private String frontAddr;
	private String rearAddr;
	private String bank;
	private String accName;
	private String account;
	private String reviser;
	private Date revDate;
	private Date joinDate;
	private Date dropDate;
	
	public String getfID() {
		return fID;
	}
	public void setfID(String fID) {
		this.fID = fID;
	}
	public String getfPW() {
		return fPW;
	}
	public void setfPW(String fPW) {
		this.fPW = fPW;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEuClass() {
		return euClass;
	}
	public void setEuClass(String euClass) {
		this.euClass = euClass;
	}
	public String getfClass() {
		return fClass;
	}
	public void setfClass(String fClass) {
		this.fClass = fClass;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getFrontAddr() {
		return frontAddr;
	}
	public void setFrontAddr(String frontAddr) {
		this.frontAddr = frontAddr;
	}
	public String getRearAddr() {
		return rearAddr;
	}
	public void setRearAddr(String rearAddr) {
		this.rearAddr = rearAddr;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getReviser() {
		return reviser;
	}
	public void setReviser(String reviser) {
		this.reviser = reviser;
	}
	public Date getRevDate() {
		return revDate;
	}
	public void setRevDate(Date revDate) {
		this.revDate = revDate;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getDropDate() {
		return dropDate;
	}
	public void setDropDate(Date dropDate) {
		this.dropDate = dropDate;
	}
		
}
