package uz.jurayev.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jurayev.academy.domain.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}