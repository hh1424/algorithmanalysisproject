package edu.guilford;

import java.util.Random;
import java.util.Scanner;

public class PositionApplicant {
private String applicantName;
private int applicantNumber;
private double introCompProg;
private double advCompProg;
private double operSystems;
private double networking;
private double dataSystems;
private double algorithms;
private double overallCollegeGPA;
private String positionName;

    public PositionApplicant(String applicantName) {
        this.applicantName = applicantName;
    }

    public PositionApplicant(String applicantName, int applicantNumber, String positionName,
            double introCompProg, double advCompProg, 
            double operSystems, double networking, double dataSystems, 
            double algorithms, double overallCollegeGPA) {
        this.applicantName = applicantName;
        this.applicantNumber = applicantNumber;
        this.positionName = positionName;
        this.introCompProg = introCompProg;
        this.advCompProg = advCompProg;
        this.operSystems = operSystems;
        this.networking = networking;
        this.dataSystems = dataSystems;
        this.algorithms = algorithms;
        this.overallCollegeGPA = overallCollegeGPA;
    }
        
    public double calculateAverageScore() {
        double averageScore;
        averageScore = (introCompProg + advCompProg + operSystems + networking + 
                dataSystems + algorithms + overallCollegeGPA) /7;
        return averageScore;
    }
    
    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getApplicantNumber() {
        return applicantNumber;
    }

    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }

    public double getIntroCompProg() {
//        Random rand = new Random();
        return introCompProg; // = rand.nextDouble() * 69 + 31;
    }

    public void setIntroCompProg(double introCompProg) {
        this.introCompProg = introCompProg;
    }

    public double getAdvCompProg() {
//        Random rand = new Random ();
        return advCompProg; // = rand.nextDouble() * 69 + 31;
    }

    public void setAdvCompProg(double advCompProg) {
        this.advCompProg = advCompProg;
    }

    public double getOperSystems() {
//        Random rand = new Random();
        return operSystems; // = rand.nextDouble() * 69 + 31;
    }

    public void setOperSystems(double operSystems) {
        this.operSystems = operSystems;
    }

    public double getNetworking() {
//        Random rand = new Random();
        return networking; // = rand.nextDouble() * 69 + 31;
    }

    public void setNetworking(double networking) {
        this.networking = networking;
    }

    public double getDataSystems() {
//        Random rand = new Random();
        return dataSystems; // = rand.nextDouble() * 69 + 31;
    }

    public void setDataSystems(double dataSystems) {
        this.dataSystems = dataSystems;
    }

    public double getAlgorithms() {
//        Random rand = new Random();
        return algorithms; //= rand.nextDouble() * 69 + 31;
    }

    public void setAlgorithms(double algorithms) {
        this.algorithms = algorithms;
    }

    public double getOverallCollegeGPA() {
//        Random rand = new Random();
        return overallCollegeGPA; // = rand.nextDouble() * 69 + 31;
    }

    public void setOverallCollegeGPA(double overallCollegeGPA) {
        this.overallCollegeGPA = overallCollegeGPA;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String postitionName) {
        this.positionName = postitionName;
    }

    public String toString() {  
    String output;

    output = "Applicant Name: " + applicantName + "\n" +  
        "Applicant Number: " + applicantNumber + "\n" + 
        "Position Name: " + positionName + "\n" +  
        "Intro to Comp Prog: " + introCompProg + "\n" +  
        "Adv Comp Prog: " + advCompProg + "\n" +
        "Operating Systems: " + operSystems + "\n" + 
        "Networking: " + networking + "\n" + 
        "Data Systems: " + dataSystems + "\n" + 
        "Algorithms: " + algorithms + "\n" + 
        "Overall College GPA: " + overallCollegeGPA + "\n" + 
        "Average Score: " + calculateAverageScore();
    
    return output;  
    }
    
    public double calculateStandardDeviation() {
        double stdDev;
        
        double value1 = introCompProg;
        double value2 = advCompProg;
        double value3 = operSystems;
        double value4 = networking;
        double value5 = dataSystems;
        double value6 = algorithms;
        double value7 = overallCollegeGPA;
        double average = (value1 + value2 + value3 + value4 + value5 + value6 + value7) / 7;
        
        double num1 = value1 - average;
        double calc1 = Math.pow(num1, 2.0);
        double num2 = value2 - average;
        double calc2 = Math.pow(num2, 2.0);
        double num3 = value3 - average;
        double calc3 = Math.pow(num3, 2.0);
        double num4 = value4 - average;
        double calc4 = Math.pow(num4, 2.0);
        double num5 = value5 - average;
        double calc5 = Math.pow(num5, 2.0);
        double num6 = value6 - average;
        double calc6 = Math.pow(num6, 2.0);
        double num7 = value7 - average;
        double calc7 = Math.pow(num7, 2.0);
        
        stdDev = Math.sqrt((calc1 + calc2 + calc3 + calc4 + calc5 + calc6 + calc7) / (7-1));
        return stdDev;
    }

    // Consider the applicant further if the score in Introduction to Computer Programming is greater than 80  
    public boolean analyze_applicant1() {  
        boolean accept;  
        accept = introCompProg > 78;  
        return accept;  
    }
    
    //Consider the candidate further if both the introCompProg and advCompProg scores are greater than 85  
    public boolean analyze_applicant2() {  
        boolean accept;  
        accept = introCompProg > 84 && advCompProg > 82;  
        return accept;  
    }
    
    // Consider the applicant further if the overall GPA is greater than 90 or the average score for computing classes is greater than 85.
    public boolean analyze_applicant3() {
        boolean considerFurther;
        considerFurther = overallCollegeGPA > 86 || calculateAverageScore() > 88;
        return considerFurther;
    }
    
    // Consider the applicant further if the operating systems is greater than or equal to 85 or data systems is greater than 90
    public boolean analyze_applicant4() {
        boolean considerFurther;
        considerFurther = operSystems >= 91 && dataSystems > 91;
        return considerFurther;
    }
    
    // Consider the applicant if introCompProg, OperSystems, Networking, and Algorithms is greater than or equal to 85
    // or AdvCompProg, DataSystems, and OverallCollegeGPA is greater than 69
    public boolean analyze_applicant5() {
        boolean considerFurther;
        considerFurther = introCompProg > 85 && operSystems >= 85 && networking > 85 && algorithms > 85 || 
                advCompProg > 69 && dataSystems > 69 && overallCollegeGPA > 69;
        return considerFurther;
    }
    
    public boolean analyze_applicant6() {
        boolean considerFurther;
        considerFurther = algorithms >= 91 && advCompProg > 90 && overallCollegeGPA > 80;
        return considerFurther;
    }
        
    public String getNewApplicantName() {
        String newApplicant;
        Scanner scan = new Scanner(System.in);
        newApplicant = scan.nextLine().toUpperCase();
        return newApplicant;
    }  

}
