//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String[] groceries={"Apples","Avocado","watermelon","beetroot","Kale", "Sukumawezi"};
         System.out.println("Number of groceries" +groceries.length);

         for(String item:groceries){
             System.out.println(item + ",");
         }
         System.out.println();
         //retrieve the element in constant time
        System.out.println("grocery item at index 3:" + groceries[3]);
        //remove element
        groceries[3] = null;
        for(String item:groceries){
            System.out.println(item + ",");
        }
    }

}