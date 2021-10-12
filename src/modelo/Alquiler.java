package modelo;

public class Alquiler {

    private int idCliente;
    private int idVehiculo;
    private int dia;
    private int mes;
    private int mesDia;
    private boolean vencido;
    private double precio;


    public Alquiler(int idCliente, int idVehiculo, int dia, int mes, double precio) {
        this.idCliente = idCliente;
        this.idVehiculo = idVehiculo;
        this.dia = dia;
        this.mes = mes;
        this.mesDia = mes*100 + dia;
        this.precio = precio;

        if(this.mesDia <= 1012){
            this.vencido = true;
        }

        else{
            this.vencido = false;
        }

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMesDia() {
        return mesDia;
    }

    public void setMesDia(int mesDia) {
        this.mesDia = mesDia;
    }

    public boolean isVencido() {
        return vencido;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "idCliente=" + idCliente +
                ", idVehiculo=" + idVehiculo +
                ", vencido=" + vencido +
                ", precio=" + precio +
                '}';
    }
}
