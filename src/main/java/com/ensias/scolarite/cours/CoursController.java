package com.ensias.scolarite.cours;

import com.ensias.scolarite.modules.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
public class CoursController {

    @Autowired
    private CoursService coursService;

    @RequestMapping("/modules/{id}/cours")
    public List<Cours> getAllCours(@PathVariable Integer id){
        return coursService.getAllCours(id);
    }

    @RequestMapping("/modules/{moduleId}/cours/{id}")
    public Optional<Cours> getCours(@PathVariable Integer id){
        return coursService.getCours(id);
    }
    @PostMapping("/modules/{moduleId}/cours")
    //pour ajouter un Cours à un Module donné
    public void ajouterCours(@RequestBody Cours cours, @PathVariable Integer moduleId) {
        cours.setModule(new Module(moduleId,"",""));
        coursService.ajouterCours(cours);
    }

    @PutMapping("/modules/{moduleId}/cours/{id}")
    //pour modifier un Cours donné d’un Module donné
    public void modifierCours(@RequestBody Cours cours, @PathVariable Integer moduleId,
                              @PathVariable Integer id) {
        cours.setModule(new Module(moduleId,"",""));
        coursService.modifierCours(cours);
    }
    @DeleteMapping("/modules/{moduleId}/cours/{id}")
    //pour supprimer un Cours donné d’un Module donné
    public void supprimerCours(@PathVariable Integer id) {
        coursService.supprimerCours(id);
    }

}
