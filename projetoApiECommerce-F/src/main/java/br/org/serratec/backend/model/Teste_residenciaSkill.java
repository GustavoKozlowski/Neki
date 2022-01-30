package br.org.serratec.backend.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Teste_residenciaSkill 
{
    @Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_foto")
	private Long id;

	private String version;
	
	@NotBlank(message = "O nome não pode ser nulo!")
	@Size (max = 20, message = "O tamanho do campo nome_usuario não pode ser superior a 20 caracteres!")
	@Column(length = 20, nullable = false)
	private String name;

	@Column (name = "descricao", length = 255, nullable = false)
	private String description ;

	public Teste_residenciaSkill() {
		super();
	}

	public Teste_residenciaSkill(Long id, String version,
			@NotBlank(message = "O nome não pode ser nulo!") @Size(max = 20, message = "O tamanho do campo nome_usuario não pode ser superior a 20 caracteres!") String name,
			String description) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		Teste_residenciaSkill other = (Teste_residenciaSkill) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

