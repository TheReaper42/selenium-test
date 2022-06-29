package org.example;

import org.junit.Test;


public class FirstScriptTest extends TestBase {


    @Test
    public void SeleniumTest() {
        main.goTo();
        main.clickButton();
        testOne.checkPage("New plan");
        System.out.println("We are in Plans!");


        main.choosePage("Keywords");
        testOne.checkPage("New keyword");
        System.out.println("We are in Keywords!");


        main.choosePage("Parameters");
        testOne.checkPage("New parameter");
        System.out.println("We are in Parameters!");


        main.choosePage("Scheduler");
        testOne.checkPage("New task");
        System.out.println("We are in Scheduler!");

    }
}

