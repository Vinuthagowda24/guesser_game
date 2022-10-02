//guesser game
import java.util.Scanner
class Guesser
{
  int gnum;
  int guessingNum()
  {
    system.out.println("Guesser,kindly  guess a number");
             Scanner scan=new Scanner(system.in);
                 gnum=scan.nextInt();
                   return gnum;
   }
}

class Player
{
  int pnum;
  int predictNum()
  {
     system.out.println("player,kindly predict a number");
        Scanner scan=new Scanner(system.in);
          pnum=scan.nextInt();
           return pnum;
   }
}
class Umpire
{
  int numFromGuesser;
  int numFromPlayer1;
  int numFromPlayer2;
  int numFromPlayer3;
 
 void collectNumFromGuesser()
{
   Guesser g=new Guesser();
   numFromGuesser=g.guessingNum();
}
 void collectNumPlayers()
{
   Player p1=new Player();
   Player p2=new Player();
   Player p3=new Player();
  numFromPlayer1=p1.predictingNum();
  numFromPlayer2=p2.predictingNum();
  numFromPlayer3=p3.predictingNum();
}
void compare()
{
  if(numFromPlayer1==newFromGuesser)
   {
     System.out.println("player has won the game");
   }
  else if(numFromPlayer2==newFromGuesser)
   {
     System.out.println("player has won the game");
   }
  else if(numFromPlayer3==newFromGuesser)
   {
     System.out.println("player has won the game");
    }
  else
  {
    System.out.println("Game Lost.Try again");
  }
 }
}

class GuesserGameApp
{
  public static void main(string()args)
   {
     Umpire u=new umpire();
     u.collectNumFromGuesser();
     u.collectNumFromPlayer();
     u.compare();
   }
}
