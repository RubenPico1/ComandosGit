/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author picperru programa que pida al usuario su fecha de nacimiento y le
 * diga felicidades y su cumple ,y si no es su cumpl€ que diga cuandos dias faltan
 *
 *
 */
public class FormateoFecha2 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            String fechaNac = sc.nextLine();

            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
            df.setLenient(false);//modo no permisivo,para lo que dice abajo
            Date fecha = df.parse(fechaNac);

            //si llegamos aqui es que la cadena era una fecha, pero si pones el dia 100 si te deja, hay que ponerlo en modo no permisivo
            GregorianCalendar hoy=new GregorianCalendar();
            hoy.setTime(new Date());
            
            GregorianCalendar cumple=new GregorianCalendar();
            cumple.setTime(fecha);
            
            if(hoy.get(Calendar.DAY_OF_MONTH) == cumple.get(Calendar.DAY_OF_MONTH)
                    && hoy.get(Calendar.MONTH)== cumple.get(Calendar.MONTH)){
                System.out.println("Felicidades");
            }else{
//                long milishoy=hoy.getTimeInMillis();
//                fecha.set(Calendar.YEAR, hoy.get(Calendar.YEAR));
//                if(fecha.getTimeInMillis()<milishoy){
//                    fecha.set(Calendar.YEAR, hoy.get(Calendar.YEAR+1));
//                }
//                long resultado= fecha.getTimeInMillis()+milishoy;
//                int dias=(int)(resultado/(1000*60*60*24)+1);
//                System.out.println("Quedan " + dias + "dias");
            }
                     

        } catch (ParseException ex) {
            System.out.println("Error fecha no valida");
        }

    }

}
