package ccm.data.dto;

import java.sql.Timestamp;

public class MessageVO
{
	/*
	
	MNUM BIGINT NOT NULL AUTO_INCREMENT, #메시지번호
  PREVMNUM BIGINT NULL, #이전메시지번호
  WRITER1 VARCHAR(15) NULL, #작성자
  WRITER2 VARCHAR(15) NULL, #작성자
  RECEIVER1 VARCHAR(15) NULL, #수신자
  RECEIVER2 VARCHAR(15) NULL, #수신자
  TITLE VARCHAR(50) NOT NULL, #제목
  CONTENT VARCHAR(500) NOT NULL, #내용
  REGDATE DATE DEFAULT NOW() NOT NULL, #작성일
  REVISER VARCHAR(15) NULL, #수정자
  REVDATE DATE NULL, #수정일
  CHECKED BOOLEAN NOT NULL, #확인여부
	
	*/
	private Integer mNum;
	private Integer prevmNum;
	private String writer1;
	private String writer2;
	private String receiver1;
	private String receiver2;
	private String title;
	private String content;
	private Timestamp regDate;
	private String reviser;
	private Timestamp revDate;
	private boolean checked;
	
	public Integer getmNum() {
		return mNum;
	}
	public void setmNum(Integer mNum) {
		this.mNum = mNum;
	}
	public Integer getPrevmNum() {
		return prevmNum;
	}
	public void setPrevmNum(Integer prevmNum) {
		this.prevmNum = prevmNum;
	}
	public String getWriter1() {
		return writer1;
	}
	public void setWriter1(String writer1) {
		this.writer1 = writer1;
	}
	public String getWriter2() {
		return writer2;
	}
	public void setWriter2(String writer2) {
		this.writer2 = writer2;
	}
	public String getReceiver1() {
		return receiver1;
	}
	public void setReceiver1(String receiver1) {
		this.receiver1 = receiver1;
	}
	public String getReceiver2() {
		return receiver2;
	}
	public void setReceiver2(String receiver2) {
		this.receiver2 = receiver2;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public String getReviser() {
		return reviser;
	}
	public void setReviser(String reviser) {
		this.reviser = reviser;
	}
	public Timestamp getRevDate() {
		return revDate;
	}
	public void setRevDate(Timestamp revDate) {
		this.revDate = revDate;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
}
