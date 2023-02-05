package com.bekirdogan.iocisz_disiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdisizEmployee")
@ApplicationScoped
public class Employee {

    private Boss boss;

    public Employee() {
        boss = new Boss();
    }

    public String getData(String data) {
        return boss.version(data);
    }
}
