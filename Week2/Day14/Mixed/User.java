public class User {
    private String password;
    User(String password){
        this.password = password;
    } 
    public String maskPassword(){
        if(password.length()<=2){
            return password;
        }
        char first = password.charAt(0);
        char last = password.charAt(password.length() - 1);
        StringBuilder masked = new StringBuilder();
        masked.append(first);
        for(int i=1;i< password.length() - 1;i++){
        masked.append('*');
    }
    masked.append(last);
    return masked.toString();
    
}
public static void main(String[] args){
    User u = new User("secure123");
    System.out.println(u.maskPassword());
}
}