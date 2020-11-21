 
package io.flexicontech.projectmtool.repositories;

 
import io.flexicontech.projectmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Omoefe
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
    
    
}
