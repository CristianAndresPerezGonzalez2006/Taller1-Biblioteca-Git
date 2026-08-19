/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.time.LocalDate;
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
static ArrayList<Libro> libros = new ArrayList<>();
public static void crearLibro() {
    System.out.println("--- Registrar nuevo libro ---");
    System.out.print("Codigo: ");
    String codigo = sc.nextLine();
    System.out.print("Titulo: ");
    String titulo = sc.nextLine();
    System.out.print("Anio de publicacion: ");
    String anioPublicacion = sc.nextLine();
    System.out.print("Autor: ");
    String autor = sc.nextLine();

    Libro nuevoLibro = new Libro(codigo, titulo, anioPublicacion, autor);
    libros.add(nuevoLibro);

    System.out.println("Libro registrado con exito.");
}

public static void listarLibros() {
    System.out.println("--- Lista de libros ---");
    if (libros.isEmpty()) {
        System.out.println("No hay libros registrados.");
    } else {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
}

public static void buscarLibro() {
    System.out.print("Ingrese el codigo del libro a buscar: ");
    String codigoBuscado = sc.nextLine();

    boolean encontrado = false;
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigoBuscado)) {
            System.out.println("Libro encontrado: " + l);
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontro ningun libro con ese codigo.");
    }
}
public static void actualizarLibro() {
    System.out.print("Ingrese el codigo del libro a actualizar: ");
    String codigoBuscado = sc.nextLine();

    boolean encontrado = false;
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigoBuscado)) {
            System.out.print("Nuevo titulo: ");
            String titulo = sc.nextLine();
            System.out.print("Nuevo anio de publicacion: ");
            String anioPublicacion = sc.nextLine();
            System.out.print("Nuevo autor: ");
            String autor = sc.nextLine();

            l.setTitulo(titulo);
            l.setAnioPublicacion(anioPublicacion);
            l.setAutor(autor);

            System.out.println("Libro actualizado con exito.");
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontro ningun libro con ese codigo.");
    }
}

public static void eliminarLibro() {
    System.out.print("Ingrese el codigo del libro a eliminar: ");
    String codigoBuscado = sc.nextLine();

    Libro libroAEliminar = null;
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigoBuscado)) {
            libroAEliminar = l;
            break;
        }
    }

    if (libroAEliminar != null) {
        libros.remove(libroAEliminar);
        System.out.println("Libro eliminado con exito.");
    } else {
        System.out.println("No se encontro ningun libro con ese codigo.");
    }
}

static ArrayList<Prestamo> prestamos = new ArrayList<>();
public static void crearPrestamo() {
    System.out.println("--- Registrar nuevo prestamo ---");
    System.out.print("ID del prestamo: ");
    String idPrestamo = sc.nextLine();

    System.out.print("ID del cliente: ");
    String idCliente = sc.nextLine();
    Cliente clienteEncontrado = null;
    for (Cliente c : clientes) {
        if (c.getId().equals(idCliente)) {
            clienteEncontrado = c;
            break;
        }
    }

    System.out.print("Codigo del libro: ");
    String codigoLibro = sc.nextLine();
    Libro libroEncontrado = null;
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigoLibro)) {
            libroEncontrado = l;
            break;
        }
    }

    if (clienteEncontrado == null) {
        System.out.println("No se encontro el cliente con ese ID.");
        return;
    }
    if (libroEncontrado == null) {
        System.out.println("No se encontro el libro con ese codigo.");
        return;
    }
    if (!libroEncontrado.isDisponible()) {
        System.out.println("El libro no esta disponible actualmente.");
        return;
    }

    Prestamo nuevoPrestamo = new Prestamo(idPrestamo, clienteEncontrado, libroEncontrado, LocalDate.now(), "activo");
    prestamos.add(nuevoPrestamo);
    libroEncontrado.setDisponible(false);

    System.out.println("Prestamo registrado con exito.");
}

public static void devolucionPrestamo() {
    System.out.print("Ingrese el ID del prestamo a devolver: ");
    String idBuscado = sc.nextLine();

    boolean encontrado = false;
    for (Prestamo p : prestamos) {
        if (p.getIdPrestamo().equals(idBuscado)) {
            if (p.getEstado().equals("devuelto")) {
                System.out.println("Este prestamo ya fue devuelto anteriormente.");
            } else {
                p.setEstado("devuelto");
                p.getLibro().setDisponible(true);
                System.out.println("Devolucion registrada con exito.");
            }
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontro ningun prestamo con ese ID.");
    }
}
