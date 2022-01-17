public class Chinese {
    //static关键字的使用

    //定义人的身份证号、名字和国籍
    String id;
    String name;
    //由于在这里指中国人，因此国籍变量为静态变量，使用时由类调用
    static String country = "中国";
    
    public Chinese(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //中国人都说中文，因此可以设置为静态方法
    public static void speak(){

        System.out.println("你好！");

    }

}
