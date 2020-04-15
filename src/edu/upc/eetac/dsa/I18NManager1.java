package edu.upc.eetac.dsa;
import javax.swing.*;
import java.util.ResourceBundle;

public class I18NManager1 {

    private static I18NManager1 instance;
    private ResourceBundle ca, es, en;

    private static final String PACKAGE = "edu.upc.eetac.dsa";


    private I18NManager1(){

        this.es = ResourceBundle.getBundle(PACKAGE+"es");
        this.ca = ResourceBundle.getBundle(PACKAGE+"es");
        this.en = ResourceBundle.getBundle(PACKAGE+"es");

    }


    public static void main(String[] args){

        String value = null;

        value = I18NManager1.getInstance().getText("ca", "l1");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("en", "l1");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("es", "l1");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("ca", "l2");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("en", "l2");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("es", "l2");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("ca", "l3");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("en", "l3");
        System.out.println(value);

        value = I18NManager1.getInstance().getText("es", "l3");
        System.out.println(value);

    }

}
