package com.udea.flightsearch.service;

import com.udea.flightsearch.model.Flight;
import com.udea.flightsearch.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> findFlights(LocalDate startDate, LocalDate endDate, String origin, String destination, Double maxPrice, String classType, String typeLuggage, Integer numberPassengers) {

        // Generar una clave de combinación de parámetros para usar en el switch
        String key = (origin != null ? "1" : "0") +
                (destination != null ? "1" : "0") +
                (maxPrice != null ? "1" : "0") +
                (classType != null ? "1" : "0") +
                (typeLuggage != null ? "1" : "0") +
                (numberPassengers != null ? "1" : "0");

        switch (key) {

            case "111111": // Todos los parámetros no son nulos
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, destination, maxPrice, classType, typeLuggage, numberPassengers);

            case "111110": // Todos menos numberPassengers no son nulos
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, origin, destination, maxPrice, classType, typeLuggage);

            case "111101": // Todos menos typeLuggage no son nulos
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, destination, maxPrice, classType, numberPassengers);

            case "111100": // Filtros: origen, destino, precio máximo y clase
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCase(
                        startDate, endDate, origin, destination, maxPrice, classType);

            case "111011": // Todos menos classType no son nulos
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, destination, maxPrice, typeLuggage, numberPassengers);

            case "111010": // Filtros: origen, destino, maxPrice, typeLuggage
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, origin, destination, maxPrice, typeLuggage);

            case "111001": // Filtros: origen, destino, maxPrice, numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, destination, maxPrice, numberPassengers);

            case "111000": // Filtros: origen, destino, maxPrice
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, destination, maxPrice);

            case "110111": // Filtros: origen, destino, classType, typeLuggage y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, destination, classType, typeLuggage, numberPassengers);

            case "110110": // Filtros: origen, destino, classType y typeLuggage
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, origin, destination, classType, typeLuggage);

            case "110101": // Filtros: origen, destino, classType y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, destination, classType, numberPassengers);

            case "110100": // Filtros: origen, destino, classType
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, origin, destination, classType);

            case "110011": // Filtros: origen, destino, typeLuggage y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, destination, typeLuggage, numberPassengers);

            case "110010": // Filtros: origen, destino y typeLuggage
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, origin, destination, typeLuggage);

            case "110001": // Filtros: origen, destino y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, destination, numberPassengers);

            case "110000": // Filtros: origen y destino
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCase(
                        startDate, endDate, origin, destination);

            case "101111": // Filtros: origen, maxPrice, classType, typeLuggage y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, maxPrice, classType, typeLuggage, numberPassengers);

            case "101110": // Filtros: origen, maxPrice, classType, typeLuggage
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, origin, maxPrice, classType, typeLuggage);

            case "101101": // Filtros: origen, maxPrice, classType y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, maxPrice, classType, numberPassengers);

            case "101100": // Filtros: origen, maxPrice, classType
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCase(
                        startDate, endDate, origin, maxPrice, classType);

            case "101011": // Filtros: origen, maxPrice, typeLuggage y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, maxPrice, typeLuggage, numberPassengers);

            case "101010": // Filtros: origen, maxPrice, typeLuggage
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, origin, maxPrice, typeLuggage);

            case "101001": // Filtros: origen, maxPrice y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqualAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, maxPrice, numberPassengers);

            case "101000": // Filtros: origen y maxPrice
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, maxPrice);

            case "100111": // Filtros: origen, classType, typeLuggage y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, classType, typeLuggage, numberPassengers);

            case "100110": // Filtros: origen, classType y typeLuggage
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, origin, classType, typeLuggage);

            case "100101": // Filtros: origen, classType y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, classType, numberPassengers);

            case "100100": // Filtros: origen y classType
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, origin, classType);

            case "100011": // Filtros: origen, typeLuggage y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, typeLuggage, numberPassengers);

            case "100010": // Filtros: origen y typeLuggage
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, origin, typeLuggage);

            case "100001": // Filtros: origen y numberPassengers
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, origin, numberPassengers);

            case "100000": // Solo origen no es nulo
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCase(
                        startDate, endDate, origin);

            case "011111": // Todos menos origin no son nulos
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, destination, maxPrice, classType, typeLuggage, numberPassengers);

            case "011110": // Filtros: destino, precio máximo, clase, tipo de equipaje
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, destination, maxPrice, classType, typeLuggage);

            case "011101": // Filtros: destino, precio máximo, clase y número de pasajeros
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, destination, maxPrice, classType, numberPassengers);

            case "011100": // Filtros: destino, precio máximo y clase
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndClassTypeContainingIgnoreCase(
                        startDate, endDate, destination, maxPrice, classType);

            case "011011": // Filtros: destino, precio máximo, tipo de equipaje y número de pasajeros
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, destination, maxPrice, typeLuggage, numberPassengers);

            case "011010": // Filtros: destino, precio máximo y tipo de equipaje
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, destination, maxPrice, typeLuggage);

            case "011001": // Filtros: destino, precio máximo y número de pasajeros
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqualAndNumberPassengersLessThanEqual(
                        startDate, endDate, destination, maxPrice, numberPassengers);

            case "011000": // Filtros: destino y precio máximo
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, destination, maxPrice);

            case "010111": // Filtros: destino, clase, tipo de equipaje y número de pasajeros
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, destination, classType, typeLuggage, numberPassengers);

            case "010110": // Filtros: destino, clase y tipo de equipaje
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, destination, classType, typeLuggage);

            case "010101": // Filtros: destino, clase y número de pasajeros
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, destination, classType, numberPassengers);

            case "010100": // Filtros: destino y clase
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, destination, classType);

            case "010011": // Filtros: destino, tipo de equipaje y número de pasajeros
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, destination, typeLuggage, numberPassengers);

            case "010010": // Filtros: destino y tipo de equipaje
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, destination, typeLuggage);

            case "010001": // Filtros: destino y número de pasajeros
                return flightRepository.findByDateBetweenAndNumberPassengersLessThanEqualAndDestinationContainingIgnoreCase(
                        startDate, endDate, numberPassengers, destination);

            case "010000": // Solo destino no es nulo
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCase(
                        startDate, endDate, destination);

            case "001111": // Filtros: precio máximo, clase, tipo de equipaje y número de pasajeros
                return flightRepository.findByDateBetweenAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, maxPrice, classType, typeLuggage, numberPassengers);

            case "001110": // Filtros: precio máximo, clase y tipo de equipaje
                return flightRepository.findByDateBetweenAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, maxPrice, classType, typeLuggage);

            case "001101": // Filtros: precio máximo, clase y número de pasajeros
                return flightRepository.findByDateBetweenAndPriceLessThanEqualAndClassTypeContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, maxPrice, classType, numberPassengers);

            case "001100": // Filtros: precio máximo y clase
                return flightRepository.findByDateBetweenAndPriceLessThanEqualAndClassTypeContainingIgnoreCase(
                        startDate, endDate, maxPrice, classType);

            case "001011": // Filtros: precio máximo, tipo de equipaje y número de pasajeros
                return flightRepository.findByDateBetweenAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, maxPrice, typeLuggage, numberPassengers);

            case "001010": // Filtros: precio máximo y tipo de equipaje
                return flightRepository.findByDateBetweenAndPriceLessThanEqualAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, maxPrice, typeLuggage);

            case "001001": // Filtros: precio máximo y número de pasajeros
                return flightRepository.findByDateBetweenAndNumberPassengersLessThanEqualAndPriceLessThanEqual(
                        startDate, endDate, numberPassengers, maxPrice);

            case "001000": // Solo precio máximo no es nulo
                return flightRepository.findByDateBetweenAndPriceLessThanEqual(
                        startDate, endDate, maxPrice);

            case "000111": // Filtros: clase, tipo de equipaje y número de pasajeros
                return flightRepository.findByDateBetweenAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCaseAndNumberPassengersLessThanEqual(
                        startDate, endDate, classType, typeLuggage, numberPassengers);

            case "000110": // Filtros: clase y tipo de equipaje
                return flightRepository.findByDateBetweenAndClassTypeContainingIgnoreCaseAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, classType, typeLuggage);

            case "000101": // Filtros: clase y número de pasajeros
                return flightRepository.findByDateBetweenAndNumberPassengersLessThanEqualAndClassTypeContainingIgnoreCase(
                        startDate, endDate, numberPassengers, classType);

            case "000100": // Solo clase no es nulo
                return flightRepository.findByDateBetweenAndClassTypeContainingIgnoreCase(
                        startDate, endDate, classType);

            case "000011": // Filtros: tipo de equipaje y número de pasajeros
                return flightRepository.findByDateBetweenAndNumberPassengersLessThanEqualAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, numberPassengers, typeLuggage);

            case "000010": // Solo tipo de equipaje no es nulo
                return flightRepository.findByDateBetweenAndTypeLuggageContainingIgnoreCase(
                        startDate, endDate, typeLuggage);

            case "000001": // Solo número de pasajeros no es nulo
                return flightRepository.findByDateBetweenAndNumberPassengersLessThanEqual(
                        startDate, endDate, numberPassengers);

            case "000000": // Sin filtros, solo fechas
                return flightRepository.findByDateBetween(startDate, endDate);

            default:
                throw new IllegalArgumentException("Combinación de filtros no válida");
        }

    }

}
