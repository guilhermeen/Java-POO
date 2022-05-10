package projeto001;
public class Estudante extends Pessoa {
    private String login;
    private int totAssistido;

    public Estudante(String nome, int idade, String sexo, String login){
        super(nome,idade,sexo);
        this.login=login;
        this.totAssistindo=0;
    }

    public String getLogin(){
        return login;
    }    

    public void setLogin() {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistido;
    }

    public void  setTotAssitindo() {
        this.totAssistindo = totAssistido;
    }

    @Override
    public String toString(){
        return "Estudante{"+super.toString(+"\nlogin"+login+'}')
    }

}
