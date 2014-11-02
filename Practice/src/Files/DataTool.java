package Files;
/**
 * General purpose class to deal with reading/writing data to files.
 */

/**
 * General purpose class to deal with reading/writing data to files.
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;

public final class DataTool {
    public static final String SEPERATOR = System.getProperty("line.separator");


    public static boolean addString(String filename, String data) {
        try {
            return saveData(filename, getContents(filename)+" "+data);
        }
        catch(Exception e) {
            System.err.println("Error adding string: " + e.getMessage());
            return false;
        }
    }

    public static String getContents(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(SEPERATOR);
                line = br.readLine();
            }

            br.close();
            return sb.toString();
        }
        catch(Exception e) {
            System.err.println("Error loading data: " + e.getMessage());
            return null;
        }
    }

    public static ArrayList<String> getContentsAsArrayList(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            ArrayList<String> arrayList = new ArrayList<String>();

            while(line != null) {
                arrayList.add(line + "");
                line = br.readLine();
            }

            br.close();
            return arrayList;
        }
        catch(Exception e) {
            System.err.println("Error loading data: " + e.getMessage());
            return null;
        }
    }

    public static String getString(String filename, int position) {
        try {
            String data = "";
            Scanner s = new Scanner(getContents(filename));
            for(int i = 1; i <= position; i++) {
                data = s.next();
            }
            s.close();

            return data;
        }
        catch(Exception e) {
            System.err.println("Error getting string: " + e.getMessage());
            return null;
        }
    }

    public static boolean replaceString(String filename, int position, String data) {
        try {
            return saveData(filename, getContents(filename).replace(getString(filename, position), data));
        }
        catch(Exception e) {
            System.err.println("Error replacing string: " + e.getMessage());
            return false;
        }
    }

    public static boolean saveData(String filename, String data) {
        try {
            FileWriter f = new FileWriter(filename);
            BufferedWriter b = new BufferedWriter(f);
            b.write(data);
            b.close();

            return true;
        }
        catch(Exception e) {
            System.err.println("Error saving data: " + e.getMessage());

            return false;
        }
    }

    public static int getNumOfValues(String filename) {
        try {
            int numOfValues = 0;
            Scanner s = new Scanner(getContents(filename));
            while(s.hasNext()) {
                s.next();
                numOfValues++;
            }
            s.close();

            return numOfValues;
        }
        catch(Exception e) {
            System.err.println("Error getting number of values: " + e.getMessage());
            return -1;
        }
    }
}