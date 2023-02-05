package com.bekirdogan.iocli_dili;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdilidiliEmployee")
@ApplicationScoped
public class Employee {

    private BossInterface bossInterface;

    public Employee() {
        bossInterface = new Boss();
    }

    public String getData(String data) {
        return bossInterface.version(data);
    }
}
