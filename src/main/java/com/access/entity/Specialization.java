package com.access.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="specialization_tab")
public class Specialization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="spec_id_col")
	private Long Id;
	
	@Column(name="spec_code_col")
	private String specCode;
	
	@Column(name="spec_name_col")
	private String specName;
	
	@Column(name="spec_note_col")
	private String specNote;

}
