package com.company.Bionix;

import java.util.List;

public class TransformerCollectionInArray<T> {
    public void transform(List<T> t) {
        T[] myArray = (T[]) new Object[t.size()];
        myArray = t.toArray(myArray);
        for (T type : myArray) {
            System.out.println(type);
        }
    }
}