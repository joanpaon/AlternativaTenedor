/* 
 * Copyright (C) 2016 José A. Pacheco Ondoño - joanpon@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    // Instancia el objeto Scanner
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        // Referencias
        final String COMIDA1 = "carne";
        final String COMIDA2 = "pescado";
//        final String COMIDA3 = "arroz";
        final int PUAS0 = 0;
        final int PUAS1 = 3;
        final int PUAS2 = 4;

        // Variables
        int puas;

        // Cabecera
        System.out.println("Alternativa Tenedor");
        System.out.println("===================");

        // Introduce el tipo de comida
        System.out.print("Tipo de comida .: ");
        String tipoComida = SCN.nextLine().toLowerCase();

        // Analiza el tipo de comida
//        switch (tipoComida) {
//            case COMIDA1:
//                puas = PUAS1;
//                break;
//            case COMIDA2:
////            case COMIDA3:
//                puas = PUAS2;
//                break;
//            default:
//                puas = PUAS0;
//        }
        
        if (tipoComida.equals(COMIDA1)) {
            puas = PUAS1;
        } else if (tipoComida.equals(COMIDA2)) {
            puas = PUAS2;
        } else {
            puas = PUAS0;
        }
        
        // Separador
        System.out.println("---");

        // Muestra el resultado
        System.out.printf("Tenedor con ....: %d púas%n", puas);
    }
}
