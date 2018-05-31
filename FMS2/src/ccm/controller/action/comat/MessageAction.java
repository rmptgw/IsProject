package ccm.controller.action.comat;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ccm.controller.Action;
import ccm.dao.CommonDAO;
import ccm.dao.EmployeeDAO;
import ccm.dao.FreelancerDAO;
import ccm.data.table.Employee;
import ccm.data.table.Freelancer;
import ccm.data.table.Message;

public class MessageAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "common/msg/showMsg.jsp";
		String freeWriter = request.getParameter("freeWriter");
		String empWriter = request.getParameter("empWriter");
		String prevMsgNum = request.getParameter("prevMsgNum");
		String receiver = request.getParameter("receiver");
		String projNum = request.getParameter("projNum");
		String title = request.getParameter("msgTitle");
		String content = request.getParameter("msgContent");
		Message msgVo = new Message();
		
		CommonDAO cDao = CommonDAO.getInstance();
		FreelancerDAO fDao = FreelancerDAO.getInstance();
		EmployeeDAO eDao = EmployeeDAO.getInstance();

		// 메세지 보내는 사람의 id를 tempVo에 넣음
		Freelancer freeTempVo = (Freelancer) request.getSession().getAttribute("loginfree");
		Employee empTempVo = (Employee) request.getSession().getAttribute("loginemp");
		
		// 수신인 확인
		Freelancer freeId = fDao.getfVo(freeWriter);
		Employee empId = eDao.geteVo(empWriter); 

		int res = cDao.msgReceiverCheck(receiver);
		
		switch(res) {
		case 1: 
			msgVo.setFreeReceiver(receiver);
			break;
		case 2:
			msgVo.setEmpReceiver(receiver);
			break;
		default:
			break;	
		}
		
		/*if(prevMsgNum == null) {
			prevMsgNum = "0";
		}*/
		if(projNum == null) {
			projNum = "0";
		}
		if(title == null) {
			title = "";
		}
		if (content == null) {
			content = "";
		}
		msgVo.setProjNum(Integer.parseInt(projNum));
		msgVo.setMsgTitle(title);
		msgVo.setMsgContent(content);
		msgVo.setPrevMsgNum(Integer.parseInt(prevMsgNum));
		
		if( freeTempVo != null ) {
			msgVo.setFreeWriter(request.getParameter("freeWriter"));
		} else if( empTempVo != null ) {
			msgVo.setEmpWriter(request.getParameter("empWriter"));
		}
		
		
		cDao.insertMsg(msgVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
