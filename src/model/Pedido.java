package model;

/**
 * Clase base que representa un pedido genérico del
 * Encapsula los atributos comunes a todos los tipos de pedido y define
 * el método asignarRepartidor() que las subclases sobrescriben, además
 * de una versión sobrecargada que recibe el nombre del repartidor.
 */
public class Pedido {

    private final String idPedido;
    private final String direccionEntrega;
    private final String tipoPedido;

    public Pedido(String idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    /** Versión genérica (sin repartidor asignado aún). Sobrescrita por cada subclase. */
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor...");
        System.out.println("-> Pedido " + idPedido + " en espera de asignacion generica.");
    }

    /** Versión sobrecargada: recibe el nombre del repartidor ya asignado. */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Asignando repartidor...");
        System.out.println("-> Pedido asignado a " + nombreRepartidor);
    }
}
