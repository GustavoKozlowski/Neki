package br.org.serratec.backend.model;


import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "produto")
public class Teste_residenciaUser_skill {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_produto")
	private Long id;
	
	@Column(name = "codigo_produto")
	private Long user_id;
	
	@Column (name = "descricao", length = 100, nullable = false)
	private String 	skill_id;
	
    @Column
	private String 	knowledge_level;

    @Column (name = "nome", length = 30, nullable = false)
	private Date created_at  ;
	
    @Column 
	private Date updated_at;

	public Teste_residenciaUser_skill() {
		super();
	}

	public Teste_residenciaUser_skill(Long id, Long user_id, String skill_id, String knowledge_level, Date created_at,
			Date updated_at) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.skill_id = skill_id;
		this.knowledge_level = knowledge_level;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(String skill_id) {
		this.skill_id = skill_id;
	}

	public String getKnowledge_level() {
		return knowledge_level;
	}

	public void setKnowledge_level(String knowledge_level) {
		this.knowledge_level = knowledge_level;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teste_residenciaUser_skill other = (Teste_residenciaUser_skill) obj;
		return Objects.equals(id, other.id);
	}

  }