package android.gaurav21.com.notesapp;

public class Product {
    private String data;

    public Product() { // Firebase requires an empty constructor.

    }

    public Product(String val) {
        this.data = val;
    }

    public String getName() {
        return data;
    }

    public void setName(String val) {
        this.data = val;
    }
}
