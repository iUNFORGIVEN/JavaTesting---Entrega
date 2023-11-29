package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class SomeDataServiceStub implements SomeDataService {
  @Override
  public int[] retrieveAllData() {
    return new int[] { 1, 2, 3 };
  }
}


public class SomeBusinessStubTest {
  @Test
  public void calculateSumUsingDataService_basic() {
    DemoApplication business = new DemoApplication();
    business.setSomeDataService(new SomeDataServiceStub());
    int actualResult = business.calculateSumWithADataService();
    int expectedResult = 6;
    assertEquals(expectedResult, actualResult);
  }
}
