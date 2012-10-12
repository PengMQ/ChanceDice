//import org.junit.Test;
//import sun.jvm.hotspot.memory.DictionaryEntry;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.assertTrue;
//
//public class TestDice {
//
//    @Test
//    public void shouldReturnsNumberOfThreeFaces(){
//        ArrayList<Integer> faces = new ArrayList<Integer>();
//        faces.add(1);
//        faces.add(2);
//        faces.add(3);
//        faces.add(4);
//        faces.add(5);
//        faces.add(6);
//        Dice dice = new Dice(faces);
//        assertEquals(dice.numberOfFaces(3),1);
//    }
//
//    @Test
//    public void shouldReturnsNumberOfFourFaces(){
//        ArrayList<Integer> faces = new ArrayList<Integer>();
//        faces.add(1);
//        faces.add(2);
//        faces.add(4);
//        faces.add(4);
//        faces.add(5);
//        faces.add(6);
//        Dice dice = new Dice(faces);
//        assertEquals(dice.numberOfFaces(4),2);
//    }
//
//    @Test
//    public void shouldReturnsTrueIfProbabilityOfBothFacesAreEqual(){
//        ArrayList<Integer> faces = new ArrayList<Integer>();
//        faces.add(1);
//        faces.add(2);
//        faces.add(4);
//        faces.add(4);
//        faces.add(5);
//        faces.add(6);
//        Dice dice = new Dice(faces);
//        assertTrue(dice.isChanceEqual(1, 6));
//    }
//
//
//}
