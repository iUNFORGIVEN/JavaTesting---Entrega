package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


  @Autowired
  private CalculadoraService calculadoraService;

  @GetMapping("/sumar")
  public int sumar(@RequestParam int a, @RequestParam int b){
    return a +b;
  }

}
