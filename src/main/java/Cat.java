public class Cat implements Actions {

    public void actions (String run, String swim) {
        System.out.println("Кот " + run + " и " + swim);
    }

    public void barriers (String runRoad, String jumpOverWall) {
        System.out.println("Кот " + runRoad + " и " + jumpOverWall);
    }
}