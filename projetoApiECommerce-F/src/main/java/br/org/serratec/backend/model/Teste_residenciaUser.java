package br.org.serratec.backend.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
public class Teste_residenciaUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long id;
	

	@NotBlank(message = "O nome não pode ser nulo!")
	@Size (max = 20, message = "O tamanho do campo nome_usuario não pode ser superior a 20 caracteres!")
	@Column(length = 20, nullable = false)
	private String login ;

	
	@NotBlank(message = "A senha não pode ser nula!")
	@Size (max = 255, message = "O tamanho do campo senha não pode ser superior a 255 caracteres!")
	@Column(length = 255, nullable = false)
	private String password;
	
	@Future(message = "Data Inválida!")
	@Column(name = "data_nasc")
	private LocalDate last_login_date;
	
	@Column(name = "image_url" )
	private String uri;

	public Teste_residenciaUser() {
		super();
	}

	public Teste_residenciaUser(Long id,
			@NotBlank(message = "O nome não pode ser nulo!") @Size(max = 20, message = "O tamanho do campo nome_usuario não pode ser superior a 20 caracteres!") String login,
			@NotBlank(message = "A senha não pode ser nula!") @Size(max = 255, message = "O tamanho do campo senha não pode ser superior a 255 caracteres!") String password,
			@Future(message = "Data Inválida!") LocalDate last_login_date, String uri) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.last_login_date = last_login_date;
		this.uri = uri;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getLast_login_date() {
		return last_login_date;
	}

	public void setLast_login_date(LocalDate last_login_date) {
		this.last_login_date = last_login_date;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
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
		Teste_residenciaUser other = (Teste_residenciaUser) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
