/**
 *
 */
package org.sofka.api.cuenta.bancaria.cliente.repository;

import java.util.Optional;
import org.sofka.api.cuenta.bancaria.cliente.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * <b> Interfaz del repositorio del cliente. </b>
 *
 * @author Jenny Pucha
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: Jenny Pucha $, $Date: 19 abr. 2024 $]
 *          </p>
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    /**
     * <b> Metodo para obtiene un cliente por su identificacion. </b>
     * <p>
     * [Author: Jenny Pucha, Date: 19 abr. 2024]
     * </p>
     *
     * @param identificacion parametro de entrada
     * @return Optional<Cliente> objeto de respuesta.
     */
    @Query(value = "SELECT * FROM  Cliente c WHERE c.identificacion = :identificacion", nativeQuery = true)
    Optional<Cliente> obtenerPorIdentificacion(String identificacion);

}
