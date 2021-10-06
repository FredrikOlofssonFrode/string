package se.fredrik;

/*Du har en sträng tex 
string namn="kurt andersson";
eller
string namn="leif stefan holmberg";
Skriv kod så att förnamn och efternamn i variabeln i en ny variabel (caseName) börjar med stora bokstäver.
Resultatet skall bli så här "Kurt Andersson"*/

public class Lab7 {

    public void run7() {

        System.out.print("Skriv in ditt namn: ");
        String name = (System.console().readLine());
        //Splittar upp din inmatade text i "lådor" så skriver du in Fredrik Olofsson så är en låda "Fredrik" och den andra är "Olofsson"
        String words[] = name.split(" ");
        String capName = "";

        //
        for (String word : words) {

            // skapar en varibel som heter "firstLetter" som 
            String firstLetter = word.substring(0, 1);

            String remainLetters = word.substring(1);

            capName += firstLetter.toUpperCase() + remainLetters + " ";

        }
        System.out.println(capName);

    }

}
