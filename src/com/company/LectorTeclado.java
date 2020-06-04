package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;


public class LectorTeclado
{
    // VARIABLES

    private static LectorTeclado instance;
    private Scanner m_sc;

    // METODOS

    public static LectorTeclado getInstance()
    {
        if(instance == null)
        {
            instance = new LectorTeclado();
        }
        return instance;
    }

    public LectorTeclado()
    {
        m_sc = new Scanner(System.in);
    }

    public int leerMenus(String mensaje)
    {
        int opc = 0;

        while (!m_sc.hasNextInt())
        {
            m_sc.next();
            System.out.println(mensaje);
        }

        opc = m_sc.nextInt();
        System.out.println(" ");
        return opc;
    }

    public int leerEntero(String mensaje)
    {
        int opc2 = 0;

        while (!m_sc.hasNextInt())
        {
            m_sc.next();
            System.out.println(mensaje);
        }

        opc2 = m_sc.nextInt();
        System.out.println(" ");
        return opc2;
    }

    public LocalDate leerFecha(String mensaje)
    {
        boolean valido = false;
        LocalDate fecha = null;

        while(!valido)
        {
            try
            {
                String fechaEntrada = m_sc.next();
                fecha = LocalDate.parse(fechaEntrada);
                valido = true;
            }catch(Exception ex)
            {
                System.out.println(mensaje);
                m_sc.next();
            }
        }

        return fecha;
    }

    public LocalTime leerhora(String mensaje)
    {
        boolean validoHora = false;
        LocalTime hora = null;

        while(!validoHora)
        {
            try
            {
                String horaEntrada = m_sc.next();
                hora = LocalTime.parse(horaEntrada);
                validoHora = true;
            }catch(Exception ex)
            {
                m_sc.next();
                System.out.println(mensaje);
            }
        }

        return hora;
    }

    public String nuevaCita()
    {
        String pregunta = null;
        boolean validoCita = false;

        while(!validoCita)
        {
            try
            {
                pregunta = m_sc.next();
                System.out.println(" ");
                validoCita = true;
            }
            catch (Exception ex)
            {
                System.out.print("Escriba solamente y o n");
                m_sc.next();
            }
        }

        return pregunta;
    }
}

