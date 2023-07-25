package com.epam.training.unclean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Application {

    public static void main(String[] args) {
        
        Application app = new Application();

        System.out.println(app.filter(List.of(1, 2, 1, 5, 3, 2, 2, 2, 2, 4, 2)));
        System.out.println(app.filter(List.of(1, 2, 1, 2, 1, 2, 1, 2, 3)));
        System.out.println(app.filter(List.of(1, 2, 1, 2, 1, 2, 1, 2)));
        System.out.println(app.filter(List.of(0, 0, 0, 0)));
        System.out.println(app.filter(List.of(1)));
        System.out.println(app.filter(List.of()));
        System.out.println(app.filter(null));


    }

    // This code checks the even numbers in the array
    public static List<Integer> filter(List<? extends Integer> inputList) {
        if (inputList == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        List<Integer> array4 = new ArrayList<>();

        int Idx1;
        for (Idx1 = 0; Idx1 < inputList.size(); Idx1++) {
            Integer Indexed = inputList.get(Idx1);
            boolean l = false;
            for (int index2 = 1; index2 < inputList.size() - 1; index2++) {
                if (Idx1 == index2 - 1) {
                    continue;
                }
                if (Indexed.equals(inputList.get(index2 - 1))) {
                    l = true;
                    break;
                }
            }
            if (!l) {
                array4.add(Indexed);
            }
        }
        return array4;
    }
}
