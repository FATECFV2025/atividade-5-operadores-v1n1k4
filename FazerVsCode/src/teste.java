public class Operadores {

  
    private float v1;
    private float v2;


    public float getV2() {
        return v2;
    }

    public void setV2(float v2) {
        this.v2 = v2;
    }

    public float getV1() {
        return v1;
    }

    public void setV1(float v1) {
        this.v1 = v1;
    }

    public float adicao(float v1, float v2) {
        return v1 + v2;
    }

    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2) {
        return v1 * v2;
    }

    public float divisao(float v1, float v2) {
        //so pra fala q sabo mas se for float n precisa ne? eu acho,talvez eu n sabo tanto
        if(v2 == 0){
            return 0;
        }

        return v1 / v2;
    }
    // vou tenta fazer o desafio aq
    //op logicos
    public  boolean operadordosEx(boolean treco, boolean treco2){
        return treco && treco2;
    }
    public boolean operadordosOr(boolean treco, boolean treco2){
        return treco || treco2;
    }
    public boolean operadoresdeNot(boolean treco){
        return !treco;
    }
    //tenta o dos comparativo
    public boolean duploIgual(float v1, float v2){
        return v1 == v2;//igualdade 

    }
    public boolean diferente(float v1, float v2){
        return v1 != v2;

    }
    public boolean maio(float v1, float v2){
        return v1 > v2;

    }
    public boolean meno(float v1, float v2){
        return v1 < v2;

    }
    public boolean maioouIgual(float v1, float v2){
        return v1 >= v2;

    }
    public boolean menoouIgual(float v1, float v2){
        return v1 <= v2;

    }
    //atreibuição
    public  float atribuicaoSoma(float v1, float v2){
        return v1 += v2;

    }
    public float atribuicaoMeno(float v1, float v2){
        return v1 -= v2;

    }
    public float atribuicaoMultipli(float v1, float v2){
        return v1 *= v2;

    }
    public float atribuicaoDivida(float v1, float v2){
        return v1 /= v2;
    }

    


}
