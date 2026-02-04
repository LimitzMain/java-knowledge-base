public class StoringBigInt {
    public static void main(String[] args) {
        int Int_Big_Number = (int) 1_000_000_000;
        System.out.println("Printing Big Number stored in an INT: " + Int_Big_Number);
        
        long Long_Big_Number = 1_000_000_000;
        System.out.println("Printing Big Number stored in an LONG: " + Long_Big_Number);
        
        //EXTRA:
        //for storing/declaring large numbers, use '_' for more clarity.
        //Example:
        //1000000000 -> 1_000_000_000
        //'_' represents as ',' , for a more easier read.
    }
}
