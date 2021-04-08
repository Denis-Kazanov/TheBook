package Glava9;

public abstract class  Class2 extends Class1{
    private Class2(){
        super(10);
        System.out.println("Приватный конструтора class2");
    }
    public Class2(int i ){
        this();
        System.out.println("Перегруженный констр class2");
    }
}
