
import java.util.Random;

public class Die {

    int faceValue;

    //Method to roll the die
    public int roll(){

        //Variables Declaration
        Random randNum;

        //Variable Initialization
        randNum = new Random();
        faceValue = randNum.nextInt(6);
        faceValue ++;

        return faceValue;

    }

    //Get the face value
    public int getFaceValue(){
        return faceValue;
    }

    //Change the face value to string
    public String toString() {
        return faceValue + "";
    }


}
