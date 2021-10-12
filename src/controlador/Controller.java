package controlador;

import modelo.Modelo;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private VentanaPrincipal vista;
    private Modelo modelo;

    public Controller(VentanaPrincipal vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setController(this);
        this.vista.getFormularioCliente().setController(this);
        this.vista.getConsultaCliente().setController(this);
        this.vista.getModuloAlquiler().setController(this);
        this.vista.getConsultaVehiculo().setController(this);
        this.vista.getActualizarCliente().setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.getBotonMostrarListaClientes())){
            modelo.mostrarListaClientes();
        }
        if(e.getSource().equals(this.vista.getBotonMostrarListaVehiculos())){
            modelo.mostrarListaVehiculos();
        }
        if(e.getSource().equals(this.vista.getBotonRegistrarCliente())){
            this.modelo.setRegistrarCliente();
        }
        if(e.getSource().equals(this.vista.getFormularioCliente().getBotonRegistrar())){
            this.modelo.registrarCliente();
            this.vista.getFormularioCliente().setVisible(false);
        }
        if(e.getSource().equals(this.vista.getBotonConsultarCliente())){
            this.vista.getConsultaCliente().setVisible(true);
        }
        if(e.getSource().equals(this.vista.getConsultaCliente().getBotonConsultar())){
            this.modelo.ConsultarCliente();
            System.out.println("Changos");
        }
        if(e.getSource().equals(this.vista.getBotonAlquilarVehiculo())){
            this.modelo.setAlquilar();
        }
        if(e.getSource().equals(this.vista.getModuloAlquiler().getBotonAlquilar())){
            this.modelo.alquilar();
        }

        if(e.getSource().equals(this.vista.getBotonConsultarVehiculo())){
            this.modelo.setConsultaVehiculo();
        }

        if(e.getSource().equals(this.vista.getConsultaVehiculo().getBotonPlaca())){
            this.modelo.consultarVPlaca();

        }
        if(e.getSource().equals(this.vista.getConsultaVehiculo().getBotonMarca())){
            this.modelo.consultarVMarca();
        }
        if(e.getSource().equals(this.vista.getConsultaVehiculo().getBotonColor())){
            this.modelo.consultarVcolor();
        }

        if(e.getSource().equals(this.vista.getBotonVehiculosAlquilados())){
            this.modelo.vehiculosAlquilados();
        }

        if(e.getSource().equals(this.vista.getBotonVehiculosDisponibles())){
            this.modelo.vehiculosDisponibles();
        }

        if(e.getSource().equals(this.vista.getBotonActualizarCliente())){
            this.modelo.setActualizarCliente();
        }

        if(e.getSource().equals(this.vista.getActualizarCliente().getBotonActualizar())){
            this.modelo.actualizarCliente();
        }

        if(e.getSource().equals(this.vista.getBotonContratosVencidos())){
            this.modelo.contratosVencidos();
        }

        if(e.getSource().equals(this.vista.getBotonEstadisticas())){
            this.modelo.estadisticas();
        }

    }
}
