public class Operadores {
    
    public static void main(String[] args) throws Exception {
        String concatenação = "?";

        concatenação = 1 + 1 + 1 + "1";
        System.out.println(concatenação); // 31
        
        concatenação = 1 + "1" + 1 + 1;
        System.out.println(concatenação); // 1111       
        
        concatenação = 1 + "1" + 1 + "1";
        System.out.println(concatenação); // 1111
        
        concatenação = "1" + 1 + 1 + 1;
        System.out.println(concatenação); // 1111  
        
        concatenação = "1" + (1 + 1 + 1);
        System.out.println(concatenação); // 13

    }
}
