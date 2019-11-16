package c.test;

import org.junit.Test;

import c.dao.DeptDao;
import c.entity.Dept;

public class TestDeptDao {

	DeptDao dao = new DeptDao();

	/**
	 * 测试一级缓存
	 */
	@Test
	public void testSelectOneByDId() {
		Dept dept = dao.selectOneByDId(1);
		System.out.println(dept);
	}

	@Test
	public void testSelectOneByDName() {
		System.out.println("第一次查询: " + dao.selectOneByDName("财务部"));
		System.out.println("第二次查询: " + dao.selectOneByDName("财务部"));
	}

	@Test
	public void test3() {
		System.out.println(dao.selectOneByDName("财务部"));
		System.out.println(dao.selectOneByDName("市场部"));
		System.out.println(dao.selectOneByDName("财务部"));
		System.out.println(dao.selectOneByDName("市场部"));
	}

	@Test
	public void test4() {
		System.out.println(dao.selectOneByDName("财务部"));
		System.out.println(dao.selectOneByDName("市场部"));
		
		System.out.println(dao.selectOneByDName("行政部"));
		
		System.out.println(dao.selectOneByDName("市场部"));
		System.out.println(dao.selectOneByDName("财务部"));
	}

}
