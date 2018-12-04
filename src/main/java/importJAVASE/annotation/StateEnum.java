package importJAVASE.annotation;

/**
 *
 * @author cln
 * @version $Id: StateEnum.java v 0.1 18-11-5 下午1:45 cln Exp $$
 */
public enum StateEnum implements EnumInterface {

    YES(0, "正确"),

    NO(1, "错误");

    private Integer type;

    private String desc;

    StateEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static StateEnum getByType(Integer type) {
        for (StateEnum stateEnum : StateEnum.values()) {
            if (stateEnum.getType().equals(type)) {
                return stateEnum;
            }
        }
        return null;
    }

    public static String getDescByType(Integer type) {
        for (StateEnum stateEnum : StateEnum.values()) {
            if (stateEnum.getType().equals(type)) {
                return stateEnum.getDesc();
            }
        }
        return "";
    }
}
