package b.test;

import java.util.List;

import org.junit.Test;

import b.dao.EmpDao;
import b.entity.Dept;

public class EmpDaoTest {

	@Test
	public void testSelectEmpByDeptName() {
		EmpDao dao = new EmpDao();

		List<Dept> list = dao.selectEmpByDeptName("研发部");
		System.out.println(list);
	}

}
