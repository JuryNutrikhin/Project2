public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human();

    }
}
//===========================================================
class Human{
    private String name;
    private int age;


    //====================================================
    //
    public Human() {
        System.out.println("Hi  1  level");

    }
    //
    //=======================================================
    //
    public Human(String name){
        System.out.println("Hi 2 level");
    }

    //========================================================

    public Human( String name , int age){
        System.out.println("HI  3  level");
//        public void setName( String name){
//            this.name
        }
    }

