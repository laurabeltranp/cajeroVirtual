package backend.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cuentas")
public class Cuenta {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idCuenta;

	    private String numeroCuenta;
	    private Double saldo = 0.0;

	    @ManyToOne
	    @JoinColumn(name = "usuario_id")
	    private Usuario usuario;
	    
	    @CreatedDate
	    private LocalDateTime fechaCreacion;

}
