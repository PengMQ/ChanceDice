import java.util.ArrayList;

public class Dice {
    ArrayList<Integer> faces;
    public Dice(ArrayList<Integer> faces) {
        this.faces = faces;


    }

    public int numberOfFaces(int i) {
        int counter = 0;
        for(int j : faces){
            if(i==j){
                counter++;

            }

        }

            return counter;
    }
}
