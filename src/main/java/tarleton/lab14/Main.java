package tarleton.lab14;

/**
 *
 * @author Joe Meier
 */
public class Main {
    public static void main(String[] args) {
        Material m1 = new Material.Builder("hard",
            "heavy",
            "opaque",
            "rigid",
            "nonbreathable")
            .waterproof(true)
            .shiny(true)
            .windproof(true)
            .coldResistant(true)
            .recyclable(true)
            .heatResistant(true)
            .build();
        System.out.println(m1);
    }
}
