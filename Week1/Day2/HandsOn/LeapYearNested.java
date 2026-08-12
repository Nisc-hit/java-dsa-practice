public class LeapYearNested {
    public static void main(String [] args){
        int year = 2024;
        boolean isLeap;
        if (year % 4 ==0){
            if(year % 100 ==0){
                if(year % 400 ==0){
                    isLeap = true;
                }
                else{
                    isLeap =false;
                }
             }else{ isLeap = true;}
        }else{ isLeap = false;}
        System.out.println(year +"leap year? " + isLeap);
    }
    
}
