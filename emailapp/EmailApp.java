package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith"); 
        
        em1.getInfo();
        System.out.println(em1.getInfo());

    }
}
