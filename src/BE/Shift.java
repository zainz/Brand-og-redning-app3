/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BE;

/**
 *
 * @author Christian
 */
public class Shift {
    
    private String date;
    private String firemamName;
    private String role;
    private String type;
    
    public Shift(String date, String firemanName, String role, String type){
        this.date = date;
        this.firemamName = firemanName;
        this.role = role;
        this.type = type;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the firemamName
     */
    public String getFiremamName() {
        return firemamName;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
}
