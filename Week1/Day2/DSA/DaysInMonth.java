public class DaysInMonth {
    public static void main (String[] args){
        int month = 2;
        int year = 2024;
        int days;
        switch (month){
            case 1: case 3: case 5: case 7: case 8:case 10:case 12: 
                days = 31;
                break;
                case 4:case 6:case 9:case 11:
                    days = 30;
                    break;
                    case 2:
                        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                        days = isLeap ? 29 : 28;
                        break;
                        default:
                            days = 0;
                            System.out.println("Invalid month");
        }
        System.out.println("Days in month = " + days);
    }
    
}
