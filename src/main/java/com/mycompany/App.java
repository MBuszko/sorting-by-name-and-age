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
        sortTableOfPeople(tableOfPeople);
        System.out.println();
        printTableOfPeople(tableOfPeople);
    }

    public static Person[]sortTableOfPeople(Person[] tableOfPeople) {

        for (int i = 0; i < tableOfPeople.length; i++)
        {
            int tmp = i;
            for (int j = i + 1; j < tableOfPeople.length; j++)
                if (tableOfPeople[j].getSurname().compareTo(tableOfPeople[tmp].getSurname()))
                    tmp = j;

                //if (tableOfPeople[j].getAge() < tableOfPeople[tmp].getAge())
                  //  tmp = j;


                /*if (tableOfPeople[j].getSurname().equals(tableOfPeople[tmp].getSurname()))
                    if (tableOfPeople[j].getAge() < tableOfPeople[tmp].getAge())
                        tmp = j;
                else if (tableOfPeople[j].getAge() < tableOfPeople[tmp].getAge())
                    tmp =j;*/


            Person smallerNumber = tableOfPeople[tmp];
            tableOfPeople[tmp] = tableOfPeople[i];
            tableOfPeople[i] = smallerNumber;
        }
        return tableOfPeople;
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
