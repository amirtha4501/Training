package in.kpriet.training.java.innerclass;

class GiftCard { 

    static int amount;
    
    GiftCard() {
        amount = 1000;
    }
    
    static void showDetail() { 
        System.out.println("(outer class)Send Rupees " + amount + " to Hank"); 
    } 
     
    // A static inner class 
    static class User { 
        
        void getSponsor() {
            System.out.println("(nested)Ami sent Rupees " + amount); // here amount is a static variable
        } 
    }  
   
    public static void main(String[] args) { 
       
       GiftCard giftCard = new GiftCard();
       giftCard.showDetail();
       
       User user = new User();
       user.getSponsor();
    } 
}

/* 
   Since static members and static nested class both are not strongly associated with outer class object, they can exist
   without the existence of outer class object.
        
   static nested class cannot access the member variables of the outer class. It is because the static nested class doesn't require to create an instance of the outer class.
*/
