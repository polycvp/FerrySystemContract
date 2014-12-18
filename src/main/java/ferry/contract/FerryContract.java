/*
 * This class contains the methods that need to be implemented to connect 
    the frontend and backend of the ferry application.
 */

package ferry.contract;

import ferry.eto.NoFerriesFoundException;
import ferry.eto.InvalidRouteException;
import ferry.eto.NoScheduleException;
import ferry.eto.NoSuchAccountException;
import ferry.eto.InvalidAccountException;
import ferry.eto.NoSuchReservationException;
import ferry.dto.AbstractAccount;
import ferry.dto.TrafficDetail;
import ferry.dto.AccountDetail;
import ferry.dto.AccountSummary;
import ferry.dto.TravelSummary;
import ferry.dto.ReservationDetail;
import ferry.dto.TrafficSummary;
import ferry.dto.ReservationSummary;
import ferry.dto.TravelDetail;
import java.util.Collection;
import javax.ejb.Remote;

/**
 * @author Group F
 */
@Remote
public interface FerryContract {
    
    /**
     * Gets a complete timetable of ferry traffic according to the departure and destination port and departure time
     * @param trafficDetail the information necessary for finding relevant ferry trips
     * @return A collection of TrafficSummary
     * @throws InvalidRouteException if the route does not exist ,NoFerriesFoundException if ferries are not found on the route
     */
    public Collection<TrafficSummary> getTrafficInformation(TrafficDetail trafficDetail) throws InvalidRouteException,NoFerriesFoundException;
    
    /**
     * Sends all the information required for making a reservation to the frontend, for the users review
     * @param travelDetail 
     * @return TravelSummary an enriched set of data relevant for making the reservation
     * @throws NoScheduleException if the trip does not exist
     * @pre a ferry trip is selected
     * @post the reservation price is known
     */
    public TravelSummary getTravelSummary(TravelDetail travelDetail) throws NoScheduleException;
    
    /**
     * Makes a reservation after the user has approved all the details, including the price, of his travel
     * @param resDetail
     * @return a ReservationSummary relevant for showing a receipt to the client
     * @throws NoSuchReservationException
     * @pre a ferry trip is selected and the price is known
     * @post a reservation is created
     */
    public ReservationSummary makeReservation(ReservationDetail resDetail) throws NoSuchReservationException;
    
    /**
     * 
     * @param reservationId
     * @return
     * @throws NoSuchReservationException 
     */
    public boolean deleteReservation(int reservationId) throws NoSuchReservationException;
    
    /**
     * 
     * @param resDetail
     * @return
     * @throws NoSuchReservationException 
     */
    public ReservationSummary editReservation(ReservationDetail resDetail) throws NoSuchReservationException;
    
    /**
     * checks weather a user is a resident and entitled to special discounts
     * @return true or false depending on the user account
     * @pre user account must exist
     */
    public boolean isUserResident(AbstractAccount accDTO);
    
    /**
     * submits the necessary information to create a user account and returns a summary as confirmation
     * @param accDetail
     * @return AccountSummary for the users review
     * @throws InvalidAccountException if the information is incomplete or corrupted
     * @post a user account is created
     */
    public AccountSummary makeAccount(AccountDetail accDetail) throws InvalidAccountException;
    
    /**
     * 
     * @param email
     * @param password
     * @return the account corresponding to the user
     * @throws NoSuchAccountException 
     */
    public AccountDetail login(String email,String password) throws NoSuchAccountException;
    
    /**
     * 
     * @param accDetail
     * @return 
     */
    public AccountSummary deleteAccount(AccountDetail accDetail);
    
    /**
     * 
     * @param accDetail
     * @return
     * @throws NoSuchAccountException 
     */
    public boolean editAccount(AccountDetail accDetail) throws NoSuchAccountException;
    
    /**
     * 
     * @param acc
     * @return
     * @throws NoSuchAccountException 
     */
    public AccountDetail showAccount(AbstractAccount acc) throws NoSuchAccountException;
}
