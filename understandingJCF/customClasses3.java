package understandingJCF;

// create a custom class Data3 within which another custom class should provide data as well.

class Data3 {
    public Integer num;
    public InternalData revenue; // revenue will hold a reference to InternalData object.

    Data3(int num, int revenue) {
        this.num = num;
        this.revenue = new InternalData(revenue);
        // revenue is object (reference) of InternalData custom class.
        // create a new object of InternalData class.
        // pass revenue argument to its constructor.
    }
}

class InternalData {
    public Integer revenue;

    InternalData(Integer revenue) {
        this.revenue = revenue;
    }
}

public class customClasses3 {

    public static void main(String[] args) {
        // creating object of class Data3.
        Data3 data = new Data3(1, 10000);
        System.out.println(data.num);
        System.out.println(data.revenue.revenue);
        // data.revenue is of type InternalData
        // data.revenue holds a reference to an object
        // of class InternalData.
        // data.revenue.revenue gives int value
        // at the reference the object was pointing to.
    }
}
