package understandingJCF;

// Creating simple custom class
// to store integer and string data together.
// publically accessible data and variables.
// not the best practice in industries. fine for ds algo, competitions.

class Data {
    public Integer num; // Integer: wrapper class around int.
    public String name; // leaving data as public

    // providing values using parameterized constructor.
    Data(int num, String name) {
        this.num = num;
        this.name = name;
    }
}

public class understandingCustomClasses {
    public static void main(String[] args) {
        // creating object of Data custom class and
        // setting the value using parameterized constructor.
        Data data = new Data(1, "ABC");
        System.out.println(data.num);
        System.out.println(data.name);
    }

}
