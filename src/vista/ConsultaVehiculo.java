package vista;

import controlador.Controller;

import javax.swing.*;
import java.util.ArrayList;

public class ConsultaVehiculo extends JFrame {

    private Controller controller;
    private JLabel labelPlaca = new JLabel("Placa:");
    private JLabel labelMarca = new JLabel("Marca:");
    private JLabel labelColor = new JLabel("Color:");
    private JComboBox<String> cboPlaca = new JComboBox<>();
    private JComboBox<String> cboMarca = new JComboBox<>();
    private JComboBox<String> cboColor = new JComboBox<>();
    private JButton botonPlaca = new JButton("Consultar");
    private JButton botonMarca = new JButton("Consultar");
    private JButton botonColor = new JButton("Consultar");
    private JTextArea texto = new JTextArea();
    private JScrollPane scrollPaneTexto = new JScrollPane(texto);


    public ConsultaVehiculo(){
        this.setSize(900,500);
        this.setLayout(null);
        this.setVisible(false);
        this.initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        this.add(labelPlaca);
        this.labelPlaca.setBounds(10,50,90,30);
        this.add(cboPlaca);
        this.cboPlaca.setBounds(100,50,150,30);
        this.add(botonPlaca);
        this.botonPlaca.setBounds(250,50,100,30);
        this.add(labelMarca);
        this.labelMarca.setBounds(10,80,90,30);
        this.add(cboMarca);
        this.setCboMarca();
        this.add(botonMarca);
        this.botonMarca.setBounds(250,80,100,30);
        this.cboMarca.setBounds(100,80,150,30);
        this.add(labelColor);
        this.labelColor.setBounds(10,110,90,30);
        this.add(cboColor);
        this.cboColor.setBounds(100,110,150,30);
        this.setCboColor();
        this.add(botonColor);
        this.botonColor.setBounds(250,110,100,30);
        this.add(scrollPaneTexto);
        this.scrollPaneTexto.setBounds(10,150,800,450);


    }

    public void setController(Controller cont){
        this.controller = cont;
        this.botonColor.addActionListener(this.controller);
        this.botonMarca.addActionListener(this.controller);
        this.botonPlaca.addActionListener(this.controller);
    }

    public void setCboPlaca(ArrayList<String> lista) {
        for (String s: lista) {
            this.cboPlaca.addItem(s);
        }
    }

    public void setCboMarca(){
        this.cboMarca.addItem("Chevrolet");
        this.cboMarca.addItem("Mazda");
        this.cboMarca.addItem("Ford");
        this.cboMarca.addItem("BMW");
        this.cboMarca.addItem("Renault");
    }

    public void setCboColor(){
        this.cboColor.addItem("Rojo");
        this.cboColor.addItem("Azul");
        this.cboColor.addItem("Verde");
        this.cboColor.addItem("Blanco");
        this.cboColor.addItem("Negro");
    }

    public void setTexto(String s){
        texto.setText(s);
    }

    public JComboBox<String> getCboPlaca() {
        return cboPlaca;
    }

    public JComboBox<String> getCboMarca() {
        return cboMarca;
    }

    public JComboBox<String> getCboColor() {
        return cboColor;
    }

    public JButton getBotonPlaca() {
        return botonPlaca;
    }

    public JButton getBotonMarca() {
        return botonMarca;
    }

    public JButton getBotonColor() {
        return botonColor;
    }

    public JTextArea getTexto() {
        return texto;
    }
}
