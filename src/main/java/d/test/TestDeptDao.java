package d.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import d.dao.DeptDao;
import d.entity.Dept;

public class TestDeptDao {

	DeptDao dao = new DeptDao();

	@Test
	public void testInsert() {

		List<Dept> depts = new ArrayList<>();

		depts.add(new Dept(111, "后勤部", "贵阳"));
		depts.add(new Dept(222, "督导部", "重庆"));
		depts.add(new Dept(333, "创意部", "上海"));

		dao.insertDept(depts);

	}

	@Test
	public void testUpdate() {

		List<Dept> depts = new ArrayList<Dept>();

//		depts.add(new Dept(111, "后勤部", "深圳"));
		depts.add(new Dept(222, "督导部", "深圳"));
		depts.add(new Dept(333, "创意部", "深圳"));

		dao.updateDept(depts);

	}

	@Test
	public void testDelete() {

		Integer[] deptId = { 111, 222, 333 };

		dao.deleteDept(deptId);

	}

}
