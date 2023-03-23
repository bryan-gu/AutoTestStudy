package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Grouping {
    @BeforeClass(alwaysRun = true)
    public void beforeClass(){
        System.out.println("BeforeClass");
    }

    @Test(groups = {"suv","cars"})
    public void testBMWX6(){
        System.out.println("Running Test - BMW X6");
    }
    @Test(groups = {"sedan","cars"})
    public void testAudiA6(){
        System.out.println("Running Test - AudiA6");
    }
    @Test(groups = "moto")
    public void testNinja(){
        System.out.println("Running Test - Kawasaki Ninja");
    }
    @Test(groups = "moto")
    public void testHondaCBR(){
        System.out.println("Running Test - Honda CBR");
    }
    @AfterClass(alwaysRun = true)
    public void afterClass(){
        System.out.println("AfterClass");
    }
}
