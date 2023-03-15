public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 2022);
        Notebook heavyNotebook = new Notebook (2000,1500, 2010);
        Notebook oldNotebook = new Notebook(1600, 500, 2000);

        displayNotebookParameters("notebook weight: ", notebook, "notebook price: ", "notebook year: ");
        displayNotebookParameters("heavyNotebook weight: ", heavyNotebook, "heavyNotebook price: ", "heavyNotebook year: ");
        displayNotebookParameters("oldNotebook weight: ", oldNotebook, "oldNotebook price: ", "oldNotebook year: ");
    }

    private static void displayNotebookParameters(String x, Notebook notebook, String x1, String x2) {
        System.out.println(x + notebook.weight);
        System.out.println(x1 + notebook.price);
        System.out.println(x2 + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.payOffCheck();
    }
}