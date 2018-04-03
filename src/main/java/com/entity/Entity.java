package com.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Date;
import java.sql.Types;
import java.util.UUID;

import static java.sql.Types.TIMESTAMP;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Entity<U> {

    @Id
    @GeneratedValue( generator="uuid" )
    @GenericGenerator(
            name="uuid",
            strategy="org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name="uuid_gen_strategy_class",
                            value="org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    public UUID uuid;

    @CreatedBy
    protected U createdBy;
    @CreatedDate
    protected Date creationDate;
    @LastModifiedBy
    protected U lastModifiedBy;
    @LastModifiedDate
    protected Date lastModifiedDate;
}