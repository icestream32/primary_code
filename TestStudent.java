//用来测试Student类的调用，通过“引用”间接访问堆内存中的类
public class TestStudent {
    public static void main(String args[]){

        Student s = new Student();
        System.out.println("年龄 = " + s.age);
        System.out.println("性别 = " + s.sex);
        System.out.println("姓名 = " + s.name);
        System.out.println("地址 = " + s.address);

    }
    
}
