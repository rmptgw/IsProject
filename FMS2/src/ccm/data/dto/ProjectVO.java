package ccm.data.dto;

import java.sql.Timestamp;

public class ProjectVO
{
	/*
	
	PNUM BIGINT AUTO_INCREMENT NOT NULL, #프로젝트번호
	ISEXTERN BOOLEAN NOT NULL, #외부프로젝트 여부
	PFIELD VARCHAR(10) NOT NULL, #프로젝트 유형
	NAME VARCHAR(20) NOT NULL, #프로젝트 이름
	PROGSTATE VARCHAR(5) NOT NULL, #진행상태
	REGDATE DATE NULL, #등록일
	REGPERSON VARCHAR(15) NULL, #등록인
	REVDATE DATE NULL, #수정일
	REVPERSON VARCHAR(15) NULL, #수정인
	STARTDATE DATE NOT NULL, #프로젝트 시작일
	ENDDATE DATE NULL, #프로젝트 종료일
	EXPECTEDTIME INT NULL, #예상기간
	TARGET VARCHAR(20) NOT NULL, #고객사
	PARTNER VARCHAR(20) NULL, #협력사
	PLAN VARCHAR(5000) NOT NULL, #세부내용
	RECRUSTARTDATE DATE NULL, #모집시작일
	RECRUENDDATE DATE NULL, #모집마감일
	DEVSORT VARCHAR(10) NOT NULL, #개발분야
	DNUM BIGINT NOT NULL, #사용 DBMS
	 
	*/
	private Integer pNum;
	private boolean isExtern;
	private String pField;
	private String name;
	private String profState;
	private Timestamp regDate;
	private String revPerson;
	private Timestamp startDate;
	private Integer expectedtTime;
	private String target;
	private String partner;
	private String plan;
	private Timestamp recruStartDate;
	private Timestamp recruEndDate;
	private String devSort;
	private Integer dNum;
	
	public Integer getpNum() {
		return pNum;
	}
	public void setpNum(Integer pNum) {
		this.pNum = pNum;
	}
	public boolean isExtern() {
		return isExtern;
	}
	public void setExtern(boolean isExtern) {
		this.isExtern = isExtern;
	}
	public String getpField() {
		return pField;
	}
	public void setpField(String pField) {
		this.pField = pField;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfState() {
		return profState;
	}
	public void setProfState(String profState) {
		this.profState = profState;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public String getRevPerson() {
		return revPerson;
	}
	public void setRevPerson(String revPerson) {
		this.revPerson = revPerson;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Integer getExpectedtTime() {
		return expectedtTime;
	}
	public void setExpectedtTime(Integer expectedtTime) {
		this.expectedtTime = expectedtTime;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public Timestamp getRecruStartDate() {
		return recruStartDate;
	}
	public void setRecruStartDate(Timestamp recruStartDate) {
		this.recruStartDate = recruStartDate;
	}
	public Timestamp getRecruEndDate() {
		return recruEndDate;
	}
	public void setRecruEndDate(Timestamp recruEndDate) {
		this.recruEndDate = recruEndDate;
	}
	public String getDevSort() {
		return devSort;
	}
	public void setDevSort(String devSort) {
		this.devSort = devSort;
	}
	public Integer getdNum() {
		return dNum;
	}
	public void setdNum(Integer dNum) {
		this.dNum = dNum;
	}
}
