package todolist;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by m_por on 14/04/2017.
 */
public interface TaskRepository extends CrudRepository<Task, Long> {
}
