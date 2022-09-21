public class TestDiceGame{

    public static void main(String[] args) throws Exception {
        
        //Variable Declaration
        DiceGame diceGame;
        
        //Variable Intialization
        diceGame = new DiceGame();


        //Play the game! Keep rolling until both the die's show 6, and report the no of rolls
        System.out.println(diceGame.play());



    }
}
