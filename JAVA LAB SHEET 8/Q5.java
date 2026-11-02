public class Q5 {
    static class ProductPair<T, U> {                               // T = product id, U = price
        private T id;
        private U price;
        ProductPair(T id, U price) { this.id = id; this.price = price; }
        void display() { System.out.println("Product ID: " + id + ", Price: " + price); }
    }

    public static void main(String[] args) {
        ProductPair<Integer, Double> p1 = new ProductPair<>(1, 499.99);
        ProductPair<Integer, Double> p2 = new ProductPair<>(2, 1299.5);
        ProductPair<Integer, Double> p3 = new ProductPair<>(3, 75.0);
        p1.display();
        p2.display();
        p3.display();
    }
}
