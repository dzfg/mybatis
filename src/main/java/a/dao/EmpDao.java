package a.dao;

import org.apache.ibatis.session.SqlSession;

import a.entity.Emp;
import util.MybatisUtil;

public class EmpDao {

	public Emp selectEmpAndDeptByEmpName(String name) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		try {
			return sqlSession.selectOne(Emp.class.getName() + ".selectEmpAndDeptByEmpName", name);
		} catch (Exception e) {
			e.printStackTrace();

			sqlSession.rollback();
		} finally {
			MybatisUtil.closeSqlSession();
		}

		return null;
	}

}
