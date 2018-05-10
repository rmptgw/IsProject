package ccm.data.dto;

public class DBMSVO
{
	/*
	DNUM BIGINT NOT NULL AUTO_INCREMENT, #DBMS번호
	NAME VARCHAR(15) NOT NULL,
	*/
	private Integer dNum;
	private String name;
	
	public Integer getdNum() {
		return dNum;
	}
	public void setdNum(Integer dNum) {
		this.dNum = dNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
