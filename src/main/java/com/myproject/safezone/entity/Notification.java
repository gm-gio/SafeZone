package com.myproject.safezone.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;


import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notifications", schema = "safe_zone")
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private Long notificationId;

    @Column(name = "title")
    private String title;

    @Column(name = "message")
    private String message;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "notification_type", insertable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    private NotificationType type;

    @Column(name = "status")
    private String status;

    @ManyToMany(mappedBy = "notifications")
    @ToString.Exclude
    private Set<User> users;

    @ManyToMany(mappedBy = "notifications")
    @ToString.Exclude
    private Set<Group> groups;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Notification notification = (Notification) o;

        return notificationId != null && notificationId.equals(notification.notificationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId);
    }
}
