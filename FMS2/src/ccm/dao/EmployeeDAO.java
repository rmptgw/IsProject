package ccm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ccm.data.dto.EmployeeVO;
import ccm.util.DBManager;

public class EmployeeDAO {
	private static EmployeeDAO instance = new EmployeeDAO();
	
	private EmployeeDAO() {
		super();
	}
	
	public static EmployeeDAO getInstance() {
		return instance;
	}
	
	public EmployeeVO geteVo(String id) {
		// TODO Auto-generated method stub

		EmployeeDAO eDao;
		Connection conn = null;
		String sql = "select * from emplyee where eid=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO eVo = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				eVo = new EmployeeVO();

				eVo.seteID(rs.getString("eid"));
				eVo.setePW(rs.getString("epw"));
				eVo.seteClass(rs.getString("eclass"));
				eVo.seteName(rs.getString("ename"));
				eVo.seteDept(rs.getString("edept"));
				eVo.setPic(rs.getString("pic"));
				eVo.setJoinDate(rs.getDate("joindate"));
				eVo.setDropDate(rs.getDate("dropdate"));
				eVo.setPhone(rs.getString("phone"));
				eVo.setEmail(rs.getString("email"));
				eVo.setBirth(rs.getDate("birth"));
				eVo.setSex(rs.getBoolean("sex"));
				eVo.setMarried(rs.getBoolean("married"));
				eVo.setFrontAddr(rs.getString("frontaddr"));
				eVo.setRearAddr(rs.getString("rearaddr"));
				eVo.setBank(rs.getString("bank"));
				eVo.setAccName(rs.getString("accname"));
				eVo.setAccount(rs.getString("account"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return eVo;
	}
	
	public void insertEmp(EmployeeVO eVo) {
		String sql = "insert into employee('eid','epw','frontaddr', 'rearaddr') VALUES(?, ?, ?, ?)";
		Connection conn = null;

		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			// ?占쏙옙 占쏙옙 占쏙옙占쏙옙

			pstmt.setString(1, eVo.geteID());
			pstmt.setString(2, eVo.getePW());
			pstmt.setString(3, eVo.getFrontAddr());
			pstmt.setString(4, eVo.getRearAddr());
			System.out.println(pstmt.executeUpdate());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
