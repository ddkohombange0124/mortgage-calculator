/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morgage;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Kohombange DD
 */
public class Morgage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    final byte months_in_yr=12;
    final byte persant=100;
    
    Scanner scanner= new Scanner(System.in);
    System.out.print("principal : ");
    int principal=scanner.nextInt();
    
    System.out.print("annual rate : ");
    float annualrate=scanner.nextFloat();
    float monthlyrate=annualrate/persant/months_in_yr;
    
    System.out.print("period(years) :");
    byte years=scanner.nextByte();
    int payment=years*months_in_yr;
    
    double mortgage=principal*(monthlyrate * Math.pow(1+monthlyrate,payment)/Math.pow(1+monthlyrate,payment)-1);
    String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("mortgage:"+mortgageFormatted);
    
    }
    
}
