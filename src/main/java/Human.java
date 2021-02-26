public class Human implements Actions {

    public void actions (String run, String swim) {
        System.out.println("Человек " + run + " и " + swim);
    }

    public void barriers (String runRoad, String jumpOverWall) {
        System.out.println("Человек " + runRoad + " и " + jumpOverWall);
    }
}