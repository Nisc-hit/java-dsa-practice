public class TicketPricing {
    public static void main(String[] args){
        int age = 20;
        String category;
        double price;
        if ( age<12){
            category = "child";
        }else if (age < 60){
            category = "adult";
        }else{
            category = "senior";
        }
        switch(category) {
            case "child" : price = 50;
            break;
            case "adult" : price = 150;
            break;
            case "senior" :price = 80;
            break;
            default :price = 0;
        }
        
        System.out.println("Ticket price for " + category + " is: $" + price);

    }
    
}
