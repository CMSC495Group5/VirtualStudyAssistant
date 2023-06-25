/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist_handler;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jdev1
 */
public class ArrayListHandler {

    private static ArrayList<String> classname;
    private static ArrayList<String> startdate;
    private static ArrayList<String> enddate;

    private ArrayListHandler() {
        // constructor code
    }

    public static void addClass(String classname, String startdate, String enddate) {
        ArrayListHandler.classname.add(classname);
        ArrayListHandler.startdate.add(startdate);
        ArrayListHandler.enddate.add(enddate);
      
      
    }

   
   
}

