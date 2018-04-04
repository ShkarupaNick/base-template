package com.entity;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;
import java.util.UUID;

@javax.persistence.Entity
@Table(name = "roles")
public class Role extends com.entity.Entity<User>{
    public enum ERole{ADMIN,USER}

    @Enumerated(EnumType.STRING)
    private ERole name;

    @ManyToMany(mappedBy = "roleList")
    private Set<User> users;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "uuid=" + uuid +
                ", name='" + name +
                '}';
    }
}