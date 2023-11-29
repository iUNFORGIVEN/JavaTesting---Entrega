package com.example.demo;

public class Calculadora {
  private ServicioMatematico operacion;
  private Operacion operacion2;


  public Calculadora(Operacion operacion2){
    this.operacion2 =  operacion2;
  }
  public Calculadora(ServicioMatematico operacion){
    this.operacion =  operacion;
  }

  public int realizarSuma(int a, int b){
    return operacion.sumar(a,b);
  }

  public int realizarMultiplicacion(int a, int b){
    return operacion.multiplicar(a,b);
  }

  public int realizarResta(int a, int b){
    return operacion.resta(a,b);
  }

  public int realizarOperacion(int a, int b){
    return operacion2.realizarOperacion(a,b);
  }


}
