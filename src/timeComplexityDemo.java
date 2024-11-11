
public class timeComplexityDemo {
    public static void main(String[] args) {

        double now= System.currentTimeMillis();

        timeComplexityDemo demo = new timeComplexityDemo();
        System.out.println(demo.findSum2(99999));
        System.out.println("Time taken -" + (System.currentTimeMillis() - now)+ "Milliseconds");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        String[] groceries={"Apples","Avocado","watermelon","beetroot","Kale", "Sukumawezi"};
//        System.out.println("Number of groceries" +groceries.length);
//
//        for(String item:groceries){
//            System.out.println(item + ",");
//        }
//        System.out.println();
//        //retrieve the element in constant time
//        System.out.println("grocery item at index 3:" + groceries[3]);
//        //remove element
//        groceries[3] = null;
//        for(String item:groceries){
//            System.out.println(item + ",");
//        }
    }
//    public int findSum(int n){
//        return (n + 1) * n /2;
//    }
    public  int findSum2(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
//        System.out.println(findSum2(int sum));
    }

}
