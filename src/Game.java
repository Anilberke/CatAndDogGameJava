public class Game {
    private int MAX_NUMBER_0F_ROUNDS = 1000;

    public int getMAX_NUMBER_0F_ROUNDS() {
        return MAX_NUMBER_0F_ROUNDS;
    }

    public double calculateDistance(Animal dog,Animal cat){
        int x1 = dog.getX_axis();
        int x2 = cat.getX_axis();
        int y1 = dog.getY_axis();
        int y2 = cat.getY_axis();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
    }

    public boolean isGameOver(Animal dog,Animal cat){
        int x1 = dog.getX_axis();
        int x2 = cat.getX_axis();
        int y1 = dog.getY_axis();
        int y2 = cat.getY_axis();
        return  x1 == x2 && y1 == y2;
    }



}
