package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest{

  @Test
  public void testOperacionSumaStub(){
    ServicioMatematico sumaStub = new OperacionStub();
    Calculadora calculadora=new Calculadora(sumaStub);
    int resultado = calculadora.realizarSuma(5,6);


    assertEquals(13,resultado);

  }

  @Test
  public void testOperationMultiStub()
  {
    ServicioMatematico multiplicacionstub = new OperacionStub();
    Calculadora calculadora =new Calculadora(multiplicacionstub);

    int resultado =calculadora.realizarMultiplicacion(5,5);

    assertEquals(25,resultado);
  }

  @Test
  public void testOperationRestaStub()
  {
    ServicioMatematico restastub = new OperacionStub();
    Calculadora calculadora =new Calculadora(restastub);

    int resultado =calculadora.realizarResta(5,5);

    assertEquals(0,resultado);
  }


  @Test
  public void testRealizarOperacionConSumaReal() {
    Operacion sumaReal = new Suma();
    Calculadora calculadora = new Calculadora(sumaReal);

    int resultado = calculadora.realizarOperacion(2, 3);

    assertEquals(5, resultado);
  }

  @Test
  public void testRealizarOperacionConRestaReal() {
    Operacion restaReal = new Resta();
    Calculadora calculadora = new Calculadora(restaReal);

    int resultado = calculadora.realizarOperacion(7, 4);

    assertEquals(3, resultado);
  }

  @Test
  public void testRealizarOperacionConMultiplicacionReal() {
    Operacion multiplicacionReal = new Multi();
    Calculadora calculadora = new Calculadora(multiplicacionReal);

    int resultado = calculadora.realizarOperacion(4, 2);

    assertEquals(8, resultado);
  }
}
