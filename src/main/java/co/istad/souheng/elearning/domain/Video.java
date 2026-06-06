package co.istad.souheng.elearning.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String duration;
    private Boolean isDeleted;
    private Boolean isPublished;
    private String slug;
    private String thumbnail;
    private String title;
    private String youtubeId ;

    @ManyToOne
    private Course course;
    @OneToMany(mappedBy = "video")
    private List<Comment> comments;
}
