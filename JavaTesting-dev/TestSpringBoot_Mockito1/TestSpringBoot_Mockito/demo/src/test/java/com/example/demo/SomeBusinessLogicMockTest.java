package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessLogicMockTest {

  @InjectMocks
  DemoApplication business;

  @Mock
  SomeDataService dataServiceMock;

  @Test
  public void calculateSumUsingDataService_basic() {
    when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});
    assertEquals(6, business.calculateSumWithADataService());
  }
}