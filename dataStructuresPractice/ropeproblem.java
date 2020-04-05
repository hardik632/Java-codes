package dataStructures;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class ropeproblem { 
      
    // function print how many Ropes are Left After 
    // Every Cutting operation 
    public static void cuttringRopes(int Ropes[], int n) 
    { 
        // sort all Ropes in increasing 
        // order of their length 
        Arrays.sort(Ropes); 
  
        int singleOperation = 0; 
  
        // min length rope 
        int cuttingLenght = Ropes[0]; 
  
        // now traverse through the given Ropes in 
        // increase order of length 
        for (int i = 1; i < n; i++) 
        { 
            // After cutting if current rope length 
            // is greater than '0' that mean all 
            // ropes to it's right side are also 
            // greater than 0 
            if (Ropes[i] - cuttingLenght > 0) 
            { 
                System.out.print(n - i + " "); 
                  
                // now current rope become  
                // min length rope 
                cuttingLenght = Ropes[i]; 
  
                singleOperation++; 
            } 
        } 
          
        // after first operation all ropes 
        // length become zero 
        if (singleOperation == 0) 
            System.out.print("0"); 
    } 
  
    public static void main(String[] arg) 
    { 
        int[] Ropes = { 5, 1, 1, 2, 3, 5 }; 
        int n = Ropes.length; 
        cuttringRopes(Ropes, n); 
    } 
} 