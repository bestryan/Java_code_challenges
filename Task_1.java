import java.io.*;
import java.util.*;

public class Assessment_1 {
    public static void main(String[] args) {

        // Create ArrayList records hold data from csv.file
        BufferedReader input = null;
        List<List<String>> records = new ArrayList<List<String>>();

        // Read csv.file by line (file can be changed here)
        try {
            input = new BufferedReader(new FileReader("/Users/ryan/IdeaProjects/Assessment_1/src/16August.csv"));
            String line = null;
            // while loop split line by line using comma
            while ((line = input.readLine()) != null) {
                String[] data_1 = line.split(",");
                records.add(Arrays.asList(data_1));
            }

            /**
             * Below code checking arraylist records data
             * for (List<String> i : records){
             * System.out.println(i);
             * }
             *
             * Below code check records nested in an array list
             * System.out.println(records);
             */

            // reverse the ArrayList data
            Collections.reverse(records);

            // Declare two variables datatype
            int i = 0; int var = 6;

            /**
             * Below code sum up temperature, Dew point, Humidity, Wind Speed every 3 hours
             * Total 8 times by every 6 lines from csv file
             */

            // Temperature calculation every 3 hours (grouped)
            double t1 = 0.0;
            for (i = 0; i < var; i++) {t1 += Double.parseDouble(records.get(i).get(1));}
            double t2 = 0.0;
            for (i = var; i < var * 2; i++) {t2 += Double.parseDouble(records.get(i).get(1));}
            double t3 = 0.0;
            for (i = var * 2; i < var * 3; i++) {t3 += Double.parseDouble(records.get(i).get(1));}
            double t4 = 0.0;
            for (i = var * 3; i < var * 4; i++) {t4 += Double.parseDouble(records.get(i).get(1));}
            double t5 = 0.0;
            for (i = var * 4; i < var * 5; i++) {t5 += Double.parseDouble(records.get(i).get(1));}
            double t6 = 0.0;
            for (i = var * 5; i < var * 6; i++) {t6 += Double.parseDouble(records.get(i).get(1));}
            double t7 = 0.0;
            for (i = var * 6; i < var * 7; i++) {t7 += Double.parseDouble(records.get(i).get(1));}
            double t8 = 0.0;
            for (i = var * 7; i < var * 8; i++) {t8 += Double.parseDouble(records.get(i).get(1));}

            // Dew point calculation every 3 hours (grouped)
            double d1 = 0.0;
            for (i = 0; i < var; i++) {d1 += Double.parseDouble(records.get(i).get(3));}
            double d2 = 0.0;
            for (i = var; i < var * 2; i++) {d2 += Double.parseDouble(records.get(i).get(3));}
            double d3 = 0.0;
            for (i = var * 2; i < var * 3; i++) {d3 += Double.parseDouble(records.get(i).get(3));}
            double d4 = 0.0;
            for (i = var * 3; i < var * 4; i++) {d4 += Double.parseDouble(records.get(i).get(3));}
            double d5 = 0.0;
            for (i = var * 4; i < var * 5; i++) {d5 += Double.parseDouble(records.get(i).get(3));}
            double d6 = 0.0;
            for (i = var * 5; i < var * 6; i++) {d6 += Double.parseDouble(records.get(i).get(3));}
            double d7 = 0.0;
            for (i = var * 6; i < var * 7; i++) {d7 += Double.parseDouble(records.get(i).get(3));}
            double d8 = 0.0;
            for (i = var * 7; i < var * 8; i++) {d8 += Double.parseDouble(records.get(i).get(3));}

            // Humidity calculation every 3 hours (grouped)
            double h1 = 0.0;
            for (i = 0; i < var; i++) {h1 += Double.parseDouble(records.get(i).get(4));}
            double h2 = 0.0;
            for (i = var; i < var * 2; i++) {h2 += Double.parseDouble(records.get(i).get(4));}
            double h3 = 0.0;
            for (i = var * 2; i < var * 3; i++) {h3 += Double.parseDouble(records.get(i).get(4));}
            double h4 = 0.0;
            for (i = var * 3; i < var * 4; i++) {h4 += Double.parseDouble(records.get(i).get(4));}
            double h5 = 0.0;
            for (i = var * 4; i < var * 5; i++) {h5 += Double.parseDouble(records.get(i).get(4));}
            double h6 = 0.0;
            for (i = var * 5; i < var * 6; i++) {h6 += Double.parseDouble(records.get(i).get(4));}
            double h7 = 0.0;
            for (i = var * 6; i < var * 7; i++) {h7 += Double.parseDouble(records.get(i).get(4));}
            double h8 = 0.0;
            for (i = var * 7; i < var * 8; i++) {h8 += Double.parseDouble(records.get(i).get(4));}

            // Wind Speed calculation every 3 hours (grouped)
            double w1 = 0.0;
            for (i = 0; i < var; i++) {w1 += Double.parseDouble(records.get(i).get(7));}
            double w2 = 0.0;
            for (i = var; i < var * 2; i++) {w2 += Double.parseDouble(records.get(i).get(7));}
            double w3 = 0.0;
            for (i = var * 2; i < var * 3; i++) {w3 += Double.parseDouble(records.get(i).get(7));}
            double w4 = 0.0;
            for (i = var * 3; i < var * 4; i++) {w4 += Double.parseDouble(records.get(i).get(7));}
            double w5 = 0.0;
            for (i = var * 4; i < var * 5; i++) {w5 += Double.parseDouble(records.get(i).get(7));}
            double w6 = 0.0;
            for (i = var * 5; i < var * 6; i++) {w6 += Double.parseDouble(records.get(i).get(7));}
            double w7 = 0.0;
            for (i = var * 6; i < var * 7; i++) {w7 += Double.parseDouble(records.get(i).get(7));}
            double w8 = 0.0;
            for (i = var * 7; i < var * 8; i++) {w8 += Double.parseDouble(records.get(i).get(7));}


            /**
             * Below code calculate average and save in new array
             * Total of 8 record arrays
             * Combine below 8 array to one new arraylist
             */
            // Create calculated data in to arraylists
            String[] record1 = {records.get(0).get(0)+"--"+records.get(var-1).get(0),String.format("%.2f °C", t1/6), String.format("%.2f °C",d1/6), String.format("%.2f",h1/6), String.format("%.2f km/h",w1/6)};
            String[] record2 = {records.get(var).get(0)+"--"+records.get(var*2-1).get(0),String.format("%.2f °C", t2/6), String.format("%.2f °C",d2/6), String.format("%.2f",h2/6), String.format("%.2f km/h",w2/6)};
            String[] record3 = {records.get(var*2).get(0)+"--"+records.get(var*3-1).get(0),String.format("%.2f °C", t3/6), String.format("%.2f °C",d3/6), String.format("%.2f",h3/6), String.format("%.2f km/h",w3/6)};
            String[] record4 = {records.get(var*3).get(0)+"--"+records.get(var*4-1).get(0),String.format("%.2f °C", t4/6), String.format("%.2f °C",d4/6), String.format("%.2f",h4/6), String.format("%.2f km/h",w4/6)};
            String[] record5 = {records.get(var*4).get(0)+"--"+records.get(var*5-1).get(0),String.format("%.2f °C", t5/6), String.format("%.2f °C",d5/6), String.format("%.2f",h5/6), String.format("%.2f km/h",w5/6)};
            String[] record6 = {records.get(var*5).get(0)+"--"+records.get(var*6-1).get(0),String.format("%.2f °C", t6/6), String.format("%.2f °C",d6/6), String.format("%.2f",h6/6), String.format("%.2f km/h",w6/6)};
            String[] record7 = {records.get(var*6).get(0)+"--"+records.get(var*7-1).get(0),String.format("%.2f °C", t7/6), String.format("%.2f °C",d7/6), String.format("%.2f",h7/6), String.format("%.2f km/h",w7/6)};
            String[] record8 = {records.get(var*7).get(0)+"--"+records.get(var*8-1).get(0),String.format("%.2f °C", t8/6), String.format("%.2f °C",d8/6), String.format("%.2f",h8/6), String.format("%.2f km/h",w8/6)};

            // Combine all 8 records array to new arraylist
            List<String[]> list = new ArrayList<>();
            list.add(record1);
            list.add(record2);
            list.add(record3);
            list.add(record4);
            list.add(record5);
            list.add(record6);
            list.add(record7);
            list.add(record8);

            /**
             * Below code using FileWriter function
             * csvWriter append names then join above records
             * FileWriter to create and re-write the file
             */

            // FileWriter to export new CSV file
            // Add header to the csv file
            FileWriter csvWriter = new FileWriter("/Users/ryan/IdeaProjects/Assessment_1/src/16_Aug_RangeAverages.csv");
            csvWriter.append("Day/Time(Every 3 hours)");
            csvWriter.append(",");
            csvWriter.append("Ave_Temperature[°C]");
            csvWriter.append(",");
            csvWriter.append("Ave_Dew_Point[°C]");
            csvWriter.append(",");
            csvWriter.append("Ave_Humidity[%]");
            csvWriter.append(",");
            csvWriter.append("Ave_Wind_Speed[km/h]");
            csvWriter.append("\n");

            // loop the list and place data in correctly
            for (String[] data_2 : list) {
                csvWriter.append(String.join(",", data_2));
                csvWriter.append("\n");
            }
            // writes the content of the buffer to the destination
            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
