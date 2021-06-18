import java.util.Scanner;

public class ChocolateGift {

    public static void main(String[] args)
    {
        int ChocolateNumber = 0;  //Number of Chocolate initially bought by the customer

        int CouponNumber;         //Number of Coupon initially given to  the customer

        int TotalChocholate;      //Number of  Total Chocolate initially bought by the customer

        int extraCouponChocolate; //Extra   Chocolate

        int totalChocolates;

        int totalCoupons;

        Scanner chocolate= new Scanner(System.in); //Receiving or Inputing the number pf chocolate bought

        System.out.println("Enter the Number of Chocolates bought by the Customer:"); //Displaying

        ChocolateNumber = chocolate.nextInt(); //

        CouponNumber = ChocolateNumber/3;  //Number(s) Numbers of COUPONS  the cutomer gets

        extraCouponChocolate = CouponNumber/7; //Extra Chocolate the customer get

        totalChocolates = ChocolateNumber + extraCouponChocolate; //Overall chocolate the customer would get

        System.out.println("The total number of Chocolate having is " +totalChocolates);

        System.out.println("The total number of Coupons having is " +CouponNumber);
    }
}
