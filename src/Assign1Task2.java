package assign1Task2;
import java.util.Scanner ;


/**
 *
 * @author Vedika Jain
 */
public class Assign1Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a scanner object for user input
        Scanner task2 = new Scanner (System.in);

        //create a string for the colon to align it more easily
        String colon = ":";

        // ask the user to enter information
        System.out.print("Please enter the item price : ");
        double original;
        original= task2.nextDouble();
        System.out.print("Enter the discount ratio (5 for 5%) :");
        double discount;
        discount= task2.nextDouble();

        // print out the original price and discount ratio
        System.out.printf("\n Original price %s %.2f", colon,original);
        System.out.printf("\n Discount ratio %s %.2f %% ", colon, discount);

        // calculate and print the price before tax
        double beforetax = original - (discount* original/100);
        System.out.printf("\n Price before tax %s %.2f " , colon, beforetax);

        // print the separation
        System.out.print("\n ---------------------------------------");

        //calculate and display the federal tax
        double tax1= 0.05;
        double federal = tax1* beforetax ;
        System.out.printf("\n Federal Tax %4s %.2f", colon,federal );

        //calculate and display the provincial tax
        double tax2= 0.09975;
        double provin = tax2 * beforetax ;
        System.out.printf("\n Provincial Tax %s %.2f" , colon,provin);

        // calcualte and display the final price
        double finalPrice = beforetax + federal+ provin;
        System.out.printf("\n Final price %4s %.2f \n", colon,finalPrice );

    }
}











