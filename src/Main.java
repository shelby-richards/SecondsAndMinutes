public class Main {

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "You have entered an invalid response.";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " +remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "You have entered an invalid response.";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " +remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(600, 25));
        System.out.println(getDurationString(4, 10));

        System.out.println(getDurationString(4500)); //1h 15 min*/
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(45));

        System.out.println(getDurationString(-54));
        System.out.println(getDurationString(-540, 65));

        System.out.println(getDurationString(-5));
    }
}
