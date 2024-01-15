public class PlayerRating {
    int playerP;
    String pName;
    float critic1rating;
    float critic2rating;
    float critic3rating;
    float avgRating;
    char catg;

    PlayerRating(int playerP1, String pName1) {
        playerP = playerP1;
        pName = pName1;
    }

    void calcAvgRating(float critic1rating, float critic2rating) {
        this.avgRating = (critic1rating + critic2rating) / 2;
    }

    void calcAvgRating(float critic1rating, float critic2rating, float critic3rating) {
        this.avgRating = (critic1rating + critic2rating + critic3rating) / 3;
    }

    void calcCatg() {
        if (avgRating > 8) {
            catg = 'A';
        } else if (avgRating > 5 && avgRating <= 8) {
            catg = 'B';
        } else if (avgRating > 0 && avgRating <= 5) {
            catg = 'C';
        } else {
            catg = 'D';
        }
    }

    void display() {
        System.out.println("player name : " + pName);
        System.out.println("player position : " + playerP);
        System.out.println("average rating : " + avgRating);
        System.out.println("category : " + catg);
    }

    public static void main(String[] args) {
        PlayerRating p;  // No need to set it to null initially
        p = new PlayerRating(1, "Beckham");
        p.calcAvgRating(9, 9.9f);
        p.calcCatg();
        p.display();

        p = new PlayerRating(1, "Oscar");
        p.calcAvgRating(1, 1, 1);
        p.calcCatg();
        p.display();
    }
}

// OUTPUT
// player name : Beckham
// player position : 1
// average rating : 9.45
// category : A
// player name : Oscar
// player position : 1
// average rating : 1.0
// category : C