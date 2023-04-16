package com.samplepoc.newapplication;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.samplepoc.resources.MyResource;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class MyApiApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(MyResource.class);
        return classes;
    }
}
