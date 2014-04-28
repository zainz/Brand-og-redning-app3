/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import BE.Fireman;
import BE.Shift;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class ShiftDAL extends AbstractDAL {
    
    public ArrayList<Shift> getShifts(Fireman fm) throws SQLException{
        Connection con = null;
        ArrayList<Shift> shifts = new ArrayList();
        
        try{
            con = getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Løn_rapport "
                    + "JOIN Brandmand ON Løn_rapport.brandmand_FK = Brandmand.cpr_no "
                    + "WHERE cpr_no = '" + fm.getCpr());
            while(rs.next()){
                String date = rs.getString("dato");
                String firemanName = rs.getString("fornavn");
                String role = rs.getString("role");
                String type = rs.getString("type");
                Shift s = new Shift(date, firemanName, role, type);
                shifts.add(s);
            }
            
            return shifts;
        } finally{
            if(con != null) con.close();
        }
        
    }
}
