package todolist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * Created by m_por on 14/04/2017.
 */
@Data
@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String taskName;

    public Task() {
    }

    public Task(String taskName) {
        this.taskName = taskName;
    }
}
