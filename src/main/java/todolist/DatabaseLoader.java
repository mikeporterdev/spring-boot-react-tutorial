package todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by m_por on 14/04/2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {
    private final TaskRepository repository;

    @Autowired
    public DatabaseLoader(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Task("Clean dishes"));
        this.repository.save(new Task("wash stuff"));
        this.repository.save(new Task("idk"));
        this.repository.save(new Task("test"));
    }
}
