package ccm.data.dto;

import java.sql.Date;
import java.sql.Timestamp;

/***************************
 * 
 * 
 * 지권 지건
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

public class EmployeeVO
{
	/*
	 * EID VARCHAR(15) NOT NULL, #직원아이디
	 * EPW VARCHAR(100) NOT NULL, #패스워드
	 * ECLASS VARCHAR(10) NULL, #직책
	 * ENAME VARCHAR(15) NULL, #이름
	 * EDEPT VARCHAR(5) NULL, #부서
	 * PIC MEDIUMBLOB NULL, #사진
	 * JOINDATE DATE NOT NULL, #입사일
	 * DROPDATE DATE NULL, #퇴사일
	 * PHONE VARCHAR(11) NULL, #폰번
	 * EMAIL VARCHAR(50) NULL, #이메일
	 * BIRTH DATE NULL, #생년월일
	 * SEX BOOLEAN NULL, #성별
	 * MARRIED BOOLEAN NULL, #결혼여부
	 * FRONTADDR VARCHAR(30) NULL, #본주소 *************
	 * REARADDR VARCHAR(30) NULL, #나머지주소 *************
	 * BANK VARCHAR(15) NULL, #계좌은행
	 * ACCNAME VARCHAR(12) NULL, #계좌명의
	 * ACCOUNT VARCHAR(30) NULL, #계좌번호
	 * 
	 * */
	private String eID;
	private String ePW;
	private String eClass;
	private String eName;
	private String eDept;
	private String pic;
	private Date joinDate;
	private Date dropDate;
	private String phone;
	private String email;
	private Date birth;
	private boolean sex;
	private boolean married;
	private String frontAddr;
	private String rearAddr;
	private String bank;
	private String accName;
	private String account;
	
	public String geteID() {
		return eID;
	}
	public void seteID(String eID) {
		this.eID = eID;
	}
	public String getePW() {
		return ePW;
	}
	public void setePW(String ePW) {
		this.ePW = ePW;
	}
	public String geteClass() {
		return eClass;
	}
	public void seteClass(String eClass) {
		this.eClass = eClass;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
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
	
	
}
