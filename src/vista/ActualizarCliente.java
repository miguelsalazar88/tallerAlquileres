package vista;

import controlador.Controller;

import javax.swing.*;
import java.util.ArrayList;

public class ActualizarCliente extends JFrame{

    private Controller controller;
    private JLabel labelCodigo = new JLabel("Codigo:");
    private JLabel labelId = new JLabel("ID:");
    private JLabel labelNombre = new JLabel("Nombre:");
    private JLabel labelDireccion = new JLabel("Direccion:");
    private JLabel labelFnacicmiento = new JLabel("Fecha de Nacimiento:");
    private JLabel labelDia = new JLabel("Dia:");
    private JLabel labelMes = new JLabel("Mes:");
    private JLabel labelAnio = new JLabel("Año:");
    private JLabel labelNumTajeta = new JLabel("Número de Tarjeta:");
    private JLabel labelTipoTarjeta = new JLabel("Tipo de Tarjeta:");
    private JComboBox<String> cboCodigo = new JComboBox();
    private JTextField JTFid = new JTextField();
    private JTextField JTFnombre = new JTextField();
    private JTextField JTFdireccion = new JTextField();
    private JComboBox CboDia = new JComboBox();
    private JComboBox CboMes = new JComboBox();
    private JComboBox CboAnio = new JComboBox();
    private JTextField JTFNumTarjeta = new JTextField();
    private JComboBox CboTipoTarjeta = new JComboBox();
    private JButton botonActualizar = new JButton("Actualizar");


    public ActualizarCliente(){
        this.setVisible(false);
        this.setLayout(null);
        this.setSize(300,500);
        this.initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        this.add(labelCodigo);
        this.labelCodigo.setBounds(10,50,150,30);
        this.add(labelId);
        this.labelId.setBounds(10,80,150,30);
        this.add(labelNombre);
        this.labelNombre.setBounds(10,110,150,30);
        this.add(labelDireccion);
        this.labelDireccion.setBounds(10,140,150,30);
        this.add(labelFnacicmiento);
        this.labelFnacicmiento.setBounds(10,170,150,30);
        this.add(labelDia);
        this.labelDia.setBounds(10,200,150,30);
        this.add(labelMes);
        this.labelMes.setBounds(10,230,150,30);
        this.add(labelAnio);
        this.labelAnio.setBounds(10,260,150,30);
        this.add(labelNumTajeta);
        this.labelNumTajeta.setBounds(10,290,150,30);
        this.add(labelTipoTarjeta);
        this.labelTipoTarjeta.setBounds(10,320,150,30);
        this.add(cboCodigo);
        this.cboCodigo.setBounds(160,50,100,30);
        this.add(JTFid);
        this.JTFid.setBounds(160,80,100,30);
        this.add(JTFnombre);
        this.JTFnombre.setBounds(160,110,100,30);
        this.add(JTFdireccion);
        this.JTFdireccion.setBounds(160,140,100,30);
        this.add(CboDia);
        this.initCboDia();
        this.CboDia.setBounds(160,200,100,30);
        this.add(CboMes);
        this.initCboMes();
        this.CboMes.setBounds(160,230,100,30);
        this.add(CboAnio);
        this.initCboAnio();
        this.CboAnio.setBounds(160,260,100,30);
        this.add(JTFNumTarjeta);
        this.JTFNumTarjeta.setBounds(160,290,100,30);
        this.add(CboTipoTarjeta);
        this.CboTipoTarjeta.setBounds(160,320,100,30);
        this.initTipoTarjeta();
        this.add(botonActualizar);
        this.botonActualizar.setBounds(100,400,100,30);

    }

    public void initCboAnio(){
        for (int i = 1988; i <2022; i++) {
            this.CboAnio.addItem(String.valueOf(i));
        }
    }

    public void initCboMes(){
        for (int i = 1; i <13; i++) {
            this.CboMes.addItem(String.valueOf(i));
        }
    }

    public void initCboDia(){
        for (int i = 1; i <32; i++) {
            this.CboDia.addItem(String.valueOf(i));
        }
    }

    public void initTipoTarjeta(){
        this.getCboTipoTarjeta().addItem("Credito");
        this.getCboTipoTarjeta().addItem("Debito");
    }

    public void setCboId(ArrayList<String> lista){
        for (String s: lista) {
            cboCodigo.addItem(s);
        }
    }

    public void setController(Controller cont){
        this.controller = cont;
        this.botonActualizar.addActionListener(this.controller);
    }

    public JLabel getLabelCodigo() {
        return labelCodigo;
    }

    public void setLabelCodigo(JLabel labelCodigo) {
        this.labelCodigo = labelCodigo;
    }

    public JLabel getLabelId() {
        return labelId;
    }

    public void setLabelId(JLabel labelId) {
        this.labelId = labelId;
    }

    public JLabel getLabelNombre() {
        return labelNombre;
    }

    public void setLabelNombre(JLabel labelNombre) {
        this.labelNombre = labelNombre;
    }

    public JLabel getLabelDireccion() {
        return labelDireccion;
    }

    public void setLabelDireccion(JLabel labelDireccion) {
        this.labelDireccion = labelDireccion;
    }

    public JLabel getLabelFnacicmiento() {
        return labelFnacicmiento;
    }

    public void setLabelFnacicmiento(JLabel labelFnacicmiento) {
        this.labelFnacicmiento = labelFnacicmiento;
    }

    public JLabel getLabelDia() {
        return labelDia;
    }

    public void setLabelDia(JLabel labelDia) {
        this.labelDia = labelDia;
    }

    public JLabel getLabelMes() {
        return labelMes;
    }

    public void setLabelMes(JLabel labelMes) {
        this.labelMes = labelMes;
    }

    public JLabel getLabelAnio() {
        return labelAnio;
    }

    public void setLabelAnio(JLabel labelAnio) {
        this.labelAnio = labelAnio;
    }

    public JLabel getLabelNumTajeta() {
        return labelNumTajeta;
    }

    public void setLabelNumTajeta(JLabel labelNumTajeta) {
        this.labelNumTajeta = labelNumTajeta;
    }

    public JLabel getLabelTipoTarjeta() {
        return labelTipoTarjeta;
    }

    public void setLabelTipoTarjeta(JLabel labelTipoTarjeta) {
        this.labelTipoTarjeta = labelTipoTarjeta;
    }

    public JComboBox<String> getCboCodigo() {
        return cboCodigo;
    }

    public JTextField getJTFid() {
        return JTFid;
    }

    public void setJTFid(JTextField JTFid) {
        this.JTFid = JTFid;
    }

    public JTextField getJTFnombre() {
        return JTFnombre;
    }

    public void setJTFnombre(JTextField JTFnombre) {
        this.JTFnombre = JTFnombre;
    }

    public JTextField getJTFdireccion() {
        return JTFdireccion;
    }

    public void setJTFdireccion(JTextField JTFdireccion) {
        this.JTFdireccion = JTFdireccion;
    }

    public JComboBox getCboDia() {
        return CboDia;
    }

    public void setCboDia(JComboBox cboDia) {
        CboDia = cboDia;
    }

    public JComboBox getCboMes() {
        return CboMes;
    }

    public void setCboMes(JComboBox cboMes) {
        CboMes = cboMes;
    }

    public JComboBox getCboAnio() {
        return CboAnio;
    }

    public void setCboAnio(JComboBox cboAnio) {
        CboAnio = cboAnio;
    }

    public JTextField getJTFNumTarjeta() {
        return JTFNumTarjeta;
    }

    public void setJTFNumTarjeta(JTextField JTFNumTarjeta) {
        this.JTFNumTarjeta = JTFNumTarjeta;
    }

    public JComboBox getCboTipoTarjeta() {
        return CboTipoTarjeta;
    }

    public void setCboTipoTarjeta(JComboBox cboTipoTarjeta) {
        CboTipoTarjeta = cboTipoTarjeta;
    }

    public JButton getBotonActualizar() {
        return botonActualizar;
    }
}
