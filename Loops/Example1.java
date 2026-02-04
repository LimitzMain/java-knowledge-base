public class BasicIncreLoop {
    public static void main(String[] args) {
       
        //Loops
        //incremental loop
        int x = 10; //this loop will run 10 times
        for (int i = 1; i <= x; i++) {
            System.out.println(i + ": This loop will run " + x + " times.");
        }
        
        //nested loop (incremental)
        // run loop 10 times.
        for (int i = 1; i <= x; i++) {
            //for every iteration, print 3 times.
            for (int j = 1; j <= 3; j++) {
                System.out.println("[" + i + "] [" + j + "]");
            }
        }
    }
}
