class Demo {
        private int secretNumber = 42;
        public int getSecretNumber(){
            return secretNumber;
        }
}
public class DemoTest{
    public static void main(String[] args){
        Demo d = new Demo();
        System.out.println(d.getSecretNumber());
    }
}