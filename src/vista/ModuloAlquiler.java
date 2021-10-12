package vista;

import controlador.Controller;

import javax.swing.*;
import java.util.ArrayList;

public class ModuloAlquiler extends JFrame {

    private Controller controller;
    private JLabel labelIdCliente = new JLabel("ID Cliente:");
    private JLabel labelIdVehiculo = new JLabel("ID Vehiculo");
    private JComboBox cboClientes = new JComboBox();
    private JComboBox cboVehiculos = new JComboBox();
    private JLabel labelFvencimiento = new JLabel("Fecha de Vencimiento:");
    private JLabel labelDia = new JLabel("Dia:");
    private JLabel labelMes = new JLabel("Mes:");
    private JComboBox cboDia = new JComboBox();
    private JComboBox cboMes = new JComboBox();
    private JButton botonAlquilar = new JButton("Alquilar");

    public ModuloAlquiler(){
        this.setSize(500,500);
        this.setVisible(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.initComponents();
    }

    private void initComponents() {
        this.add(cboClientes);
        this.cboClientes.setBounds(100,100,100,30);
        this.add(labelIdCliente);
        this.labelIdCliente.setBounds(10,100,90,30);
        this.add(labelIdVehiculo);
        this.labelIdVehiculo.setBounds(10,130,90,30);
        this.add(cboVehiculos);
        this.cboVehiculos.setBounds(100,130,100,30);
        this.add(botonAlquilar);
        this.add(labelFvencimiento);
        this.labelFvencimiento.setBounds(10,160,200,30);
        this.add(labelDia);
        this.labelDia.setBounds(10,190,90,30);
        this.add(cboDia);
        this.cboDia.setBounds(100,190,100,30);
        this.setCboDia();
        this.add(labelMes);
        this.labelMes.setBounds(10,220,90,30);
        this.add(cboMes);
        this.cboMes.setBounds(100,220,100,30);
        this.setCboMes();
        this.botonAlquilar.setBounds(100,250,100,30);

    }

    private void setCboMes() {
        for (int i = 1; i < 13; i++) {
            this.cboMes.addItem(String.valueOf(i));
        }
    }

    private void setCboDia() {
        for (int i = 1; i <32 ; i++) {
            cboDia.addItem(String.valueOf(i));
        }
    }

    public void setController(Controller cont){
        this.controller = cont;
        this.botonAlquilar.addActionListener(this.controller);
    }

    public void setCboClientes(ArrayList<String> lista){
        for (String s: lista) {
            this.cboClientes.addItem(s);
        }
    }

    public void setCboVehiculos(ArrayList<String> lista){
        for (String s: lista) {
            this.cboVehiculos.addItem(s);
        }
    }

    public JComboBox getCboClientes() {
        return cboClientes;
    }

    public JComboBox getCboVehiculos() {
        return cboVehiculos;
    }

    public JComboBox getCboDia() {
        return cboDia;
    }

    public JComboBox getCboMes() {
        return cboMes;
    }

    public JButton getBotonAlquilar() {
        return botonAlquilar;
    }
}
