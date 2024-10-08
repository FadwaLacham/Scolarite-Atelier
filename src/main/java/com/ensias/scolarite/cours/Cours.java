package com.ensias.scolarite.cours;
import com.ensias.scolarite.modules.Module;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cours{
        @Id
        private int id;
        private String nom;
        private String description;

        @ManyToOne
        @JoinColumn(name = "module_id")
        private Module module;
}
