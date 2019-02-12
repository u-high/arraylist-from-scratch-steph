import java.util.*;

public class steveArrayRunner{
  public static void main(String [] args)
  {  
    
    int[] tuple = new int[]{2, 3, 4};
    
    SteveArray steve = new SteveArray(tuple);
    steve.add(3);
    steve.add(50);
    steve.get(2);
    steve.set(2, 25);
    steve.test();
    
    tuple = steve.convert();
    
    System.out.println(Arrays.toString(tuple));
    

    
  }
  
  
  
  
}