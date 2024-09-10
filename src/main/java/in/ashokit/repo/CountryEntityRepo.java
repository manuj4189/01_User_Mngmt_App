package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entities.CountryEntity;
@Repository
public interface CountryEntityRepo extends JpaRepository<CountryEntity, Integer> {

}
