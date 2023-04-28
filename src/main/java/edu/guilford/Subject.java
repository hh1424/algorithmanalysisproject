package edu.guilford;

// This is the Subject class definition, and it is not a runnable program on its own

import java.util.Random;


public class Subject {
    
    // start declaring some attributes
    private int age;
    private String gender;
    private boolean ruleFollowing;
    private double socialValue;
    private boolean human;
    private int weight;
    private boolean pedestrian;
    private int salary;
    private String species;
    
    // constructor - Modified to instantiate an object with random values for the attributes
    // empty constructor--all it does (at first) is return an object with no attributes initialized
    // it simply reserves memory for that object
    public Subject() {
        // change the constructor behavior so that it assigns random values to the attributes
        Random rand = new Random();
        // generate a random age between 0 and 210 inclusive. What message do we send to rand to do that?
        age = rand.nextInt(211);
        socialValue = rand.nextDouble() * 49.0 + 1.0;
        ruleFollowing = rand.nextBoolean();
        pedestrian = rand.nextBoolean();
        weight = rand.nextInt(291) + 10;
        salary = rand.nextInt(200) + 1;
        
        // generate a random number between 1 and 3
        int number = rand.nextInt(3) + 1;
        // decide what species this is--program control using a conditional statement
        human = rand.nextBoolean();
        if (human) {
            species = "human"; // number == 0 is true
            pedestrian = true;
        } // Generate more random species
        else if (number == 1) {
            species = "dog"; // number == 0 is false and number == 1 is true
        }
        else if (number == 2) {
            species = "cat";
        }
        else if (number == 3) {
            species = "squirrel";
        } 
        else if (number == 4) {
            species = "bird";
        }
        else if (number == 5) {
            species = "fish";
        }
        else if (number == 6) {
            species = "capybara";
        }
        else if (number == 7) {
            species = "insect";
        }
        else if (number == 8) {
            species = "reptile";
        }
        
        // decide what gender this is
        int role = rand.nextInt(3);
        if (role == 0 ) {
            gender = "male";
        } else if (role == 1) {
            gender = "female";
        } else if (role == 2) {
            gender = "other";
        }
        
    }
    
    // consructor with parameters--builds an object that uses exactly the data provided by whoever
    // wants the object instantiated
    public Subject(int age, String gender, boolean ruleFollowing, double socialValue, boolean human, int weight, 
            boolean pedestrian, int salary, String species) {
        this.age = age;
        this.gender = gender;
        this.ruleFollowing = ruleFollowing;
        this.socialValue = socialValue;
        this.human = human;
        this.weight = weight;
        this.pedestrian = pedestrian;
        this.salary = salary;
        this.species = species;
    }
    
    // behaviors
    // build some getter and setter methods

    // new method to calculate the ratio of salary to socialValue
    public double calcSalaryToSocial() {
        return salary / socialValue;
    }
    
    @Override
    public String toString() {
        return "Subject{" + "age=" + age + ", gender=" + gender + ", ruleFollowing=" + ruleFollowing 
                + ", socialValue=" + socialValue + ", human=" + human + ", weight=" + weight 
                + ", pedestrian=" + pedestrian + ", salary=" + salary + ", species=" + species + '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isRuleFollowing() {
        return ruleFollowing;
    }

    public void setRuleFollowing(boolean ruleFollowing) {
        this.ruleFollowing = ruleFollowing;
    }

    public double getSocialValue() {
        return socialValue;
    }

    public void setSocialValue(double socialValue) {
        this.socialValue = socialValue;
    }

    public boolean isHuman() {
        return human;
    }

    public void setHuman(boolean human) {
        this.human = human;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isPedestrian() {
        return pedestrian;
    }

    public void setPedestrian(boolean pedestrian) {
        this.pedestrian = pedestrian;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    


    //Add a static selectionsort method that takes an array of integers as a parameter
    //and sorts the array in using the selection sort algorithm
    public static void selectionSort(int[] array) {
        //loop through the array
        for (int i = 0; i < array.length - 1; i++) {
            //find the minimum value in the array
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j]< array[min]) {
                    min = j;
                }
            }
            //swap the minimum value with the first value in the array
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    //Add a static quicksort method that takes an array of integers as a parameter
    //and sorts the array in using the quicksort algorithm
    public static void quickSort(int[] array, int low, int high) {
        //check to see if the array is empty
        if (array == null || array.length == 0) {
            return;
        }
        //check to see if the low value is less than the high value
        if (low >= high) {
            return;
        }
        //pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        //make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            //check to see if the left value is less than the pivot
            while (array[i] < pivot) {
                i++;
            }
            //check to see if the right value is greater than the pivot
            while (array[j] > pivot) {
                j--;
            }
            //swap the values
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        //call quickSort() method recursively
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }

    


}
