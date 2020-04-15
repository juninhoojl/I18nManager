package edu.upc.eetac.dsa;
import javax.swing.*;
import java.util.ResourceBundle;
import java.util.HashMap;

public class I18NManager2 {

    private static I18NManager2 instance;
    private HashMap<String, ResourceBundle> data;

    private static final String PACKAGE = "edu.upc.eetac.dsa";

    // A ideia eh a mesma que a primeira porem usando hash
    private I18NManager2(){
        this.data = new HashMap<String, ResourceBundle>();
    }

    public String getText(String language, String key){
        // A primeira vez que executamos vai estar totalmente vazia
        ResourceBundle rs = this.data.get(language);
        if(rs==null){
            rs = ResourceBundle.getBundle(PACKAGE+"."+language);
            this.data.put(language, rs);
        }
        return rs.getString(key);
    }

    // Aqui temos um singleton
    public static I18NManager2 getInstance(){
        if(instance==null) instance = new I18NManager2();
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
