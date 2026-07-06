package DSA.Ex2_Ecommerce_Search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    static Product linearSearch(Product products[], int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                return products[i];
            }
        }
        return null;
    }

    static Product binarySearch(Product products[], int id) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == id) {
                return products[mid];
            }
            else if (products[mid].productId < id) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }return null;
    }
    static void sortProducts(Product products[]) {

        for (int i = 0; i < products.length - 1; i++) {
            for (int j = 0; j < products.length - i - 1; j++) {
                if (products[j].productId > products[j + 1].productId) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        Product products[] = {

                new Product(104, "PS5", "Gadgets"),
                new Product(101, "Cricket Bat", "Sports"),
                new Product(103, "Ben 10 Comic", "Books"),
                new Product(105, "Colgate", "Toiletries"),
                new Product(102, "AAA Battery", "Electronics")

        };
        int searchId = 103;
        System.out.println("Linear Search");
        Product p1 = linearSearch(products, searchId);
        if (p1 != null)
            p1.display();
        else
            System.out.println("Product Not Found");

        sortProducts(products);
        System.out.println();
        System.out.println("Binary Search");
        Product p2 = binarySearch(products, searchId);

        if (p2 != null)
            p2.display();
        else
            System.out.println("Product Not Found");
    }
}
