package br.com.ecomerce.bean;

import lombok.Getter;
import lombok.Setter;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.Calendar;

@ManagedBean
@Setter
@Getter
public class CadastroUsuarioBean {

    private String nome;
    private String email;
    private String senha;

    public String cadastrar() throws InterruptedException {
        if(this.getNome() == null || this.getNome().length() <10) {
            this.adicionarMensagem("formulario:nome", FacesMessage.SEVERITY_ERROR,
                    "Nome Incompleto", "Favor informar seu nome completo.");
        }

        if(hojeEhDiaDeDescanso()) {
            this.adicionarMensagem(null, FacesMessage.SEVERITY_WARN,
                    "Hoje é dia de descanso", "você não pode cadastrar usuário!!");
        }

        if(this.getEmail() == null || this.getEmail().length() < 10) {
            this.adicionarMensagem("formulario:email", FacesMessage.SEVERITY_ERROR,
                    "E-mail incompleto", "Favor informar um e-mail válido!");
        }

        FacesContext context = 	FacesContext.getCurrentInstance();
        if(!context.getMessages().hasNext()) {
            this.adicionarMensagem(null, FacesMessage.SEVERITY_INFO, "Usuário cadastrado",
                    "Usuário cadastrado com sucesso!");
            Thread.sleep(2000);
            return "PrimeiraPaginaBackingBeans?face-redirect=true";
        }
        return "";
    }

    private boolean hojeEhDiaDeDescanso() {
        return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }

    public void adicionarMensagem(String clientId, Severity severity, String summary, String detail ) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(severity, summary, detail);

        context.addMessage(clientId, message);
    }
}

