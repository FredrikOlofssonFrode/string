package se.fredrik;

public class Lab5 {

    public void run5() {
        System.out.println("Mata in ett ord: ");
        String txt = System.console().readLine();

        int position = 0;
        while (true) {
            System.out.println("Mata in en position: ");
            position = Integer.parseInt(System.console().readLine());

            if (position >= 0 && position < txt.length()) 
                break;
            
        }
        char ch = txt.charAt(position);
        System.out.println("Din valda position blev: " + ch);

    }

}
