package primus.Main;

import java.util.Scanner;
import primus.loja.LojaI;
import primus.mochila.Mochila;
import primus.personagem.Personagem;
import primus.inimigo.Inimigo;
import primus.loja.LojaA;
import primus.loja.LojaE;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Scanner criado para ler o que o usuário digitar.
        Scanner sc = new Scanner(System.in);

        //Objeto personagem chamado 'p'.
        Personagem p = new Personagem();

        //Objeto Mochila chamado 'bag'.
        Mochila bag = new Mochila();

        //Objeto LojaI chamado 'shopI'.
        LojaI shopI = new LojaI();

        //Objeto LojaE chamado 'shopE'.
        LojaE shopE = new LojaE();

        //Objeto LojaA chamado 'shopA'.
        LojaA shopA = new LojaA();

        //Espada chamada 'Espada de Madeira'.
        shopA.espada[0] = "Espada de Madeira";
        shopA.espadaMudarAtaque[0] = 10;
        shopA.precoEspada[0] = 10;

        //Espada chamada 'Espada de Bronze'.
        shopA.espada[1] = "Espada de Bronze";
        shopA.espadaMudarAtaque[1] = 30;
        shopA.precoEspada[1] = 20;

        //Espada chamada 'Espada de Ferro'.
        shopA.espada[2] = "Espada de Ferro";
        shopA.espadaMudarAtaque[2] = 50;
        shopA.precoEspada[2] = 40;

        //Espada chamada 'Espada de Prata'.
        shopA.espada[3] = "Espada de Prata";
        shopA.espadaMudarAtaque[3] = 80;
        shopA.precoEspada[3] = 70;

        //Espada chamada 'Espada de ouro'.
        shopA.espada[4] = "Espada de Ouro";
        shopA.espadaMudarAtaque[4] = 100;
        shopA.precoEspada[4] = 90;

        //Espada chamada 'Espada de Platina'.
        shopA.espada[5] = "Espada de Platina";
        shopA.espadaMudarAtaque[5] = 150;
        shopA.precoEspada[5] = 120;

        //Espada chamada 'Espada de Diamante'.
        shopA.espada[6] = "Espada de Diamante";
        shopA.espadaMudarAtaque[6] = 180;
        shopA.precoEspada[6] = 180;

        //Espada chamada 'Espada Lendária'.
        shopA.espada[7] = "Espada Lendária";
        shopA.espadaMudarAtaque[7] = 250;
        shopA.precoEspada[7] = 200;

        //Espada grande chamada 'Espada Grande de Madeira'.
        shopA.espadaG[0] = "Espada Grande de Madeira";
        shopA.espadaGMudarAtaque[0] = 10;
        shopA.precoEspadaG[0] = 10;

        //Espada grande chamada 'Espada Grande de Bronze'.
        shopA.espadaG[1] = "Espada Grande de Bronze";
        shopA.espadaGMudarAtaque[1] = 20;
        shopA.precoEspadaG[1] = 40;

        //Espada grande chamada 'Espada Grande de Ferro'.
        shopA.espadaG[2] = "Espada Grande de Ferro";
        shopA.espadaGMudarAtaque[2] = 40;
        shopA.precoEspadaG[0] = 60;

        //Espada grande chamada 'Espada Grande de Prata'.
        shopA.espadaG[3] = "Espada Grande de Prata";
        shopA.espadaGMudarAtaque[3] = 70;
        shopA.precoEspadaG[0] = 90;

        //Espada grande chamada 'Espada Grande de Ouro'.
        shopA.espadaG[4] = "Espada Grande de Ouro";
        shopA.espadaGMudarAtaque[4] = 90;
        shopA.precoEspadaG[0] = 120;

        //Espada grande chamada 'Espada Grande de Platina'.
        shopA.espadaG[5] = "Espada Grande de Platina";
        shopA.espadaGMudarAtaque[5] = 140;
        shopA.precoEspadaG[0] = 150;

        //Espada grande chamada 'Espada Grande de Diamante'.
        shopA.espadaG[6] = "Espada Grande de Diamante";
        shopA.espadaGMudarAtaque[6] = 170;
        shopA.precoEspadaG[0] = 200;

        //Espada grande chamada 'Espada Grande Lendária'.
        shopA.espadaG[7] = "Espada  Grande Lendária";
        shopA.espadaGMudarAtaque[7] = 240;
        shopA.precoEspadaG[0] = 250;

        //Cajado chamado 'Cajado de Madeira'.
        shopA.cajado[0] = "Cajado de Madeira";
        shopA.cajadoMudarAtaque[0] = 10;
        shopA.precoCajado[0] = 10;

        //Cajado chamado 'Cajado de Bronze'.
        shopA.cajado[1] = "Cajado de Bronze";
        shopA.cajadoMudarAtaque[1] = 20;
        shopA.precoCajado[1] = 20;

        //Cajado chamado 'Cajado de Ferro'.
        shopA.cajado[2] = "Cajado de Ferro";
        shopA.cajadoMudarAtaque[2] = 30;
        shopA.precoCajado[2] = 30;

        //Cajado chamado 'Cajado de Prata'.
        shopA.cajado[3] = "Cajado de Prata";
        shopA.cajadoMudarAtaque[3] = 60;
        shopA.precoCajado[3] = 50;

        //Cajado chamado 'Cajado de Ouro'.
        shopA.cajado[4] = "Cajado de Ouro";
        shopA.cajadoMudarAtaque[4] = 80;
        shopA.precoCajado[4] = 70;

        //Cajado chamado 'Cajado de Platina'.
        shopA.cajado[5] = "Cajado de Platina";
        shopA.cajadoMudarAtaque[5] = 130;
        shopA.precoCajado[5] = 100;

        //Cajado chamado 'Cajado de Diamante'.
        shopA.cajado[6] = "Cajado de Diamante";
        shopA.cajadoMudarAtaque[6] = 160;
        shopA.precoCajado[6] = 150;

        //Cajado chamado 'Cajado Lendário'.
        shopA.cajado[7] = "Cajado Lendário";
        shopA.cajadoMudarAtaque[7] = 230;
        shopA.precoCajado[7] = 180;

        //Katana chamada 'Katana de Madeira'.
        shopA.katana[0] = "Katana de Madeira";
        shopA.katanaMudarAtaque[0] = 10;
        shopA.precoCajado[0] = 10;

        //Katana chamada 'Katana de Bronze'.
        shopA.katana[1] = "Katana de Bronze";
        shopA.katanaMudarAtaque[1] = 30;
        shopA.precoCajado[1] = 30;

        //Katana chamada 'Katana de Ferro'.
        shopA.katana[2] = "Katana de Ferro";
        shopA.katanaMudarAtaque[2] = 50;
        shopA.precoCajado[2] = 40;

        //Katana chamada 'Katana de Prata'.
        shopA.katana[3] = "Katana de Prata";
        shopA.katanaMudarAtaque[3] = 80;
        shopA.precoCajado[3] = 70;

        //Katana chamada 'Katana de Ouro'.
        shopA.katana[4] = "Katana de Ouro";
        shopA.katanaMudarAtaque[4] = 100;
        shopA.precoCajado[4] = 90;

        //Katana chamada 'Katana de Platina'.
        shopA.katana[5] = "Katana de Platina";
        shopA.katanaMudarAtaque[5] = 150;
        shopA.precoCajado[5] = 140;

        //Katana chamada 'Katana de Diamante'.
        shopA.katana[6] = "Katana de Diamante";
        shopA.katanaMudarAtaque[6] = 180;
        shopA.precoCajado[6] = 170;

        //Katana chamada 'Katana Lendária'.
        shopA.katana[7] = "Katana Lendária";
        shopA.katanaMudarAtaque[7] = 250;
        shopA.precoCajado[7] = 220;

        //Capacete chamado 'Capacete de Couro'.
        shopE.head[0] = "Capacete de Couro";
        shopE.precoH[0] = 20;
        shopE.equipHDefesa[0] = 10;
        shopE.equipHAgilidade[0] = 0;

        //Capacete chamado 'Capacete de Bronze'.
        shopE.head[1] = "Capacete de Bronze";
        shopE.precoH[1] = 40;
        shopE.equipHDefesa[1] = 20;
        shopE.equipHAgilidade[1] = 0;

        //Capacete chamado 'Capacete de Ferro'.
        shopE.head[2] = "Capacete de Ferro";
        shopE.precoH[2] = 60;
        shopE.equipHDefesa[2] = 40;
        shopE.equipHAgilidade[2] = 5;

        //Capacete chamado 'Capacete de Prata'.
        shopE.head[3] = "Capacete de Prata";
        shopE.precoH[3] = 80;
        shopE.equipHDefesa[3] = 70;
        shopE.equipHAgilidade[3] = 5;

        //Capacete chamado 'Capacete de Ouro'.
        shopE.head[4] = "Capacete de Ouro";
        shopE.precoH[4] = 100;
        shopE.equipHDefesa[4] = 80;
        shopE.equipHAgilidade[4] = 0;

        //Capacete chamado 'Capacete de Platina'.
        shopE.head[5] = "Capacete de Platina";
        shopE.precoH[5] = 150;
        shopE.equipHDefesa[5] = 100;
        shopE.equipHAgilidade[5] = 5;

        //Capacete chamado 'Capacete de Diamante'.
        shopE.head[6] = "Capacete de Diamante";
        shopE.precoH[6] = 180;
        shopE.equipHDefesa[6] = 150;
        shopE.equipHAgilidade[6] = 10;

        //Capacete chamado 'Capacete Lendário'.
        shopE.head[7] = "Capacete Lendário";
        shopE.precoH[7] = 250;
        shopE.equipHDefesa[7] = 200;
        shopE.equipHAgilidade[7] = 0;

        //Peitoral chamado 'Peitoral de Couro'.
        shopE.body[0] = "Peitoral de Couro";
        shopE.precoB[0] = 40;
        shopE.equipBDefesa[0] = 30;
        shopE.equipBAgilidade[0] = 0;

        //Peitoral chamado 'Peitoral de Bronze'.
        shopE.body[1] = "Peitoral de Bronze";
        shopE.precoB[1] = 60;
        shopE.equipBDefesa[1] = 40;
        shopE.equipBAgilidade[1] = 5;

        //Peitoral chamado 'Peitoral de Ferro'.
        shopE.body[2] = "Peitoral de Ferro";
        shopE.precoB[2] = 80;
        shopE.equipBDefesa[2] = 60;
        shopE.equipBAgilidade[2] = 10;

        //Peitoral chamado 'Peitoral de Prata'.
        shopE.body[3] = "Peitoral de Prata";
        shopE.precoB[3] = 100;
        shopE.equipBDefesa[3] = 90;
        shopE.equipBAgilidade[3] = 10;

        //Peitoral chamado 'Peitoral de Ouro'.
        shopE.body[4] = "Peitoral de Ouro";
        shopE.precoB[4] = 120;
        shopE.equipBDefesa[4] = 100;
        shopE.equipBAgilidade[4] = 5;

        //Peitoral chamado 'Peitoral de Platina'.
        shopE.body[5] = "Peitoral de Platina";
        shopE.precoB[5] = 170;
        shopE.equipBDefesa[5] = 120;
        shopE.equipBAgilidade[5] = 10;

        //Peitoral chamado 'Peitoral de Diamante'.
        shopE.body[6] = "Peitoral de Diamante";
        shopE.precoB[6] = 200;
        shopE.equipBDefesa[6] = 170;
        shopE.equipBAgilidade[6] = 20;

        //Peitoral chamado 'Peitoral Lendário'.
        shopE.body[7] = "Peitoral Lendário";
        shopE.precoB[7] = 270;
        shopE.equipBDefesa[7] = 220;
        shopE.equipBAgilidade[7] = 0;

        //Claça chamada 'Calça de Couro'.
        shopE.leggs[0] = "Calça de Couro";
        shopE.precoL[0] = 30;
        shopE.equipLDefesa[0] = 20;
        shopE.equipLAgilidade[0] = 0;

        //Claça chamada 'Calça de Bronze'.
        shopE.leggs[1] = "Calça de Bronze";
        shopE.precoL[1] = 50;
        shopE.equipLDefesa[1] = 30;
        shopE.equipLAgilidade[1] = 10;

        //Claça chamada 'Calça de Ferro'.
        shopE.leggs[2] = "Calça de Ferro";
        shopE.precoL[2] = 70;
        shopE.equipLDefesa[2] = 50;
        shopE.equipLAgilidade[2] = 10;

        //Claça chamada 'Calça de Prata'.
        shopE.leggs[3] = "Calça de Prata";
        shopE.precoL[3] = 90;
        shopE.equipLDefesa[3] = 80;
        shopE.equipLAgilidade[3] = 10;

        //Claça chamada 'Calça de Ouro'.
        shopE.leggs[4] = "Calça de Ouro";
        shopE.precoL[4] = 110;
        shopE.equipLDefesa[4] = 90;
        shopE.equipLAgilidade[4] = 10;

        //Claça chamada 'Calça de Platina'.
        shopE.leggs[5] = "Calça de Platina";
        shopE.precoL[5] = 160;
        shopE.equipLDefesa[5] = 110;
        shopE.equipLAgilidade[5] = 10;

        //Claça chamada 'Calça de Diamante'.
        shopE.leggs[6] = "Calça de Diamante";
        shopE.precoL[6] = 190;
        shopE.equipLDefesa[6] = 160;
        shopE.equipLAgilidade[6] = 20;

        //Claça chamada 'Calça Lendária'.
        shopE.leggs[7] = "Calça Lendária";
        shopE.precoL[7] = 260;
        shopE.equipLDefesa[7] = 210;
        shopE.equipLAgilidade[7] = 0;

        //Botas chamadas 'Botas de Couro'.
        shopE.boots[0] = "Botas de Couro";
        shopE.precoBt[0] = 10;
        shopE.equipBtDefesa[0] = 5;
        shopE.equipBtAgilidade[0] = 0;

        //Botas chamadas 'Botas de Bronze'.
        shopE.boots[1] = "Botas de Bronze";
        shopE.precoBt[1] = 30;
        shopE.equipBtDefesa[1] = 15;
        shopE.equipBtAgilidade[1] = 5;

        //Botas chamadas 'Botas de Ferro'.
        shopE.boots[2] = "Botas de Ferro";
        shopE.precoBt[2] = 50;
        shopE.equipBtDefesa[2] = 30;
        shopE.equipBtAgilidade[2] = 10;

        //Botas chamadas 'Botas de Prata'.
        shopE.boots[3] = "Botas de Prata";
        shopE.precoBt[3] = 70;
        shopE.equipBtDefesa[3] = 50;
        shopE.equipBtAgilidade[3] = 10;

        //Botas chamadas 'Botas de Ouro'.
        shopE.boots[4] = "Botas de Ouro";
        shopE.precoBt[4] = 90;
        shopE.equipBtDefesa[4] = 70;
        shopE.equipBtAgilidade[4] = 5;

        //Botas chamadas 'Botas de Platina'.
        shopE.boots[5] = "Botas de Platina";
        shopE.precoBt[5] = 140;
        shopE.equipBtDefesa[5] = 85;
        shopE.equipBtAgilidade[5] = 10;

        //Botas chamadas 'Botas de Diamante'.
        shopE.boots[6] = "Botas de Diamante";
        shopE.precoBt[6] = 170;
        shopE.equipBtDefesa[6] = 140;
        shopE.equipBtAgilidade[6] = 20;

        //Botas chamadas 'Botas Lendárias'.
        shopE.boots[7] = "Botas Lendárias";
        shopE.precoBt[7] = 240;
        shopE.equipBtDefesa[7] = 180;
        shopE.equipBtAgilidade[7] = 0;

        //Item chamado 'Poção de Vida'.
        shopI.item[0] = "Poção de Vida";
        shopI.preco[0] = 20;
        shopI.mudarVida[0] = 10;
        shopI.mudarMana[0] = 0;

        //Item chamado 'Poção de Mana'.
        shopI.item[1] = "Poção de Mana";
        shopI.preco[1] = 20;
        shopI.mudarVida[1] = 0;
        shopI.mudarMana[1] = 10;

        //Item chamado 'Poção Mestre'.
        shopI.item[2] = "Poção Mestre";
        shopI.preco[2] = 40;
        shopI.mudarVida[2] = 10;
        shopI.mudarMana[2] = 10;

        //Item chamado 'Poção Plus Ultra'.
        shopI.item[3] = "Poção Plus Ultra";
        shopI.preco[3] = 70;
        shopI.mudarVida[3] = 20;
        shopI.mudarMana[3] = 20;

        //Objeto Inimigo chamado 'inimigo'.
        Inimigo inimigo = new Inimigo();
        //Objeto Inimigo chamado 'slime'.
        Inimigo slime = new Inimigo("Slime", 5, 2, 5, 0, 5, 10, "Gosma Gosmenta", 20);
        //Objeto Inimigo chamado 'goblin'.
        Inimigo goblin = new Inimigo("Goblin", 10, 5, 10, 5, 15, 20, "Orelha de Goblin", 40);
        //Objeto Inimigo chamado 'ogro'.
        Inimigo ogro = new Inimigo("Ogro", 20, 10, 25, 30, 5, 40, "Pele de Ogro", 80);
        //Objeto Inimigo chamado 'minotauro'.
        Inimigo minotauro = new Inimigo("Minotauro", 20, 15, 35, 20, 15, 80, "Chifre de Minotauro", 100);
        //Objeto Inimigo chamado 'demônio'.
        Inimigo demonio = new Inimigo("Demônio", 50, 40, 35, 40, 50, 160, "Calda de Demônio", 180);
        //Objeto Inimigo chamado 'dragão'.
        Inimigo dragao = new Inimigo("Dragão", 70, 40, 50, 55, 25, 320, "Escama de Dragão", 300);

        //Repetição para a criação do personagem.
        //Enquanto o personagem não possuir uma classe, será nescessária a criação do personagem.
        while (p.getClasse() == null) {
            p.criarPersonagem();
        }

        //Variável criada para auxiliar na repetição do código
        boolean pão = true;

        //Repetição criada para repetir o código sempre que a variável pão continuar verdadeira.
        while (pão == true) {
            System.out.println("---------------------------------------------------");
            System.out.println("PRIMUS");
            System.out.println("---------------------------------------------------");
            System.out.println("Digite 1 para exibir os status do personagem;");
            System.out.println("Digite 2 para exibir o equipamento equipado;");
            System.out.println("Digite 3 para abrir a mochila de itens;");
            System.out.println("Digite 4 para abrir a mochila de equipamentos;");
            System.out.println("Digite 5 para abrir a mochila de itens de monstros;");
            System.out.println("Digite 6 para abrir a mochila de armas;");
            System.out.println("Digite 7 para treinar;");
            System.out.println("Digite 8 para tentar subir de nível;");
            System.out.println("Digite 9 para abrir a loja de itens;");
            System.out.println("Digite 10 para abrir a loja de equipamentos;");
            System.out.println("Digite 11 para abrir a loja de armas;");
            System.out.println("Digite 12 para batalhar contra um inimigo;");
            System.out.println("Ou digite 0 para fechar o jogo.");
            System.out.println("");
            int escolha = sc.nextInt();
            if (escolha == 1) {
                p.exibirStatus();
            } else if (escolha == 2) {
                p.exibirEquip();
            } else if (escolha == 3) {
                bag.abrirMochilaI(p);
            } else if (escolha == 4) {
                bag.abrirMochilaE(p);
            } else if (escolha == 5) {
                bag.abrirMochilaM();
            } else if (escolha == 6) {
                bag.abritMochilaA(p);
            } else if (escolha == 7) {
                p.treinar();
            } else if (escolha == 8) {
                p.subirNivel();
            } else if (escolha == 9) {
                shopI.abrirLojaI(p, bag);
            } else if (escolha == 10) {
                shopE.abrirLojaE(p, bag);
            } else if (escolha == 11) {
                shopA.abrirLojaA(bag, p);
            } else if (escolha == 12) {
                inimigo.batalhar(bag, p, slime, goblin, ogro, minotauro, demonio, dragao);
            } else if (escolha == 0) {
                pão = false;
            }
        }
    }
}
