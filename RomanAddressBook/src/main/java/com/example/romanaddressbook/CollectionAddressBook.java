package com.example.romanaddressbook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CollectionAddressBook implements AddressBook{

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ObservableList<Person> getPersonList(){
        return personList;
    }

    public void print(){
        int number = 0;
        System.out.println();
        for (Person person: personList){
            number++;
            System.out.println(number+") ПІП: "+person.getPIP()+"; Телефон: "+ person.getPhone());
        }
    }
    public void fillTestData(){
        personList.add(new Person("Yulia", "12231"));
        personList.add(new Person("Oksana", "02365"));
        personList.add(new Person("Petro", "465875"));
    }
}

