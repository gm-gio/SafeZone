package com.myproject.safezone.entity;

import jakarta.persistence.*;
import jakarta.websocket.OnError;
import lombok.*;
import org.hibernate.Hibernate;


import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "groups", schema = "safe_zone")
@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "group_description")
    private String groupDescription;


    @ManyToMany(mappedBy = "groups")
    @ToString.Exclude
    private Set<User> users;

    @ManyToMany
    @ToString.Exclude
    @JoinTable(
            name = "group_notification",
            schema = "safe_zone",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "notification_id")
    )
    private Set<Notification> notifications;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Group group = (Group) o;

        return groupId != null && groupId.equals(group.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId);
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
            if (!user.getGroups().contains(this)) {
                user.getGroups().add(this);
            }
        }
    }

    public void removeUser(User user) {
        users.remove(user);
        user.getGroups().remove(this);
    }
}
