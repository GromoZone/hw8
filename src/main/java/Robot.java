public class Robot implements Actions {

    public void actions (String run, String swim) {
        System.out.println("Робот " + run + " и " + swim);
    }

    public void barriers (String runRoad, String jumpOverWall) {
        System.out.println("Робот " + runRoad + " и " + jumpOverWall);
    }
}