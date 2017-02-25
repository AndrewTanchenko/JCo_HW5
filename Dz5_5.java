// Javacore / Tanchenko A.
/*
 * Given a positive integer, N, define the ’3N+1’ sequence starting from N as follows: 
 * If N is an even number, then divide N by two; but if N is odd, then multiply N by 3 and add 1. 
 * Continue to generate numbers in this way until N becomes equal to 1. 
 * For example, starting from N = 3, which is odd, we multiply by 3 and add 1, giving N = 3*3+1 = 10. 
 * Then, since N is even, we divide by 2, giving N = 10/2 = 5. We continue in this way, stopping when we reach 1, 
 * giving the complete sequence: 3, 10, 5, 16, 8, 4, 2, 1. 
 * 
 * Write a program that will read a positive integer from the user and will print out the 3N+1 sequence starting from that integer. 
 * The program should also count and print out the number of terms in the sequence.
 */
//import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;

class Dz5_5 {
  
  //5)  
  static  int even(int n) {
    int n_=n/2;
    return n_;}
  
  static  int odd(int n) {
    int n_=n*3+1;
    return n_;}
  
  static  int nextN3plus1(int n) {
    int n_=0;
    if(n%2==0){
      n_=even(n);}
    else{
      n_=odd(n);}
    return n_;}
    
 
    public static void main(String[] args) {
      
    // Input user data block  
      int n=5;
    ////////////////////////
      
      System.out.println(" start of '3N+1' series: "+n);
      
      int i=0;
      while(n>1){
        i++;
        n=nextN3plus1(n);
        System.out.println(" "+i+" term of series: "+n);
      }       
    }
}
