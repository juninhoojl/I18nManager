package edu.upc.eetac.dsa;
import javax.swing.*;
import java.util.ResourceBundle;

public class I18NManager1 {

    private static I18NManager1 instance;
    private ResourceBundle ca, es, en, pt;

    private static final String PACKAGE = "edu.upc.eetac.dsa";


    private I18NManager1(){

        this.es = ResourceBundle.getBundle(PACKAGE+".es");
        this.ca = ResourceBundle.getBundle(PACKAGE+".en");
        this.en = ResourceBundle.getBundle(PACKAGE+".ca");
        this.pt = ResourceBundle.getBundle(PACKAGE+".pt");

    }

    public String getText(String language, String key){

        ResourceBundle rs = null;
        if(language.equals("es")) rs = this.es;
        if(language.equals("en")) rs = this.en;
        if(language.equals("ca")) rs = this.ca;
        if(language.equals("pt")) rs = this.ca;

        return rs.getString(key);
    }

    // Aqui temos um singleton
    public static I18NManager1 getInstance(){
        if(instance==null) instance = new I18NManager1();
        return instance;
    }

    public static void main(String[] args){

        String value = null;

        value = I18NManager1.getInstance().getText("ca", "l1");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("en", "l1");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("es", "l1");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("pt", "l1");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("ca", "l2");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("en", "l2");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("es", "l2");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("pt", "l2");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("ca", "l3");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("en", "l3");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("es", "l3");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("pt", "l3");
        System.out.println(value);

    }



}
