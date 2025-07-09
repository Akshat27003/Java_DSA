package understandingJCF;

// Creating simple custom class
// to store integer and string data together.
// make data and variables as private.
// and use getter and setter.
// time consuming but important and best for industry level or real life practical coding.

class Data2 {
    private Integer num; // keeping data as private.
    private String name;

    public void setNum(int num) // setter method for num
    {
        this.num = num;
    }

    public void setName(String name) // setter method for name
    {
        this.name = name;
    }

    public Integer getNum() // getter method for num
    {
        return num;
    }

    public String getName() // getter method for name
    {
        return name;
    }
}

public class customClasses2 {

    public static void main(String[] args) {
        // creating object of Data2 custom class
        Data2 data = new Data2();
        // setting values using setter() methods.
        data.setNum(1);
        data.setName("ABC");
        // accessing values using getter() methods.
        System.out.println(data.getNum());
        System.out.println(data.getName());
    }
}
