package com.senati.eti.data;

import com.senati.eti.model.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alumno objAl1 = new Alumno();
		objAl1.setNombre("Joe");
		objAl1.setApellido("Castillo");
		objAl1.setGenero("M");
		objAl1.setEdad(25);
		Alumno objAl2 = new Alumno("Rosa", "Flores", "F" , 17);
        Alumno objAl3 = null;
        String nom = "", ape="" , gen="";
        int ed = 0;
        System.out.println("REGISTRO DE DATOS");
        System.out.println("-----------------");
        System.out.println("Nombre.......:");
        nom=sc.nextLine();
        System.out.println("Apellido.......:");
        ape=sc.nextLine();
        System.out.println("Genero [F][M].......:");
        gen=sc.nextLine();
        System.out.println("Edad [14-30].......:");
        ed=sc.nextInt();
        objAl3 = new Alumno(nom, ape, gen , ed);
        ArrayList<Alumno> arrAlumno = new ArrayList<Alumno>();
        arrAlumno.add(objAl1);
        arrAlumno.add(objAl2);
        arrAlumno.add(objAl3);
        System.out.println("DATOS REGISTRADOS");
        System.out.println("-----------------");
        String patron = "%-4s %-20s %-10s %-15s";
        System.out.println(String.format(patron, "N", "Nombres y apellidos", "Género", "Estado"));
        System.out.println(String.format(patron, "--", "-----------------------", "-------", "---------"));
        for(int x = 0; x< arrAlumno.size(); x++) {
        	System.out.println(String.format(patron, (x+1),
        			arrAlumno.get(x).NombreCompleto(),
        			arrAlumno.get(x).MostrarGenero(),
        			arrAlumno.get(x).MostrarEstado()));
        }
    }
}
