public class Dice{
      
    
    //Intialization
    Die firstDie = new Die();
    Die secondDie = new Die();
    int sumOfDies;
    int sumOfFacesOfBothDies;

    
    //Method to role both dies
    public int rollBothDie() {
        firstDie.roll();
        secondDie.roll();
        sumOfDies = firstDie.getFaceValue() + secondDie.getFaceValue();
        return sumOfDies;
    }

    //Get face value of first die
    public int getDie1FaceValue() {
      return firstDie.getFaceValue();
    }

     //Get face value of Second die
    public int getDie2FaceValue() {
    return secondDie.getFaceValue();
    }

    //Get the total of the face values
    public int getDiceTotal(){
    sumOfFacesOfBothDies =   getDie1FaceValue() + getDie2FaceValue();
    return sumOfFacesOfBothDies;
    }

    //Extract the string to modify it
    public String toString() {
    return "Dice total: " + getDiceTotal();
    }

}
