public class DoubleToInt { 
  
    // main method 
    public static void main(String args[]) 
    { 
  
        // Get the double value 
        double data = 9.2; 
  
        // convert into int 
        int value = (int)Math.round(data); 
        // print the int value 
        System.out.println(value); 
     // Get the double value 
        double data1 = 3452.345; 
  
        // Create a wrapper around 
        // the double value 
        Double newData = new Double(data1); 
  
        // convert into int 
        int value1 = newData.intValue(); 
  
        // print the int value 
        System.out.println(value1); 
    } 
} 