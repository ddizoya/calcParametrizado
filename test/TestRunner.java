/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class TestRunner {
     public static void main(String[] args){
         Result resul = JUnitCore.runClasses(OperacionesTest.class);
         for (Failure failure : resul.getFailures()){
              System.out.println(failure.toString());
         }
          System.out.println(resul.wasSuccessful());
 
    }

}
