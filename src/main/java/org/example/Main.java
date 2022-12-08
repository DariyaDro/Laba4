package org.example;

import java.io.*;
import java.util.LinkedList;
/**Класс для формирования списка из документа .csv и его печати
 * @author Дроздова Дария
 * */
public class Main {
    /** Функция формирования списка из документа .csv*/
    public static void get_list_from_document(LinkedList<Person> list_of_persons) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("C:\\I\\java\\Laba4\\src\\main\\resources\\names.csv"));
        String nextLine;
        while ((nextLine = csvReader.readLine()) != null) {
            String[] s = nextLine.split(";");
            Person p = new Person();
            p.set_ID(s[0]);
            p.set_name(s[1]);
            p.set_pol(s[2]);
            p.set_date_of_birthday(s[3]);
            p.set_division(s[4]);
            p.set_salary(s[5]);
            list_of_persons.add(p);
        }
    }
    /**Точка входа в класс и приложение, вывод списка на экран*/
    public static void main(String[] args) throws IOException {
        LinkedList<Person> list_of_persons = new LinkedList<>();
        get_list_from_document(list_of_persons);
        for(Person p: list_of_persons){
            p.print();
        }
    }
}

