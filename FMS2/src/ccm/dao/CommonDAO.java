package ccm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import ccm.data.dto.*;
import ccm.util.DBManager;;

public class CommonDAO
{
	private static CommonDAO instance = new CommonDAO();
	private CommonDAO() { 
		super();
	}
	public static CommonDAO getInstance() { 
		return instance; 
		}


	Connection getConnection() {
		Connection conn = null;
		Context initContext;

		try {
			initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/mariadb");
			conn = ds.getConnection();

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public int loginCheck(String id, String pw, FreeLancerVO loginFree, EmployeeVO loginEmp) //로그인할때 아이디랑 비번이 맞는지 체크해주는거
	{
		System.out.println("id = " + id + ", pw = " + pw);
		//쿼리를 직원, 프리랜서 각각 실행해서 결과에 따라 로그인이 달라지게함 
		/*String freeSql = "SELECT FID, FPW, FNAME, FPIC, FBIRTH, FSEX, FPHONE, FEMAIL,"
				+ " FJOINDATE, FDROPDATE, EUCLASS, FCLASS, FMARRIED, FFRONTADDR, FREARADDR,"
				+ " FBANK, FACCNAME, FACCOUNT, REVISER, REVDATE FROM FREELANCER"
				+ " WHERE FID = ? AND FPW = ?";
		String empSql = "SELECT EID, EPW, ECLASS, ENAME, EDEPT, EPIC, EJOINDATE, EDROPDATE,"
				+ " EPHONE, EEMAIL, EBIRTH, ESEX, EMARRIED, EFRONTADDR, EREARADDR, EBANK,"
				+ " EACCNAME, EACCOUNT  FROM EMPLOYEE"
				+ " WHERE EID = ? AND EPW = ?";*/
		String freeSql = "SELECT * FROM FREELANCER WHERE FID = ? AND FPW = ?";
		String empSql = "SELECT * FROM EMPLOYEE WHERE EID = ? AND EPW = ?";
		
		//결과값 -1은 로그인실패 1은 프리랜서로그인 2는 직원로그인
		int res = -1;
		Connection conn = null;
		ResultSet freers = null;
		ResultSet emprs = null;
		PreparedStatement pstmt = null;
		
		try
		{
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(freeSql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			freers = pstmt.executeQuery();
			
			while (freers.next())
			{
				if(freers.getString("FID") != null);
				{	
					loginFree.setfID(freers.getString("FID"));
					loginFree.setName(freers.getString("NAME"));
					loginFree.setPic(freers.getString("PIC"));
					loginFree.setBirth(freers.getDate("birth"));
					loginFree.setSex(freers.getBoolean("SEX"));
					loginFree.setPhone(freers.getString("PHONE"));
					loginFree.setEmail(freers.getString("EMAIL"));
					loginFree.setJoinDate(freers.getDate("JOINDATE"));
					loginFree.setDropDate(freers.getDate("DROPDATE"));
					loginFree.setEuClass(freers.getString("EUCLASS"));
					loginFree.setMarried(freers.getBoolean("MARRIED"));
					loginFree.setFrontAddr(freers.getString("FRONTADDR"));
					loginFree.setRearAddr(freers.getString("REARADDR"));
					loginFree.setBank(freers.getString("BANK"));
					loginFree.setAccName(freers.getString("ACCNAME"));
					loginFree.setAccount(freers.getString("ACCOUNT"));
					loginFree.setReviser(freers.getString("REVISER"));
					loginFree.setRevDate(freers.getDate("REVDATE"));
					
					res = 1;
					break;
				}
			}
			
			pstmt.close();
			
			pstmt = conn.prepareStatement(empSql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			emprs = pstmt.executeQuery();
			
			while (emprs.next())
			{
				if(emprs.getString("EID") != null);
				{
					loginEmp.seteID(emprs.getString("EID"));
					loginEmp.setePW(emprs.getString("EPW"));
					loginEmp.seteClass(emprs.getString("CLASS"));
					loginEmp.seteName(emprs.getString("NAME"));
					loginEmp.seteDept(emprs.getString("DEPT"));
					loginEmp.setPic(emprs.getString("PIC"));
					loginEmp.setJoinDate(emprs.getDate("JOINDATE"));
					loginEmp.setDropDate(emprs.getDate("DROPDATE"));
					loginEmp.setPhone(emprs.getString("PHONE"));
					loginEmp.setEmail(emprs.getString("EMAIL"));
					loginEmp.setBirth(emprs.getDate("EBIRTH"));
					loginEmp.setSex(emprs.getBoolean("ESEX"));
					loginEmp.setMarried(emprs.getBoolean("MARRIED"));
					loginEmp.setFrontAddr(emprs.getString("FRONTADDR"));
					loginEmp.setRearAddr(emprs.getString("REARADDR"));
					loginEmp.setBank(emprs.getString("BANK"));
					loginEmp.setAccName(emprs.getString("ACCNAME"));
					loginEmp.setAccount(emprs.getString("ACCOUNT"));
					
					res = 2;
					break;
				}
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("왜안되지");
		}
		finally
		{
			DBManager.close(conn, pstmt,  freers, emprs);
		}
		
		System.out.println(loginFree == null ? "로그인프리널" : "로그인프리낫널");
		
		return res;
	}
}