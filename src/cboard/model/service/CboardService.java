package cboard.model.service;
import java.sql.Connection;
import java.util.ArrayList;
import cboard.model.dao.CboardDao;
import cboard.model.vo.Cboard;
import static common.JDBCTemp.*;

public class CboardService {
	private CboardDao cdao = new CboardDao();
	
	public CboardService() {}

	public ArrayList<Cboard> selectAll(int currentPage, int limit, String local) {
		Connection conn = getConnection();
		ArrayList<Cboard> list = cdao.selectList(conn, currentPage, limit, local);
		close(conn);
		return list;
	}

	public int getListCount(String local) {
		Connection conn = getConnection();
		int listCount = cdao.getListCount(conn, local);
		close(conn);
		return listCount;
	}

}