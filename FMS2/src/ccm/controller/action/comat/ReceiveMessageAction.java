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

public class ReceiveMessageAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "common/msg/showMsg.jsp";
		String freeWriter = request.getParameter("freeWriter");
		String empWriter = request.getParameter("empWriter");
		
		CommonDAO cDao = CommonDAO.getInstance();
		FreelancerDAO fDao = FreelancerDAO.getInstance();
		EmployeeDAO eDao = EmployeeDAO.getInstance();
		
		// 보내진 no를 msgNo 변수에 적용한다.
		String msgNo = request.getParameter("no");
		Message reMsg = new Message();
		
		System.out.println(msgNo);
		System.out.println(freeWriter);
		System.out.println(empWriter);
		

		// 현재 사용자의 회원번호를 세션으로부터 가져오는 과정
		Freelancer freeTempVo = (Freelancer) request.getSession().getAttribute("loginfree");
		Employee empTempVo = (Employee) request.getSession().getAttribute("loginemp");
						
		System.out.println(freeTempVo);
		System.out.println(empTempVo);
				
		List<Message> messageList = null;
				
		if( freeTempVo != null ) {
			messageList = cDao.selectAllMsgFree(freeTempVo.getFreeId());
		} else if( empTempVo != null ) {
			messageList = cDao.selectAllMsgEmp(empTempVo.getEmpId());
		}
		
		reMsg.setPrevMsgNum(Integer.parseInt(msgNo));
		reMsg.setProjNum(Integer.parseInt(request.getParameter("projNum")));
		reMsg.setMsgTitle(request.getParameter("msgTitle"));
		
		if( freeWriter != null ) {
			reMsg.setFreeReceiver(request.getParameter("freeWriter"));
			System.out.println(reMsg);
		} else if( empWriter != null ) {
			reMsg.setEmpReceiver(request.getParameter("empWriter"));
			System.out.println(reMsg);
		}

		System.out.println("------------------");
		System.out.println(reMsg);
		System.out.println("------------------");
		
		request.setAttribute("reMsg", reMsg);
		request.setAttribute("messageList", messageList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
