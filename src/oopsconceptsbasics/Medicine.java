package oopsconceptsbasics;

import java.time.LocalDate;

public class Medicine {
    private String name;
    private String brand;
    private String dosageForm; //capsule, tablet, liquid or syrup forms etv
    private String strength; // 5mg, 10 mg etc
    private LocalDate manufactureDate;
    private LocalDate expirationDate;
    private String batchNumber; // for tracking and quality control
    private String sideEffects; // desc of potential side effects
    private String storageInstructions; // cold place, dark place?
    private int quantity; //how many pills, milliliters if in liquid form

    private boolean requiresPrescription;
    //Accessors and Mutators

    //Behaviors/ Methods

}
