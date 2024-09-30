package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    static List<Person> peopleList = new ArrayList<>();
    public static List<Person> getPeopleList() {
        if (peopleList.isEmpty()) {
            peopleList.add(new Person("John", "Smith"));
            peopleList.add(new Teacher("Maria", "Montessori", "Educacion"));
            peopleList.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
            peopleList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));
        }

        return peopleList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person people : stringList) {
            people.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }

}
