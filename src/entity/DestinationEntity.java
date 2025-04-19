package entity;

public class DestinationEntity {

    private Long id;
    private String name;
    private String description;
    private String country;
    private TourEntity tours;

    private static Long counter =0L;

    public DestinationEntity(Long id, String name, String description, String country, TourEntity tours) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.country = country;
        this.tours = tours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TourEntity getTours() {
        return tours;
    }

    public void setTours(TourEntity tours) {
        this.tours = tours;
    }

    public static Long getCounter() {
        return counter;
    }

    public static void setCounter(Long counter) {
        DestinationEntity.counter = counter;
    }
}
