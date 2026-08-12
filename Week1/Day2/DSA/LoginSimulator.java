public class LoginSimulator {
    public static void main(String[] args){
        String username = "Nischit";
        String password = "4567";
        String inputUsername = "Nischit";
        String inputPassword = "4567";
        if(inputUsername.equals(username) && inputPassword.equals(password)){
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }
    }
    
}
