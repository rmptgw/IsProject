package ccm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ccm.data.dto.FreeLancerVO;
import ccm.util.DBManager;;

public class FreelancerDAO {
	private static FreelancerDAO instance = new FreelancerDAO();

	private FreelancerDAO() {
		super();
	}

	public static FreelancerDAO getInstance() {
		return instance;
	}

	public int insertFL(FreeLancerVO fVo) {
		int result = -1;
		String sql = "insert into freelancer(fid, fpw, email, joindate) VALUES(?, ?, ?, now())";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();	//DB연동
			pstmt = conn.prepareStatement(sql);
			// 각각의 변수(?)에 회원가입 화면에 입력한 값을 넣는다.
			pstmt.setString(1, fVo.getfID());
			pstmt.setString(2, fVo.getfPW());
			pstmt.setString(3, fVo.getEmail());

			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public FreeLancerVO getfVo(String id) {
		// TODO Auto-generated method stub

		Connection conn = null;
		String sql = "select * from freelancer where fid=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FreeLancerVO fVo = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				fVo = new FreeLancerVO();

				fVo.setfID(rs.getString("fid"));
				fVo.setfPW(rs.getString("fpw"));
				fVo.setName(rs.getString("name"));
				fVo.setPic(rs.getString("pic"));
				fVo.setBirth(rs.getDate("birth"));
				fVo.setSex(rs.getBoolean("sex"));
				fVo.setPhone(rs.getString("phone"));
				fVo.setEmail(rs.getString("email"));
				fVo.setEuClass(rs.getString("euclass"));
				fVo.setfClass(rs.getString("class"));
				fVo.setMarried(rs.getBoolean("married"));
				fVo.setFrontAddr(rs.getString("frontaddr"));
				fVo.setRearAddr(rs.getString("rearaddr"));
				fVo.setBank(rs.getString("bank"));
				fVo.setAccName(rs.getString("accname"));
				fVo.setAccount(rs.getString("account"));
				fVo.setReviser(rs.getString("reviser"));
				fVo.setRevDate(rs.getDate("revdate"));

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
		return fVo;
	}
}
