package co.istad.souheng.elearning.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private LocalDateTime createdAt;
    private Boolean isDeleted;
    private String text;

    @ManyToOne
    private Course course;
    @ManyToOne
    private Video video;
}
