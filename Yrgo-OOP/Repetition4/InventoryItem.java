public class InventoryItem implements Comparable<InventoryItem> {
    private String name;
    private Integer articleNumber;
    private int price;
    private int stock;

    public InventoryItem(String name, int articleNumber, int price, int stock) {
        this.name = name;
        this.articleNumber = articleNumber;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + articleNumber;
        result = prime * result + price;
        result = prime * result + stock;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InventoryItem other = (InventoryItem) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (articleNumber != other.articleNumber)
            return false;
        if (price != other.price)
            return false;
        if (stock != other.stock)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\nArticlenumber = " + articleNumber + "\nName = " + name + "\nPrice = " + price + "\nStock = "
                + stock;
    }

    @Override
    public int compareTo(InventoryItem o) {
        return articleNumber.compareTo(o.articleNumber);
    }

}
