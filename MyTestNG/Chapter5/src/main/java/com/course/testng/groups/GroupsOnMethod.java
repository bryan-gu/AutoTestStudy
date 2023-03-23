package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("test1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("test2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("test3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("test4");
    }


    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("BeforeGroupOnServer");
    }

    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("AfterGroupOnServer");
    }

    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("BeforeGroupOnClient");
    }

    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("AfterGroupOnClient");
    }
}
