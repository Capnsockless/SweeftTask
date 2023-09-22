public class Launcher {
    //Demetre Beroshvili

    public static void main(String[] args) {
        Solutions sol = new Solutions();

        //1
        System.out.println("-----N1-----");
        int[] nums = {3, 4, 3, 1, 6, 7, 7, 4, 8, 6, 9, 12, 9, 12, 8}; // Single : 1
        System.out.printf("Single number: %d\n", sol.singleNumber(nums));

        //2
        System.out.println("-----N2-----");
        int[] cash = {67, 35, 15, 50, 121, 135, 0};
        for (int c : cash){
            System.out.printf("Coins in %d : %d\n", c, sol.minSplit(c));
        }

        //3
        System.out.println("-----N3-----");
        int[] nums2 = {3, 4, 6, 2, 1, 8, 5, 0, 9, -2}; // -2 0 1 2 3 4 5 6 -7- 8 9
        System.out.printf("Lowest unavailable int: %d\n", sol.notContains(nums2));

        //4
        System.out.println("-----N4-----");
        System.out.printf("%s + %s = %s\n", "1010", "1011", sol.binarySum("1010", "1011"));
        System.out.printf("%s + %s = %s\n", "11010", "1011", sol.binarySum("11010", "1011"));
        System.out.printf("%s + %s = %s\n", "10", "1111", sol.binarySum("10", "1111"));

        //5
        System.out.println("-----N5-----");
        System.out.printf("Stairs : %d, variants : %d\n", 17, sol.countVariants(17));
        System.out.printf("Stairs : %d, variants : %d\n", 3, sol.countVariants(3));
        System.out.printf("Stairs : %d, variants : %d\n", 6, sol.countVariants(6));

        //6
        System.out.println("-----N6-----");
        LinkedStack<String> myStack = new LinkedStack<>();
        myStack.add("BA"); myStack.add("WQ");
        myStack.add("PO"); myStack.add("NH");
        myStack.add("JY"); myStack.add("RE");
        System.out.println(myStack);
        myStack.remove(); myStack.remove();
        System.out.println(myStack);
        myStack.clear();
        System.out.println(myStack);
    }
}
