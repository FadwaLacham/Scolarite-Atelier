package com.ensias.scolarite.cours;
import com.ensias.scolarite.modules.Module;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoursRepository extends CrudRepository<Cours, Integer> {

    List<Cours> findByModuleId(Integer moduleId);
}
