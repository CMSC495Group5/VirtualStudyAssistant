/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist_handler;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jdev1
 */
public class ArrayListHandler extends JFrame {

    private static final ArrayList<String> class_name = new ArrayList<>();
    private static final ArrayList<String> start_date = new ArrayList<>();
    private static final ArrayList<String> end_date   = new ArrayList<>();
    private static boolean classMatched = false;
    private static boolean scheduleEmpty = false;


    private ArrayListHandler() {
        // constructor code
    }

    public static void addClass(String classname, String startdate, String enddate) {
       
        if(class_name.isEmpty()  && start_date.isEmpty() && end_date.isEmpty()){
            ArrayListHandler.class_name.add(classname);
            ArrayListHandler.start_date.add(startdate);
            ArrayListHandler.end_date.add(enddate);
            // testing the arrays
            testArrayList(class_name);
            testArrayList(start_date);
            testArrayList(end_date);
        }
        // test for a duplicate class
        else{
            for(String element: class_name){
                if(element.matches(classname)){
                    classMatched = true;
                }
            }
            if(classMatched == false){
                ArrayListHandler.class_name.add(classname);
                ArrayListHandler.start_date.add(startdate);
                ArrayListHandler.end_date.add(enddate);
                // testing the arrays
                testArrayList(class_name);
                testArrayList(start_date);
                testArrayList(end_date);
            }
         
        }

    }
    
    public static void deleteSchedule() {
        if(!class_name.isEmpty()  && !start_date.isEmpty() && !end_date.isEmpty()){
            ArrayListHandler.class_name.clear();
            ArrayListHandler.start_date.clear();
            ArrayListHandler.end_date.clear();
            //test 
           
    }
            testArrayList(class_name);
            testArrayList(start_date);
            testArrayList(end_date);
        
    }
    
    public static void editSchedule(String searchClass){
        
        if(class_name.isEmpty()  && start_date.isEmpty() && end_date.isEmpty()){
                    scheduleEmpty = true;
           
        }
        // test for a duplicate class
        else{
            for(String element: class_name){
                if(element.matches(searchClass)){
                    classMatched = true;
                }
            }
         
        }
        
        
    }
    
    public static void testArrayList(ArrayList<String> test){
       if(!class_name.isEmpty()  && !start_date.isEmpty() && !end_date.isEmpty()){
        for(String element: test){
            System.out.println(element);
        }
       }
       else{
           System.out.println("The size of arraylist : " + test.size());
       }
    }
   // getmethods
    public static boolean getClassMatched(){
        return classMatched;
    }
      public static boolean getscheduleEmpty(){
        return scheduleEmpty;
    }
        
   
}

