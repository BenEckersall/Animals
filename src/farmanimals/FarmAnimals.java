package farmanimals;

public class FarmAnimals
{
    public static void main(String[] args)
    {
        //Create a new Pig object
        Pig myPig = new Pig();
        //Call methods from Pig class
        myPig.oink();
        myPig.eat();
        myPig.poop();
        
        //Create a new Chicken object
        Chicken myChicken = new Chicken();
        //Call methods from Chicken class
        myChicken.cluck();
        myChicken.eat();
        myChicken.poop();
        
        //Create a new Horse object
        Horse myHorse = new Horse();
        //Call methods from Horse class
        myHorse.neigh();
        myHorse.eat();
        myHorse.poop();
    }
}
