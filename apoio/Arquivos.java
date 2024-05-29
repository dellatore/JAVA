package apoio;

import java.io.*;

public class Arquivos {

    public static void main(String[] args) throws IOException {


        //ESCRITA DE ARQUIVOS
        OutputStream os = new FileOutputStream("C:\\Users\\gabriel.dellatore\\java.io\\arquivo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter escritor = new BufferedWriter(osw);
        escritor.write("o buffer escreveu aqui!");
        escritor.close();


        //LEITURA DE ARQUIVOS

        InputStream is = new FileInputStream("C:\\Users\\gabriel.dellatore\\java.io\\arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader leitor = new BufferedReader(isr);
        String conteudo = leitor.readLine();

        while (conteudo != null){
            System.out.println(conteudo);
            conteudo = leitor.readLine();
        }
        leitor.close();

        //Criando buffer leitor e escritor de maneira direta com Composição
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\gabriel.dellatore\\java.io\\arquivo.txt")));
        BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\gabriel.dellatore\\java.io\\arquivo.txt")));
        try {

            bfw.write("buffer escreveu utilizando composição");

            String msgdireta = bfr.readLine();
            while (msgdireta != null) {
                System.out.println(msgdireta);
                msgdireta = bfr.readLine();
            }

        }catch (Exception e){
            System.out.println("algum erro foi lançado");
        }finally {
            bfr.close();
            bfw.close();
        }

        //criando o objeto pasta que trará nossa pasta principal
        String caminhoPasta = "C:\\Users\\gabriel.dellatore\\java.io";
        File pasta = new File(caminhoPasta);

        //Criando arquivos e pastas
        boolean criandoArquivo = new File(caminhoPasta + "\\novoArquivo").createNewFile();
        boolean criandoPasta = new File(caminhoPasta + "\\pastaCriada").mkdir();
        if (criandoArquivo) {
            System.out.println("arquivo criado com sucesso!");
        }
        if (criandoPasta) {
            System.out.println("pasta criada com sucesso!");
        }

        //MANIPULANDO DIRETÓRIOS

        //retornando o diretorio das pastas internas
        System.out.println("\npastas: \n");
        File [] pastas = pasta.listFiles(File::isDirectory );
        for(File past : pastas){
            System.out.println(past);
        }

        //retornando o diretorio dos arquivos internos
        System.out.println("\narquivos: \n");
        File [] arquivos = pasta.listFiles(File::isFile);
        for (File arquivo : arquivos){
            System.out.println(arquivo);
        }

        //DELETANDO ARQUIVOS E PASTAS
        File deletandoArquivo = new File("C:\\Users\\gabriel.dellatore\\java.io\\novoArquivo");
        deletandoArquivo.delete();

        File deletandoPasta = new File("C:\\Users\\gabriel.dellatore\\java.io\\pastaCriada");
        deletandoPasta.delete();

    }

}

