package ccm.data.dto;

public class FWSkillVO
{
	/*
	FSNUM BIGINT NOT NULL AUTO_INCREMENT, #프레임워크스킬 번호
  JNUM BIGINT NOT NULL, #참여 번호
  FNUM BIGINT NOT NULL, #툴 프레임워크 번호
	*/
	private Integer fsNum;
	private Integer jNum;
	private Integer fNum;
	
	public Integer getFsNum() {
		return fsNum;
	}
	public void setFsNum(Integer fsNum) {
		this.fsNum = fsNum;
	}
	public Integer getjNum() {
		return jNum;
	}
	public void setjNum(Integer jNum) {
		this.jNum = jNum;
	}
	public Integer getfNum() {
		return fNum;
	}
	public void setfNum(Integer fNum) {
		this.fNum = fNum;
	} 
}
