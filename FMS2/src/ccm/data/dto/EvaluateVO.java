package ccm.data.dto;

public class EvaluateVO
{
	/*
	EVNUM BIGINT NOT NULL AUTO_INCREMENT, #평가 번호
  JNUM BIGINT NULL, #참여 번호
  VALUER VARCHAR(15) NULL, #평가자
  VALUEE VARCHAR(15) NULL, #피평가자
  SCORE INT NOT NULL, #평가점수
	*/
	private Integer evNum;
	private Integer jNum;
	private String valuer;
	private String valuee;
	private Integer score;
	
	public Integer getEvNum() {
		return evNum;
	}
	public void setEvNum(Integer evNum) {
		this.evNum = evNum;
	}
	public Integer getjNum() {
		return jNum;
	}
	public void setjNum(Integer jNum) {
		this.jNum = jNum;
	}
	public String getValuer() {
		return valuer;
	}
	public void setValuer(String valuer) {
		this.valuer = valuer;
	}
	public String getValuee() {
		return valuee;
	}
	public void setValuee(String valuee) {
		this.valuee = valuee;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
}
