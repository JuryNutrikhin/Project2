package Lessen26Interfaces;

public class Test {
    public static void main(String[] args){
        Animal animal = new Animal(1);
        Person person =new Person("Bob");
        //=======================
//        animal.showInfo();      // вариант 1
//        person.showInfo();
        //=======================
        outputInfo(animal);  ///вариант  2 индентичен первому
        outputInfo(person);
        //===================
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
