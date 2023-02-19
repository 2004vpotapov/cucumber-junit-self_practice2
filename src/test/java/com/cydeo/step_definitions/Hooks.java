package com.cydeo.step_definitions;

import com.cydeo.utulities.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

   @After
    public void setUp(){

   }

   @After
    public void tearDown(Scenario scenario){

       if(scenario.isFailed()){
           byte[] data = ( ( TakesScreenshot ) Driver.getDriver() ).getScreenshotAs(OutputType.BYTES);
           scenario.attach(data,"image/png", scenario.getName());
       }

     //  Driver.closeDriver();


   }
}
