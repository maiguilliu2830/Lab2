
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * A sell of a vehicle, performed by a seller to a client.
 *
 * @author POO
 * @version março/2022
 */
public class Sell {

    private static int numberOfSells = 0;
    // Id of the sell.
    private final String id;
    // Client to whom the sell is done.
    private User client;
    // Seller who performed the sell.
    private User seller;
    // Sold vehicle.
    private Vehicle vehicle;
    // Date of the sell.
    private LocalDate date;

    /**
     * Constructor of class Sell
     *
     * @param client The client to whom the sell is done.
     * @param seller The seller who performed the sell.
     * @param vehicle The sold vehicle.
     */
    public Sell(User client, User seller, Vehicle vehicle) {
        id = Integer.toString(++numberOfSells);
        this.client = client;
        this.seller = seller;
        this.vehicle = vehicle;
        this.date = LocalDate.now();
    }

    /**
     * Get the id.
     *
     * @return This sell id.
     */
    public String getId() {
        return id;
    }

    /**
     * Get the client.
     *
     * @return The client of this sell.
     */
    public User getClient() {
        return client;
    }
    /**
     * Get the seller.
     *
     * @return The seller of this sell.
     */
    public User getSeller() {
        return seller;
    }

    /**
     * Get the vehicle.
     *
     * @return The sold vehicle.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Get the date.
     * 
     * @return The sell date.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Set the date.
     *
     * @param date The sell date. Must not be null. Must not be a future date.
     */
    public void setDate(LocalDate date) {
        if (date != null && date.isBefore(LocalDate.now())) {
            this.date = date;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/YYYY");
        return "Data da venda \t: " + date.format(formatter) + "\n"
                + vehicle + "\n";
    }

}
