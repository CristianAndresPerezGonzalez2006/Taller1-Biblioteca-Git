/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller1BibliotecaGit {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

   public static void crearCliente() {
    System.out.println("--- Registrar nuevo cliente ---");
    System.out.print("ID: ");
    String id = sc.nextLine();
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    System.out.print("Telefono: ");
    String telefono = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();

    Cliente nuevoCliente = new Cliente(id, nombre, telefono, email);
    clientes.add(nuevoCliente);

    System.out.println("Cliente registrado con exito.");
}
    }

