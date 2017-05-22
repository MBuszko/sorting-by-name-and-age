package com.mycompany;

/**
 * Created by kornel on 22.05.17.
 */
public class BubbleSorter implements Sorter {
    public Person[] sort(Person[] p) {
        for (int i = 0; i < p.length - 1; i++)
        {
            int tmp = i;
            for (int j = i + 1; j < p.length; j++)
                if (p[j].getAge() < p[tmp].getAge())
                    tmp = j;

            Person tempPerson = p[tmp];
            p[tmp] = p[i];
            p[i] = tempPerson;
        }
        return p;
    }
}
