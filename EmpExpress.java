import java.util.ArrayList;

public interface EmpExpress<T> {
    abstract void ListOfEmp(ArrayList e);
    default int MaxSalary(ArrayList e){
       return 5;
    }

}
