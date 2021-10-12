package app;

import controlador.Controller;
import modelo.Cliente;
import modelo.Modelo;
import modelo.Vehiculo;
import vista.VentanaPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        VentanaPrincipal v = new VentanaPrincipal();
        Modelo m = new Modelo(v);
        Controller C = new Controller(v,m);

    }

}
