public class Peramaeter {
    
    //设立一个类，用于传递参数值
    private int age;
    
    //VS Code 源代码操作自动生成getter和setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //VS Code源代码操作自动生成带参数的构造函数
    //类中一旦设置了带参数的构造函数，那么系统就不再默认设置一个无参的构造函数，建议手动添加
    public Peramaeter(){

    }

    public Peramaeter(int age) {
        this.age = age;
    }
    
}
