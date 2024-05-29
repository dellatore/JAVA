package testejpa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer id;

    //@Column(name = "nome completo") //muda o nome da coluna no banco de dados
    private String nome;


    private String email;

    public Pessoa(){

    }

    public Pessoa(Integer id, String nome, String email) {
        setEmail(email);
        setId(id);
        setNome(nome);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

     */

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
