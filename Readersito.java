/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: Readersito.java
 * Fecha: 21/02/2023
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
public class Readersito {
    private ArrayList<ArrayList<String>> data;

    /**
     * Lee el archivo especificado y almacena la información en una lista de listas de cadenas.
     *
     * @param filename el nombre del archivo a leer
     * @return una lista de listas de Strings que contiene la información del archivo
     */
    public ArrayList<ArrayList<String>> read(String filename) {
        data = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get(filename);

        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String line; 

            while ((line = br.readLine()) != null) {
                String[] lineData = line.split(""); 
                ArrayList<String> row = new ArrayList<String>();

                for (String item : lineData) {
                    row.add(item);
                }

                data.add(row); 
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return data;
    }

    /**
     * Devuelve una cadena que contiene la información almacenada en la lista de listas de cadenas.
     *
     * @return una cadena que contiene la información del archivo
     */
    public String getDataAsString() {
        StringBuilder sb = new StringBuilder();

        for (ArrayList<String> row : data) {
            for (String item : row) {
                sb.append(item).append(" ");
            }

            sb.append("\n");
        }

        String dataString = sb.toString().trim();
        System.out.println(dataString); 
        return dataString;
    }
}