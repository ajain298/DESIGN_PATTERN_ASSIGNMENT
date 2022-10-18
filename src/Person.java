public abstract class Person {

    private ProductMenu theProductMenu;
    Person(ProductMenu thePM)
    {
        this.theProductMenu = thePM;
    }

    public abstract void showMenu();
    public abstract ProductMenu CreateProductMenu();
    public void showAddButton(){

    }
    public void showViewButton(){

    }
    public void showRadioButton(){

    }
    public void showLabels(){

    }


}
