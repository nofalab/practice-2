/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordreverse;

import java.util.Scanner;

/**
 *Nofal Branch 
 * @author Megha Patel
 */
public class WordReverse {

   
    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        name=sc.nextLine();
        
        char[] revName=name.toCharArray();
        
        for(int i= revName.length-1; i>=0;i--)
        {
            System.out.print(revName[i]);
        }
    }

}
