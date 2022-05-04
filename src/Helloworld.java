

//public class Helloworld {
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.user("Vova", 22);
//        person1.speak();
//        int years1 = person1.calc();
//        System.out.println(" my old " + years1);
//
//    }
//}
//
//class Person {
//    String name;
//    int age;
//
//    void user(String username, int userage) {
//        name = username;
//        age = userage;
//
//    }
//
//    void speak() {
//        System.out.println("my name " + name + " i am " + age + "age");
//    }
//
//    int calc() {
//        int years = 65 - age;
//        return years;
//    }
//}
//=======================================================================================================
public class Helloworld {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-4);
        System.out.println("Enter name " + person1.getName());
        System.out.println(" Enter age " + person1.getAge());
        person1.speak();
    }
}

//======================================
class Person {
    private String name;
    private int age;

    //======================================
    public void setName(String userName) {
        if (userName.isEmpty()) {   //проверяет отсутствие   в веденого текст = Thrue
            System.out.println(" Text no");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    //============================================
    public void setAge(int userAge) {// проверка на положительность
        if (userAge < 0) {  //??????Если условие меньше нуля то пишет 0??????Ответ  так и должно быть
            System.out.println( "Vvedite  4islo");
        }
        else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    //========================================
    void speak() {
        System.out.println(" My name " + name + " i am " + age + " age");
    }
}
//====================================================================================================














































