package Enum;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
enum AccountType {
    SAVINT,FIXED,CURRENT;
    private AccountType(){
        System.out.println("It is a private method");
    }
}
