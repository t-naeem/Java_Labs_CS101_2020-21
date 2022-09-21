public class DiceGame{


    public String play() {


        //Variables
        Dice Dice;
        Dice = new Dice();

        //Roll the Dice first
        Dice.rollBothDie();
        int countRollBothDie = 1;

        //Keep rolling till the face values are both == 6
        while (Dice.getDie1FaceValue() != Dice.getDie2FaceValue()) {
            Dice.rollBothDie();
            countRollBothDie ++;

        }

        //return the number of rolls it took to get both 6's
        return "Number of times the dice was rolled to get a six on both dices: " + countRollBothDie;

        
        

    }

            


        




    
}
