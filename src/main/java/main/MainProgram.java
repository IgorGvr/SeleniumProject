package main;

import config.LoginPassword;
import config.TestCapabilities;
import config.TestChome;
import config.TestFirefox;

/**
 * Created by olga-UI on 12/29/18.
 */
public class MainProgram {

    public static void main(String[] args) throws InterruptedException {


        //TestChome chome = new TestChome();                        //1
        //chome.testChrome();
        TestFirefox testMozilla = new TestFirefox();              //2
        testMozilla.testFirefox();
        //LoginPassword loginPassword = new LoginPassword();        //3

        //TestCapabilities test1 = new TestCapabilities();
        //test1.startTest();



    }
}
