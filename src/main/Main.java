package main;

import data.DatosPrueba;
import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

/**
 * Clase de prueba del sistema SpeedFast. Instancia un pedido de cada tipo
 * y demuestra el polimorfismo llamando a asignarRepartidor() en su versión
 * sobrescrita (sin argumentos) y sobrecargada (con el nombre del repartidor).
 */
public class Main {

    public static void main(String[] args) {
        Pedido[] pedidos = {
                new PedidoComida("P-001", "Av. Siempre Viva 123"),
                new PedidoEncomienda("P-002", "Calle Los Alamos 45", 3.5),
                new PedidoExpress("P-003", "Pasaje Las Rosas 78", "Farmacia")
        };
        String[] repartidores = DatosPrueba.obtenerRepartidores();

        for (int i = 0; i < pedidos.length; i++) {
            Pedido pedido = pedidos[i];
            pedido.asignarRepartidor();
            pedido.asignarRepartidor(repartidores[i]);
            System.out.println();
        }
    }
}
