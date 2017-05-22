package com.mycompany;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Integer[] table = {5, 0, 2, 3, 1};
        //printTable(table);

        Person[] tableOfPeople = {
                new Person("Nowak", 23),
                new Person("Kowalski", 22),
                new Person("Nowak", 45),
                new Person("Góra", 22),
                new Person("Pająk", 25),
                new Person("Mikołajski", 23)
        };

        /*
        System.out.println();
        sortTable(table);
        //Integer min = min(table);
        //System.out.println(min);
        System.out.println();
        printTable(table);
        */
        System.out.println(1);

        printTableOfPeople(tableOfPeople);
        selectionSort(tableOfPeople);
        System.out.println();
        printTableOfPeople(tableOfPeople);
    }


    public static Person[] selectionSort(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            for (int j = i; j < persons.length - 1; j++) {
                if (persons[i].getAge() > persons[j + 1].getAge()) {
                    swap(persons, i, j + 1);
                }
                if (persons[i].getAge() == persons[j + 1].getAge()) {
                    if (!isHigherInAlphabet(persons[i].getSurname(), persons[j + 1].getSurname())) {
                        swap(persons, i, j + 1);
                    }
                }
            }
        }

        return persons;
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














    public static Integer[]sortTable(Integer[] table) {

        for (int i = 0; i < table.length - 1; i++)
        {
            int tmp = i;
            for (int j = i + 1; j < table.length; j++)
                if (table[j] < table[tmp])
                    tmp = j;

            int smallerNumber = table[tmp];
            table[tmp] = table[i];
            table[i] = smallerNumber;
        }
        return table;
        }





    public static Integer min(Integer[] table) {
        Integer tmp = table[0];
        for (int i = 1; i < table.length; i++) {
            if (tmp > table[i]) {
                tmp = table[i];
            }
        }
        return tmp;
    }

    public static void printTableOfPeople(Person[] table)
    {
        for (Person p: table) {
            System.out.println("Surname: " + p.getSurname() + ", age: " + p.getAge());
        }
    }

    public static void printTable(Integer[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }
}
