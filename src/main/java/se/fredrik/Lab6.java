package se.fredrik;

public class Lab6 {

    public void run6(){

        
        System.out.print("Skriv ditt namn: ");
        String name = System.console().readLine();

        System.out.println(name);

        String []words = name.split(" ");
      
        
        String result = words[0].charAt(0) + "." + words[1].charAt(0);


        System.out.println(result);
        

    }
    
}
