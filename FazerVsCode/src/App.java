public class App {

    public static void main(String[] args) {
        Operadores op = new Operadores();

        System.out.println("O Resultado é: " + op.adicao(10, 5));
        System.out.println("O Resultado é: " + op.subtracao(10, 5));
        System.out.println("O Resultado é: " + op.multiplicacao(10, 5));
        System.out.println("O Resultado é: " + op.divisao(10, 5));

        System.out.println("___________age é os logico___________");
        boolean treco = true;
        boolean treco2 = false;
        System.out.println("do and: " + op.operadordosEx(treco, treco2));
        System.out.println("do or:  " + op.operadordosOr(treco, treco2));
        System.out.println("do not: " + op.operadoresdeNot(treco));

        System.out.println("--------------- agr os comparativo-----------------");
        System.out.println("igualdade: " + op.duploIgual(10,5));
        System.out.println("diferente: " + op.diferente(10,5));
        System.out.println("maio: " + op.maio(10,5));
        System.out.println("meno: " + op.meno(10,5));
        System.out.println("meno ou = " + op.menoouIgual(10,5));
        System.out.println("maio ou =: " + op.maioouIgual(10,5));
        //é a quarta vez q mudo e coloco coisa 
        System.out.println("-------------------------------aaaaaatribuiçãaaaaaaao----------------------------");
        System.out.println("soma: " + op.atribuicaoSoma(10,5));
        System.out.println("menos: " + op.atribuicaoMeno(10,5));
        System.out.println("dividi: " + op.atribuicaoDivida(10,5));
        System.out.println("multi: " + op.atribuicaoMultipli(10,5));
    }
}
