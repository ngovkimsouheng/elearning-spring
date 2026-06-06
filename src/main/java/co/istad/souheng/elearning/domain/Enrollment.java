package co.istad.souheng.elearning.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "enrollemnts")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enrollmentId;
    private LocalDateTime enrollmentAt;
    private LocalDateTime paymentAt;
    private String paymentMehtod;
    private Boolean paymentStatus;

    @ManyToOne
    private Course course;
    @ManyToOne
    private StudentProfile studentProfile;

}
