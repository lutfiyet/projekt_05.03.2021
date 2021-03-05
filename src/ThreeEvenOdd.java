public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*

   Parametre int array olan threeEvenOrOdd methodu oluşturun.
   arrayiniz 3 tane çift veya 3 tane  tek değer içeriyorsa method  true değerini döndürür.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
public static boolean threeEvenOrOdd(int[] sayilar){
int count=0;
boolean uclu=false;
    for (int i = 0; i <sayilar.length ; i++) {
        if (sayilar[i]%2==0){
           count++;
        }
        if (count==3) {
            uclu = true;
        }
        else if(!(count ==3)) {
            uclu=false;}
    }

    return uclu;
}



}
