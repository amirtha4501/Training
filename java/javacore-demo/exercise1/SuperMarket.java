package in.kpriet.training.java.innerclass;

// Outer class
class Product { 
    
    int productCost;
    
    Product () {
        productCost = 100;
    }
    
    // Nested inner class
    class ProductDiscount {
    
        int discountAmount;
        
        ProductDiscount() {
            discountAmount = 30;
        }
        
        void listProducts() {
            System.out.println("The product price after discount is " + (productCost - discountAmount));
        }
    }
}


class SuperMarket {
    
    public static void main(String[] args) {
        
        // instantiate the outer class to instantiate an inner class
        Product.ProductDiscount product = new Product().new ProductDiscount();
        product.listProducts();
        System.out.println("Discount amount from inner class " + product.discountAmount); 
        
        Product productOuterClass = new Product();
        System.out.println("Product cost from outer class " + productOuterClass.productCost); 

        /* 
        Since non-static members and inner class both are strongly associated with outer class object, they can't exist
        without existence of outer class object.
        
        An instance of InnerClass can exist only within an instance of OuterClass.
            ProductDiscount productInner = new ProductDiscount();
            System.out.println(productInner.productCost);
        
        Property of outer class cannot be obtained directly with the inner class instance
            System.out.println("Product cost of outer class from inner class " + product.productCost);
            
        Property of inner class cannot be obtained directly with the outer class instance
            System.out.println("Discount amount of inner class with parent's object" + productOuter.discountAmount);
            
        Since an inner class is implicitly associated with an object of its outer class, it cannot define static methods
            class Product {
                class ProductDiscount {
                    public static void main(String[] args){ 
                        System.out.println("Static method in inner class");
                    }
                }
            }
        */
    }
}
