package se.fredrik;

public class Lab8 {
    public void run8() {

        // Så länge som användaren skriver in fel namn, så kör loopen vidare.
        while (true) {

            System.out.print("Ange ett namn: ");
            String name = System.console().readLine();
            // equalsIgnoreCase använder man så om användaren skriver in MatS SunDin så kommer den ändå känna utav att det är "Mats Sundin".
            // Den sorterar ut dem "felaktiga" tecken och skriver ut meddelandet även fast man skrivit "fel".
            if (name.equalsIgnoreCase("Mats Sundin")) {
                System.out.println("The worlds best player of all time!!!");
                break;
            } else {
                System.out.println("I´ve never heard about that player?");
                System.out.println("*** TRY AGAIN ***");
            }

        }
    }

}
