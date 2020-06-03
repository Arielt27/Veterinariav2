package com.company;

public class Menus
{
    public void menuP() // METODO PARA MOSTRAR MENU PRINCIPAL EN PANTALLA
    {
        System.out.println("*******************************");
        System.out.println("*     Clinica Veterinaria     *");
        System.out.println("* 1- Citas                    *");
        System.out.println("* 2- Diagnosticos             *");
        System.out.println("* 3- Reportes                 *");
        System.out.println("* 4- Salir                    *");
        System.out.println("*******************************");
        System.out.print("Su Opcion es: ");
    }

    public void menuCitas() // METODO PARA MOSTRAR MENU DE CITAS EN PANTALLA
    {
        System.out.println("*************Citas*************");
        System.out.println("1- Agendar Cita");
        System.out.println("2- Re-agendar Cita");
        System.out.println("3- Cancelar Cita");
        System.out.println("4- Menu Principal");
        System.out.print("Su Opcion es: ");
    }

    public void menuDiag() // METODO PARA MOSTRAR MENU DE DIAGNOSTICOS EN PANTALLA
    {
        System.out.println("*********Diagnosticos**********");
        System.out.println("1- Registrar Diagnostico");
        System.out.println("2- Modificar  Diagnostico");
        System.out.println("3- Eliminar Diagnostico");
        System.out.println("4- Menu Principal");
        System.out.print("Su Opcion es: ");
    }

    public void menuRep() // METODO PARA MOSTRAR MENU DE REPORTES EN PANTALLA
    {
        System.out.println("***********Reportes************");
        System.out.println("1- Reporte de Citas");
        System.out.println("2- Reporte de Diagnosticos");
        System.out.println("3- Menu Principal");
        System.out.print("Su Opcion es: ");
    }
}
