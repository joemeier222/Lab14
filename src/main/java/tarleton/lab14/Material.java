package tarleton.lab14;

/**
 *
 * @author Joe Meier
 * 
 * 
 */
public class Material {
    private final String rigidity;
    private final String weight;
    private final String visibility;
    private final String malleability;
    private final String breathability;
    private boolean waterproof;
    private boolean absorbent;
    private boolean windproof;
    private boolean moistureResistant;
    private boolean shiny;
    private boolean antibacterial;
    private boolean heatResistant;
    private boolean coldResistant;
    private boolean acidResistant;
    private boolean alcoholResistant;
    private boolean alkaliResistant;
    private boolean mineralOilResistant;
    private boolean recyclable;

    public Material(Builder builder) {
        this.rigidity = builder.rigidity;
        this.weight = builder.weight;
        this.visibility = builder.visibility;
        this.malleability = builder.malleability;
        this.breathability = builder.breathability;
        this.waterproof = builder.waterproof;
        this.absorbent = builder.absorbent;
        this.windproof = builder.windproof;
        this.moistureResistant = builder.moistureResistant;
        this.shiny = builder.shiny;
        this.antibacterial = builder.antibacterial;
        this.heatResistant = builder.heatResistant;
        this.coldResistant = builder.coldResistant;
        this.acidResistant = builder.acidResistant;
        this.alcoholResistant = builder.alcoholResistant;
        this.alkaliResistant = builder.alkaliResistant;
        this.mineralOilResistant = builder.mineralOilResistant;
        this.recyclable = builder.recyclable;
    }

    public String getRigidity() {
        return rigidity;
    }

    public String getWeight() {
        return weight;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getMalleability() {
        return malleability;
    }

    public String getBreathability() {
        return breathability;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public boolean isAbsorbent() {
        return absorbent;
    }

    public boolean isWindproof() {
        return windproof;
    }

    public boolean isMoistureResistant() {
        return moistureResistant;
    }

    public boolean isShiny() {
        return shiny;
    }

    public boolean isAntibacterial() {
        return antibacterial;
    }

    public boolean isHeatResistant() {
        return heatResistant;
    }

    public boolean isColdResistant() {
        return coldResistant;
    }

    public boolean isAcidResistant() {
        return acidResistant;
    }

    public boolean isAlcoholResistant() {
        return alcoholResistant;
    }
    
    public boolean isAlkaliResistant() {
        return alkaliResistant;
    }

    public boolean isMineralOilResistant() {
        return mineralOilResistant;
    }

    public boolean isRecyclable() {
        return recyclable;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(
        "Material: "  + rigidity 
                + ", " + weight 
                + ", " + visibility 
                + ", " + malleability 
                + ", " + breathability);
        
        if (waterproof){
            str.append(", waterproof");
        }
        
        if (absorbent){
            str.append(", absorbent" );
        }
        
        if (windproof){
            str.append(", windproof");
        }
        
        if (moistureResistant){
            str.append(", moisture-resistant" );
        }
        
        if (shiny){
            str.append(", shiny");
        }
        
        if (antibacterial){
            str.append(", antibacterial");
        }
 
        if (heatResistant){
            str.append(", heat-resistant");
        }

        if (coldResistant){
            str.append(", cold-resistant");
        }

        if (acidResistant){
            str.append(", acid-resistant");
        }

        if (alcoholResistant){
            str.append(", alcohol-resistant");
        }
        
        if (alkaliResistant){
            str.append(", alkali-resistant");
        }

        if (mineralOilResistant){
            str.append(", mineral oil-resistant");
        }

        if (recyclable){
            str.append(", recyclable");
        }        
        
        return str.toString();
    }
    
    public static class Builder {
        private final String rigidity;
        private final String weight;
        private final String visibility;
        private final String malleability;
        private final String breathability;
        private boolean waterproof;
        private boolean absorbent;
        private boolean windproof;
        private boolean moistureResistant;
        private boolean shiny;
        private boolean antibacterial;
        private boolean heatResistant;
        private boolean coldResistant;
        private boolean acidResistant;
        private boolean alcoholResistant;
        private boolean alkaliResistant;
        private boolean mineralOilResistant;
        private boolean recyclable;

        public Builder(String rigidity, String weight, String visibility, String malleability, String breathability) {
            this.rigidity = rigidity;
            this.weight = weight;
            this.visibility = visibility;
            this.malleability = malleability;
            this.breathability = breathability;
        }

        public Builder waterproof(boolean val) {
            this.waterproof = val;
            return this;
        }

        public Builder absorbent(boolean val) {
            this.absorbent = val;
            return this;
        }        

        public Builder windproof(boolean val) {
            this.windproof = val;
            return this;
        }
        
        public Builder moistureResistant(boolean val) {
            this.moistureResistant = val;
            return this;
        }
        
        public Builder shiny(boolean val) {
            this.shiny = val;
            return this;
        }

        public Builder antibacterial(boolean val) {
            this.antibacterial = val;
            return this;
        }

        public Builder heatResistant(boolean val) {
            this.heatResistant = val;
            return this;
        }

        public Builder coldResistant(boolean val) {
            this.coldResistant = val;
            return this;
        }
        
        public Builder acidResistant(boolean val) {
            this.acidResistant = val;
            return this;
        }
        
        public Builder alcoholResistant(boolean val) {
            this.alcoholResistant = val;
            return this;
        }
        
        public Builder alkaliResistant(boolean val) {
            this.alkaliResistant = val;
            return this;
        }
        
        public Builder mineralOilResistant(boolean val) {
            this.mineralOilResistant = val;
            return this;
        }
        
        public Builder recyclable(boolean val) {
            this.recyclable = val;
            return this;
        }
        
        public Material build() {
            return new Material(this);
        }
    }
}
