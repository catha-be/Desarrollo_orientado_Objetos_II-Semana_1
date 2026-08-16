# Semana 1 — SpeedFast: Sobrecarga y sobreescritura en clases derivadas

Actividad formativa individual de **Desarrollo Orientado a Objetos II** (Duoc UC). Implementa un sistema simplificado de asignación de repartidores para SpeedFast, aplicando **polimorfismo** mediante sobrecarga y sobreescritura del método `asignarRepartidor()`.

## Caso

SpeedFast ofrece tres tipos de servicio, cada uno con un criterio distinto de asignación de repartidor:

| Tipo de pedido | Criterio de asignación |
| --- | --- |
| Comida | Repartidor con mochila térmica |
| Encomienda | Validación de peso y embalaje |
| Compra Express | Repartidor más cercano con disponibilidad inmediata |

## Estructura del proyecto

```
Semana_1/
└── src/
    ├── model/
    │   ├── Pedido.java             # Clase base: atributos + asignarRepartidor() genérico
    │   ├── PedidoComida.java       # Sobrescribe/sobrecarga: mochila térmica
    │   ├── PedidoEncomienda.java   # Sobrescribe/sobrecarga: peso y embalaje
    │   └── PedidoExpress.java      # Sobrescribe/sobrecarga: cercanía y disponibilidad
    ├── data/
    │   └── DatosPrueba.java        # Datos de ejemplo: nombres de repartidores disponibles
    └── main/
        └── Main.java               # Instancia cada subclase y demuestra el polimorfismo
```

- **`model`** — la jerarquía de clases (`Pedido` y sus tres subclases).
- **`data`** — datos de ejemplo desacoplados de `Main` (repartidores de prueba).
- **`main`** — punto de entrada: aquí se instancian los pedidos, tal como exige la pauta.

## Diseño

- **`Pedido`** encapsula `idPedido`, `direccionEntrega` y `tipoPedido` (privados, con getters) e implementa un constructor completo.
- **`asignarRepartidor()`** (sin argumentos) está definido de forma genérica en `Pedido` y **sobrescrito** en cada subclase con la lógica de validación propia de su tipo.
- **`asignarRepartidor(String nombreRepartidor)`** es la versión **sobrecargada**: recibe el nombre del repartidor y, en cada subclase, imprime tanto la validación específica del tipo de pedido como la confirmación de asignación.
- **`DatosPrueba`** (paquete `data`) provee los nombres de repartidores de ejemplo.
- **`Main`** instancia un `PedidoComida`, un `PedidoEncomienda` y un `PedidoExpress`, los recorre como `Pedido[]` y llama ambas versiones del método sobre cada uno, evidenciando el polimorfismo (mismo tipo de referencia, comportamiento distinto según la instancia real).

## Cómo compilar y ejecutar

Requiere JDK instalado (`javac`/`java` en el PATH).

```bash
cd Semana_1
javac -d out src/model/*.java src/data/*.java src/main/*.java
java -cp out main.Main
```

### Desde IntelliJ IDEA

1. Abrir esta carpeta (`Semana_1`) como proyecto, o agregarla como módulo.
2. Marcar `src/` como **Sources Root** (clic derecho → *Mark Directory as* → *Sources Root*).
3. Ejecutar `main.Main`.

## Salida esperada (consola)

```
[Pedido Comida]
Asignando repartidor...
-> Verificando mochila termica... OK
[Pedido Comida]
Asignando repartidor...
-> Verificando mochila termica... OK
-> Pedido asignado a Juan Perez

[Pedido Encomienda]
Asignando repartidor...
-> Validando peso (3.5 kg) y embalaje... OK
[Pedido Encomienda]
Asignando repartidor...
-> Validando peso (3.5 kg) y embalaje... OK
-> Pedido asignado a Camila Soto

[Pedido Express - Farmacia]
Asignando repartidor...
-> Repartidor mas cercano con disponibilidad inmediata encontrado.
[Pedido Express - Farmacia]
Asignando repartidor...
-> Repartidor mas cercano con disponibilidad inmediata encontrado.
-> Pedido asignado a Luis Diaz
```

(El primer bloque de cada pedido corresponde a la llamada sin argumentos —versión sobrescrita—; el segundo, a la llamada con el nombre del repartidor —versión sobrecargada—.)