package ra.entity;

public class LaptopWithTypeLaptop {
    private LaptopType laptopType;
    private int totalLaptop;

    public LaptopWithTypeLaptop() {
    }

    public LaptopWithTypeLaptop(LaptopType laptopType, int totalLaptop) {
        this.laptopType = laptopType;
        this.totalLaptop = totalLaptop;
    }

    public LaptopType getLaptopType() {
        return laptopType;
    }

    public void setLaptopType(LaptopType laptopType) {
        this.laptopType = laptopType;
    }

    public int getTotalLaptop() {
        return totalLaptop;
    }

    public void setTotalLaptop(int totalLaptop) {
        if (totalLaptop >= 0) {
            this.totalLaptop = totalLaptop;
        } else {
            System.out.println("Total laptops must be non-negative.");
        }
    }

    @Override
    public String toString() {
        return "LaptopWithTypeLaptop{" +
                "laptopType=" + laptopType +
                ", totalLaptop=" + totalLaptop +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LaptopWithTypeLaptop that = (LaptopWithTypeLaptop) o;

        if (totalLaptop != that.totalLaptop) return false;
        return laptopType != null ? laptopType.equals(that.laptopType) : that.laptopType == null;
    }

    @Override
    public int hashCode() {
        int result = laptopType != null ? laptopType.hashCode() : 0;
        result = 31 * result + totalLaptop;
        return result;
    }
}
