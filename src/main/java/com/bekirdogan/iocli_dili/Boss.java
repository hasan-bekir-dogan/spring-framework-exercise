package com.bekirdogan.iocli_dili;

public class Boss implements BossInterface{

    @Override
    public String version(String data) {
        return "version" + data;
    }
}
