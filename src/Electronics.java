import java.time.LocalDate;
import java.util.Scanner;

public class Electronics extends Product{
    private String brand;
    private String color;
    private boolean isNew;
    private  int memory;
    static int electronicsCounter= 0;
    Scanner scanner = new Scanner(System.in);

    public Electronics(String name, String description, int price, LocalDate createdAt, String brand, String color, boolean isNew, int memory) {
        super(name, description, price, createdAt);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
        electronicsCounter++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getElectronicsCounter() {
        return electronicsCounter;
    }

    public void setElectronicsCounter(int electronicsCounter) {
        this.electronicsCounter = electronicsCounter;
    }
}
