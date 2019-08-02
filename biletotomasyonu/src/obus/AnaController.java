/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obus;

import Veritabani.baglan;
import static java.awt.Color.RED;
import java.awt.Component;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.net.URL;
import static java.nio.file.Files.size;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javax.swing.JOptionPane;
import javax.swing.text.html.CSS;
import obus.bilet_sorgula;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author Berat Berkol
 */
public class AnaController implements Initializable {

    @FXML
    public ChoiceBox<?> biletal_cinsiyet_cmb;
    @FXML
    public TextField biletal_adsoyad;
    @FXML
    public TextField biletal_tc;
    @FXML
    public ChoiceBox<String> biletal_nereden_cmb;
    @FXML
    public ChoiceBox<String> biletal_nereye_cmb;
    @FXML
    public DatePicker biletal_tarih;
    @FXML
    public TextField biletiptal_tc;
    @FXML
    public Button biletiptal_iptalet;
    @FXML
    public TextField biletlerim_tc;
    public Button biletlerim_sorgula;
    @FXML
    public TextArea bizeulas_mesaj;
    @FXML
    public Button bizeulas_gonder;
    public ImageView bus;
    public Button buy_ticket;
    @FXML
    public Button bilet_ara;
    @FXML
    public Button biletal;
    @FXML
    public Circle biletal_s4circle;
    @FXML
    public Circle biletal_s3circle;
    @FXML
    public Circle biletal_s1circle;
    @FXML
    public Circle biletal_s2circle;
    @FXML
    public Circle biletal_s6circle;
    @FXML
    public Circle biletal_s5circle;
    @FXML
    public Circle biletal_s7circle;
    @FXML
    public Circle biletal_s8circle;
    @FXML
    public Circle biletal_s16circle;
    @FXML
    public Circle biletal_s15circle;
    @FXML
    public Circle biletal_s13circle;
    @FXML
    public Circle biletal_s14circle;
    @FXML
    public Circle biletal_s10circle;
    @FXML
    public Circle biletal_s9circle;
    @FXML
    public Circle biletal_s11circle;
    @FXML
    public Circle biletal_s12circle;
    @FXML
    public Circle biletal_s25circle;
    @FXML
    public Circle biletal_s26circle;
    @FXML
    public Circle biletal_s28circle;
    @FXML
    public Circle biletal_s27circle;
    @FXML
    public Circle biletal_s29circle;
    @FXML
    public Circle biletal_s30circle;
    @FXML
    public Circle biletal_s24circle;
    @FXML
    public Circle biletal_s23circle;
    @FXML
    public Circle biletal_s21circle;
    @FXML
    public Circle biletal_s22circle;
    @FXML
    public Circle biletal_s18circle;
    @FXML
    public Circle biletal_s17circle;
    @FXML
    public Circle biletal_s19circle;
    @FXML
    public Circle biletal_s20circle;
    @FXML
    public Circle biletal_s37circle;
    @FXML
    public Circle biletal_s35circle;
    @FXML
    public Circle biletal_s36circle;
    @FXML
    public Circle biletal_s32circle;
    @FXML
    public Circle biletal_s31circle;
    @FXML
    public Circle biletal_s33circle;
    @FXML
    public Circle biletal_s34circle;
    @FXML
    public CheckBox seat4;
    @FXML
    public CheckBox seat3;
    @FXML
    public CheckBox seat1;
    @FXML
    public CheckBox seat2;
    @FXML
    public CheckBox seat6;
    @FXML
    public CheckBox seat5;
    @FXML
    public CheckBox seat7;
    @FXML
    public CheckBox seat8;
    @FXML
    public CheckBox seat16;
    @FXML
    public CheckBox seat15;
    @FXML
    public CheckBox seat13;
    @FXML
    public CheckBox seat14;
    @FXML
    public CheckBox seat10;
    @FXML
    public CheckBox seat9;
    @FXML
    public CheckBox seat11;
    @FXML
    public CheckBox seat12;
    @FXML
    public CheckBox seat25;
    @FXML
    public CheckBox seat26;
    @FXML
    public CheckBox seat28;
    @FXML
    public CheckBox seat27;
    @FXML
    public CheckBox seat29;
    @FXML
    public CheckBox seat30;
    @FXML
    public CheckBox seat24;
    @FXML
    public CheckBox seat23;
    @FXML
    public CheckBox seat21;
    @FXML
    public CheckBox seat22;
    @FXML
    public CheckBox seat18;
    @FXML
    public CheckBox seat17;
    @FXML
    public CheckBox seat19;
    @FXML
    public CheckBox seat20;
    @FXML
    public CheckBox seat38;
    @FXML
    public Circle biletal_s38circle;
    @FXML
    public CheckBox seat37;
    @FXML
    public CheckBox seat35;
    @FXML
    public CheckBox seat36;
    @FXML
    public CheckBox seat32;
    @FXML
    public CheckBox seat31;
    @FXML
    public CheckBox seat33;
    @FXML
    public CheckBox seat34;
    @FXML
    private ChoiceBox<?> biletal_firma_cmb;
    @FXML
    private Rectangle biletal_kapi;
    @FXML
    private Button biletal11;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> sehir = FXCollections.observableArrayList("Tekirdag","Istanbul","Izmir","Antalya","Isparta","Diyarbakir","Bursa");
        ObservableList<String> cinsiyet = FXCollections.observableArrayList("Erkek","Kadin");
        ObservableList<String> firma = FXCollections.observableArrayList("Kamil Koç","Pamukkale","Ulusoy","Isparta Petrol");
        ChoiceBox cb1 = biletal_nereden_cmb;
        ChoiceBox cb2 = biletal_nereye_cmb;
        ChoiceBox cb3 = biletal_cinsiyet_cmb;
        ChoiceBox cb4 = biletal_firma_cmb;
        cb1.setItems((ObservableList) sehir);
        cb2.setItems((ObservableList) sehir);
        cb3.setItems((ObservableList) cinsiyet);
        cb4.setItems((ObservableList) firma);
              
        // TODO
    }    

    @FXML
    private void gonder_bizeulas(ActionEvent event) {
        bizeulas_mesaj.setText(null);
        Component frame = null;
        JOptionPane.showMessageDialog(frame,"Tesekkur ederiz. Fikirleriniz bizim icin onemlidir.");
        
        
    }



    @FXML
    private void biletal_biletara(ActionEvent event) {
        ChoiceBox cb1 = biletal_nereden_cmb;
        ChoiceBox cb2 = biletal_nereye_cmb;
        ChoiceBox cb3 = biletal_cinsiyet_cmb;
        ChoiceBox cb4 = biletal_firma_cmb;
        TextField adsoyad = biletal_adsoyad;
        TextField tcno = biletal_tc;
        DatePicker tarih1 = biletal_tarih;
        Button biletal1 = biletal;
        Rectangle kapi = biletal_kapi;
        
        Circle sc1 = biletal_s1circle;Circle sc10 = biletal_s10circle;Circle sc11 = biletal_s11circle;Circle sc28 = biletal_s28circle;
        Circle sc2 = biletal_s2circle;Circle sc12 = biletal_s12circle;Circle sc13 = biletal_s13circle;Circle sc29 = biletal_s29circle;
        Circle sc3 = biletal_s3circle;Circle sc14 = biletal_s14circle;Circle sc15 = biletal_s15circle;Circle sc30 = biletal_s30circle;
        Circle sc4 = biletal_s4circle;Circle sc16 = biletal_s16circle;Circle sc17 = biletal_s17circle;Circle sc31 = biletal_s31circle;
        Circle sc5 = biletal_s5circle;Circle sc18 = biletal_s18circle;Circle sc19 = biletal_s19circle;Circle sc32 = biletal_s32circle;
        Circle sc6 = biletal_s6circle;Circle sc20 = biletal_s20circle;Circle sc21 = biletal_s21circle;Circle sc33 = biletal_s33circle;
        Circle sc7 = biletal_s7circle;Circle sc22 = biletal_s22circle;Circle sc23 = biletal_s23circle;Circle sc34 = biletal_s34circle;
        Circle sc8 = biletal_s8circle;Circle sc24 = biletal_s24circle;Circle sc25 = biletal_s25circle;
        Circle sc9 = biletal_s9circle;Circle sc26 = biletal_s26circle;Circle sc27 = biletal_s27circle;
        
        
        CheckBox s1= seat1;CheckBox s2= seat2;CheckBox s3= seat3;CheckBox s4= seat4;CheckBox s5= seat5;CheckBox s6= seat6;
        CheckBox s7= seat7;CheckBox s8= seat8;CheckBox s9= seat9;CheckBox s10= seat10;CheckBox s11= seat11;CheckBox s12= seat12;
        CheckBox s13= seat13;CheckBox s14= seat14;CheckBox s15= seat15;CheckBox s16= seat16;CheckBox s17= seat17;CheckBox s18= seat18;
        CheckBox s19= seat19;CheckBox s20= seat20;CheckBox s21= seat21;CheckBox s22= seat22;CheckBox s23= seat23;CheckBox s24= seat24;
        CheckBox s25= seat25;CheckBox s26= seat26;CheckBox s27= seat27;CheckBox s28= seat28;CheckBox s29= seat29;CheckBox s30= seat30;
        CheckBox s31= seat31;CheckBox s32= seat32;CheckBox s33= seat33;CheckBox s34= seat34;
        
        List<CheckBox> checkboxes = new ArrayList<>();      
               checkboxes.add(s1);checkboxes.add(s2);checkboxes.add(s3);checkboxes.add(s4);checkboxes.add(s5);checkboxes.add(s6);checkboxes.add(s7);checkboxes.add(s8);
               checkboxes.add(s9);checkboxes.add(s10);checkboxes.add(s11);checkboxes.add(s12);checkboxes.add(s13);checkboxes.add(s14);checkboxes.add(s15);checkboxes.add(s16);
               checkboxes.add(s17);checkboxes.add(s18);checkboxes.add(s19);checkboxes.add(s20);checkboxes.add(s21);checkboxes.add(s22);checkboxes.add(s23);checkboxes.add(s24);
               checkboxes.add(s25);checkboxes.add(s26);checkboxes.add(s27);checkboxes.add(s28);checkboxes.add(s29);checkboxes.add(s30);checkboxes.add(s31);checkboxes.add(s32);
               checkboxes.add(s33);checkboxes.add(s34);
               
        List<Circle> circles = new ArrayList<>();
               circles.add(sc1);circles.add(sc2);circles.add(sc3);circles.add(sc4);circles.add(sc5);circles.add(sc6);circles.add(sc7);circles.add(sc8);circles.add(sc9);
               circles.add(sc10);circles.add(sc11);circles.add(sc12);circles.add(sc13);circles.add(sc14);circles.add(sc15);circles.add(sc16);circles.add(sc17);circles.add(sc18);
               circles.add(sc19);circles.add(sc20);circles.add(sc21);circles.add(sc22);circles.add(sc23);circles.add(sc24);circles.add(sc25);circles.add(sc26);circles.add(sc27);
               circles.add(sc28);circles.add(sc29);circles.add(sc30);circles.add(sc31);circles.add(sc32);circles.add(sc33);circles.add(sc34);
               
        
       sc1.setVisible(true);sc2.setVisible(true);sc3.setVisible(true);sc4.setVisible(true);sc5.setVisible(true);sc6.setVisible(true);
       sc7.setVisible(true);sc8.setVisible(true);sc9.setVisible(true);sc10.setVisible(true);sc11.setVisible(true);sc12.setVisible(true);
       sc13.setVisible(true);sc14.setVisible(true);sc15.setVisible(true);sc16.setVisible(true);sc17.setVisible(true);sc18.setVisible(true);
       sc19.setVisible(true);sc20.setVisible(true);sc21.setVisible(true);sc22.setVisible(true);sc23.setVisible(true);sc24.setVisible(true);
       sc25.setVisible(true);sc26.setVisible(true);sc27.setVisible(true);sc28.setVisible(true);sc29.setVisible(true);sc30.setVisible(true);
       sc31.setVisible(true);sc32.setVisible(true);sc33.setVisible(true);sc34.setVisible(true);
       
       s1.setVisible(true);s2.setVisible(true);s3.setVisible(true);s4.setVisible(true);s5.setVisible(true);s6.setVisible(true);
       s7.setVisible(true);s8.setVisible(true);s9.setVisible(true);s10.setVisible(true);s11.setVisible(true);s12.setVisible(true);
       s13.setVisible(true);s14.setVisible(true);s15.setVisible(true);s16.setVisible(true);s17.setVisible(true);s18.setVisible(true);
       s19.setVisible(true);s20.setVisible(true);s21.setVisible(true);s22.setVisible(true);s23.setVisible(true);s24.setVisible(true);
       s25.setVisible(true);s26.setVisible(true);s27.setVisible(true);s28.setVisible(true);s29.setVisible(true);s30.setVisible(true);
       s31.setVisible(true);s32.setVisible(true);s33.setVisible(true);s34.setVisible(true);
       
       kapi.setVisible(true);
        
        cb1.setSelectionModel(null);
        cb2.setSelectionModel(null);
        cb3.setSelectionModel(null);
        cb4.setSelectionModel(null);
        adsoyad.setEditable(false);
        tcno.setEditable(false);
        tarih1.setDisable(true);
        biletal1.setVisible(true);
        JOptionPane.showMessageDialog(null,"Yeşil renk yanan koltuklardan dilediğinizi seçebilirsiniz.", "Lütfen Koltuk Seçiminizi Yapınız." , JOptionPane.INFORMATION_MESSAGE);
        bilet_al ba = new bilet_al();
        String nereden = biletal_nereden_cmb.getValue();
        String nereye = biletal_nereye_cmb.getValue();
        String firma = biletal_firma_cmb.getValue().toString();
        String tarih = biletal_tarih.getValue().toString();
        int otoid = ba.guzergah(nereden,nereye);
        int firmaid= ba.firmaidbul(firma);
        int dolukoltuk[] = new int[34];
        try{
        baglan aa= new baglan();
        PreparedStatement psp;
        ResultSet rs;
        psp=aa.getCon().prepareStatement("SELECT koltukno FROM bilet WHERE tarih=? and firmaid=? and otoid=?");
        psp.setString(1, tarih);
        psp.setInt(2, firmaid);
        psp.setInt(3, otoid);
        rs=psp.executeQuery();
        while(rs.next()){
            int a=Integer.parseInt(rs.getString(1));
            circles.get(a-1).setFill(Color.RED);
            checkboxes.get(a-1).setDisable(true);
        }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    @FXML
    private void iptalet(ActionEvent event) {
        int kimlikno;
        TextField tcno = biletiptal_tc;
        kimlikno=Integer.parseInt(tcno.getText());
        bilet_iptal bi = new bilet_iptal();
        bi.bilet_iptal(kimlikno);
    }

    @FXML
    private void biletara(ActionEvent event) {
        int kimlikno;
        TextField tcno = biletlerim_tc;
        kimlikno=Integer.parseInt(tcno.getText());
        bilet_sorgula bs = new bilet_sorgula();
        bs.bilet_sorgula(kimlikno);
    }

    @FXML
    private void biletal_biletal(ActionEvent event) {
        int koltukno=0;
        CheckBox s1= seat1;CheckBox s2= seat2;CheckBox s3= seat3;CheckBox s4= seat4;CheckBox s5= seat5;CheckBox s6= seat6;
        CheckBox s7= seat7;CheckBox s8= seat8;CheckBox s9= seat9;CheckBox s10= seat10;CheckBox s11= seat11;CheckBox s12= seat12;
        CheckBox s13= seat13;CheckBox s14= seat14;CheckBox s15= seat15;CheckBox s16= seat16;CheckBox s17= seat17;CheckBox s18= seat18;
        CheckBox s19= seat19;CheckBox s20= seat20;CheckBox s21= seat21;CheckBox s22= seat22;CheckBox s23= seat23;CheckBox s24= seat24;
        CheckBox s25= seat25;CheckBox s26= seat26;CheckBox s27= seat27;CheckBox s28= seat28;CheckBox s29= seat29;CheckBox s30= seat30;
        CheckBox s31= seat31;CheckBox s32= seat32;CheckBox s33= seat33;CheckBox s34= seat34;
        if(s1.isSelected()){koltukno=1;}
        else if(s2.isSelected()){koltukno=2;}else if(s3.isSelected()){koltukno=3;}if(s4.isSelected()){koltukno=4;}
        if(s5.isSelected()){koltukno=5;}else if(s6.isSelected()){koltukno=6;}else if(s7.isSelected()){koltukno=7;}if(s8.isSelected()){koltukno=8;}
        if(s9.isSelected()){koltukno=9;}else if(s10.isSelected()){koltukno=10;}else if(s11.isSelected()){koltukno=11;}if(s12.isSelected()){koltukno=12;}
        if(s13.isSelected()){koltukno=13;}else if(s14.isSelected()){koltukno=14;}else if(s15.isSelected()){koltukno=15;}if(s16.isSelected()){koltukno=16;}
        if(s17.isSelected()){koltukno=17;}else if(s18.isSelected()){koltukno=18;}else if(s19.isSelected()){koltukno=19;}if(s20.isSelected()){koltukno=20;}
        if(s21.isSelected()){koltukno=21;}else if(s22.isSelected()){koltukno=22;}else if(s23.isSelected()){koltukno=23;}if(s24.isSelected()){koltukno=24;}
        if(s25.isSelected()){koltukno=25;}else if(s26.isSelected()){koltukno=26;}else if(s27.isSelected()){koltukno=27;}if(s28.isSelected()){koltukno=28;}
        if(s29.isSelected()){koltukno=29;}else if(s30.isSelected()){koltukno=30;}else if(s31.isSelected()){koltukno=31;}if(s32.isSelected()){koltukno=32;}
        if(s33.isSelected()){koltukno=33;}else if(s34.isSelected()){koltukno=34;}
        
        String adsoyad = biletal_adsoyad.getText();
        String tcno = biletal_tc.getText();
        String cinsiyet= biletal_cinsiyet_cmb.getValue().toString();
        String nereden = biletal_nereden_cmb.getValue();
        String nereye = biletal_nereye_cmb.getValue();
        String firma = biletal_firma_cmb.getValue().toString();
        String tarih = biletal_tarih.getValue().toString();
        bilet_al baa= new bilet_al();
        int otoid = baa.guzergah(nereden,nereye);
        int firmaid= baa.firmaidbul(firma);
        baa.bilet_ekle(koltukno, tarih, firmaid, otoid);
        Button biletal1=biletal;
        Button biletal2=biletal11;
        biletal1.setVisible(false);
        biletal2.setVisible(true);
        JOptionPane.showMessageDialog(null,"Alışverişinizi tamamlamak için lütfen tekrar 'Bilet Satın Al' butonuna basınız", "Emin Misiniz ?" , JOptionPane.INFORMATION_MESSAGE);
        
        
    }

    @FXML
    private void biletal_biletal1(ActionEvent event) {
        int koltukno=0;
        CheckBox s1= seat1;CheckBox s2= seat2;CheckBox s3= seat3;CheckBox s4= seat4;CheckBox s5= seat5;CheckBox s6= seat6;
        CheckBox s7= seat7;CheckBox s8= seat8;CheckBox s9= seat9;CheckBox s10= seat10;CheckBox s11= seat11;CheckBox s12= seat12;
        CheckBox s13= seat13;CheckBox s14= seat14;CheckBox s15= seat15;CheckBox s16= seat16;CheckBox s17= seat17;CheckBox s18= seat18;
        CheckBox s19= seat19;CheckBox s20= seat20;CheckBox s21= seat21;CheckBox s22= seat22;CheckBox s23= seat23;CheckBox s24= seat24;
        CheckBox s25= seat25;CheckBox s26= seat26;CheckBox s27= seat27;CheckBox s28= seat28;CheckBox s29= seat29;CheckBox s30= seat30;
        CheckBox s31= seat31;CheckBox s32= seat32;CheckBox s33= seat33;CheckBox s34= seat34;
        if(s1.isSelected()){koltukno=1;}
        else if(s2.isSelected()){koltukno=2;}else if(s3.isSelected()){koltukno=3;}if(s4.isSelected()){koltukno=4;}
        if(s5.isSelected()){koltukno=5;}else if(s6.isSelected()){koltukno=6;}else if(s7.isSelected()){koltukno=7;}if(s8.isSelected()){koltukno=8;}
        if(s9.isSelected()){koltukno=9;}else if(s10.isSelected()){koltukno=10;}else if(s11.isSelected()){koltukno=11;}if(s12.isSelected()){koltukno=12;}
        if(s13.isSelected()){koltukno=13;}else if(s14.isSelected()){koltukno=14;}else if(s15.isSelected()){koltukno=15;}if(s16.isSelected()){koltukno=16;}
        if(s17.isSelected()){koltukno=17;}else if(s18.isSelected()){koltukno=18;}else if(s19.isSelected()){koltukno=19;}if(s20.isSelected()){koltukno=20;}
        if(s21.isSelected()){koltukno=21;}else if(s22.isSelected()){koltukno=22;}else if(s23.isSelected()){koltukno=23;}if(s24.isSelected()){koltukno=24;}
        if(s25.isSelected()){koltukno=25;}else if(s26.isSelected()){koltukno=26;}else if(s27.isSelected()){koltukno=27;}if(s28.isSelected()){koltukno=28;}
        if(s29.isSelected()){koltukno=29;}else if(s30.isSelected()){koltukno=30;}else if(s31.isSelected()){koltukno=31;}if(s32.isSelected()){koltukno=32;}
        if(s33.isSelected()){koltukno=33;}else if(s34.isSelected()){koltukno=34;}
        
        String adsoyad = biletal_adsoyad.getText();
        String tcno = biletal_tc.getText();
        String cinsiyet= biletal_cinsiyet_cmb.getValue().toString();
        String nereden = biletal_nereden_cmb.getValue();
        String nereye = biletal_nereye_cmb.getValue();
        String firma = biletal_firma_cmb.getValue().toString();
        String tarih = biletal_tarih.getValue().toString();
        bilet_al baa= new bilet_al();
        int otoid = baa.guzergah(nereden,nereye);
        int firmaid= baa.firmaidbul(firma);
        int biletno=baa.biletnobul(koltukno, tarih, firmaid, otoid);
        baa.yolcu_ekle(tcno, adsoyad, tarih, koltukno, cinsiyet, biletno);
    }

    private void biletal_temizle(ActionEvent event) {
        ChoiceBox cb1 = biletal_nereden_cmb;
        ChoiceBox cb2 = biletal_nereye_cmb;
        ChoiceBox cb3 = biletal_cinsiyet_cmb;
        ChoiceBox cb4 = biletal_firma_cmb;
        TextField adsoyad = biletal_adsoyad;
        TextField tcno = biletal_tc;
        DatePicker tarih1 = biletal_tarih;
        Button biletal1 = biletal;
        Button biletal111 = biletal11;
        Rectangle kapi = biletal_kapi;
        
        Circle sc1 = biletal_s1circle;Circle sc10 = biletal_s10circle;Circle sc11 = biletal_s11circle;Circle sc28 = biletal_s28circle;
        Circle sc2 = biletal_s2circle;Circle sc12 = biletal_s12circle;Circle sc13 = biletal_s13circle;Circle sc29 = biletal_s29circle;
        Circle sc3 = biletal_s3circle;Circle sc14 = biletal_s14circle;Circle sc15 = biletal_s15circle;Circle sc30 = biletal_s30circle;
        Circle sc4 = biletal_s4circle;Circle sc16 = biletal_s16circle;Circle sc17 = biletal_s17circle;Circle sc31 = biletal_s31circle;
        Circle sc5 = biletal_s5circle;Circle sc18 = biletal_s18circle;Circle sc19 = biletal_s19circle;Circle sc32 = biletal_s32circle;
        Circle sc6 = biletal_s6circle;Circle sc20 = biletal_s20circle;Circle sc21 = biletal_s21circle;Circle sc33 = biletal_s33circle;
        Circle sc7 = biletal_s7circle;Circle sc22 = biletal_s22circle;Circle sc23 = biletal_s23circle;Circle sc34 = biletal_s34circle;
        Circle sc8 = biletal_s8circle;Circle sc24 = biletal_s24circle;Circle sc25 = biletal_s25circle;
        Circle sc9 = biletal_s9circle;Circle sc26 = biletal_s26circle;Circle sc27 = biletal_s27circle;
        
        
        CheckBox s1= seat1;CheckBox s2= seat2;CheckBox s3= seat3;CheckBox s4= seat4;CheckBox s5= seat5;CheckBox s6= seat6;
        CheckBox s7= seat7;CheckBox s8= seat8;CheckBox s9= seat9;CheckBox s10= seat10;CheckBox s11= seat11;CheckBox s12= seat12;
        CheckBox s13= seat13;CheckBox s14= seat14;CheckBox s15= seat15;CheckBox s16= seat16;CheckBox s17= seat17;CheckBox s18= seat18;
        CheckBox s19= seat19;CheckBox s20= seat20;CheckBox s21= seat21;CheckBox s22= seat22;CheckBox s23= seat23;CheckBox s24= seat24;
        CheckBox s25= seat25;CheckBox s26= seat26;CheckBox s27= seat27;CheckBox s28= seat28;CheckBox s29= seat29;CheckBox s30= seat30;
        CheckBox s31= seat31;CheckBox s32= seat32;CheckBox s33= seat33;CheckBox s34= seat34;
        
       
       sc1.setVisible(false);sc2.setVisible(false);sc3.setVisible(false);sc4.setVisible(false);sc5.setVisible(false);sc6.setVisible(false);
       sc7.setVisible(false);sc8.setVisible(false);sc9.setVisible(false);sc10.setVisible(false);sc11.setVisible(false);sc12.setVisible(false);
       sc13.setVisible(false);sc14.setVisible(false);sc15.setVisible(false);sc16.setVisible(false);sc17.setVisible(false);sc18.setVisible(false);
       sc19.setVisible(false);sc20.setVisible(false);sc21.setVisible(false);sc22.setVisible(false);sc23.setVisible(false);sc24.setVisible(false);
       sc25.setVisible(false);sc26.setVisible(false);sc27.setVisible(false);sc28.setVisible(false);sc29.setVisible(false);sc30.setVisible(false);
       sc31.setVisible(false);sc32.setVisible(false);sc33.setVisible(false);sc34.setVisible(false);
       
       s1.setVisible(false);s2.setVisible(false);s3.setVisible(false);s4.setVisible(false);s5.setVisible(false);s6.setVisible(false);
       s7.setVisible(false);s8.setVisible(false);s9.setVisible(false);s10.setVisible(false);s11.setVisible(false);s12.setVisible(false);
       s13.setVisible(false);s14.setVisible(false);s15.setVisible(false);s16.setVisible(false);s17.setVisible(false);s18.setVisible(false);
       s19.setVisible(false);s20.setVisible(false);s21.setVisible(false);s22.setVisible(false);s23.setVisible(false);s24.setVisible(false);
       s25.setVisible(false);s26.setVisible(false);s27.setVisible(false);s28.setVisible(false);s29.setVisible(false);s30.setVisible(false);
       s31.setVisible(false);s32.setVisible(false);s33.setVisible(false);s34.setVisible(false);
       
       kapi.setVisible(false);
        
        cb1.getSelectionModel().clearSelection();
        cb2.getSelectionModel().clearSelection();
        cb3.getSelectionModel().clearSelection();
        cb4.getSelectionModel().clearSelection();
        adsoyad.setEditable(true);
        adsoyad.clear();
        tcno.setEditable(true);
        tcno.clear();
        tarih1.setDisable(false);
        biletal1.setVisible(false);
        biletal111.setVisible(false);
        
        
    }

    
    
}
