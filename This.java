public class This {
    //测试类，一个日期对象

    //定义年月日
    private int year;
    private int month;
    private int date;

    //设置年月日接口和年月日构造函数
    //可以看到，set方法里用了this关键字，这是用处之一
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public This(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    //若程序员不设置日期时，需要默认日期为1970年1月1日
    /* 
        当然可以这样设置
        public This(){
            year = 1970;
            month = 1;
            date = 1;
        }
        但是这样增加了代码的繁琐性，我们当然可以通过this()调用构造函数的方法实现
    */
    public This(){
        //重点：this(实参)必须放在构造函数的第一行
        this(1970, 1, 1);
    }

}
