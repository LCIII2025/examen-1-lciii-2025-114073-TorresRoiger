package org.example.parking;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class EstacionamientoTest {

    @Test
    public void testRetirarVehiculo() throws Exception {
        //TODO test
        Estacionamiento estacionamiento = new Estacionamiento();
        Vehiculo vehiculo = new Vehiculo("123", "ModeloTest", Vehiculo.Tipo.AUTO);
        Cliente cliente = new Cliente("dni123", "Fran");

        estacionamiento.ingresarVehiculo(cliente.getDni(), cliente.getNombre(), vehiculo);

        Ticket ticket = estacionamiento.retirarVehiculo(vehiculo.getPatente());

        assertEquals(ticket.getVehiculo().getPatente(), "123");
    }

    @Test
    public void testCalcularPrecio() throws Exception {
        // TODO test
    }

}