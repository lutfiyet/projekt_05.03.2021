import javax.swing.*;
import java.util.Arrays;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       For Example:

            my family live in united states

      Result should be

            My Family Live In United States

     */

    /*
           camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
           büyük harfe çevirip geri döndüren metodun yazınız.

           Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel

     */


    public static String camelcase (String cumle){
        String basharflerbuyuk="";
        String[] cumleninkelimeler = cumle.split(" ");

        for(int i = 0 ; i < cumleninkelimeler.length ; i++){
            basharflerbuyuk+=cumleninkelimeler[i].substring(0,1).toUpperCase()+cumleninkelimeler[i].substring(1)+" ";
        }
        return basharflerbuyuk.trim();
    }

}