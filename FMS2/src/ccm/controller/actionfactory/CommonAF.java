package ccm.controller.actionfactory;

import ccm.controller.Action;
import ccm.controller.action.*;
import ccm.controller.action.commonAction.*;

/***************************
 * 
 * 
 * �븙�� �씤�꽣�럹�씠�뒪
 * �씠嫄몃줈 媛� 湲곕뒫�쓽 �븸�뀡�쓣 留뚮뱺�떎
 * 
 * �옉�꽦�옄 : 
 * 
 * �닔�젙�옄 : 
 * 
 * �닔�젙�씪 : 
 *
 *
 ***************************/

public class CommonAF
{
	private static CommonAF instance = new CommonAF();
	private CommonAF() { super(); }
	
	public static CommonAF getInstance() { return instance; }
	
	public Action getAction(String command) 
	{
		Action action = null;
		System.out.println("CommonAF :" + command);

		if (command.equals("main")) { 
			action = new GoToMainAction(); 
		} else if (command.equals("login")) {
			action = new GoToLoginAction();
		} else if(command.equals("login_form")) {
			action = new LoginProcessAction();
		} else if (command.equals("logout")){
			action = new LogoutAction();
		} else if (command.equals("join_form")) {
			action = new JoinFormAction();
		} else if (command.equals("join")) {
			action = new JoinAction();
		} else if (command.equals("message_form")) {
			action = new MessageFormAction();
		}

		return action;
	}
}
