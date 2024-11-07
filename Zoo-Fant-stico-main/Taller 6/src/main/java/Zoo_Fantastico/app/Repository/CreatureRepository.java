package Zoo_Fantastico.app.Repository;

import Zoo_Fantastico.app.Creature.Creature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatureRepository extends JpaRepository<Creature, Long> {
}


