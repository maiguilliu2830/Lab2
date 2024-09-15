
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 * Manage stand.
 *
 * @author POO
 * @version março/2022
 */
public class Stand {

    // Clients registry
    private ArrayList<User> clients;
    // Sellers registry
    private ArrayList<User> sellers;
    // Vehicles registry
    private ArrayList<Vehicle> vehicles;
    // Sells registry
    private ArrayList<Sell> sells;

    /**
     * Constructor of class Stand
     */
    public Stand() {

    }

    /**
     * Get the list of clients.
     *
     * @return This stand clients.
     */
    public List<User> getClients() {
        
    }

    /**
     * Get the list of sellers.
     *
     * @return This stand sellers.
     */
    public List<User> getSellers() {
        
    }

    /**
     * Get the list of vehicles.
     *
     * @return This stand vehicles.
     */
    public List<Vehicle> getVehicles() {
        
    }

    /**
     * Get the list of sells.
     *
     * @return This stand sells.
     */
    public List<Sell> getSells() {
        
    }

    /**
     * Register a client.
     *
     * @param client to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerClient(User client) {
        
    }

    /**
     * Register a seller.
     *
     * @param seller to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSeller(User seller) {
        
    }

    /**
     * Register a vehicle.
     *
     * @param vehicle to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerVehicle(Vehicle vehicle) {
        
    }

    /**
     * Register a sell.
     *
     * @param sell to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSell(Sell sell) {
        
    }

    /**
     * Generate a new sell and register that sell.
     *
     * @param client Must be already registered.
     * @param seller Must be already registered.
     * @param vehicle Must be already registered.
     * @return true If the request succeeds, false otherwise.
     */
    public boolean createSell(User client, User seller, Vehicle vehicle) {
        
    }

    /**
     * Calculates the total number of sells within the provided year.
     *
     * @param year
     * @return The total number of sells in the year.
     */
    public int calculateSellsOfTheYear(int year) {
        
    }

    /**
     * Find the seller with more sells within the provided year.
     *
     * @param year
     * @return The name of the seller of the year.
     */
    public String findSellerOfTheYear(int year) {
        
    }

}
