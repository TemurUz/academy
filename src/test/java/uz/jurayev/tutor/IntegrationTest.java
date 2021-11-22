package uz.jurayev.tutor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import uz.jurayev.tutor.ReactiveSqlTestContainerExtension;
import uz.jurayev.tutor.TutorAcademyApp;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = TutorAcademyApp.class)
@ExtendWith(ReactiveSqlTestContainerExtension.class)
public @interface IntegrationTest {
}
