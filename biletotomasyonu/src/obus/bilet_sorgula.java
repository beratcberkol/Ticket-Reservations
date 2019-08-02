/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obus;
import Veritabani.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Berat Berkol
 */
public class bilet_sorgula extends AnaController {
    
    
    Statement st;
    PreparedStatement psp;
    ResultSet rs;

    
    

    public void bilet_sorgula(int kimlikno){
        try {

            baglan aa = new baglan();
            psp=aa.getCon().prepareStatement("select b.tarih,b.koltukno,f.firmaad from yolcu y,bilet b,firma f where tcno=? and y.biletno=b.biletno and b.firmaid=f.firmaid");
            psp.setInt(1,kimlikno);

            rs=psp.executeQuery();
            while(rs.next()){
                    JOptionPane.showMessageDialog(null, rs.getString("b.tarih")+" tarihinde\n"+rs.getString("f.firmaad")+"  adlı firmadan\n"+rs.getString("b.koltukno")+"  numaralı koltukta biletiniz bulunmaktadır.", "İyi Yolculuklar Dileriz.." , JOptionPane.INFORMATION_MESSAGE);
            }
            JOptionPane.showMessageDialog(null,"Daha fazla biletiniz bulunmamaktadır.","İyi Yolculuklar Dileriz...", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
        
    

        
    
}
