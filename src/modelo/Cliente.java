package modelo;

public class Cliente {

    private int codigoCliente;
    private int id;
    private String nombre;
    private String direccion;
    private Fecha fNacimiento;
    private long numTarjeta;
    private String tipoTarjeta;
    private Boolean alguilado;

    public Cliente(int codigoCliente, int id, String nombre, String direccion,
                   int dia, int mes, int anio, long numTarjeta, String tipoTarjeta) {
        this.codigoCliente = codigoCliente;
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fNacimiento = new Fecha(dia,mes,anio);
        this.numTarjeta = numTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.alguilado = false;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public long getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(long numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public Boolean getAlguilado() {
        return alguilado;
    }

    public void setAlguilado(Boolean alguilado) {
        this.alguilado = alguilado;
    }


    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Fecha de Nacimiento: " + fNacimiento.toString()
                 + ", Direccion: " + direccion;
    }
}
