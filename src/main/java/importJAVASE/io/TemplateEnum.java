package importJAVASE.io;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cl
 * @version $Id: TemplateEnum.java v 0.1 18-12-11 下午7:59 cl Exp $$
 */
public enum  TemplateEnum {
    DZ("代账合同","记账报税"),
    REGISTER("公司注册合同","公司注册"),
    LOGOUT("公司注销合同","公司注销"),
    CHANGE("工商变更合同","工商变更");

    private String name;

    private String agreementName;

    TemplateEnum(String name, String agreementName) {
        this.name = name;
        this.agreementName = agreementName;
    }

    public static List<TemplateEnum> getList(){
        return Lists.newArrayList(TemplateEnum.values());
    }

    public String getName() {
        return name;
    }

    public String getAgreementName() {
        return agreementName;
    }
}
