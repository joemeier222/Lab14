package tarleton.lab14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Joe Meier
 */
public class MaterialTest {

    @Test
    public void testBuilder1() {
        assertEquals(
            new Material.Builder(
                "hard",
                "heavy",
                "opaque",
                "rigid",
                "nonbreathable")
                .build().toString(),
                "Material: hard, heavy, opaque, rigid, nonbreathable");
    }
    @Test
    public void testBuilder2() {
        assertEquals(
            new Material.Builder(
                "hard",
                "heavy",
                "opaque",
                "rigid",
                "nonbreathable")
                .waterproof(true)
                .build().toString(),
                "Material: hard, heavy, opaque, rigid, nonbreathable, waterproof");
    }

    @Test
    public void testBuilder3() {
        assertEquals(
            new Material.Builder(
                "hard",
                "heavy",
                "opaque",
                "rigid",
                "nonbreathable")
                .waterproof(false)
                .build().toString(),
                "Material: hard, heavy, opaque, rigid, nonbreathable");
    }    
    
    @Test
    public void testBuilder4() {
        assertEquals(
            new Material.Builder(
                "soft",
                "light-weight",
                "transparent",
                "bendy",
                "breathable")
                .absorbent(true)
                .windproof(true)
                .build().toString(),
                "Material: soft, light-weight, transparent,"
                        + " bendy, breathable, "
                        + "absorbent, windproof");
    }
    
    @Test
    public void testBuilder5() {
        assertEquals(
            new Material.Builder(
                "soft",
                "light-weight",
                "transparent",
                "bendy",
                "breathable")
                .moistureResistant(true)
                .shiny(true)
                .antibacterial(true)
                .build().toString(),
                "Material: soft, light-weight, transparent,"
                        + " bendy, breathable, moisture-resistant,"
                        + " shiny, antibacterial");
    }

    @Test
    public void testBuilder6() {
        assertEquals(
            new Material.Builder(
                "soft",
                "heavy",
                "translucent",
                "elastic",
                "breathable")
                .heatResistant(true)
                .coldResistant(true)
                .acidResistant(true)
                .alcoholResistant(true)
                .alkaliResistant(true)
                .mineralOilResistant(true)
                .build().toString(),
                "Material: soft, heavy, translucent,"
                        + " elastic, breathable, heat-resistant,"
                        + " cold-resistant, acid-resistant,"
                        + " alcohol-resistant, alkali-resistant,"
                        + " mineral oil-resistant");
    }

    @Test
    public void testBuilder7() {
        assertEquals(
            new Material.Builder(
                "soft",
                "heavy",
                "translucent",
                "elastic",
                "breathable")
                .waterproof(true)
                .absorbent(true)
                .windproof(true)
                .moistureResistant(true)
                .shiny(true)
                .antibacterial(true)
                .heatResistant(true)
                .coldResistant(true)
                .acidResistant(true)
                .alcoholResistant(true)
                .alkaliResistant(true)
                .mineralOilResistant(true)
                .recyclable(true)
                .build().toString(),
                "Material: soft, heavy, translucent,"
                        + " elastic, breathable, waterproof,"
                        + " absorbent, windproof, moisture-resistant,"
                        + " shiny, antibacterial, heat-resistant,"
                        + " cold-resistant, acid-resistant,"
                        + " alcohol-resistant, alkali-resistant,"
                        + " mineral oil-resistant, recyclable");
    }
}
