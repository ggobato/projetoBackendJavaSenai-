package org.example.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class FormaPagamento  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FPG_ID")
    private Long fpgId;

    @NotBlank(message = "Forma de pagamento é obrigatório")
    @Size(max = 100, message = "")
    @Column(name = "FPG_DESCRICAO")
    private String fpgDescricao;

    public FormaPagamento() {
    }

    public FormaPagamento(Long fpgId, String fpgDescricao) {
        this.fpgId = fpgId;
        this.fpgDescricao = fpgDescricao;
    }

    public Long getFpgId() {
        return fpgId;
    }

    public void setFpgId(Long fpgId) {
        this.fpgId = fpgId;
    }

    public String getFpgDescricao() {
        return fpgDescricao;
    }

    public void setFpgDescricao(String fpgDescricao) {
        this.fpgDescricao = fpgDescricao;
    }

}