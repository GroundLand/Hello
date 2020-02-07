package importJAVASE.io;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cl
 * @version $Id: Employee v 0.1 2020-02-07 14:55 cl Exp $$
 */
@Data
public class Employee implements Serializable {

    private String name;

    private  double salary;

    private  int entryYear;

    private int entryMonth;

    private int enrtyDate;


    public Employee(String name, double salary, int entryYear, int entryMonth, int enrtyDate) {
        this.name = name;
        this.salary = salary;
        this.entryYear = entryYear;
        this.entryMonth = entryMonth;
        this.enrtyDate = enrtyDate;
    }
}
