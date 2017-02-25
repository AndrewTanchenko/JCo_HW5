// Javacore / Tanchenko A.
/*
 * 2. ���� ����� ����� N (> 0). ��������� �������� ������� ������ � ������ ������� �� �������, ������� ��� ��� �����, ������� � ����� ������ (������� ������).
 * 3. ���� ����� ����� N (> 1). ���� ��� �������� �������, �� ���� �� ����� ������������� ���������, ����� 1 � ������ ����, �� ������� True, ����� ������� False.
 * 4. ���� ����� ����� N (> 1). ������������������ ����� ��������� FK ������������ ��������� �������: F1 = 1, F2 = 1, FK = FK�2 + FK�1, K = 3, 4, � . 
 * ���������, �������� �� ����� N ������ ���������. ���� ��������, �� ������� True, ���� ��� � ������� False.
 */
//import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;

class Dz5_234 {
  
  //2)  
  static  void printAllDigits(int n) {
      System.out.print (""+n+" is contained next digits:");
      String s1=""+n;
      int l=s1.length();
      for(int i=1;i<=l;i++){
        System.out.print(" "+n%10);
        n=(int)(n/10);
      }
      System.out.println();
    }
    
  //3)  
  static  boolean checkPrimeNum(int n) {
      boolean answer=false;
      int i=0;
      for(i=2;i<n;i++){
        if(n%i==0){break;}
      }
      if(i==n){answer=true;}
      //System.out.println(""+i);
      return answer;
    }
    
  //4)    
  static  boolean compareFibonachi(int n) {
    boolean ans=false;
    int f_1=1,f_2=1,f_3=0;
    
    while(f_3<=n){
      f_3=f_1+f_2;
      f_1=f_2;
      f_2=f_3;
      //System.out.print(" "+f_3);
      if(f_3==n){ans=true;}
    }
    //System.out.println();
    return ans;
  }
    


    public static void main(String[] args) {
      
    // Input user data block  
      int n=0;
    ////////////////////////
      
      n=12345;
      printAllDigits(n);
      
      n=7;
      if(checkPrimeNum(n)){
        System.out.println(""+n+" is a prime number ");}
      else{
        System.out.println(""+n+" is not a prime number ");}
      
      n=21;
      if(compareFibonachi(n)){
        System.out.println(""+n+" is a part of Fibonacci series ");}
      else{
        System.out.println(""+n+" is not a part of Fibonacci series ");}
      
    }
}