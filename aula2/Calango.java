public class Calango{
    int bucho;
    int maxBucho;
    int nPatas;
    int rabo;
    int vida;
    boolean alive;

    Calango(int maxBucho){
        this.bucho = maxBucho / 2;
        this.maxBucho = maxBucho;
        this.nPatas = 4;
        this.rabo = 1;
        this.vida = 4;
        this.alive = true;
    }

    void comer(int qtd){
        bucho += qtd;
        if(bucho < maxBucho){
            System.out.println("Yummy yum! Que delicia!");
        }
        else
        if(bucho == maxBucho){
            System.out.println("Estou satisfeito.");
        }
        else{
            System.out.println("Tô cheio.");
        }
    }

    void andar(){
        if(nPatas < 2){
            System.out.println("Estou imposibilitado de tal tarefa.");
            return;
        }
        if(bucho > 0){
            bucho -= 1;
            System.out.println("Que passeio agradavel.");
            return;
        }
        System.out.println("Estou muito cansado.");
    }

    void acidentar(){
        if(nPatas > 0){
            nPatas -= 1;
            System.out.println("Ounch! Perdi uma pata!");
        }
        else
        if(nPatas == 0 && rabo == 1){
            rabo -= 1;
            System.out.println("Agora perdi o rabo! Tô só o cotoco!");
        }
        else{
            alive = false;
            System.out.println("R.I.P.");
        }
    }

    void regenerar(){
        if(nPatas == 4 && rabo == 1){
            System.out.println("Estou perfeito!");
        }
        else
        if(rabo < 1){
            if(bucho > 6){
                rabo += 1;
                bucho -= 6;
                System.out.println("Opa, recuperei meu rabo! Virei cobra!");
            }
            else{
                System.out.println("Não tenho energia para me recuperar.");
            } 
        }
        else{
            if(bucho > 4){
                nPatas += 1;
                bucho -= 5;
                System.out.println("Opa, recuperei uma pata!");
            }
            else{
                System.out.println("Não tenho energia para me recuperar.");
            }
        }

    }

    public String toString(){
        return "Bucho: " + bucho + "/" + maxBucho + " Patas: " + nPatas + " Rabo: " + rabo + " Alive: " + alive;
    }

    public static void main(String[] args){
        Calango deadlango = new Calango(20);

        System.out.println(deadlango);

        deadlango.comer(1);
        deadlango.comer(1);

        System.out.println(deadlango);

        deadlango.andar();
        deadlango.andar();
        deadlango.andar();
        deadlango.andar();

        System.out.println(deadlango);

        deadlango.comer(1);
        deadlango.comer(1);
        deadlango.comer(1);
        deadlango.comer(1);

        System.out.println(deadlango);

        deadlango.acidentar();
        deadlango.acidentar();
        deadlango.acidentar();

        System.out.println(deadlango);

        deadlango.andar();

        System.out.println(deadlango);

        deadlango.acidentar();
        deadlango.acidentar();
        //deadlango.acidentar();

        System.out.println(deadlango);

        deadlango.regenerar();
        deadlango.regenerar();

        System.out.println(deadlango);

        deadlango.regenerar();

        System.out.println(deadlango);

        deadlango.comer(1);
        deadlango.comer(1);
        deadlango.comer(1);
        deadlango.comer(1);
        deadlango.comer(1);
        deadlango.comer(1);
        deadlango.comer(1);

        System.out.println(deadlango);

        deadlango.regenerar();
        deadlango.regenerar();
        deadlango.regenerar();

        System.out.println(deadlango);

        deadlango.comer(8);

        System.out.println(deadlango);

        deadlango.regenerar();
        deadlango.regenerar();

        System.out.println(deadlango);

    }


}