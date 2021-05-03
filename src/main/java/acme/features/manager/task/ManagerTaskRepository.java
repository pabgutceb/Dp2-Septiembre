package acme.features.manager.task;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.tasks.Task;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface ManagerTaskRepository extends AbstractRepository {
	@Query("select t from Task t where t.managerId.id=?1")
	Collection<Task> findTasksByManager(int id);
	@Query("select t from Task t")
	Collection<Task> encuentraTodos();
	
	@Query("select t from Task t where t.id=?1")
	Task findById(int id);

}
