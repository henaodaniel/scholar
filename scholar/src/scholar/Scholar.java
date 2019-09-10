/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Scholar {
    
    public static void main(String[] args) {
     Empleado empleado1 = new Empleado();
     empleado1.nombre= " Daniel";
     empleado1.apellido= " Henao";
     empleado1.fecha_de_nacimiento= " 07-10-2000";
     empleado1.calcEdad();
       System.out.println("el empleado se llama " + empleado1.nombre + empleado1.apellido);
       System.out.println("la fecha de nacimiento es" + empleado1.fecha_de_nacimiento);
       System.out.println("la edad es" + empleado1.calcEdad());
       
       
       Scanner lectura=new Scanner (System.in);
      int edad, año_nacimiento,año_actual;
      System.out.println("ingresa el año de nacimiento");
      año_nacimiento=lectura.nextInt();
      System.out.println("ingresa el año actual");
      año_actual=lectura.nextInt();
        int año_actual_año_nacimiento = 0;
      edad=año_actual_año_nacimiento;
      System.out.println("la edad es"+edad);
      
       
       
       
     
     
     
     System.out.println("El empleado se llama: "+empleado1.nombre);
    
    
     Estudiante estudiante1=new Estudiante();
     estudiante1.nombre="Daniel";
     estudiante1.apellido="Henao";
     System.out.println("El estudiante se llama: "+estudiante1.nombre);
     
          
    
    
    
    
    }
    
}
