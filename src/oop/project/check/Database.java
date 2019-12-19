/*
 * To change Database template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project.check;


/**
 *
 * @author user
 */
public class Database {
    private  static  String host, id, password, csdl;

    public static String getCsdl() {
        return csdl;
    }

    public static void setCsdl(String csdl) {
        Database.csdl = csdl;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        Database.host = host;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Database.id = id;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Database.password = password;
    }
    
    }

