import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;
    public List<Horse> getHorses() {
        return horses;
    }
    public Hippodrome (List list) {
         this.horses = list;
    }
    public void run() throws Exception{
        for (int i = 0; i < 100; i++) {
        move();
        print();
        Thread.sleep(200);
        
        
        }
        
        
    }
    public void move(){
        for (Horse value : horses) {
            value.move();
        }
    }
    public void print(){
        horses.forEach(Horse::print);
        for (int i =0; i< 10; i++) {
            System.out.println();
    }
    }
    public Horse getWinner(){
        double maxDistance = 0;
        Horse horseWinner = null;
        for (Horse value: horses){
            if (value.distance > maxDistance){
                maxDistance = value.distance;
                horseWinner = value;
            }
        }
        return horseWinner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().name +"!");
    }
    
    public static void main(String[] args) throws Exception{
      Horse horse1 = new Horse("Naruto", 3, 0);
    Horse horse2 = new Horse("Saske", 3, 0);
    Horse horse3 = new Horse("Sakura", 3, 0);
    ArrayList<Horse> horsesArray = new ArrayList<>();
    horsesArray.add(horse1);
    horsesArray.add(horse2);
    horsesArray.add(horse3);
    game = new Hippodrome(horsesArray);
    game.run();
    game.printWinner();
}
}
