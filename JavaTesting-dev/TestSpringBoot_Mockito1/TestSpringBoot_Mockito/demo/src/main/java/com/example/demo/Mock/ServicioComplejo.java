package com.example.demo.Mock;

public class ServicioComplejo {
  private OperacionesService operacionesService;
  private AlmacenamientoService almacenamientoService;

  public ServicioComplejo(OperacionesService operacionesService, AlmacenamientoService almacenamientoService)
  {
    this.operacionesService =operacionesService;
    this.almacenamientoService = almacenamientoService;
  }

  public void realizarOperacionyGuardar(int a, int b){
    int resultado = operacionesService.operacionCompleja(a,b);
    almacenamientoService.guardarResultado(resultado);
  }
}
