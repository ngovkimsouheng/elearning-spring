package co.istad.souheng.elearning.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rating;
    private LocalDateTime createdAt;
    private String description;
    private Float discountPercent;
    private Boolean isDeleted;
    private Boolean isPublished;
    private String keyword;
    private String level;
    private BigDecimal price;
    private String slug;
    private Float starRating;
    private String thumbnail;
    private String title;
    private Float totalHours;
    private LocalDateTime updatedAt;

    @ManyToOne
    private Category category;
    @ManyToOne
    private InstructorProfile instructorProfile;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "course")
    private List<Video> videos;

}
