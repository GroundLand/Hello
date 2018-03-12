package importJAVASE.compare;

public class Apple implements Comparable<Apple>{

    private Integer weight;

    private String color;

    public Apple(Integer weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int compareTo(Apple apple) {
     return weight.compareTo(apple.getWeight());
    }
}
