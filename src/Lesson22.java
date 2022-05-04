//public class Lesson22 {//// Final
//
//    public static void main(String[] args) {
//
//        final int X = 10;
//        System.out.println(X);
//        Test test1 = new Test();
//        test1.speak();
//
//    }
//}
//
/////=====================================================
//class Test {
//    public static final int CONSTANT = 0;
//
//    public void speak() {
//        System.out.println(CONSTANT);
//    }
//
//}

public class Lesson22 {

    public static void main(String[] args){
        Test test1 = new Test();
        test1.speak();

    }

};

//===============================================


class Test{

    public static final int CONSTANT = 0;

    void speak(){
        System.out.println( CONSTANT);
    }

};


































