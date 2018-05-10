package ccm.data.dto;

public class FrameworkVO
{
	/*
	FNUM BIGINT NOT NULL AUTO_INCREMENT, #프레임워크번호
  NAME VARCHAR(15) NOT NULL, #프레임워크이름
  DEVFIELD VARCHAR(10) NOT NULL, #분야
	*/
	private Integer fNum;
	private String name;
	private String devField;
	
	public Integer getfNum() {
		return fNum;
	}
	public void setfNum(Integer fNum) {
		this.fNum = fNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDevField() {
		return devField;
	}
	public void setDevField(String devField) {
		this.devField = devField;
	}
}
