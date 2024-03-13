// Logikklass : Converter

package Inlamingsuppgift_TA_Prog;

public class Converter {
    // Här deklareras variabler
    private final String[] alphabet;
    private final String[] morseCode;
    private String results = "";

    // Constructor med båda tabeller
    public Converter() {
        alphabet = new String[]{"A", "B", "C", "D", "E",
                "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ".", ",", "?"};

        morseCode = new String[]{"*-", "-***", "-*-*", "-**", "*",
                "**-*", "--*", "****", "**", "*---", "-*-", "*-**", "--", "-*", "---", "*--*",
                "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**",
                "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----",
                "*-*-*-", "--**--", "**--**"};
    }

    // Metoden omvandlar text till Morsekod
    public void toMorseCode(String myText) {
        String[] testData;
        testData = myText.split("");
        for (int i = 0; i < testData.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j].equalsIgnoreCase(testData[i])) {
                    results = results + (morseCode[j]) + " ";
                    break;
                }
            }
        }
    }

    // Metoden omvandlar Morsekod till text
    public void fromMorseCode(String myText) {
        String[] testData = myText.split(" ");
        // Här hanteras med try and catch tecken som inte är Morsekod
        try {
            for (int i = 0; i < testData.length; i++) {
                boolean found = false;
                for (int j = 0; j < morseCode.length; j++) {
                    if (morseCode[j].equalsIgnoreCase(testData[i])) {
                        results = results + (alphabet[j]);
                        found = true;
                        break;
                    }
                }//läggs till för tecken som inte är * eller -
                if (!found) {
                    throw new IllegalArgumentException("Ogiltig Morsekod tecken/antal mellanslag hittades!");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("\nFel: " + e.getMessage());
            System.out.println("Endast '*' eller '-' accepteras i Morsekod och bara ett mellanslag!");
        }
    }

    // Metoden visar upp resultatet
    public void printOutResults() {
        if (results != "")         //Results printas inte ut om den är tom!
            System.out.println("\nDen konverterade texten är: " + results);
        results = "";           // Här nollställs variabeln
    }

    public String getResults() {
        return results;
        //return results.trim();
    }

    // Metoden skriver ut en marginal
    public void marginal() {
        System.out.println("*************************************");
    }
}