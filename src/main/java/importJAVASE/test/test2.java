package importJAVASE.test;

import importJAVASE.useless.CopyEmployee;
import importJAVASE.useless.Employee;
import importJAVASE.useless.Employer;
import org.springframework.beans.BeanUtils;

/**
 * Created by Administrator on 2017/3/29 0029.
 */
public class test2 {
    public static void main(String[] args) {
        Employer employer = new Employer("bob", "1");
        Employee employee = new Employee("john", employer);
        CopyEmployee coptEm = new CopyEmployee();
        BeanUtils.copyProperties(employee, coptEm);
        coptEm.getEmployer();
    }
}
