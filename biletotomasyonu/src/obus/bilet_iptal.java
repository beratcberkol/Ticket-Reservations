/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obus;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Veritabani.baglan;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Berat Berkol
 */
public class bilet_iptal extends AnaController {
    Statement st1;
    PreparedStatement psp;

    
    public void bilet_iptal(int kimlikno){
        try {

            baglan aa = new baglan();
            psp=aa.getCon().prepareStatement("delete y,b from yolcu as y left join bilet as b on b.biletno=y.biletno where y.tcno=?");
            psp.setInt(1,kimlikno);
            psp.executeUpdate();
           
                  JOptionPane.showMessageDialog(null,"Biletiniz Başarıyla İptal Edilmiştir", "Yine Bekleriz.." , JOptionPane.INFORMATION_MESSAGE);
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    
    }
       
}
