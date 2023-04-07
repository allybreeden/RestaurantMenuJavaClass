package restaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.*;

public class MenuItem {

    private String name;
    private String description;
    private Double price;
    private String category;
    private Date dateAdded;



    public MenuItem(String name, String description, Double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.dateAdded = new Date();
    }

    // TODO: Define getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }


    // TODO: Define custom toString() method

    @Override
    public String toString() {
        String newText = isNew() ? "- NEW!" : "";
        return name + newText + '\n' +
                description + " | $" + price;
    }


    // TODO: Define custom equals() method

    @Override
            public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.name.equals(otherItem.getName());
    }





    // TODO: Define instance method isNew()

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = dateAdded.until(today, ChronoUnit.DAYS);
        System.out.println(daysBetween + " days since " + name + " was added");
        return daysBetween < 90;
    }
}
