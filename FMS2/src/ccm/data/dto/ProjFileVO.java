package ccm.data.dto;

public class ProjFileVO
{
	/*
	FNUM BIGINT NOT NULL, #파일번호
  PNUM BIGINT NULL, #프로젝트번호
  FILE MEDIUMBLOB NULL, #파일
  PIC MEDIUMBLOB NULL, #사진
	*/
	private Integer fNum;
	private Integer pNum;
	private String file;
	private String pic;
	
	public Integer getfNum() {
		return fNum;
	}
	public void setfNum(Integer fNum) {
		this.fNum = fNum;
	}
	public Integer getpNum() {
		return pNum;
	}
	public void setpNum(Integer pNum) {
		this.pNum = pNum;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
}
