import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    
    
    public static void main(String[] args)throws IOException  {
        

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = new String ( br.readLine() );
        int len = s.length();
        int [][] chk = new int [ len ] [ len ];
        int i, j;
        
        for ( i = 0 ; i < len ; i++ ){
            chk [i] [i] = 1 ;
        }
        
        for( i = len - 2 ; i >= 0 ; i-- ){
            for ( j = i + 1 ; j < len ; j++ ){
                if ( s.charAt(i) == s.charAt(j) ){
                    chk [i] [j] = 2 + chk [ i+1 ] [ j-1 ] ;
                }
                else{
                    chk [i] [j] = Math.max( chk[i][j-1] , chk[i+1][j]);
                }
            }
        }
        int fun, maximum = 0 ;
        for( i = 0 ; i < len - 1 ; i ++){
            fun = chk[0][i] * chk[i+1][len-1];
            if ( fun > maximum ){
                maximum = fun;
            }
        }
        
      /*  for(i =0 ; i < len; i++){
            for(j=0; j<len; j++){
                System.out.print(chk[i][j] + "\t");
            }
            System.out.println("");
        }*/
        
        System.out.println( maximum );
    }


    
}
