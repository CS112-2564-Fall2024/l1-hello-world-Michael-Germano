public class Car {
    String color;

    public Car(){
        this.color = "None"; 
    }

    public Car(String color) {
        this.color = color;
    }
    
    public String GetInstructions() {
        return color;
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color;
    }

    public boolean equals(Car otherCar) {
        if (this.color.equals(otherCar.color))
            return true;
        else
            return false; 
    }
}
