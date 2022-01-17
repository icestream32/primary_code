public class TestAccount {
    //用来测试类的构造函数
    public static void main(String args[]){
        
        //无参构造了一个a1对象
        Account a1 = new Account();
        
        //有参构造了一个a2对象
        Account a2 = new Account("zhangsan", 100000.0);
        
        //输出实例变量值
        System.out.println(a1.getBalance());
        System.out.println(a2.getName() + " " + a2.getBalance());
        
    }
}
