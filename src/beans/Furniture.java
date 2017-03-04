package beans;

public abstract class Furniture {

    private String name;

    public Furniture(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getCostWithDiscount();

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Furniture furniture = (Furniture) object;

        if (!name.equals(furniture.name)) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                '}';
    }
}
