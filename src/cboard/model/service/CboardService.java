package cboard.model.service;
import java.sql.Connection;
import java.util.ArrayList;
import cboard.model.dao.CboardDao;
import cboard.model.vo.Cboard;
import static common.JDBCTemp.*;

public class CboardService {
	private CboardDao cdao = new CboardDao();
	
	public CboardService() {}

	public ArrayList<Cboard> selectAll(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<Cboard> list = cdao.selectList(conn, currentPage, limit);
		close(conn);
		return list;
	}

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = cdao.getListCount(conn);
		close(conn);
		return listCount;
	}

	public ArrayList<Cboard> selectLocal(int currentPage, int limit, String local) {
		Connection conn = getConnection();
		ArrayList<Cboard> list = cdao.selectLocal(conn, currentPage, limit, local);
		close(conn);
		return list;
	}

	public int getLocalListCount(String local) {
		Connection conn = getConnection();
		int listCount = cdao.getLocalListCount(conn, local);
		close(conn);
		return listCount;
	}

}
