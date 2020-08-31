    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package book;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String aa,bb,dd,ee,gg,hh;
        Double x;
        Double cc,ff,ii;
        books b=new mybook();
        Scanner obj=new Scanner(System.in);
        
        System.out.println("enter the title 1:");
        aa=obj.next();
        System.out.println("enter the author 1:");
        bb=obj.next();
        System.out.println("enter the price 1:");
        cc=obj.nextDouble();
        b.setdetail(aa,bb,cc);
        System.out.println("title:"+b.gettitle());
        
        System.out.println("enter the title 2:");
        dd=obj.next();
        System.out.println("enter the author 2:");
        ee=obj.next();
        System.out.println("enter the price 2:");
        ff=obj.nextDouble();
        b.setdetail(ee,dd,ff);
        System.out.println("title:"+b.gettitle());
        
        System.out.println("enter the title 3:");
        gg=obj.next();
        System.out.println("enter the author 3:");
        hh=obj.next();
        System.out.println("enter the price 3:");
        ii=obj.nextDouble();
        b.setdetail(gg,hh,ii);      
        System.out.println("Title:"+b.gettitle());
        
        x=cc+ff+ii;
        System.out.println("Total price:"+x);
    }
}

abstract class books
{
    String title;
    String author;
    double price;
    abstract void setdetail(String s,String s1,double d);
    String gettitle()
            {
                return title;
            }
}
class mybook extends books
{
    public void setdetail(String s,String s1,double d)   
    {
        title=s;
        author=s1;
        price=d;
          
    }
}
