package a.test;

import org.junit.Test;

import a.dao.EmpDao;
import a.entity.Emp;

public class EmpDaoTest {

	@Test
	public void testSelectEmpAndDeptByEmpName() {
		EmpDao dao = new EmpDao();

		Emp emp = dao.selectEmpAndDeptByEmpName("马云");
		System.out.println(emp);
	}

}
