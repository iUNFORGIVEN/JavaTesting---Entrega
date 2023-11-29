package com.example.demo.MockTest;

import com.example.demo.Mock.AlmacenamientoService;
import com.example.demo.Mock.OperacionesService;
import com.example.demo.Mock.ServicioComplejo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ServicioComplejoTest {

  @Mock
  private OperacionesService mockOperacionesService;

  @Mock
  private AlmacenamientoService mockAlmacenamientoService;

  @InjectMocks
  private ServicioComplejo servicioComplejo;

  @Test
  public void testRealizarOperacionComplejayGuardar(){
    // Inicializar los mocks
    MockitoAnnotations.openMocks(this);

    // Configurar el comportamiento del mock
    when(mockOperacionesService.operacionCompleja(5, 5)).thenReturn(10);
    when(mockOperacionesService.operacionCompleja(5, 6)).thenReturn(10);

    //Ejecutar el metodo que se quiere probar
    servicioComplejo.realizarOperacionyGuardar(5,6);

    //Verificar que el metodo guardarResultado fue llamado con el resultado esperado
    verify(mockAlmacenamientoService).guardarResultado(10);
  }
}
