import java.util.ArrayList;
import java.util.Date;

public class Main {
    static ArrayList<Emp> employee=new ArrayList<>();
    public static void main(String[] args) {
            Emp e=new Emp();
            Emp e1=new Emp();
            Emp e2=new Emp();
            Emp e3=new Emp();
            Emp e4=new Emp();
            e.setFirstName("Deepesh");
            e.setLastName("Sharame");
            e.setDate(new Date());
            e.setSalary(15000.50);
            e.setId(1);
            e1.setFirstName("gaurav");
            e1.setLastName("bhasin");
            e1.setDate(new Date());
            e1.setSalary(16.50);
            e1.setId(2);
            e2.setFirstName("anas");
            e2.setLastName("khan");
            e2.setDate(new Date());
            e2.setSalary(000.50);
            e2.setId(3);
            e3.setFirstName("keshav");
            e3.setLastName("puri");
            e3.setDate(new Date());
            e3.setSalary(16000.50);
            e3.setId(4);
            e4.setFirstName("amritpal");
            e4.setLastName("singh");
            e4.setDate(new Date());
            e4.setSalary(1000.50);
            e4.setId(5);
            employee.add(e);
            employee.add(e1);
            employee.add(e2);
            employee.add(e3);
            employee.add(e4);

            EmpExpress x=(p)->{
                    for (Object k:p) {
                            System.out.println(((Emp)k).getFirstName());
                    }
            };
            x.ListOfEmp(employee);
            }
}
