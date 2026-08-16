package model;

/**
 * Pedido de encomienda: requiere validación de peso y embalaje.
 */
public class PedidoEncomienda extends Pedido {

    private final double pesoKg;

    public PedidoEncomienda(String idPedido, String direccionEntrega, double pesoKg) {
        super(idPedido, direccionEntrega, "Encomienda");
        this.pesoKg = pesoKg;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> Validando peso (" + pesoKg + " kg) y embalaje... OK");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> Validando peso (" + pesoKg + " kg) y embalaje... OK");
        System.out.println("-> Pedido asignado a " + nombreRepartidor);
    }
}
