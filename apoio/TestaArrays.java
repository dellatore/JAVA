package apoio;
import apoio.herança_e_polimorfismo.*;

public class TestaArrays {
    public static void main(String[] args) {

        Conta c1 = new Conta("gabriel");
        Conta c2 = new ContaCorrente("thiago",2,"bb");
        Conta c3 = new Conta("kauan");
        Conta c4 = new ContaPoupança("rafael",3,"bradesco",1000);
        Conta c5 = new Conta("pedro");

        Gerente gerente = new Gerente("gabriel",20,3000,3);
        Funcionario func = new Funcionario("thiago",26,1600);

        c1.depositar(gerente.getSalario());
        c2.depositar(func.getSalario());

        //Array
        /*
        apoio.Conta[] contas = new apoio.Conta[10];
        contas[0] = c1;
        contas[1] = c2;
        contas[2] = c3;
        contas[3] = c4;
        contas[4] = c5;

        System.out.println(contas[0].getNome());
        System.out.println(contas[1].getNome());
        System.out.println(contas[2].getNome());
        System.out.println(contas[3].getNome());
        System.out.println(contas[4].getNome());
        */

        //ArrayList -> vantagem : pesquisa dos elementos mais rapida
        /*
        List<apoio.Conta> contasArrayList = new ArrayList<apoio.Conta>();

        System.out.println("sem render: " + c2.getSaldo());
        c2.rendimento();
        System.out.println("rendendo:" + c2.getSaldo());

        contasArrayList.add(c1);
        contasArrayList.add(c2);
        contasArrayList.add(c3);
        contasArrayList.add(c4);
        contasArrayList.add(c5);

        //Collections.sort(contasArrayList) -> nao compila pois o Collections nao tem parametros de comparação
        //erro logico


        System.out.println("posicao 0 antes do .shuffle: " + contasArrayList.get(0).getNome());
        Collections.shuffle(contasArrayList); //embaralha as posiçoes do array
        System.out.println("posicao 0 pos .shuffle: " + contasArrayList.get(0).getNome());
        */

        //Linkedlist -> vantagem: permite a rapida inserção e remoção de elementos

        //HashSet -> vantagem : nao permite inserção de elementos iguais / desvantagem : os elementos sao inseridos aleatoriamente
        //LinkedHashSet -> permite a ordem de acordo com a inserção

        /*
        Set<String> set = new HashSet<>();
        Set<String> linkset = new LinkedHashSet<>();

        set.add("gabriel");
        set.add("gleicy");
        set.add("murilo");
        set.add("evandro");
        set.add("rodrigo");
        set.add("gabriel"); //nao entra no hashset devido a ja existir essa mesma String

        linkset.add("gabriel");
        linkset.add("gleicy");
        linkset.add("murilo");
        linkset.add("evandro");
        linkset.add("rodrigo");


        System.out.println(set);
        System.out.println(linkset);

         */

        //Iterator -> vantagem : possibilita a melhor passagem entre os itens de uma List

        /*
        Set<String> linkset = new LinkedHashSet<>();
        linkset.add("gabriel");
        linkset.add("gleicy");
        linkset.add("murilo");
        linkset.add("evandro");
        linkset.add("rodrigo");
        Iterator<String> it = linkset.iterator();

        while (it.hasNext()){ //hasNext() retorna true caso a List ainda possua elementos
            System.out.println(it.next()); //.next() usca o proximo elemento da List
        }
         */

        //HashMap -> permite associar valores a chaves
        //put -> adiciona
        //replace -> substitui
        //remove -> remove
        /*
        Map<apoio.Funcionario,apoio.Conta> map = new HashMap<>();
        map.put(gerente,c1);
        map.put(func,c2);
        System.out.println(map.get(gerente).getNome() + " " + map.get(gerente).getSaldo());
        System.out.println(map.values()); //retorna uma Collection com todos os valores
        System.out.println(map.keySet()); //retorna um Set com todas as chaves
         */


    }
}
