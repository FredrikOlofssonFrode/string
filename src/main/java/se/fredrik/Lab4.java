package se.fredrik;

public class Lab4 {

    public void run4(){

        
        String txt = "Detta är min text som jag matar in";

        String[] antalTecken = txt.split(" ");
        
        System.out.println("Det är totalt: " + antalTecken.length + " antal tecken i ditt ord");

    }
    
}
