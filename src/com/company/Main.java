package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // VARIABLES

        int opcMenu;
        int opcCitas;
        int opcDiag;
        int opcRep;


        // CREAR OBJETOS

        Cita Citas = new Cita();
        Menus showMenu = new Menus();
        LectorTeclado lector = new LectorTeclado();
        Diagnostico Diagnosticos = new Diagnostico();


        // PROGRAMA PRINCIPAL

        // MOSTRAR MENU PRINCIPAL Y LEER OPCION DEL USUARIO
        showMenu.menuP();
        opcMenu = lector.leerMenus("Ingrese una opcion correcta ");

        // CICLO WHILE MENU PRINCIPAL
        while(opcMenu!=4)
        {

            // SWITCH QUE INGRESA A LAS OPCIONES DEL MENU PRINCIPAL
            switch(opcMenu)
            {
                case 1: //CITAS

                    showMenu.menuCitas();
                    opcCitas = lector.leerMenus("Ingrese una opcion correcta ");

                    // SWITCH QUE INGRESA A LAS OPCIONES DEL MENU DE CITAS
                    switch(opcCitas)
                    {
                        case 1: // AGENDAR CITA

                            System.out.println("*********Agendar Citas*********");

                            Citas.agendarCita();

                            showMenu.menuP();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta ");

                            break;

                        case 2: // REAGENDAR CITA

                            System.out.println("********Re-Agendar Citas*******");

                            Citas.reageanderCita();

                            showMenu.menuP();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta ");

                            break;

                        case 3: // CANCELAR CITA

                            System.out.println("*********Cancelar Citas********");

                            Citas.cancelarCita();

                            showMenu.menuP();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta ");

                            break;

                        case 4: // MENU PRINCIPAL

                            showMenu.menuP();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta");

                            break;
                    }

                    break;

                case 2: // DIAGNOSTICOS

                    showMenu.menuDiag();
                    opcDiag = lector.leerMenus("Ingrese una opcion correcta");

                    switch(opcDiag)
                    {
                        case 1: // REGISTRAR DIAGNOSTICO

                            System.out.println("****Registrar Diagnosticos*****");

                            Diagnosticos.registrarDiagnostico();

                            showMenu.menuP();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta ");

                            break;

                        case 2: // MODIFICAR DIAGNOSTICO

                            System.out.println("****Modificar Diagnosticos*****");

                            Diagnosticos.modificarDiagnostico();

                            showMenu.menuP();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta ");

                            break;

                        case 3: // ELIMINAR DIAGNOSTICO

                            System.out.println("*****Eliminar Diagnosticos*****");

                            Diagnosticos.eliminarDiagnostico();

                            showMenu.menuP();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta ");

                            break;

                        case 4: // MENU PRINCIPAL

                            showMenu.menuP();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta ");

                            break;
                    }

                    break;

                case 3: // REPORTES

                    showMenu.menuRep();
                    opcRep = lector.leerMenus("Ingrese una opcion correcta");

                    switch(opcRep)
                    {
                        case 1: // REPORTE DE CITAS

                            System.out.println("********Reporte de Citas*******");

                            Citas.mostrarCitas();

                            showMenu.menuRep();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta");

                            break;

                        case 2: // REPORTE DE DIAGNOSTICOS

                            System.out.println("****Reporte de Diagnosticos****");

                            Diagnosticos.mostrarDiagnosticos();

                            showMenu.menuRep();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta");

                            break;

                        case 3: // MENU PRINCIPAL

                            showMenu.menuRep();
                            opcMenu = lector.leerMenus("Ingrese una opcion correcta");

                            break;
                    }

                    break;
            }
        }
        System.out.println("Gracias por utilizar este programa");
    }
}
