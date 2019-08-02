/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obus;
import Veritabani.baglan;
import java.awt.Checkbox;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.shape.Circle;
import javax.swing.JOptionPane;

/**
 *
 * @author Berat Berkol
 */
public class bilet_al extends AnaController {
    Statement st;
    PreparedStatement psp;
    ResultSet rs;
    
    /**
     *
     * @param firmaad
     * @return
     */
    public int firmaidbul(String firmaad){
        int firmaid=0;
        if(firmaad.equals("Kamil Koç")) {
            firmaid=1;
        } 
        else if(firmaad.equals("Pamukkale")) {
            firmaid=2;
        }
        else if(firmaad.equals("Ulusoy")) {
            firmaid=3;
        }
        else if(firmaad.equals("Isparta Petrol")) {
            firmaid=4;
        }
    
        return firmaid;
    }
    
    public void dolukoltuklar(String tarih,int firmaid,int otoid){
        int a=0;
        int dolukoltuk[] = new int[34];
        try{
        baglan aa= new baglan();
        psp=aa.getCon().prepareStatement("SELECT koltukno FROM bilet WHERE tarih=? and firmaid=? and otoid=?");
        psp.setString(1, tarih);
        psp.setInt(2, firmaid);
        psp.setInt(3, otoid);
        rs=psp.executeQuery();
        while(rs.next()){
            dolukoltuk[a]=Integer.parseInt(rs.getString(1));
            a++;
        }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
  
    public int guzergah(String nereden, String nereye){
        int otoid=0;
        switch (nereden) {
            case "Tekirdag":
                switch (nereye) {
                    case "Istanbul":
                        otoid=1;
                        break;
                    case "Izmir":
                        otoid=2;
                        break;
                    case "Antalya":
                        otoid=3;
                        break;
                    case "Bursa":
                        otoid=4;
                        break;
                    case "Diyarbakir":
                        otoid=5;
                        break;
                    case "Isparta":
                        otoid=6;
                        break;
                    default:
                        break;
                }   break;
            case "Istanbul":
                switch (nereye) {
                    case "Tekirdag":
                        otoid=7;
                    break;
                    case "Izmir":
                        otoid=8;
                    break;
                    case "Antalya":
                        otoid=9;
                    break;
                    case "Bursa":
                        otoid=10;
                    break;
                    case "Diyarbakir":
                        otoid=11;
                    break;
                    case "Isparta":
                        otoid=12;
                    break;
                    default:
                    break;
        }
                break;
            case "Izmir":
                if(null!=nereye)
                    switch (nereye) {
            case "Tekirdag":
                otoid=13;
                break;
            case "Istanbul":
                otoid=14;
                break;
            case "Antalya":
                otoid=15;
                break;
            case "Bursa":
                otoid=16;
                break;
            case "Diyarbakir":
                otoid=17;
                break;
            case "Isparta":
                otoid=18;
                break;
            default:
                break;
        }
                break;
            case "Antalya":
                if(null!=nereye)
                    switch (nereye) {
            case "Tekirdag":
                otoid=19;
                break;
            case "Istanbul":
                otoid=20;
                break;
            case "Izmir":
                otoid=21;
                break;
            case "Bursa":
                otoid=22;
                break;
            case "Diyarbakir":
                otoid=23;
                break;
            case "Isparta":
                otoid=24;
                break;
            default:
                break;
        }
                break;
            case "Bursa":
                if(null!=nereye)
                    switch (nereye) {
            case "Tekirdag":
                otoid=25;
                break;
            case "Istanbul":
                otoid=26;
                break;
            case "Izmir":
                otoid=27;
                break;
            case "Antalya":
                otoid=28;
                break;
            case "Diyarbakir":
                otoid=29;
                break;
            case "Isparta":
                otoid=30;
                break;
            default:
                break;
        }
                break;
            case "Diyarbakir":
                if(null!=nereye)
                    switch (nereye) {
            case "Tekirdag":
                otoid=31;
                break;
            case "Istanbul":
                otoid=32;
                break;
            case "Izmir":
                otoid=33;
                break;
            case "Antalya":
                otoid=34;
                break;
            case "Bursa":
                otoid=35;
                break;
            case "Isparta":
                otoid=36;
                break;
            default:
                break;
        }
                break;
            case "Isparta":
                if(null!=nereye)
                    switch (nereye) {
            case "Tekirdag":
                otoid=37;
                break;
            case "Istanbul":
                otoid=38;
                break;
            case "Izmir":
                otoid=39;
                break;
            case "Antalya":
                otoid=40;
                break;
            case "Bursa":
                otoid=41;
                break;
            case "Diyarbakir":
                otoid=42;
                break;
            default:
                break;
        }
                break;
            default:
                break;
        }
        return otoid;
    }
    public int biletnobul(int koltukno, String tarih,int firmaid,int otoid){
    int biletno=0;
    try{
        baglan aa= new baglan();
        psp=aa.getCon().prepareStatement("Select biletno From bilet Where koltukno=? and tarih=? and otoid=? and firmaid=?");
        psp.setInt(1,koltukno);
        psp.setString(2,tarih);
        psp.setInt(3,otoid);
        psp.setInt(4,firmaid);
        rs=psp.executeQuery();
        while(rs.next()){
            biletno=rs.getInt("biletno");
        }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    return biletno;
    }
    
    public void bilet_ekle(int koltukno, String tarih,int firmaid,int otoid){
        try{
        baglan aa= new baglan();
        psp=aa.getCon().prepareStatement("INSERT INTO bilet(koltukno,tarih,firmaid,otoid) VALUES (?,?,?,?)");
        psp.setInt(1,koltukno);
        psp.setString(2,tarih);
        psp.setInt(3,firmaid);
        psp.setInt(4,otoid);
        psp.executeUpdate();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void yolcu_ekle(String tcno, String adsoyad, String telno, int koltukno, String cinsiyet, int biletno){
        try{
        baglan aa= new baglan();
        psp=aa.getCon().prepareStatement("INSERT INTO yolcu(tcno,adsoyad,telno,koltukno,cinsiyet,biletno) VALUES (?,?,?,?,?,?)");
        psp.setString(1,tcno);
        psp.setString(2,adsoyad);
        psp.setString(3,telno);
        psp.setInt(4,koltukno);
        psp.setString(5,cinsiyet);
        psp.setInt(6,biletno);
        psp.executeUpdate();
        JOptionPane.showMessageDialog(null,"Biletiniz Başarıyla Alınmıştır", "İyi Yolculuklar.." , JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    
    
    
    }
    
    
    
}
