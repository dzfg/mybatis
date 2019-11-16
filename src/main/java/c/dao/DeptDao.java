package c.dao;

import org.apache.ibatis.session.SqlSession;

import c.entity.Dept;
import util.MybatisUtil;

/**
 * 使用缓存的好处: 提高用户的访问速度. 减少连接访问数据库的次数. 等等<br>
 * 不管事一级缓存, 还是二级缓存, 其底层实现都是hashmap.<br>
 */
public class DeptDao {

	/**
	 * 一级缓存是存储在session中的. 同一个session中进行多次相同查询, 第一次会去数据库中查询, 后面每次都是在缓存中查询.
	 * 
	 * @param did
	 * @return
	 */
	public Dept selectOneByDId(int did) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();

		Dept dept = null;

		try {

			dept = sqlSession.selectOne(Dept.class.getName() + ".selectDeptByDID", did);
			System.out.println("第一次查询: " + dept);

			Dept d = sqlSession.selectOne(Dept.class.getName() + ".selectDeptByDID", did);
			System.out.println("第二次查询: " + d);
		} catch (Exception e) {
			e.printStackTrace();

			sqlSession.rollback();
		} finally {
			MybatisUtil.closeSqlSession();
		}

		return dept;
	}

	/**
	 * 二级缓存: 是存储在同一个命名空间下的mapper映射中, 由多个session共享, 需要手动设置启动二级缓存.<br>
	 * 
	 * 设置二级缓存有三处:<br> 
	 * 在mybatis-config.xml中配置settings[可以不用设置, 使用默认值]<br>
	 * 在mapper.xml的操作sql语句的标签上使用useCache属性, [可以不用设置, 使用默认值]<br>
	 * 在mapper.xml中配置cache标签, 其中重要的属性为 eviction 和 size<br>
	 * 
	 * 对于任何的涉及到commit的操作, 都清空了缓存
	 * 
	 * 
	 * @param dname
	 * @return
	 */
	public Dept selectOneByDName(String dname) {

		SqlSession sqlSession = MybatisUtil.getSqlSession();

		try {
			return sqlSession.selectOne(Dept.class.getName() + ".selectDeptByDName", dname);
		} catch (Exception e) {
			e.printStackTrace();

			sqlSession.rollback();
		} finally {
			MybatisUtil.closeSqlSession();
		}

		return null;
	}

}
