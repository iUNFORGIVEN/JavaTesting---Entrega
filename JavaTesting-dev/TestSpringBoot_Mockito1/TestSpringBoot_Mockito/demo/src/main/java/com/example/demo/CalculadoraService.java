package com.example.demo;


import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
  public int sumar(int a, int b){
    return a+b;
  }
}
