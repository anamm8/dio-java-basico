package ExercicioSmartTv;

public class SmartTv {
    /*
    Exemplo de classe para representar uma Smart TV onde:
    - Tem as seguintes características: ligada (boolean), canal (int) e volume (int).
    - A TV pode ligar e desligar (mudando assim o estado ligada)
    - A TV aumenta e diminui o volume (sempre em +1 ou -1)
    - Pode mudar de canal de 1 em 1 ou pode mudar para um canal específico (indicando o número do canal)
    */
    //Atributos a nível do método, são acessíveis em todo o método
    int canal = 1;
    int volume = 25;
    boolean ligada = false;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal++;
    }

    public void mudarCanal(int novoCanal) {
        //novoCanal é declarado dentro deste método, sendo acessível apenas aqui dentro
        canal= novoCanal;
    }


}
