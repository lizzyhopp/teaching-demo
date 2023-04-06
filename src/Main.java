
public class Main {
    public static void main(String[] args) {
        //Call various methods to see behavior of Arrays
    }

    /**
     * 1
     */
    static void declaration(){

        int[] myIntArray;

        boolean[] myBooleanArray;

        String[] myStringArray;

        Object[] myObjectArray;

    }
    /**
     * 2
     */
    static void initializationWithSize(){


        int[] myArray = new int[3];     //default initial values --->{0, 0, 0}
        boolean[] myBooleanArray = new boolean[2];  //default initial values --->{false, false}
        Object[] myObjectArray = new Object[3];  //default initial values --->{null, null, null}

        printArray(myArray);
    }
    /**
     * 3
     */
    static void initializationWithValues(){

        int[] myArray = {0, 1, 2};

        printArray(myArray);
    }
    /**
     * 4
     */
    static void indexes(){
        String[] myArray = {"apple", "orange", "grape"};
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
    }
    /**
     * 5
     */
    static void changingElementValuesByIndex(){
        String[] myArray = {"apple", "orange", "grape"};
        System.out.println(myArray[0]);

        myArray[0] = "mango";

        System.out.println(myArray[0]);


    }
    /**
     * 6
     */
    static void reassignment(){
        int[] firstArray = {0, 1, 2};
        int[] secondArray = firstArray;  //{0, 1, 2}

        printArray(firstArray);

        secondArray[0] = 999;

        printArray(firstArray);
    }

    /**
     * 7
     */
 static void printArray(int[] myArray){

     for (int i = 0; i < myArray.length ; i++) {
            System.out.print(myArray[i] + " ");
        }

//     for (int number: myArray) {
//         System.out.print(number + " ");
//     }
    }


    /**
     * 8
     */
    //Let's break it!!
    static void nullPointer(){
        Player[] myArray = {new Player("Kevin Durant"), null, new Player("Lebron James")};
        System.out.println(myArray[0].playerName);
        System.out.println(myArray[1].playerName);

    }
    static void outOfBounds(){
        int[] myArray = {0, 1, 2};
        myArray[3] = 4;
    }


    /**
     * 9
     */
   static void arrayStore(){
       Object[] myArray = new String[2];
       myArray[0] = 4.0;
   }

    static class Player {
        public String playerName;
        Player(String name){
            playerName = name;

        }

    }


}