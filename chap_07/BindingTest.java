class BindingTest{
    public static void main(String args[]){
        Parent p = new Parent();
        Child c  = new Child();

        System.out.println("P.x:"+ p.x);
        p.method();

        System.out.println("C.x:"+ c.x);
        c.method();
    }
}

class Parent {
    int x = 100;
    void method(){
        System.out.println("Parent Method!");
    }
}

class Child extends Parent {
    int x = 200;
    void method(){
        System.out.println("Child method!");
    }
}