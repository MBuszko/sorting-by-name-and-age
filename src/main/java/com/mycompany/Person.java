package com.mycompany;

/**
 * Created by kornel on 19.05.17.
 */
public class Person {

    private String surname;
    private Integer age;

    public Person(String surname, Integer age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }


    public int compareTo(Person p) {
        int comparedSurname = surname.compareTo(p.surname);

        if(comparedSurname == 0) {
            return age.compareTo(p.age);
        }
        else {
            return comparedSurname;
        }
    }
}