package oopsconceptsbasics;

import java.time.LocalDate;

public class BottleJuice {
    //State
    private String name;
    private String[] ingredients;
    private String[] vitaminAndMinerals;
    private String disclaimers;
    private boolean hasAntiOxidants;
    private int servingsPerContainer;
    private int calories;
    private int sugarContent;
    private int totalCarbohydrates;
    private int totalProtein;
    private int dietaryFibre;
    private int sodium;
    private int fat;
    private LocalDate manufactureDate;
    private LocalDate expiryDate;
    //Accessors and Mutators

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getVitaminAndMinerals() {
        return vitaminAndMinerals;
    }

    public void setVitaminAndMinerals(String[] vitaminAndMinerals) {
        this.vitaminAndMinerals = vitaminAndMinerals;
    }

    public String getDisclaimers() {
        return disclaimers;
    }

    public void setDisclaimers(String disclaimers) {
        this.disclaimers = disclaimers;
    }

    public boolean isHasAntiOxidants() {
        return hasAntiOxidants;
    }

    public void setHasAntiOxidants(boolean hasAntiOxidants) {
        this.hasAntiOxidants = hasAntiOxidants;
    }

    public int getServingsPerContainer() {
        return servingsPerContainer;
    }

    public void setServingsPerContainer(int servingsPerContainer) {
        this.servingsPerContainer = servingsPerContainer;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public int getTotalCarbohydrates() {
        return totalCarbohydrates;
    }

    public void setTotalCarbohydrates(int totalCarbohydrates) {
        this.totalCarbohydrates = totalCarbohydrates;
    }

    public int getTotalProtein() {
        return totalProtein;
    }

    public void setTotalProtein(int totalProtein) {
        this.totalProtein = totalProtein;
    }

    public int getDietaryFibre() {
        return dietaryFibre;
    }

    public void setDietaryFibre(int dietaryFibre) {
        this.dietaryFibre = dietaryFibre;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    //Behaviors
    public String printInfo(){
        String pInfo = String.format("Name: %s \nCalories: %d \nFat: %dgm\n" +
                        "Manufacture Date: %s \nExpiry Date: %s \n" +
                        "Dietary Fibre: %sgm \nDisclaimers: %s"
                , getName(), getCalories(), getFat(), getManufactureDate(),
                getExpiryDate(), getDietaryFibre(), getDisclaimers());
        return pInfo;
    }

}
