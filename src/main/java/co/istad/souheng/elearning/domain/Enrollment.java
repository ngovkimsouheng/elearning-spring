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
    private Integer enrollmentId;
    private LocalDateTime enrollmentAt;
    private LocalDateTime paymentAt;
    private String paymentMehtod;
    private Boolean paymentStatus;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentProfile studentProfile;

}
