package modelo;

public class Vehiculo {

    private int codigo;
    private String placa;
    private String color;
    private String marca;
    private int modelo;
    private String motor;
    private double precio;
    private double velocidad;
    private boolean alquilado;

    public Vehiculo(int codigo, String placa, String color, String marca, int modelo,
                    String motor, double precio, double velocidad) {

        this.codigo = codigo;
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.precio = precio;
        this.velocidad = velocidad;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Placa: " + placa + ", Color: " + color + ", Marca: " + marca
                +", Modelo: " + modelo + ", Precio: " + precio;
    }
}
