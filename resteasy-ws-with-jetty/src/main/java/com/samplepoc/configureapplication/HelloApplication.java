package com.samplepoc.configureapplication;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.samplepoc.resources.GoodbyeResource;
import com.samplepoc.resources.HelloResource;

import java.util.HashSet;
import java.util.Set;

/*
 * This class ia a Jax-RS configuration class which register HelloResource to the application.
 *  
 */


@ApplicationPath("/")
public class HelloApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(HelloResource.class);
        classes.add(GoodbyeResource.class);
        return classes;
    }
}
