package importJAVASE.useless;

public class Employer {
    //姓名
    private String name;
    //职称
    private String level;

    public Employer(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
