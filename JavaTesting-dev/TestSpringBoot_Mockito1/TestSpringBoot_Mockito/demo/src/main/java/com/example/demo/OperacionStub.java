package com.example.demo;

public class OperacionStub implements ServicioMatematico, Operacion{
  @Override
  public int realizarOperacion(int a, int b) {
    return 0;
  }

  @Override
  public int sumar(int a, int b) {
    return 13;
  }

  @Override
  public int multiplicar(int a, int b) {
    return 25;
  }

  @Override
  public int resta(int a, int b) {
    return 0;
  }



}


