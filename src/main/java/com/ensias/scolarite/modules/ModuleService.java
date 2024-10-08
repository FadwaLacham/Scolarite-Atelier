package com.ensias.scolarite.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public List<Module> getAllModules() {
        List<Module> modules=new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
       //moduleRepository.findAll().forEach(m->modules.add(m));
        return modules;
    }

    public void ajouterModule(Module module) {
        moduleRepository.save(module);
    }

    public Optional<Module> getModule(int id) {
        return moduleRepository.findById(id);
    }


    public void modifierModule(Integer id, Module module) {
        moduleRepository.save(module);

    }

    public void supprimerModule(Integer id) {
        moduleRepository.deleteById(id);
    }
}
