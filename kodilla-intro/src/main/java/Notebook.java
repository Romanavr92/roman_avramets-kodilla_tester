public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap. ");
        } else if (this.price <= 1000) {
            System.out.println("This price is good. ");
        } else {
            System.out.println("This notebook is expensive. ");
        }
    }

    public void checkWeight() {
        if (this.weight <= 1000) {
            System.out.println("This notebook is lightweight");
        } else if (this.weight < 2000) {
            System.out.println("This notebook is medium-lightweight");
        } else {
            System.out.println("This notebook is heavy");
        }
    }
    public void payOffCheck() {
        if (this.year>=2010 && this.price<2000) {
            System.out.println("It pay off");
        }else  {
            System.out.println("It is not pay off");
                }
    }

}
