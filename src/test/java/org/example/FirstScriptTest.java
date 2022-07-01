package org.example;

import org.junit.Test;

public class FirstScriptTest extends TestBase {

    @Test
    public void PlansTest() {
        main.choosePage("Plans");
        testOne.checkPage("New plan");
        System.out.println("We are in Plans!");
    }

    @Test
    public void KeywordsTest() {
        main.choosePage("Keywords");
        testOne.checkPage("New keyword");
        System.out.println("We are in Keywords!");
    }

    @Test
    public void ParametersTest() {
        main.choosePage("Parameters");
        testOne.checkPage("New parameter");
        System.out.println("We are in Parameters!");
    }

    @Test
    public void SchedulerTest() {
        main.choosePage("Scheduler");
        testOne.checkPage("New task");
        System.out.println("We are in Scheduler!");

    }


}

