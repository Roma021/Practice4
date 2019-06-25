
//public class Main {
   // public static void main(String [] args) {

      /*  int day = 2; // 2 matches the case 2 which outputs Tuesday!
        switch (day) {
        case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid variable!");
        } */
        //////////////////////////////////////////////////////////////////////////////////////////
        // while Loop
        /*  int i = 0;
        while (i == 1) {
            System.out.println(i);    // only true value prints
            i++;
        }
            // do/while Loop
        int j = 0;
        do {
            System.out.println(j);
            j++;          // all values print once regardless if there true or not
        }
        while (j == 1); */
        //////////////////////////////////////////////////////////////////////////////////////////////
        // for Loop
        //  for (int i = 0; i < 5; i++) {
        //    System.out.println(i);
        //  }
        //   for (int i = 0; i <= 10; i = i + 2) {
        //    System.out.println(i);
        //  }

     /*   String[] meat = {"Steak", "Chicken", "Pork", "Veggies"};
        for (String i : meat) {
            System.out.println(i);
        }
        String [] rice = {"White rice", "Brown rice", "No rice"};
        for (String x : rice) {
            System.out.println(x);
        } */
// -----------------------------------------------------------------------------
        //  for (int i = 0; i < 10; i++) { // i++ to increase by one
        //    if (i == 8) {

        //     break
        //              ;
        //   }
        //   System.out.println(i);
        // }

        //  for (int x  = 0; x <=10; x++) {
        //     if (x == 5) {
        //         continue;
        //    }
        //   System.out.println(x);
        //  }
//----------------------------------------------------------------------------------------------
        // Arrays
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //  cars [2] = "Toyota"; // this attributes the value 2 to Toyota instead of Ford
        //  System.out.println(cars[2]); // Ford=2

        //   String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // for (int i = 0; i < cars.length; i++) {
        //  System.out.println(cars[i]);
        // OR
        //  for (String i : cars) {
        //     System.out.println(i);

        //  }

        //   int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        //  for (int i = 0; i < myNumbers.length; ++i) {
        //      for(int j = 0; j < myNumbers[i].length; ++j) {
        //      System.out.println(myNumbers[i][j]);
        //  try {
        //    int[] myNumbers = {1, 2, 3};
        //   System.out.println(myNumbers[8]);
        //  } catch (Exception e) {
        //   System.out.println("Something went wrong.");
        //   } finally {
        //    System.out.println("The 'try catch' is finished.");
        //  }
                // Calling Method
    //    public class Main {
         //   static void myMethod(String fname) {
           //     System.out.println(fname + " Smith");
          //  }

         //   public static void main(String[] args) {
           //     myMethod("Dave");
            //    myMethod("Jack");
             //   myMethod("Mike"); // you can add myMethod to outputt the same number of messages.
///////////////////////////////////////////////////////////////////////////////////////////////////
/*public class Main {

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        checkAge(22);


            }
        }*/
/////////////////////////////////////////////////////////////////////////////////////
public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}




