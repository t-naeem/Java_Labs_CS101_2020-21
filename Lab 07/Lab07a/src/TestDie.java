public class TestDie{

    public static void main(String[] args) throws Exception {

        //Variables Declaration
        Die Die;
        Dice Dice;

        //Variable Initialization
        Die = new Die();
        Dice = new Dice();
        
        System.out.println("----------Part 3-----------------------");

        //Report the intial face value
        System.out.println(Die.getFaceValue());

        //Role the die once
        System.out.println(Die.roll());

        //Report the current face value after roll
        System.out.println(Die.getFaceValue());


        System.out.println(Die);

         //If we simply print 'Die' directly, we get Die@7637f22 but toString method in Die file needs to be commented

        System.out.println(Die.toString());
        //Does anything change? No nothing changes.

        System.out.println("----------Part 4-----------------------");


        //Roll both the dies
        Dice.rollBothDie();

        //Report the face values
        System.out.println(Dice.getDie1FaceValue());
        System.out.println(Dice.getDie2FaceValue());

        //Report the total of the two face values
        System.out.println(Dice.toString());


        




    }
}
