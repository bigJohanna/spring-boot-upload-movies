package se.bigjohanna.uploadmovies.uploadmovies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.bigjohanna.uploadmovies.uploadmovies.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
