package uz.jurayev.tutor.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import uz.jurayev.tutor.domain.Authority;

/**
 * Spring Data R2DBC repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends R2dbcRepository<Authority, String> {}
