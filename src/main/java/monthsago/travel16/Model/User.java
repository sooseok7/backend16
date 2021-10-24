package monthsago.travel16.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "pw")
    private String pw;

    @Column(name = "role")
    private String role;
}
