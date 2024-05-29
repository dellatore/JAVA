package apoio;

    /*
        uma exceção criada deve extender de Exception
        o metodo que chamara a exceção deve indicar com o throws que podera lançar essa exceção
        a exceção deve ser lançada com o throws em alguma parte do programa
        utilizar o try catch, passando no catch como parametro a Exceçaõ
    */

public class MinhaExcecao extends Exception{
    private String msgErro;

    public MinhaExcecao(String msgErro) {
        this.msgErro = msgErro;
    }

    public String getMsgErro() {
        return msgErro;
    }
}
