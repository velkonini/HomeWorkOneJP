public class TreadMill implements Obstacle{
    int dist;

    public TreadMill(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(dist);
    }
}
