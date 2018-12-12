package importJAVASE.io;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cl
 * @version $Id: AgreementEnum.java v 0.1 18-12-11 下午4:08 cl Exp $$
 */
public enum AgreementEnum {
    TAX(1,2,"0","记账报税","代"),

    BOOK(1,3,"200.00","账本费","本"),
    REGISTER(2,1,"0","公司注册","注"),
    LOGOUT(2,1,"0","公司注销","销"),
    CHANGE(2,1,"0","工商变更","变");

    private int type;

    private int unit;

    private String price;

    private String name;

    private String shortName;

    AgreementEnum(int type, int unit, String price, String name,String shortName) {
        this.type = type;
        this.unit = unit;
        this.price = price;
        this.name = name;
        this.shortName = shortName;
    }

    public static List<AgreementEnum> getList(){
        return Lists.newArrayList(AgreementEnum.values());
    }

    public static AgreementEnum getByName(String name){
        for (AgreementEnum agreementEnum:AgreementEnum.values()){
            if (agreementEnum.getName().equals(name)){
                return agreementEnum;
            }
        }
        return null;
    }


    public static List<String> getNameList(){
        List<String> list = new ArrayList<>();
        for (AgreementEnum agreementEnum:AgreementEnum.values()){
            list.add(agreementEnum.getName());
        }
        return list;
    }

    public int getType() {
        return type;
    }

    public int getUnit() {
        return unit;
    }

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }
}
