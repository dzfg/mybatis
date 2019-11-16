package d.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import d.entity.Dept;
import util.MybatisUtil;

/**
 * 对于任何commit的操作,都是要清空缓存
 */
public class DeptDao {

	public int insertDept(List<Dept> depts) {

		SqlSession sqlSession = MybatisUtil.getSqlSession();

		try {

			int line = sqlSession.insert(Dept.class.getName() + ".insertDept", depts);

			sqlSession.commit();

			return line;
		} catch (Exception e) {
			e.printStackTrace();

			sqlSession.rollback();
		} finally {
			MybatisUtil.closeSqlSession();
		}

		return -1;
	}

	public int updateDept(List<Dept> depts) {

		SqlSession sqlSession = MybatisUtil.getSqlSession();

		try {

			int line = sqlSession.update(Dept.class.getName() + ".updateDept", depts);

			sqlSession.commit();

			return line;
		} catch (Exception e) {
			e.printStackTrace();

			sqlSession.rollback();
		} finally {
			MybatisUtil.closeSqlSession();
		}

		return -1;
	}

	public int deleteDept(Integer[] deptId) {

		SqlSession sqlSession = MybatisUtil.getSqlSession();

		try {

			int line = sqlSession.delete(Dept.class.getName() + ".deleteDept", deptId);

			sqlSession.commit();

			return line;
		} catch (Exception e) {
			e.printStackTrace();

			sqlSession.rollback();
		} finally {
			MybatisUtil.closeSqlSession();
		}

		return -1;
	}

}
