package ccm.data.dto;

public class LangSkillVO
{
	/*
	LSNUM BIGINT NOT NULL AUTO_INCREMENT, #언어스킬 번호
  JNUM BIGINT NOT NULL, #참여 번호
  LNUM BIGINT NOT NULL, #프로그래밍 언어 번호
	*/
	private Integer lsNum;
	private Integer jNum;
	private Integer lNum;
	
	public Integer getLsNum() {
		return lsNum;
	}
	public void setLsNum(Integer lsNum) {
		this.lsNum = lsNum;
	}
	public Integer getjNum() {
		return jNum;
	}
	public void setjNum(Integer jNum) {
		this.jNum = jNum;
	}
	public Integer getlNum() {
		return lNum;
	}
	public void setlNum(Integer lNum) {
		this.lNum = lNum;
	}
}
