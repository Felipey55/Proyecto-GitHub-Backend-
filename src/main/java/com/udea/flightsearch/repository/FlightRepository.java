package com.udea.flightsearch.repository;
import com.udea.flightsearch.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    //*+********************************************************************

    // Método para buscar vuelos entre dos fechas
    List<Flight> findByDateBetween(LocalDate startDate, LocalDate endDate);

    // Un Filtro Unico
    // Método para buscar vuelos entre dos fechas con origen especifico
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCase(LocalDate startDate, LocalDate endDate, String origin);

    // Método para buscar vuelos entre dos fechas con destino especifico
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCase(LocalDate startDate, LocalDate endDate, String destination);

    // Método para buscar vuelos entre dos fechas con precio máximo
    List<Flight> findByDateBetweenAndPriceLessThanEqual(LocalDate startDate, LocalDate endDate, Double maxPrice);

    // Método para buscar vuelos entre dos fechas con la clase
    List<Flight> findByDateBetweenAndClassTypeContainingIgnoreCase(LocalDate startDate, LocalDate endDate, String classType);

    // Método para buscar vuelos entre dos fechas con el tipo de equipaje
    List<Flight> findByDateBetweenAndTypeLuggageContainingIgnoreCase(LocalDate startDate, LocalDate endDate, String luggage);

    // Método para buscar vuelos entre dos fechas con el numero de pasajeros
    List<Flight> findByDateBetweenAndNumberPassengersLessThanEqual(LocalDate startDate, LocalDate endDate, Integer numberPassengers);

    // Dos Filtro Unico
    // Método para buscar vuelos entre dos fechas, con origen y destino específicos
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination);

    // Método para buscar vuelos entre dos fechas, con origen específico y precio máximo
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, Double maxPrice);

    // Método para buscar vuelos entre dos fechas, con destino específico y precio máximo
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, Double maxPrice);

    // Método para buscar vuelos entre dos fechas, con origen y clase especifica
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String classType);

    // Método para buscar vuelos entre dos fechas, con origen especifico y tipo de equipaje
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, con destino especifico y clase especifica
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination, String classType);

    // Método para buscar vuelos entre dos fechas, con destino especifico y tipo de equipaje
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, con precio maximo y clase
    List<Flight> findByDateBetweenAndPriceLessThanEqualAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, Double maxPrice, String classType);

    // Método para buscar vuelos entre dos fechas, con precio maximo y tipo de equipaje
    List<Flight> findByDateBetweenAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, Double maxPrice, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, con clase y tipo de equipaje
    List<Flight> findByDateBetweenAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String classType, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, con numero de pasajeros y origen
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, con numero de pasajeros y destino
    List<Flight> findByDateBetweenAndNumberPassengersLessThanEqualAndDestinationContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, Integer numberPassengers ,String destination);

    // Método para buscar vuelos entre dos fechas, con numero de pasajeros y precio maximo
    List<Flight> findByDateBetweenAndNumberPassengersLessThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, Integer numberPassengers, Double maxPrice);

    // Método para buscar vuelos entre dos fechas, con numero de pasajeros y clase
    List<Flight> findByDateBetweenAndNumberPassengersLessThanEqualAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, Integer numberPassengers, String classType);

    // Método para buscar vuelos entre dos fechas, con numero de pasajeros y tipo de equipaje
    List<Flight> findByDateBetweenAndNumberPassengersLessThanEqualAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, Integer numberPassengers, String typeLuggage);


    // Tres Filtro Unico
    // Método para buscar vuelos entre dos fechas,origen especifico, destino específico y precio máximo
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, Double maxPrice);
    // Método para buscar vuelos entre dos fechas, origen especifico, destino específico y clase
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String classType);

    // Método para buscar vuelos entre dos fechas, origen especifico, destino específico y tipo de equipaje
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, origen especifico, precio maximo y clase
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, double maxPrice, String classType);

    // Método para buscar vuelos entre dos fechas, origen especifico, clase y tipo de equipaje
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String classType, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, origen especifico, precio maximo y tipo de equipaje
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, double maxPrice, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, destino específico, precio maximo y clase
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination, double maxPrice, String classType);

    // Método para buscar vuelos entre dos fechas, destino específico, precio maximo y tipo de equipaje
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination, double maxPrice, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, precio maximo, clase y tipo de equipaje
    List<Flight> findByDateBetweenAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, double maxPrice, String classType, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, destino, clase y tipo de equipaje
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination, String classType, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, origen, destino y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination ,Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, origen, precio maximo y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, Double maxPrice, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, origen, clase y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String classType, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, origen, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, destino, precio maximo y numero de pasajeros
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, Double maxPrice, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, destino, clase y numero de pasajeros
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String classType, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, destino, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, precio maximo, clase y numero de pasajeros
    List<Flight> findByDateBetweenAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, double maxPrice, String classType, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, precio maximo, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, double maxPrice, String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, clase, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String classType,String typeLuggage, Integer numberPassengers);


    // Cuatro Filtro Unico

    // Método para buscar vuelos entre dos fechas, Origen, destino, precio maximo y Clase
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination, Double maxPrice, String classType);

    // Método para buscar vuelos entre dos fechas, Origen, destino, precio maximo y tipo de equipaje
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination, Double maxPrice, String typeLuggage);
    // Método para buscar vuelos entre dos fechas, Origen, destino, Clase y tipo de equipaje
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String classType, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, Origen, precio maximo, clase y tipo de equipaje
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin ,Double maxPrice, String classType, String typeLuggage);
    // Método para buscar vuelos entre dos fechas, destino, precio maximo, Clase y tipo de equipaje
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination,Double maxPrice, String classType, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, Origen, destino, precio maximo y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, Double maxPrice, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, Origen, destino, clase y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String classType, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, Origen, destino, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, Origen, precio maximo, clase y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, Double maxPrice, String classType, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, Origen, precio maximo, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, Double maxPrice, String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, Origen, clase, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String classType, String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, destino, precio maximo, clase y numero de pasajeros
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, Double maxPrice, String classType, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, destino, precio maximo, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, Double maxPrice, String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, destino, clase, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String classType, String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, precio maximo, clase, tipo de equipaje y numero de pasajeross
    List<Flight> findByDateBetweenAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, Double maxPrice, String classType, String typeLuggage, Integer numberPassengers);


    // Cinco Filtro Unico
    // Método para buscar vuelos entre dos fechas, destino, origen, precio maximo, clase y tipo de equipaje
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination, String origin, double maxPrice ,String classType, String typeLuggage);

    // Método para buscar vuelos entre dos fechas, origen, destino, precio maximo, clase y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, Double maxPrice ,String classType, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, origen, destino, precio maximo, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, Double maxPrice ,String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, origen, destino, clase, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String classType ,String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, origen, precio maximo, clase, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, Double maxPrice, String classType, String typeLuggage, Integer numberPassengers);

    // Método para buscar vuelos entre dos fechas, destino, precio maximo, clase, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, Double maxPrice ,String classType, String typeLuggage, Integer numberPassengers);


    // Seis Filtro Unico
    // Método para buscar vuelos entre dos fechas, destino, origen, precio maximo, clase, tipo de equipaje y numero de pasajeros
    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String origin, double maxPrice ,String classType, String typeLuggage, Integer numberPassengers);
}