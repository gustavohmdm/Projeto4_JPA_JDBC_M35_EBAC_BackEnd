package dao.jpa;

import dao.generic.jpa.GenericJpaDAO;
import domain.jpa.ClienteJpa;

/**
 * @author gustavohmdm
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
