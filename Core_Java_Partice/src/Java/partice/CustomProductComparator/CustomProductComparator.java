package Java.partice.CustomProductComparator;

import java.util.Comparator;

public class CustomProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        
        int categoryComparison = product1.getCategoryName().compareTo(product2.getCategoryName());
        if (categoryComparison != 0) {
            return categoryComparison; // If categories are different, return result
        }

        int nameComparison = product1.getProductName().compareTo(product2.getProductName());
        if (nameComparison != 0) {
            return nameComparison; // If product names are different, return result
        }

        int priceComparison = Double.compare(product1.getPrice(), product2.getPrice());
        if (priceComparison != 0) {
            return priceComparison; // If prices are different, return result
        }

        return Integer.compare(product1.getId(), product2.getId());
    }
}