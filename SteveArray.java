import java.util.*;
public class SteveArray{
  
  
  private int[] sArray;
  
  public SteveArray(int[] y){
    
      sArray = y;
      System.out.println(Arrays.toString(y) + sArray.length);
      
  }

 
  public void get(int u){
    int y = sArray[u];
     System.out.println(y);
  }
  
  public int length(){
    return sArray.length;
  }
  
  public void add(int u){
    
    int e = sArray.length + 1;
    
    int[] newArray = new int[e];
    
    newArray[newArray.length - 1] = u;
    
    for(int num = 0; num <= sArray.length - 1; num++){
     
      newArray[num] = sArray[num];
      
    }
    sArray = newArray;
    
  }
  
  public void set(int index, int num){
    
    sArray[index] = num;
    
  }
  
  
  public void test(){
    
   System.out.println(Arrays.toString(sArray));
    
  }
  

  public int[] convert(){
    
   return sArray;
    
  }
 
  
  
}