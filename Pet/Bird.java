package Pet;
//继承抽象类，由抽象宠物到具体的鸟
public class Bird extends Pet{
    public void eat(){
        //方法覆盖
        System.out.println("鸟在吃虫子！");
    }
}
