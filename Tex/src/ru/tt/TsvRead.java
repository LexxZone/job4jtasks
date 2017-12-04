package ru.tt;

import java.io.*;

public class TsvRead {


        public static void main(String[] arg) throws Exception {

            // Read tsv file
            File file = new File("source-data.tsv");
            BufferedReader TSVFile = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file), "UTF-16")); // utf-16

            String dataRow = TSVFile.readLine(); // Read first line.
            System.out.println(); // Print the empty line.
            while (dataRow != null){
                String[] dataArray = dataRow.split("\t");
                for (String item: dataArray) {
                    //System.out.print(item + "\t");
                    System.out.printf("%-5s", item);
                }
                System.out.println(); // Print the data line.
                dataRow = TSVFile.readLine(); // Read next line of data.
            }
            // Close the file once all data has been read.
            TSVFile.close();

            // End the printout with a blank line.
            System.out.println();

        } //main()
    } // TSVRead