/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project.check;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class Date {
      public static String now(String dateFormat) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(cal.getTime());
    }
}
