package notice.model.service;

import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;
import java.util.ArrayList;
import static common.JDBCTemp.*;
import java.sql.Connection;

public class NoticeService {
	private NoticeDao ndao = new NoticeDao();
	
	public NoticeService() {}
	
	public ArrayList<Notice> selectAll(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<Notice> list = ndao.selectAll(conn, currentPage, limit);
		close(conn);
		return list;
	}

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = ndao.getListCount(conn);
		close(conn);
		return listCount;
	}
	
	public int getListCount(String column, String keyword) {
		Connection conn = getConnection();
		int listCount = ndao.getListCount(conn, column, keyword);
		close(conn);
		return listCount;
	}

	public Notice selectCountTop1() {
		Connection conn = getConnection();
		Notice notice = ndao.selectCountTop1(conn);
		close(conn);
		return notice;
	}

	public ArrayList<Notice> searchTorC(int currentPage, int limit, String keyword, String column) {
		Connection conn = getConnection();
		ArrayList<Notice> list = ndao.searchTorC(conn, currentPage, limit, keyword, column);
		close(conn);
		return list;
	}

	public void addReadCount(int no) {
		Connection conn = getConnection();
		int result = ndao.addReadCount(conn, no);
		if(result > 0)
			commit(conn);
		else rollback(conn);
	}

	public Notice selectOne(int no) {
		Connection conn = getConnection();
		Notice notice = ndao.selectOne(conn, no);
		close(conn);
		return notice;
	}
}
