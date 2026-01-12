package com.epam.training.unclean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        System.out.println(filter(List.of(1, 2, 1, 5, 3, 2, 2, 2, 2, 4, 2)));
        System.out.println(filter(List.of(1, 2, 1, 2, 1, 2, 1, 2, 3)));
        System.out.println(filter(List.of(1, 2, 1, 2, 1, 2, 1, 2)));
        System.out.println(filter(List.of(0, 0, 0, 0)));
        System.out.println(filter(List.of(1)));
        System.out.println(filter(List.of()));
        System.out.println(filter(null));


    }

    // This code checks what numbers are unique in the array
    public static List<Integer> filter(List<Integer> inputList) {
        if (inputList == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (Integer number: inputList){
            freqMap.put(number,freqMap.getOrDefault(number,0)+1);
        }
        List<Integer> uniqueElements = new ArrayList<>();
        for (Integer number: inputList){
            if (freqMap.get(number) == 1){
                uniqueElements.add(number);
            }
        }
        return uniqueElements;
    }
}
