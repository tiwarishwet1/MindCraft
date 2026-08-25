package question13and14;

import java.util.Objects;

public class Vehicle implements Cloneable {

    int number;
    String name;
    double price;

    public Vehicle(int number, String name, double price) {
        super();
        this.number = number;
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Integer.valueOf(number), Double.valueOf(price));
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Vehicle other = (Vehicle) obj;

        return Objects.equals(name, other.name)
                && number == other.number
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
    }

    @Override
    public String toString() {
        return "Vehicle [number=" + number + ", name=" + name + ", price=" + price + "]";
    }

    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }
}