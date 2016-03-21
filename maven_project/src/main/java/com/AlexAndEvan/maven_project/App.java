package com.AlexAndEvan.maven_project;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector();
        System.out.println(injector);
        System.out.println( "Hello World!" );
    }
}
