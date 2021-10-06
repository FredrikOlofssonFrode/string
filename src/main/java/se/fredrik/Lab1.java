package se.fredrik;

public class Lab1 {
    public void run1(){

        int antalInMatadeNamn = 0;

        while (true){

            System.out.print("Skriv in ett namn: ");
            String name = System.console().readLine();

            if (name.equals("EXIT"))
                break;
            

            int lenght = name.length();
            System.out.println("Namnet: " + name + " har " + lenght + " tecken");
            antalInMatadeNamn++;
        }
        System.out.println("Hejdå, du in totalt %d stycken ord\n" + antalInMatadeNamn);
    
}
    
}
