package springweb.a02_mvc.a03_dao;
//springweb.a02_mvc.a03_dao.A01_EmpDao
import java.util.ArrayList;
import java.util.HashMap;

import springweb.z02_vo.Dept;
import springweb.z02_vo.Emp;
// springweb.a02_mvc.a03_dao.A01_EmpDao : namespace
// emplist : id
// ArrayList<Emp> : resultMap
// (Emp sch) : resultType
import springweb.z02_vo.Emp2;
import springweb.z03_vo.EmpDept;

public interface A01_EmpDao {
	public ArrayList<Emp> emplist(Emp sch);
	public void empInsert(Emp dto);
	public int totCnt();
	public Emp getEmp(int empno);
	public ArrayList<Emp2> searchEmp1(Emp2 sch);
	public ArrayList<Integer> searchEmp2(Emp2 sch);
	public ArrayList<Integer> searchEmp3(HashMap<String, Integer> hm);
	public Dept getDept(int deptno);
	public ArrayList<Emp> maxSal();
	public ArrayList<Emp> seachJob(String job);
	public int maxSalDeptno(int deptno);
	public ArrayList<EmpDept> schEDGList(EmpDept sch);
	public ArrayList<String> getJobs();
	public ArrayList<Emp> getMgrs();
	public ArrayList<Dept> getDepts();
}
