class SuperTest2 {

    public static void main(String args[]){
        Child c = new Child();
        c.method();
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent{
    int x= 20;

    public void method(){
        System.out.println("X="+ x);
        System.out.println("this.x="+ this.x);
        System.out.println("super.x="+ super.x);
    }
}