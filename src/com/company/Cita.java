package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Cita
{
    // ATRIBUTOS

    int tamaño = 5;
    int pos = 1;
    String nombre;
    String mascota;
    String citaNueva;
    String Y = "y";
    String No = "n";
    String ask;
    String ask2;
    LocalDate fecha;
    LocalTime hora;
    LocalDate fecha2;
    LocalTime hora2;
    String[] Cliente = new String[tamaño];
    String[] Mascota = new String[tamaño];;
    String[] Status = new String[tamaño];;
    LocalDate[] Fechas = new LocalDate[tamaño];;
    LocalTime[] Horas = new LocalTime[tamaño];;


    // OBJETOS
    Scanner entrada = new Scanner(System.in);
    LectorTeclado entrada2 = new LectorTeclado();


    // METODOS

    public void agendarCita()
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

                System.out.println("Ingrese la fecha de la cita(AAAA-MM-DD): ");
                fecha = entrada2.leerFecha("Ingrese una fecha correcta");

                System.out.println("Ingrese la hora de la cita(HH-MM): ");
                hora = entrada2.leerhora("Ingrese una hora correcta");

                Cliente[pos] = nombre;
                Mascota[pos] = mascota;
                Fechas[pos] = fecha;
                Horas[pos] = hora;
                Status[pos] = "Activa";

                System.out.println(" ");
                System.out.println("Cita Agendada");
                System.out.println(" ");

                System.out.println(Cliente[pos]);
                System.out.println(Mascota[pos]);
                System.out.println(Fechas[pos]);
                System.out.println(Horas[pos]);
                System.out.println(Status[pos]);

                pos = pos + 1;

                System.out.print("¿Desea ingresar una nueva cita? y/n ");
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

    public void reageanderCita()
    {
        int pos2;
        boolean vuelta2 = false;

        while(!vuelta2)
        {
            boolean confirmar2 = false;

            while(!confirmar2)
            {
                System.out.print("Ingrese la cita que desea cambiar: ");
                pos2 = entrada2.leerEntero("Ingrese un numero correcto");

                // MOSTRAR DATOS DE LA CITA INDICADA
                System.out.println("Numero de Cita: " + pos2);
                System.out.println("Nombre Cliente: " + Cliente[pos2]);
                System.out.println("Nombre Mascota: " + Mascota[pos2]);
                System.out.println("Fecha de Cita:  " + Fechas[pos2]);
                System.out.println("Hora de Cita:   " + Horas[pos2]);

                System.out.println("¿Desea cambiar la fecha de la cita? y/n");
                ask = entrada2.nuevaCita();

                if(ask.equals(Y))
                {
                    System.out.print("Ingrese la nueva Fecha de la cita (AAAA-MM-DD): ");
                    fecha2 = entrada2.leerFecha("Ingrese una fecha correcta ");

                    System.out.println("Ingrese la nueva hora de la cita(HH-MM): ");
                    hora2 = entrada2.leerhora("Ingrese una hora corrrecta ");

                    Fechas[pos2] = fecha2;
                    Horas[pos2] = hora2;

                    System.out.println("Numero de Cita: " + pos2);
                    System.out.println("Nombre Cliente: " + Cliente[pos2]);
                    System.out.println("Nombre Mascota: " + Mascota[pos2]);
                    System.out.println("Fecha de Cita:  " + Fechas[pos2]);
                    System.out.println("Hora de Cita:   " + Horas[pos2]);
                }

                System.out.print("¿Desea modificar otra cita? y/n ");
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

    public void cancelarCita()
    {
        int pos3;
        boolean vuelta3 = false;

        while(!vuelta3)
        {
            boolean confirmar3 = false;

            while(!confirmar3)
            {
                // SOLICITAR NUMERO DE CITA A CANCELAR
                System.out.print("Ingrese la cita que desea cambiar: ");
                pos3 = entrada2.leerEntero("Ingrese una cita valida");

                // MOSTRAR DATOS DE LA CITA INDICADA
                System.out.println("Numero de Cita: " + pos3);
                System.out.println("Nombre Cliente: " + Cliente[pos3]);
                System.out.println("Nombre Mascota: " + Mascota[pos3]);
                System.out.println("Fecha de Cita:  " + Fechas[pos3]);
                System.out.println("Hora de Cita:   " + Horas[pos3]);

                System.out.println("¿Desea cancelar la cita? y/n");
                ask = entrada2.nuevaCita();

                if(ask.equals(Y))
                {
                    // Agregando Status de Cancelada a la cita
                    Status[pos3] = "Cancelada";

                    System.out.println("Numero de Cita: " + pos3);
                    System.out.println("Nombre Cliente: " + Cliente[pos3]);
                    System.out.println("Nombre Mascota: " + Mascota[pos3]);
                    System.out.println("Fecha de Cita:  " + Fechas[pos3]);
                    System.out.println("Hora de Cita:   " + Horas[pos3]);
                    System.out.println("Status de Cita: " + Status[pos3]);
                }

                System.out.print("¿Desea cancelar otra cita? y/n ");
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
}
