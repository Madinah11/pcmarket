package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Character;

@RepositoryRestResource(path = "character" )
public interface CharacterRepository extends JpaRepository<Character,Integer> {
}
