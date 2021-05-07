package com.senati.eti.data;
import com.senati.eti.model.Alumno;
import java.util.Scanner;
import java.io.*;
public class Clase6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter archivo = null;
		PrintWriter pw = null;
		try {
			archivo = new FileWriter("info.txt,true");
			pw = new PrintWriter(archivo);
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
		        Alumno objAlumno = new Alumno(nom, ape, gen , ed);
			    pw.println("-----------------------");
			    pw.println("Datos registrados");
			    pw.println("--------------");
			    pw.println("Nombre y apellido............." + objAlumno.NombreCompleto());
			    pw.println("Genero............." + objAlumno.MostrarGenero());
			    System.out.println("El archivo fue creado correctamente");
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				if(archivo!=null) archivo.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
			}
		}

	}


