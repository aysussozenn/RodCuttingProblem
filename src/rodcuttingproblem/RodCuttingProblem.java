/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodcuttingproblem;

import static java.lang.Double.max;

/**
 *
 * @author USER
 */
public class RodCuttingProblem {

   static int rod_cutting(int price[],int size){
    int r[]=new int[size+1];
    int q;
    r[0] = 0;
    for (int j = 1; j <= size; j++)
    {
        
        q = 0;
        for (int i = 0; i < j; i++)
        {
            q = (int) max(q,price[i]+r[j-i-1]);
        }
        r[j] = q;
    }
    return r[size];
    }
         public static void main(String[] args) {
             int price[] = {76,12,26,44,97,26,14,9,14,6};
             int size = 10; 
             int a =rod_cutting(price,size);
             System.out.println("Maximum profit is " + a);
    }
}
   
    
   
    
  

