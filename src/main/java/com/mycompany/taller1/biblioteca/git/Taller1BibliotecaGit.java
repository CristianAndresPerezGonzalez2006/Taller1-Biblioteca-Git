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
public static void listarClientes() {
    System.out.println("--- Lista de clientes ---");
    if (clientes.isEmpty()) {
        System.out.println("No hay clientes registrados.");
    } else {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}
public static void buscarCliente() {
    System.out.print("Ingrese el ID del cliente a buscar: ");
    String idBuscado = sc.nextLine();

    boolean encontrado = false;
    for (Cliente c : clientes) {
        if (c.getId().equals(idBuscado)) {
            System.out.println("Cliente encontrado: " + c);
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontro ningun cliente con ese ID.");
    }
}

public static void actualizarCliente() {
    System.out.print("Ingrese el ID del cliente a actualizar: ");
    String idBuscado = sc.nextLine();

    boolean encontrado = false;
    for (Cliente c : clientes) {
        if (c.getId().equals(idBuscado)) {
            System.out.print("Nuevo nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Nuevo telefono: ");
            String telefono = sc.nextLine();
            System.out.print("Nuevo email: ");
            String email = sc.nextLine();

            c.setNombre(nombre);
            c.setTelefono(telefono);
            c.setEmail(email);

            System.out.println("Cliente actualizado con exito.");
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontro ningun cliente con ese ID.");
    }
}

public static void eliminarCliente() {
    System.out.print("Ingrese el ID del cliente a eliminar: ");
    String idBuscado = sc.nextLine();

    Cliente clienteAEliminar = null;
    for (Cliente c : clientes) {
        if (c.getId().equals(idBuscado)) {
            clienteAEliminar = c;
            break;
        }
    }

    if (clienteAEliminar != null) {
        clientes.remove(clienteAEliminar);
        System.out.println("Cliente eliminado con exito.");
    } else {
        System.out.println("No se encontro ningun cliente con ese ID.");
    }
}
