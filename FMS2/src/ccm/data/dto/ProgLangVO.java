package ccm.data.dto;

public class ProgLangVO
{
	/*
	LNUM BIGINT NOT NULL AUTO_INCREMENT, #언어번호
  	NAME VARCHAR(15) NOT NULL,
	*/
	private Integer lNum;
	private String name;
	
	public Integer getlNum() {
		return lNum;
	}
	public void setlNum(Integer lNum) {
		this.lNum = lNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
