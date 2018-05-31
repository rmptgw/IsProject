package ccm.data.table;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Message
{
	
	private Integer msgNum;			// 메시지번호
	private Integer prevMsgNum;		// 이전메시지번호
	private String freeWriter;		// 프리랜서 작성자
	private String empWriter;		// 사원 작성자
	private String freeReceiver;	// 프리랜서 수신자
	private String empReceiver;		// 사원 수신자
	private String msgTitle;		// 메시지 타이틀
	private String msgContent;		// 메시지 내용
	private Date msgSendDate;		// 메시지 보낸날
	private Boolean msgChecked;		// 메시지 확인
	private Integer projNum;		// 관련 프로젝트 번호
	private Date msgCheckedDate;	//
	
	public Message() {
		super();
	}
	
	public Message(Integer msgNum, Integer prevMsgNum, String freeWriter, String empWriter,
			String freeReceiver, String empReceiver, String msgTitle, String msgContent,
			Date msgSendDate, boolean msgChecked, Integer projNum, Date msgCheckedDate) {
		this.msgNum = msgNum;
		this.prevMsgNum = prevMsgNum;
		this.freeWriter = freeWriter;
		this.empWriter = empWriter;
		this.freeReceiver = freeReceiver;
		this.empReceiver = empReceiver;
		this.msgTitle = msgTitle;
		this.msgContent = msgContent;
		this.msgSendDate = msgSendDate;
		this.msgChecked = msgChecked;
		this.projNum = projNum;
		this.msgCheckedDate = msgCheckedDate;
	}
	
	public void setParams(ResultSet rs) throws SQLException{
		this.msgNum = rs.getInt("msgNum");
		this.prevMsgNum = rs.getInt("prevMsgNum");
		this.freeWriter = rs.getString("freeWriter");
		this.empWriter = rs.getString("empWriter");
		this.freeReceiver = rs.getString("freeReceiver");
		this.empReceiver = rs.getString("empReceiver");
		this.msgTitle = rs.getString("msgTitle");
		this.msgContent = rs.getString("msgContent");
		this.msgSendDate = rs.getDate("msgSendDate");
		this.msgChecked = rs.getBoolean("msgChecked");
		this.projNum = rs.getInt("projNum");
		this.msgCheckedDate = rs.getDate("msgCheckedDate");
	}
	
	public Integer getMsgNum() {
		return msgNum;
	}
	public void setMsgNum(Integer msgNum) {
		this.msgNum = msgNum;
	}
	public Integer getPrevMsgNum() {
		return prevMsgNum;
	}
	public void setPrevMsgNum(Integer prevMsgNum) {
		this.prevMsgNum = prevMsgNum;
	}
	public String getFreeWriter() {
		return freeWriter;
	}
	public void setFreeWriter(String freeWriter) {
		this.freeWriter = freeWriter;
	}
	public String getEmpWriter() {
		return empWriter;
	}
	public void setEmpWriter(String empWriter) {
		this.empWriter = empWriter;
	}
	public String getFreeReceiver() {
		return freeReceiver;
	}
	public void setFreeReceiver(String freeReceiver) {
		this.freeReceiver = freeReceiver;
	}
	public String getEmpReceiver() {
		return empReceiver;
	}
	public void setEmpReceiver(String empReceiver) {
		this.empReceiver = empReceiver;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public Date getMsgSendDate() {
		return msgSendDate;
	}
	public void setMsgSendDate(Date msgSendDate) {
		this.msgSendDate = msgSendDate;
	}
	public boolean getMsgChecked() {
		return msgChecked;
	}
	public void setMsgChecked(boolean msgChecked) {
		this.msgChecked = msgChecked;
	}

	public Integer getProjNum() {
		return projNum;
	}

	public void setProjNum(Integer projNum) {
		this.projNum = projNum;
	}

	public Date getMsgCheckedDate() {
		return msgCheckedDate;
	}

	public void setMsgCheckedDate(Date msgCheckedDate) {
		this.msgCheckedDate = msgCheckedDate;
	}

	@Override
	public String toString() {
		return "Message [msgNum=" + msgNum + ", prevMsgNum=" + prevMsgNum + ", freeWriter=" + freeWriter
				+ ", empWriter=" + empWriter + ", freeReceiver=" + freeReceiver + ", empReceiver=" + empReceiver
				+ ", msgTitle=" + msgTitle + ", msgContent=" + msgContent + ", msgSendDate=" + msgSendDate
				+ ", msgChecked=" + msgChecked + ", projNum=" + projNum + "]";
	}

	
	
}
