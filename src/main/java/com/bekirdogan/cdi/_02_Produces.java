package com.bekirdogan.cdi;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {
    @Produces   // üretiyor
    public List<String> getList () {
        List<String> newList = new ArrayList<>();
        newList.add("Html5");
        newList.add("css3");
        newList.add("js");
        newList.add("react");
        newList.add("angular");
        return newList;
    }
}
