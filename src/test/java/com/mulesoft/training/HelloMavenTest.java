package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

	@Rule
	public DynamicPort myPort = new DynamicPort("http.port");
	
/*
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("\n\nTestCase#1------------------- http Port: " +
    			myPort.getNumber() + "\n\n");
        runFlowAndExpect("mavenFlow", "Hello");
    }
*/  
    @Override
    protected String[] getConfigFiles() {

    	String[] files = {"maven-project.xml", "common-resources.xml"};
    	System.out.println("\n\nTestCase#2------------------- http Port: " +
    			myPort.getNumber() + "\n\n");
        return files;
    }

}
