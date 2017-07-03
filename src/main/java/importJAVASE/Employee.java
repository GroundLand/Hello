package importJAVASE;

/**
 * Created by Administrator on 2017/3/22 0022.
 */
public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Employee(String name){
        this.name = name;
    }

}
