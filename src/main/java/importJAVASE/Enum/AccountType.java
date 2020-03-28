package importJAVASE.Enum;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by Administrator on 2017/7/3 0003.
 */

public enum AccountType {
    SAVINT(1, "存在"), FIXED(2, "充满"), CURRENT(3, "当前的");

    //构造器默认私有
    AccountType(int num, String desr) {
        System.out.println("It is a private method");
    }

    private int num;

    public int getNum() {
        return num;
    }

    private String desr;

    public String getDesr() {
        return desr;
    }
}
