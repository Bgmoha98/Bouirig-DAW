package exemplesconversions;

public class ConversionsImplicites {

    /*
Les conversions entre tipus numèrics sense modificació del valor, les fa automàtica
la màquina virtual de Java. 
Aquestes conversions s'anomenen IMPLÍCITES.

 BYTE  --> SHORT, INT, LONG, FLOAT, DOUBLE
 
 SHORT --> INT, LONG, FLOAT, DOUBLE
    
 CHAR --> INT, LONG, FLOAT, DOUBLE
     
 INT   --> LONG, FLOAT, DOUBLE 
 
 LONG  --> FLOAT, DOUBLE 
 
 FLOAT --> DOUBLE
  
     */
    public static void main(String[] args) {
        byte b = 23;
        short s = 4533;
        int i = -987;
        long l = 999999L;
        float f;
        double d;
        char lletra = 'z';

        //el valor de b està en byte
        //es converteix a double i es guarda en d com a double
        d = b;
        System.out.println("d = " + d); //-->d = 23.0

        //el 345L es converteix a double i es guarda en d com a double
        d = 345L;
        System.out.println("d = " + d); //-->d = 345.0

        /* Conversions automàtiques en operacions:
        (3 + 8.2): el 3 és un int, es converteix a double i es fa la suma de dos doubles
        11.2 * 5f: el 5f és un float, es converteix a double i es fa la multiplicació de dos doubles
         */
        d = (3 + 8.2) * 5f;
        System.out.println("d = " + d); //-->d = 56.0
        
        //Conversions automàtiques entre tipus compatibles
        s = b;
        System.out.println("s = " + s); //-->s = 23
        
        i = s;
        System.out.println("i = " + i); //-->i = 23
        
        l = i;
        System.out.println("l = " + l); //-->l = 23
        
        f = l;
        System.out.println("f = " + f); //-->f = 23.0
        
        d = f;
        System.out.println("d = " + d); //-->d = 23.0
        
        i = 'a';
        System.out.println("i = " + i); //-->i = 97
        
        s = '\u0238'; //en decimal 568
        System.out.println("s = " + s); //-->s = 568
        
        i = lletra;
        System.out.println("i = " + i); //-->i = 122
        
    }

}
