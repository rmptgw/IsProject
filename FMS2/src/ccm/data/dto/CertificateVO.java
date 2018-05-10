package ccm.data.dto;

public class CertificateVO
{
	/*
	 * CNUM BIGINT NOT NULL AUTO_INCREMENT, #자격증번호
  	INSTITUTE VARCHAR(15) NOT NULL, #발급기관
  	NAME VARCHAR(15) NOT NULL, #자격증이름 
	 */
	
	private Integer cNum;
	private String institute;
	private String name;
	
	public Integer getcNum() {
		return cNum;
	}
	public void setcNum(Integer cNum) {
		this.cNum = cNum;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
