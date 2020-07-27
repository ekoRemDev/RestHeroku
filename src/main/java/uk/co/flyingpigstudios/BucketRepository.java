package uk.co.flyingpigstudios;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BucketRepository extends JpaRepository<BucketList,Long> {

            Optional<BucketList> findById(Long id);

}
