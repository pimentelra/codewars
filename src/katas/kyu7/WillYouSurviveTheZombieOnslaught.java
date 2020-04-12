package katas.kyu7;

public class WillYouSurviveTheZombieOnslaught {
    public static String zombieShootout(int zombies, int range, int ammo) {
        return String.format("You shot %s", range * 2 >= zombies && zombies <= ammo ? String.format("all %d zombies.", zombies) :
                String.format("%d zombies before being eaten: %s.", Math.min(range * 2, ammo), ammo >= range * 2 ? "overwhelmed" : "ran out of ammo"));
    }
}
