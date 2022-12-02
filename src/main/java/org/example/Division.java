package org.example;

/**Класс, хранящий информацию о подразделении*/
public class Division {
    public int ID;
    public String title;
    /**Генерация номера подразделения от 1 до 10*/
    public Division(){
        ID=(int)(Math.random()*(10-1)+1);
        title=null;
    }
}
