package vista;

import controlador.Controller;
import modelo.Cliente;
import modelo.Vehiculo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaPrincipal extends JFrame {


    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    private Panel panel = new Panel();
    private Controller controller;
    private final JButton botonMostrarListaClientes = new JButton("Mostrar Lista de Clientes");
    private final JButton botonMostrarListaVehiculos = new JButton("Mostrar Lista de Vehiculos");
    private final JButton botonRegistrarCliente = new JButton("Registrar Cliente");
    private final JButton botonAlquilarVehiculo = new JButton("Alquilar Vehículo");
    private final JButton botonConsultarCliente = new JButton("Consultar Cliente");
    private final JButton botonConsultarVehiculo = new JButton("Consultar Vehiculo");
    private final JButton botonVehiculosAlquilados = new JButton("Lista de Vehiculos Alquilados");
    private final JButton botonVehiculosDisponibles = new JButton("Lista de Vehiculos Disponibles");
    private final JButton botonActualizarCliente = new JButton("Actualizar Cliente");
    private final JButton botonContratosVencidos = new JButton("Mostrar Contratos Vencidos");
    private final JButton botonEstadisticas = new JButton("Mostrar Estadísticas");
    private JTextArea texto = new JTextArea();
    private JScrollPane scrollPaneTexto = new JScrollPane(texto);
    private FormularioCliente formularioCliente = new FormularioCliente();
    private ConsultaCliente consultaCliente = new ConsultaCliente();
    private ModuloAlquiler moduloAlquiler = new ModuloAlquiler();
    private ConsultaVehiculo consultaVehiculo = new ConsultaVehiculo();
    private ActualizarCliente actualizarCliente = new ActualizarCliente();

    public VentanaPrincipal(){
        this.setSize(1200,750);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.lightGray);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.initComponents();
    }

    private void initComponents() {
        this.add(panel);
        this.add(scrollPaneTexto);
        this.scrollPaneTexto.setBounds(275,250,900,450);
        this.add(botonMostrarListaClientes);
        this.botonMostrarListaClientes.setBounds(10,250,230,30);
        this.add(botonMostrarListaVehiculos);
        this.botonMostrarListaVehiculos.setBounds(10,280,230,30);
        this.add(botonRegistrarCliente);
        this.botonRegistrarCliente.setBounds(10,310,230,30);
        this.add(botonAlquilarVehiculo);
        this.botonAlquilarVehiculo.setBounds(10,340,230,30);
        this.add(botonConsultarCliente);
        this.botonConsultarCliente.setBounds(10,370,230,30);
        this.add(botonConsultarVehiculo);
        this.botonConsultarVehiculo.setBounds(10,400,230,30);
        this.add(botonVehiculosAlquilados);
        this.botonVehiculosAlquilados.setBounds(10,430,230,30);
        this.add(botonVehiculosDisponibles);
        this.botonVehiculosDisponibles.setBounds(10,460,230,30);
        this.add(botonActualizarCliente);
        this.botonActualizarCliente.setBounds(10,490,230,30);
        this.add(botonContratosVencidos);
        this.botonContratosVencidos.setBounds(10,520,230,30);
        this.add(botonEstadisticas);
        this.botonEstadisticas.setBounds(10,550,230,30);
    }

    public void setController(Controller cont){
        this.controller = cont;
        this.botonMostrarListaClientes.addActionListener(this.controller);
        this.botonMostrarListaVehiculos.addActionListener(this.controller);
        this.botonRegistrarCliente.addActionListener(this.controller);
        this.botonAlquilarVehiculo.addActionListener(this.controller);
        this.botonConsultarCliente.addActionListener(this.controller);
        this.botonConsultarVehiculo.addActionListener(this.controller);
        this.botonVehiculosAlquilados.addActionListener(this.controller);
        this.botonVehiculosDisponibles.addActionListener(this.controller);
        this.botonActualizarCliente.addActionListener(this.controller);
        this.botonContratosVencidos.addActionListener(this.controller);
        this.botonEstadisticas.addActionListener(this.controller);
    }

    public void setTexto(String s){
        this.texto.setText(s);
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Panel getPanel() {
        return panel;
    }

    public JButton getBotonMostrarListaClientes() {
        return botonMostrarListaClientes;
    }

    public JButton getBotonMostrarListaVehiculos() {
        return botonMostrarListaVehiculos;
    }

    public JButton getBotonRegistrarCliente() {
        return botonRegistrarCliente;
    }

    public JButton getBotonConsultarCliente() {
        return botonConsultarCliente;
    }

    public JButton getBotonConsultarVehiculo() {
        return botonConsultarVehiculo;
    }

    public JButton getBotonVehiculosAlquilados() {
        return botonVehiculosAlquilados;
    }

    public JButton getBotonVehiculosDisponibles() {
        return botonVehiculosDisponibles;
    }

    public JButton getBotonActualizarCliente() {
        return botonActualizarCliente;
    }

    public JButton getBotonContratosVencidos() {
        return botonContratosVencidos;
    }

    public JButton getBotonEstadisticas() {
        return botonEstadisticas;
    }

    public FormularioCliente getFormularioCliente() {
        return formularioCliente;
    }

    public ConsultaCliente getConsultaCliente() {
        return consultaCliente;
    }

    public ModuloAlquiler getModuloAlquiler() {
        return moduloAlquiler;
    }

    public JButton getBotonAlquilarVehiculo() {
        return botonAlquilarVehiculo;
    }

    public ConsultaVehiculo getConsultaVehiculo() {
        return consultaVehiculo;
    }

    public ActualizarCliente getActualizarCliente() {
        return actualizarCliente;
    }
}
