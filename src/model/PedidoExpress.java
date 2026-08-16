package model;

/**
 * Compra express (supermercado o farmacia): debe asignarse al repartidor
 * más cercano con disponibilidad inmediata.
 */
public class PedidoExpress extends Pedido {

    private final String tipoTienda;

    public PedidoExpress(String idPedido, String direccionEntrega, String tipoTienda) {
        super(idPedido, direccionEntrega, "Pedido Express");
        this.tipoTienda = tipoTienda;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express - " + tipoTienda + "]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> Repartidor mas cercano con disponibilidad inmediata encontrado.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Express - " + tipoTienda + "]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> Repartidor mas cercano con disponibilidad inmediata encontrado.");
        System.out.println("-> Pedido asignado a " + nombreRepartidor);
    }
}
