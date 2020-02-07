package importJAVASE.io;

import lombok.Data;

/**
 * @author cl
 * 2020-02-07 15:01
 */
@Data
public class Manager extends Employee{

    public Manager(String name, double salary, int entryYear, int entryMonth, int enrtyDate) {
        super(name, salary, entryYear, entryMonth, enrtyDate);
    }

    private Employee employee;
}
