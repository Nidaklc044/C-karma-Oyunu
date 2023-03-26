
package random;

import java.util.Scanner;
public class Random {

 
    public static void main(String[] args) {
int sayi1=(int)(Math.random()*10);
int sayi2=(int)(Math.random()*7);
if(sayi1<sayi2){
    int temp=sayi1;
    sayi1=sayi2;
    sayi2=temp;
}
System.out.println(sayi1+"-"+sayi2+"sonucu nedir?");
Scanner scan=new Scanner(System.in);
int cevap=scan.nextInt();
 if(sayi1-sayi2==cevap){
     System.out.println("tebriklerrrr sonucunuz dogru");
 }
 else{
     System.out.println("yanlıs cevap"+ sayi1+"-"+ sayi2 +"="+(sayi1-sayi2));
    }
}
}
