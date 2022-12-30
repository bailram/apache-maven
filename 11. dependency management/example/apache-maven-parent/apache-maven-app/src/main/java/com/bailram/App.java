package com.bailram;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        System.out.println( "Hello World!" );
        Person person = new Person("Dhimas");
        System.out.println(gson.toJson(person));
    }
}
