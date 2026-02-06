public class WhileDoWhile {
    public static void main(String[] args) {
       
        //Loops
        //while loop
        
        //incremental loop using 'while'
        int i = 1;
        while (i <= 10) {
            System.out.println("[" + i + "] This will print 10 times.");
            i++;
        }
        
        System.out.println(""); //blank space
        
        //alternative
        int j = 1;
        while (true) {
            j++;
            System.out.println("[" + j + "] This will print 10 times.");
            if (j >= 10) { break; }
        }
        
        System.out.println(""); //blank space
        
        //do-while
        int k = 1;
        do {
            System.out.println("[" + k + "] This will print 10 times.");
            k++;
        } while (k <= 10);
    }
}
