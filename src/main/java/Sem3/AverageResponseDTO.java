package Sem3;

public class AverageResponseDTO {
    private double averageSalary;
    private double averageAge;
    private int averageLettersInFIO;

    public AverageResponseDTO(double averageSalary, double averageAge, int averageLettersInFIO) {
        this.averageSalary = averageSalary;
        this.averageAge = averageAge;
        this.averageLettersInFIO = averageLettersInFIO;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public double getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(double averageAge) {
        this.averageAge = averageAge;
    }

    public int getAverageLettersInFIO() {
        return averageLettersInFIO;
    }

    public void setAverageLettersInFIO(int averageLettersInFIO) {
        this.averageLettersInFIO = averageLettersInFIO;
    }

    @Override
    public String toString() {
        return "AverageResponseDTO{" +
                "averageSalary=" + averageSalary +
                ", averageAge=" + averageAge +
                ", averageLettersInFIO=" + averageLettersInFIO +
                '}';
    }
}
