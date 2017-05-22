package com.mycompany;

/**
 * Created by kornel on 22.05.17.
 */
public class SelectionSorter implements Sorter {
    public Person[] sort(Person[] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = i; j < p.length - 1; j++) {
                if (p[i].getAge() > p[j + 1].getAge()) {
                    swap(p, i, j + 1);
                }
                else if (p[i].getAge() == p[j + 1].getAge()) {
                    if (!isHigherInAlphabet(p[i].getSurname(), p[j + 1].getSurname())) {
                        swap(p, i, j + 1);
                    }
                }
            }
        }

        return p;
    }


    //checks alphabetical order of two Strings and returns true if first is higher
    public static boolean isHigherInAlphabet(String first, String second) {
        if (first.compareTo(second) < 0) {
            return true;
        } else
            return false;
    }

    public static Person[] swap(Person[] persons, int p, int r) {
        Person temp = persons[p];
        persons[p] = persons[r];
        persons[r] = temp;

        return persons;
    }
}
