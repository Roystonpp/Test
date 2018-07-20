package MainPack;

public class Player
{

    boolean look = true;

    public Player()
    {

    this.look = look;

    }

    public boolean Playerlooks()
    {
        if(look = true)
        {
            System.out.println("Grey foggy clouds float oppressively close to you,\n" +
                    "reflected in the murky grey water which reaches up your\n" +
                    "shins.\n" +
                    "Some black plants barely poke out of the shallow water.\n" +
                    "Try “north”,”south”,”east”,or “west”\n" +
                    "You notice a small watch-like device in your left hand.\n" +
                    "It has hands like a watch, but the hands don’t seem to tell\n" +
                    "time.");
        }
        else
            {
                System.out.println("Please enter 'look'!");
            }
        return true;
    }

}



