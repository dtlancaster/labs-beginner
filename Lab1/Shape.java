public class Shape {
        
    public static void main(String[] args) {
        
        /* Max should be odd number only */ 
        int max = 7;

        /*
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
        
        ^^ Lol ew no
        */
        
        int[] rows = buildArray(max);
        
        for (int i = 0; i < rows.length; i++) {
            int padding = (max - rows[i]) / 2;
            
            printSpaces(padding);
            
            for (int j = 0; j < rows[i]; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    private static int[] buildArray(int max) {
        int[] rows = new int[max];
        int counter = 1;
        int i = 0;
        boolean switched = false;
            
        while (counter >= 1) {
            rows[i] = counter;
            if (switched) {
                counter -= 2;
            } else {
                counter += 2;
            }
            if (counter == max) {
                switched = true;
            }
            i++;
        }
        
        return rows;
    }
    
    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}