package org.example;

/** Класс, хранящий информацию о человеке*/
public class Person {
    private String ID;
    private String name;
    private String pol;
    private Division division;
    private String salary;
    private String date_of_birthday;
    public void set_ID(String id){ID=id;}
    public void set_name(String n){name=n;}
    public void set_pol(String p){pol=p;}
    public void set_date_of_birthday(String d){date_of_birthday=d;}
    public void set_division(String div){
        division=new Division();
        division.title=div;
    }
    public void set_salary(String sal){salary=sal;}
    public void print(){
        System.out.println(ID+"; "+name+"; "+pol+"; "+date_of_birthday+"; "+division.title+"; "+salary+"; ");
    }
}
