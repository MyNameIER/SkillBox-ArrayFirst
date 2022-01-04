package ArrayFirst;

public class SimpleArray {
    public static void main(String[] args) {
        String start = "Каждый охотнтк желает знать, где сидит фазан";
        String [] rainbowColor = start.split(",?\\s+");
        for (int i = 0; i < rainbowColor.length; i++)
        {
            System.out.println(rainbowColor[i]);
        }
        for (int i = rainbowColor.length - 1; i > 0; i--)
        {
            System.out.println(rainbowColor[i]);
        }
    }
}
