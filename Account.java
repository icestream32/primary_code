public class Account {
    //账户类
    private String name;
    private double balance;

    //无参的构造器
    public Account(){
        System.out.println("无参构造!");
    }
    //有参的构造器
    public Account(String n,double b){
        name = n;
        balance = b;
        System.out.println(name);
        System.out.println(balance);
        System.out.println("有参构造!");
    }

    //VS Code 右键点击源代码操作可以自动生成getter和setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
