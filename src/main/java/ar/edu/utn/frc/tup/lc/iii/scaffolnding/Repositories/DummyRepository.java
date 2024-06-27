package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Repositories;

import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Long> {
}
