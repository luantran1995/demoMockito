package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessStubTest {
@Test
public void testFindTheGreatestFromAllData() {
	SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
	int result = businessImpl.findTheGreatestFromAllData();
	assertEquals(24, result);

}
}
