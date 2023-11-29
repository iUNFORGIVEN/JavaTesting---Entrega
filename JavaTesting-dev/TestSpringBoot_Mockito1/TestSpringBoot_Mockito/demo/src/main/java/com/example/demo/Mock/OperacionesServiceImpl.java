package com.example.demo.Mock;

public class OperacionesServiceImpl implements OperacionesService{
  @Override
  public int operacionCompleja(int a, int b) {
    return a*b+a;
  }
}
