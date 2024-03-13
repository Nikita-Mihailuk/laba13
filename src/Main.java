interface Product {
    void setNameProduct(String nameProduct);

    String getNameProduct();

    void setPrice(double price);

    double getPrice();

    void setRating(double rating);

    double getRating();
}

class Beer implements Product {
    public String nameProduct;
    public double price;
    public double rating;

    public Beer(String nameProduct, double price, double rating) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public String getNameProduct() {
        return this.nameProduct;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return this.rating;
    }
}

class Bread implements Product{
    public String nameProduct;
    public double price;
    public double rating;

    public Bread(String nameProduct, double price, double rating) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return this.rating;
    }
}

class Yogurt implements Product{
    public String nameProduct;
    public double price;
    public double rating;

    public Yogurt(String nameProduct, double price, double rating) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return this.rating;
    }
}

interface User{
    void setPassword(String password);
    String getPassword();
    void setLogin(String login);
    String getLogin();
    boolean checkPassword(String password);
}

class Boris implements User{
    public String name;
    public int age;
    public String password;
    public String login;

    public Boris(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public boolean checkPassword(String password){ return this.password.equals(password); }
}

class Oleg implements User{
    public String name;
    public int age;
    public String password;
    public String login;

    public Oleg(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public boolean checkPassword(String password){ return this.password.equals(password); }
}

class Vitya implements User{
    public String name;
    public int age;
    public String password;
    public String login;

    public Vitya(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public boolean checkPassword(String password){ return this.password.equals(password); }
}

class Buy implements User, Product{
    public String name;
    public String password;
    public String login;

    public String nameProduct;
    public double price;
    public double rating;

    public Buy(String name, String nameProduct) {
        this.name = name;
        this.nameProduct = nameProduct;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public boolean checkPassword(String password){ return this.password.equals(password); }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public String getNameProduct() {
        return this.nameProduct;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return this.rating;
    }

    public void printInfo(){
        System.out.println(name + " купил "+ nameProduct);
    }
}

public class Main {
    public static void main(String[] args) {
        Beer beer = new Beer("Белый медведь", 149.99, 5.0);
        Bread bread = new Bread("Батон", 40.0, 4.3);
        Yogurt yogurt = new Yogurt("Простоквашино", 50, 4.7);

        Boris boris = new Boris("Борис", 66);
        Oleg oleg = new Oleg("Олег", 15);
        Vitya vitya = new Vitya("Витя", 38);

        Buy buy = new Buy("Влад" , "Лимонад");
        buy.printInfo();
    }
}