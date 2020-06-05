package com.company;

import java.util.Scanner;

public class Diagnostico
{
    // ATRIBUTOS

    int tamaño = 5;
    int pos = 1;
    String nombre;
    String mascota;
    String diagnost;
    String citaNueva;
    String Y = "y";
    String No = "n";
    String ask;
    String ask2;
    String[] Cliente = new String[tamaño];
    String[] Mascota = new String[tamaño];
    String[] Diagnosticos = new String[tamaño];

    // OBJETOS
    Scanner entrada = new Scanner(System.in);
    LectorTeclado entrada2 = new LectorTeclado();

    // METODOS

    public void registrarDiagnostico()
    {
        boolean vuelta = false;

        while(!vuelta)
        {
            boolean confirmar = false;

            while(!confirmar)
            {
                System.out.print("Ingrese su nombre: ");
                nombre = entrada.nextLine();

                System.out.print("Ingrese el nombre de su mascota: ");
                mascota = entrada.nextLine();

                System.out.print("Ingrese el diagnostico: ");
                diagnost = entrada.nextLine();

                Cliente[pos] = nombre;
                Mascota[pos] = mascota;
                Diagnosticos[pos] = diagnost;

                System.out.println(" ");
                System.out.println("Diagnostico Registrado");
                System.out.println(" ");

                pos = pos + 1;

                System.out.print("¿Desea ingresar un nuevo diagnostico? y/n ");
                citaNueva = entrada2.nuevaCita();

                if(citaNueva.equals(No))
                {
                    confirmar = true;
                }
                else
                {
                    confirmar = false;
                }
            }

            tamaño = tamaño + 1;
            vuelta = true;
        }
    }

    public void modificarDiagnostico()
    {
        int pos2;
        boolean vuelta2 = false;

        while(!vuelta2)
        {
            boolean confirmar2 = false;

            while(!confirmar2)
            {
                System.out.print("Ingrese el diagnostico que desea modificar: ");
                pos2 = entrada2.leerEntero("Ingrese un numero correcto");

                // MOSTRAR DATOS DE LA CITA INDICADA
                System.out.println("Numero de Diag: " + pos2);
                System.out.println("Nombre Cliente: " + Cliente[pos2]);
                System.out.println("Nombre Mascota: " + Mascota[pos2]);
                System.out.println("Diagnostico:    " + Diagnosticos[pos2]);

                System.out.println("¿Desea modificar el diagnostico? y/n");
                ask = entrada2.nuevaCita();

                if(ask.equals(Y))
                {
                    System.out.print("Escriba el nuevo diagnostico: ");
                    diagnost = entrada.nextLine();

                    Diagnosticos[pos2] = diagnost;

                    System.out.println("Numero de Cita: " + pos2);
                    System.out.println("Nombre Cliente: " + Cliente[pos2]);
                    System.out.println("Nombre Mascota: " + Mascota[pos2]);
                    System.out.println("Nuevo Diagn:    " + Diagnosticos[pos2]);

                    System.out.println(" ");
                    System.out.println("Diagnostico Modificado");
                }

                System.out.print("¿Desea modificar otro diagnostico? y/n ");
                citaNueva = entrada2.nuevaCita();

                if(citaNueva.equals(No))
                {
                    confirmar2 = true;
                }
                else
                {
                    confirmar2 = false;
                }
            }

            vuelta2 = true;
        }
    }

    public void eliminarDiagnostico()
    {
        int pos3;
        boolean vuelta3 = false;

        while(!vuelta3)
        {
            boolean confirmar3 = false;

            while(!confirmar3)
            {
                // SOLICITAR NUMERO DE DIAGNOSTICO A ELIMINAR
                System.out.print("Ingrese el numero de diagnostico que desea eliminar: ");
                pos3 = entrada2.leerEntero("Ingrese una cita valida");

                // MOSTRAR DATOS DEL DIAGNOSTICO INDICADO
                System.out.println("Numero de Cita: " + pos3);
                System.out.println("Nombre Cliente: " + Cliente[pos3]);
                System.out.println("Nombre Mascota: " + Mascota[pos3]);
                System.out.println("Diagnostico:    " + Diagnosticos[pos3]);

                System.out.println("¿Desea eliminar el diagnostico? y/n");
                ask2 = entrada2.nuevaCita();

                if(ask2.equals(Y))
                {
                    // ELIMINANDO DIAGNOSTICO
                    Diagnosticos[pos3] = "Sin Diagnostico, Por favor agregue un diagnostico";

                    System.out.println("Numero de Cita: " + pos3);
                    System.out.println("Nombre Cliente: " + Cliente[pos3]);
                    System.out.println("Nombre Mascota: " + Mascota[pos3]);
                    System.out.println("Diagnostico:    " + Diagnosticos[pos3]);

                    System.out.println(" ");
                    System.out.println("Diagnostico Eliminado");
                }

                System.out.print("¿Desea eliminar otro diagnostico? y/n ");
                citaNueva = entrada2.nuevaCita();

                if(citaNueva.equals(No))
                {
                    confirmar3 = true;
                }
                else
                {
                    confirmar3 = false;
                }
            }

            vuelta3 = true;
        }
    }

    public void mostrarDiagnosticos()
    {
        for(int i = 0; i<10; i++)
        {
            // MOSTRAR DATOS DE LA CITA INDICADA
            System.out.println("Numero de Diag: " + i);
            System.out.println("Nombre Cliente: " + Cliente[i]);
            System.out.println("Nombre Mascota: " + Mascota[i]);
            System.out.println("Diagnostico:    " + Diagnosticos[i]);
        }
    }
}
