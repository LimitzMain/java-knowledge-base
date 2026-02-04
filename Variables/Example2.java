public class Variables {
    public static void main(String[] args) {
        //Updating Variable
        
        int x = 5;
        System.out.println(x); //5
        
        x = 15;
        System.out.println(x); //15
        
        //Swapping Variables using 'temporary' variables
        
        int y = 10;
        int z = 5;
        
        System.out.println("Before swapping: [" + y + "] [" + z + "] ");// [10] [5]
        {
            int temp = y; // create a temporary variable
            y = z; // set y to the z
            z = temp; // set z to the temporary variable 'temp'
        }
        //'temp' isn't usable anymore outside curly brackets, thus a 'temporary' variable
        System.out.println("After swapping: [" + y + "] [" + z + "] "); // [5] [10]
        
        //Swapping Variables without temporary variables
        //Same process, but 'temp' is a global variable now
        int temp = y;
        y = z;
        z = temp;
        
        System.out.println("After swapping again: [" + y + "] [" + z + "] "); // [10] [5]
    }
}
