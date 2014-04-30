/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import BE.Fireman;
import BE.Shift;
import DAL.AbstractDAL;
import DAL.ShiftDAL;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class ShiftBLL extends AbstractDAL {
    
    ShiftDAL shd = new ShiftDAL();
    
    public ArrayList<Shift> getShifts(Fireman fm, String dato) throws SQLException{
        return shd.getShifts(fm, dato);
    }
}
