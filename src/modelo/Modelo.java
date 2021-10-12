package modelo;

import vista.VentanaPrincipal;

import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Modelo {

    private VentanaPrincipal vista;
    private List<Cliente> listaClientesModelo;
    private List<Vehiculo> listaVehiculosModelo;
    private List<Alquiler> listaAlquileres = new ArrayList<>();

    public Modelo(VentanaPrincipal vista){
        this.vista = vista;
        this.listaClientesModelo = importarClientes();
        this.listaVehiculosModelo = importarVehiculos();
    }

    public List<Cliente> importarClientes() {

        List<Cliente> listaP = new ArrayList<>();
        String filename = "src/files/clientes.txt";

        try {
            listaP = Files.lines(Paths.get(filename))
                    .map(l -> new Cliente(Integer.parseInt(l.split(",")[0])
                            ,Integer.parseInt(l.split(",")[1])
                            ,l.split(",")[2]
                            ,l.split(",")[3]
                            ,Integer.parseInt(l.split(",")[4])
                            ,Integer.parseInt(l.split(",")[5])
                            ,Integer.parseInt(l.split(",")[6])
                            ,Integer.parseInt(l.split(",")[7])
                            ,l.split(",")[8]
                    ))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Pailander con los clientes");
            System.out.println(e);
        }

        return listaP;
    }

    public List<Vehiculo> importarVehiculos() {

        List<Vehiculo> listaP = new ArrayList<>();
        String filename = "src/files/vehiculos.txt";

        try {
            listaP = Files.lines(Paths.get(filename))
                    .map(l -> new Vehiculo(Integer.parseInt(l.split(",")[0])
                            ,l.split(",")[1]
                            ,l.split(",")[2]
                            ,l.split(",")[3]
                            ,Integer.parseInt(l.split(",")[4])
                            ,l.split(",")[5]
                            ,Double.parseDouble(l.split(",")[6])
                            ,Double.parseDouble(l.split(",")[7])
                    ))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Pailander con los carros");
            System.out.println(e);
        }

        return listaP;
    }

    public void mostrarListaClientes(){
        String s = "";
        for (int i = 0; i < listaClientesModelo.size(); i++) {
            s += listaClientesModelo.get(i).toString() + "\n";

        }
        vista.setTexto(s);
    }

    public void mostrarListaVehiculos(){
        String s = "";
        for (int i = 0; i < listaVehiculosModelo.size(); i++) {
            s += listaVehiculosModelo.get(i).toString() + "\n";
        }
        this.vista.setTexto(s);
    }

    public void setRegistrarCliente(){
        this.vista.getFormularioCliente().setVisible(true);

    }

    public void registrarCliente(){

        int codigo = Integer.parseInt(this.vista.getFormularioCliente().getJTFcodigo().getText());
        int id = Integer.parseInt(this.vista.getFormularioCliente().getJTFid().getText());
        String nombre = this.vista.getFormularioCliente().getJTFnombre().getText();
        String direccion = this.vista.getFormularioCliente().getJTFdireccion().getText();
        int dia = Integer.parseInt(this.vista.getFormularioCliente().getCboDia().getSelectedItem().toString());
        int mes = Integer.parseInt(this.vista.getFormularioCliente().getCboMes().getSelectedItem().toString());
        int anio = Integer.parseInt(this.vista.getFormularioCliente().getCboAnio().getSelectedItem().toString());
        int numTarjeta = Integer.parseInt(this.vista.getFormularioCliente().getJTFNumTarjeta().getText());
        String tipoTarjeta = this.vista.getFormularioCliente().getCboTipoTarjeta().getSelectedItem().toString();

        listaClientesModelo.add(new Cliente(codigo,id,nombre,direccion,dia,mes,anio,numTarjeta,tipoTarjeta));
        JOptionPane.showMessageDialog(null,"Ccliente Registrado con Exito");

    }

    public void setConsultarCliente(){
        this.vista.getConsultaCliente().setVisible(true);
    }

    public void ConsultarCliente(){
        int id = Integer.parseInt(this.vista.getConsultaCliente().getJTFId().getText());
        String cliente = "";
        for (Cliente c: listaClientesModelo) {
            if(c.getId()==id){
                cliente = c.toString();
            }
        }

        if(cliente.equals("")){
            JOptionPane.showMessageDialog(null,"Cliente no Encontrado");
        }
        else{
            this.vista.getConsultaCliente().setTexto(cliente);
        }

    }

    public void setAlquilar(){
        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<String> vehiculos = new ArrayList<>();

        for (Cliente c: listaClientesModelo) {
            clientes.add(String.valueOf(c.getId()));
        }

        for (Vehiculo v: listaVehiculosModelo) {
            vehiculos.add(String.valueOf(v.getCodigo()));
        }

        this.vista.getModuloAlquiler().setCboClientes(clientes);
        this.vista.getModuloAlquiler().setCboVehiculos(vehiculos);

        this.vista.getModuloAlquiler().setVisible(true);
    }

    public void alquilar(){
        int idCliente = Integer.parseInt(this.vista.getModuloAlquiler().getCboClientes()
                .getSelectedItem().toString());
        int idVehiculo = Integer.parseInt(this.vista.getModuloAlquiler().getCboVehiculos()
                .getSelectedItem().toString());
        int dia = Integer.parseInt(this.vista.getModuloAlquiler().getCboDia()
                .getSelectedItem().toString());
        int mes = Integer.parseInt(this.vista.getModuloAlquiler().getCboMes()
                .getSelectedItem().toString());
        double precio = 0;

        for (Cliente c: listaClientesModelo) {
            if(c.getId()==idCliente){
                c.setAlguilado(true);
            }
        }
        for (Vehiculo v: listaVehiculosModelo) {
            if(v.getCodigo()==idVehiculo){
                v.setAlquilado(true);
                precio = v.getPrecio();
            }
        }

        this.listaAlquileres.add(new Alquiler(idCliente,idVehiculo,dia,mes,precio));
        JOptionPane.showMessageDialog(null,"Alquiler Cargado Exitosamente");
        this.vista.getModuloAlquiler().setVisible(false);
    }

    public void setConsultaVehiculo(){
        ArrayList<String> placas = new ArrayList<>();

        for (Vehiculo v: listaVehiculosModelo) {
            placas.add(v.getPlaca());
        }

        this.vista.getConsultaVehiculo().setCboPlaca(placas);

        this.vista.getConsultaVehiculo().setVisible(true);


    }

    public void consultarVPlaca(){
        String placa = this.vista.getConsultaVehiculo().getCboPlaca().getSelectedItem().toString();
        String lista = "";

        for (Vehiculo v: listaVehiculosModelo) {
            if(v.getPlaca().equals(placa)){
                lista += v.toString() + "\n";
            }
        }

        this.vista.getConsultaVehiculo().setTexto(lista);

    }

    public void consultarVMarca(){
        String marca = this.vista.getConsultaVehiculo().getCboMarca().getSelectedItem().toString();
        String lista = "";

        for (Vehiculo v: listaVehiculosModelo) {
            if(v.getMarca().equals(marca)){
                lista += v.toString() + "\n";
            }
        }

        this.vista.getConsultaVehiculo().setTexto(lista);
    }

    public void consultarVcolor(){

        String color = this.vista.getConsultaVehiculo().getCboColor().getSelectedItem().toString();
        String lista = "";

        for (Vehiculo v: listaVehiculosModelo) {
            if(v.getColor().equals(color)){
                lista += v.toString() + "\n";
            }
        }

        this.vista.getConsultaVehiculo().setTexto(lista);

    }

    public void vehiculosAlquilados(){

        String s = "";

        for (Vehiculo v: listaVehiculosModelo) {
            if(v.isAlquilado()==true){
                s += v.toString() + "\n";
            }
        }

        this.vista.setTexto(s);
    }

    public void vehiculosDisponibles(){
        String s = "";

        for (Vehiculo v: listaVehiculosModelo) {
            if(v.isAlquilado()==false){
                s += v.toString() + "\n";
            }
        }

        this.vista.setTexto(s);

    }

    public void setActualizarCliente(){
        ArrayList<String> lista = new ArrayList<>();

        for (Cliente c: listaClientesModelo) {
            lista.add(String.valueOf(c.getCodigoCliente()));
        }

        this.vista.getActualizarCliente().setCboId(lista);
        this.vista.getActualizarCliente().setVisible(true);
    }

    public void actualizarCliente() {

        for (Cliente c: listaClientesModelo) {
            if(c.getCodigoCliente()==Integer.parseInt(this.vista.getActualizarCliente().getCboCodigo().getSelectedItem().toString())){
                c.setId(Integer.parseInt(this.vista.getActualizarCliente().getJTFid().getText()));
                c.setNombre(this.vista.getActualizarCliente().getJTFnombre().getText());
                c.setDireccion(this.vista.getActualizarCliente().getJTFdireccion().getText());
                c.setfNacimiento(new Fecha(
                        Integer.parseInt(this.vista.getActualizarCliente().getCboDia().getSelectedItem().toString())
                        ,Integer.parseInt(this.vista.getActualizarCliente().getCboMes().getSelectedItem().toString())
                        ,Integer.parseInt(this.vista.getActualizarCliente().getCboAnio().getSelectedItem().toString())));
                c.setNumTarjeta(Long.valueOf(this.vista.getActualizarCliente().getJTFNumTarjeta().getText()));
                c.setTipoTarjeta(this.vista.getActualizarCliente().getCboTipoTarjeta().getSelectedItem().toString());
            }
        }

        JOptionPane.showMessageDialog(null,"Cliente Actualizado Exitosamente");
        this.vista.getActualizarCliente().setVisible(false);

    }

    public void contratosVencidos() {
        String lista = "";
        for (Alquiler a: listaAlquileres) {
            if(a.isVencido()){
                lista += a.toString() + "\n";
            }
        }
        this.vista.setTexto(lista);
    }

    public void estadisticas(){

        String s = "";

        double[] input = new double[listaAlquileres.size()];

        for (int i = 0; i < listaAlquileres.size(); i++) {
            input[i] = listaAlquileres.get(i).getPrecio();
        }

        for (int i = 0; i <listaAlquileres.size() ; i++) {
            input[i] = listaAlquileres.get(i).getPrecio();
        }
        double n=listaAlquileres.size(),sum=0,media, mediaRecortada, sum2 =0, n2=listaAlquileres.size()-2;
        for(int i=0;i<n;i++)
        {
            sum=sum+input[i];
        }
        for (int i = 1; i <listaAlquileres.size()-1; i++) {
            sum2 = sum2 + input[i];
        }
        mediaRecortada = sum2/n2;
        media = sum/n;
        s += "Media de Alquileres :"+media + "\n";
        sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.pow((input[i]-media),2);

        }
        media=sum/(n-1);
        double desviacion= Math.sqrt(media);
        s += "Desviacion Estandar de Alquileres: " + desviacion + "\n";
        s += "Media Recortada de Alquileres: " + mediaRecortada;

        this.vista.setTexto(s);
    }
}
