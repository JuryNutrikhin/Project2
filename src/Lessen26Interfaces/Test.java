package Lessen26Interfaces;

public class Test {
    public static void main(String[] args){
        Animal animal = new Animal(1);
        Person person =new Person("Bob");
        //=======================
//        animal.showInfo();      // ������� 1
//        person.showInfo();
        //=======================
        outputInfo(animal);  ///�������  2 ���������� �������
        outputInfo(person);
        //===================
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
