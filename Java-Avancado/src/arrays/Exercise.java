package arrays;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        double[] notes = new double[3];
        notes[0] = 2.0;
        notes[1] = 3.0;
        notes[2] = 4.0;

        double[] notesB = {2.0, 4.0, 5.0};

        System.out.println(Arrays.toString(notes));

        for (int i = 0; i < notesB.length; i++) {
            System.out.println(notesB[i]);
        }
    }
}
