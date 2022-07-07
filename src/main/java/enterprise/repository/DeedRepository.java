
package enterprise.repository;

import enterprise.models.Deed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeedRepository extends CrudRepository<Deed, Integer> {}
