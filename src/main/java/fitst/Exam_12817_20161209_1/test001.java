package fitst.Exam_12817_20161209_1;
import java.util.LinkedList; 

  

public class test001 
{ 
    public static boolean shushu ( int kaishi, String end ) 
    { 
        end = end.startsWith ("+") ? end.substring (1) : end; 

        int number = Integer.parseInt (end); 

        if (number < 2) 
        { 
            return false; 
        } 
        kaishi++; 
        if (kaishi >= number) 
        { 
            return true;    } 
        if (number % kaishi == 0) 
       {
            return false; 

        } 

        return shushu (kaishi, end); 

    } 

      

    public static void main ( String[] args ) 

    { 

        LinkedList<Integer> result = new LinkedList<Integer> (); 

        for ( int i = 1; i < 100; i++ ) 

        { 
            if (shushu (1, (i + ""))) 
            { 
                result.add (i); 
            } 
        } 
        System.out.println ("1到100之间的所有素数: " + result + " , 个数 : " + result.size ()); 

    } 

}
