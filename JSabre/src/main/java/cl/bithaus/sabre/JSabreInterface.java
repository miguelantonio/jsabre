package cl.bithaus.sabre;

import java.util.List;

import cl.bithaus.sabre.bo.SabreBookRequest;
import cl.bithaus.sabre.bo.SabreBookResponse;
import cl.bithaus.sabre.bo.SabreSearchRequest;
import cl.bithaus.sabre.bo.SabreSearchResponse;
import cl.bithaus.sabre.exceptions.SabreException;
import cl.bithaus.sabre.exceptions.SabreInternalException;

/**
 * Interfaz comun, util para la generacion de servicios dummy
 *
 * @author jmakuc
 *
 */
public interface JSabreInterface {

    /**
     * Inicializa el manejador de sesiones Sabre
     */
    public void startSessionManager();

    /**
     * Detiene el manejador de sesiones Sabre
     */
    public void stopSessionManager();

    /**
     * Crea una reserva en Sabre con las características indicadas
     *
     * @param request características de la reserva
     * @return Resultado de la solicitud de reserva
     * @throws cl.bithaus.sabre.exceptions.SabreInternalException
     */
    public SabreBookResponse airBook(SabreBookRequest request) throws SabreInternalException;

    /**
     * Realiza una búsqueda de itinerarios disponibles en base a los parámetros
     * indicados
     *
     * @param request parámetros de búsqueda
     * @return resultado entregados por Sabre
     * @throws cl.bithaus.sabre.exceptions.SabreInternalException
     */
    public List<SabreSearchResponse> airSearch(SabreSearchRequest request)
            throws SabreInternalException;

    /**
     * Obtiene el itinerario asociado a un código de reserva
     *
     * @param itineraryNumber código de reserva
     * @return itinerario reservado
     * @throws cl.bithaus.sabre.exceptions.SabreInternalException
     */
    public SabreSearchResponse readItinerary(String itineraryNumber) throws SabreInternalException;
}
