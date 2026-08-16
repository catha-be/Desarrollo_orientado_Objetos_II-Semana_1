package model;

/**
 * Pedido de comida: requiere repartidor con mochila térmica.
 */
public class PedidoComida extends Pedido {

    public PedidoComida(String idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Comida");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> Verificando mochila termica... OK");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> Verificando mochila termica... OK");
        System.out.println("-> Pedido asignado a " + nombreRepartidor);
    }
}
