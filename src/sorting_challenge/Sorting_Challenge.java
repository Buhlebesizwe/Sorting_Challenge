package sorting_challenge;

public class Sorting_Challenge {

    public static void main(String[] args) {
        int myArray[] = new int[50];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 2;
        }
        myArray[19] += 60;
        myArray[20] += 61;

        int temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        for (int i = myArray.length-1; i >= 0; i--) {
            System.out.print(myArray[i] + ", ");
        }
    }
}
