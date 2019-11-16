package b.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import b.entity.Dept;
import util.MybatisUtil;

public class EmpDao {

	public List<Dept> selectEmpByDeptName(String name) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		try {
			return sqlSession.selectList(Dept.class.getName() + ".selectEmpByDeptName", name);
		} catch (Exception e) {
			e.printStackTrace();

			sqlSession.rollback();
		} finally {
			MybatisUtil.closeSqlSession();
		}

		return null;
	}

}
