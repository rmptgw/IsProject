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

public class ShowMessageAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// showMsg/메시지 확인 페이지로 이동하는 액션
		String url = "common/msg/showMsg.jsp";
		
		// 보내진 no를 msgNo 변수에 적용한다.
		String msgNo = request.getParameter("no");
		
		CommonDAO cDao = CommonDAO.getInstance();
		FreelancerDAO fDao = FreelancerDAO.getInstance();
		EmployeeDAO eDao = EmployeeDAO.getInstance();
		
		// 메시지 번호를 통해 메시지를 가져온다.
		Message message =  cDao.selectOneMsgByNo(msgNo);
		
		// 메시지 번호를 통해 수신일을 업데이트 한다.
		// message = cDao.updateMsgCheckedDate(msgNo);
		
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

		System.out.println(message);
		
		
		
		request.setAttribute("messageList", messageList);
		request.setAttribute("message", message);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
