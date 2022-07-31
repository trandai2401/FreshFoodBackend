package com.freshfood.hola.model;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public class EntityAbstract {
//	 @Id
//	 @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
//	 @GenericGenerator(name = "native", strategy = "native")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;

	@CreatedBy
	@Column(name = "created_by", nullable = false, updatable = false)
	public String createdBy;
}
