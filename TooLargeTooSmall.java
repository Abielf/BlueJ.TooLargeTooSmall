
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables, player has to guess the number
        chosenNum = seed;
    }
    
    // guess method returns -1 if guess is too low, 1 if guess is too high, and 0 if the guess was correct.
    public Integer guess(Integer g) {
        if (g-chosenNum<0){ return -1;}
        else if (g-chosenNum>0) {return 1;}
        else{return 0;}
        

    }
}