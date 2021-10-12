package vista;

import controlador.Controller;

import javax.swing.*;

public class ConsultaCliente extends JFrame {

    private Controller controller;
    private JLabel labelId = new JLabel("ID:");
    private JTextField JTFId = new JTextField();
    private JButton botonConsultar = new JButton("Consultar");
    private JTextArea texto = new JTextArea();

    public ConsultaCliente(){
        this.setSize(900,500);
        this.setVisible(false);
        this.setLayout(null);
        this.initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        this.add(labelId);
        this.labelId.setBounds(100,100,50,30);
        this.add(JTFId);
        this.JTFId.setBounds(150,100,100,30);
        this.add(texto);
        this.texto.setBounds(10,150,880,200);
        this.add(botonConsultar);
        this.botonConsultar.setBounds(300,100,100,30);
    }

    public void setController(Controller cont){
        this.controller = cont;
        this.botonConsultar.addActionListener(this.controller);
    }

    public void setTexto(String s){
        this.texto.setText(s);
    }

    public JTextField getJTFId() {
        return JTFId;
    }

    public JButton getBotonConsultar() {
        return botonConsultar;
    }
}
