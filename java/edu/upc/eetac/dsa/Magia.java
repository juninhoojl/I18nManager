package edu.upc.eetac.dsa;
import edu.upc.eetac.dsa.model.User;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Magia{

    public static void main(String[] args){

        User u = new User("Pepito", "Grillo");
        System.out.println(u.getName()+" "+u.getSurname());
        System.out.println("class.getName:" + u.getClass().getName());
        System.out.println("class.getName:" + u.getClass().getSimpleName());

        System.out.println("annotacions: " +Arrays.toString(u.getClass().getAnnotations()));

        System.out.println("====================================");

        try{
            // o c eh uma entidade classe que realmente representa a classe
            Class c = Class.forName("edu.upc.eetac.dsa.model.User");
            // user2 eh uma instancia
            // sobre qualquer instancia podemos perguntar sobre sua classe
            // como por exemplo: c.getClass()
            User user2 = (User) c.newInstance();
            user2.setName("Pepe");
            user2.setSurname("Gotera");
            System.out.println(user2);

            System.out.println("====================================");

            for(Field f: c.getDeclaredFields()){
                System.out.println(f.getName());
            }

            System.out.println("====================================");

            for(Method m: c.getDeclaredMethods()){
                System.out.println(m.getName());
            }

            System.out.println("=[getName]==========================");
            // De todos os metodos declarados localiza o que chama getname
            // c eh a classe, por meio do carregador de classe acima obtivemos a classe User
            // Pegamos o metodo dessa classe que chama getname e nao tem nenhum parametro
            Method m = c.getDeclaredMethod("getName", null);
            String result = (String) m.invoke(user2, null);
            System.out.println(result);


            System.out.println("=[getName]==========================");
            Method m2 = c.getDeclaredMethod("setName", String.class);
            m2.invoke(user2, "Pepito");
            System.out.println(user2);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
