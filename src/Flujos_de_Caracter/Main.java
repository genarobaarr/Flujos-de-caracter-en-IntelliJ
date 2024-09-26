package Flujos_de_Caracter;

import java.util.*;
import java.io.*;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        File directorio = new File("C:\\Users\\genae\\Documents\\111 - UV\\3ER SEMESTRE\\DISEÑO Y PROGRAMACIÓN ORIENTADA A OBJETOS\\Datos");
        if (directorio.isDirectory()) {
            File[] misArchivos = directorio.listFiles();
            int numeroArchivos = misArchivos.length;
            System.out.println("\nEn el directorio " + directorio.getName() +
                    " hay " + numeroArchivos + " archivos.");
            for (File archivo : misArchivos) {
                Date fechaModificacion = new Date(archivo.lastModified());
                System.out.println("\nNombre: " + archivo.getName());
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
                System.out.println("Fecha de modificación: " + fechaModificacion);
                System.out.println("Tamaño: " + archivo.length() + " bytes");
            }
        }

        try {
            File fin;
            fin = new File("C:\\Users\\genae\\Documents\\111 - UV\\3ER SEMESTRE\\DISEÑO Y PROGRAMACIÓN ORIENTADA A OBJETOS\\Datos\\Testdata-mac.csv");
            FileReader fr;
            fr = new FileReader(fin);
            BufferedReader br;
            br = new BufferedReader(fr);

            File fout;
            fout = new File("C:\\Users\\genae\\Documents\\111 - UV\\3ER SEMESTRE\\DISEÑO Y PROGRAMACIÓN ORIENTADA A OBJETOS\\Datos\\Testdata-mac.csv");
            FileWriter fw;
            fw = new FileWriter(fout);
            PrintWriter pw;
            pw = new PrintWriter(fw);

            String linealeida = "";
            int c = 0;
            while ((linealeida = br.readLine()) != null){
                c++;
                pw.println(c + ": " + linealeida);
            }

            br.close();
            fr.close();

            pw.close();
            fw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}