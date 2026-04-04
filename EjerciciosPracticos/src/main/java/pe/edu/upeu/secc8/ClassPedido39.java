package pe.edu.upeu.secc8;

//Pedido
public class ClassPedido39 {

    private String cliente;
    private String producto;
    private int cantidad;
    private double descuento;
    private String direccion;
    private String notas;

    private ClassPedido39(Builder b) {
        this.cliente = b.cliente;
        this.producto = b.producto;
        this.cantidad = b.cantidad;
        this.descuento = b.descuento;
        this.direccion = b.direccion;
        this.notas = b.notas;
    }

    public static class Builder {

        private String cliente;
        private String producto;
        private int cantidad = 1;
        private double descuento = 0;
        private String direccion;
        private String notas;

        public Builder cliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder producto(String producto) {
            this.producto = producto;
            return this;
        }

        public Builder cantidad(int cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public Builder descuento(double descuento) {
            this.descuento = descuento;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder notas(String notas) {
            this.notas = notas;
            return this;
        }

        public ClassPedido39 build() {

            if (cliente == null || producto == null) {
                throw new IllegalStateException("Cliente y producto son obligatorios");
            }

            return new ClassPedido39(this);
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", descuento=" + descuento +
                ", direccion='" + direccion + '\'' +
                ", notas='" + notas + '\'' +
                '}';
    }
}