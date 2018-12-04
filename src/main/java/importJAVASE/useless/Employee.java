package importJAVASE.useless;

public class Employee {
    private String name;
    private Employer employer;

    public Employee(String name, Employer employer) {
        this.name = name;
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
