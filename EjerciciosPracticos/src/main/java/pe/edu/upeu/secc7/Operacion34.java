package pe.edu.upeu.secc7;

//Operacion
public enum Operacion34 {

    SUMA("+") {
        @Override
        public double calcular(double a, double b) {
            return a + b;
        }
    },

    RESTA("-") {
        @Override
        public double calcular(double a, double b) {
            return a - b;
        }
    },

    MULTIPLICACION("*") {
        @Override
        public double calcular(double a, double b) {
            return a * b;
        }
    },

    DIVISION("/") {
        @Override
        public double calcular(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("División por cero 💀");
            }
            return a / b;
        }
    };

    private String simbolo;

    Operacion34(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public abstract double calcular(double a, double b);
}