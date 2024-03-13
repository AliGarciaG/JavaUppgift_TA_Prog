package Inlamingsuppgift_TA_Prog;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {
    @Test
    // Här testas omvandling från ord till Morsekod
    public void toMorseCode() {
        //Arrange - Förbereder testdata och instans av Converter
        Converter myConverter = new Converter();
        String expected = "*- *-** **";

        //Act -Utför operationen som testas
        myConverter.toMorseCode("ALI");
        String actual = myConverter.getResults();

        //Assert - Jämför förväntat resultat med faktiskt resultat
        assertEquals(expected, actual);
    }

    // Här testas omvandling från Morsekod till ord
    @Test
    public void fromMorseCode() {
        //Arrange - Förbereder testdata och instans av Converter
        Converter myConverter = new Converter();
        String expected = "ALI";

        //Act -Utför operationen som testas
        myConverter.fromMorseCode("*- *-** **");
        String actual = myConverter.getResults();

        //Assert - Jämför förväntat resultat med faktiskt resultat
        assertEquals(expected, actual);
    }

    // Här testas omvandling från Morsekod till ord med olika ord
    @Test
    public void otherMorseCode() {
        //Arrange - Förbereder testdata och instans av Converter
        Converter myConverter = new Converter();
        String expected = "Hello";

        //Act -Utför operationen som testas
        myConverter.fromMorseCode("*- *-** **");
        String actual = myConverter.getResults();

        //Assert - Jämför förväntat resultat med faktiskt resultat
        assertEquals(expected, actual);
    }
}
