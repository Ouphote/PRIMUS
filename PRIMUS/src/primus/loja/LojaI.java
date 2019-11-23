package primus.loja;

import java.util.Scanner;
import primus.mochila.Mochila;
import primus.personagem.Personagem;

//Classe para os atributos da loja de itens e o método para abrir a loja de itens.
public class LojaI {

    //Scanner criado para ler o que o usuário digitar.
    Scanner sc = new Scanner(System.in);

    //Vetor usado para armazenar o nome dos itens da loja.
    public String item[] = new String[10];
    //Vetor usado para armazenar o preço dos itens da loja.
    public int preco[] = new int[10];
    //Vetor usado para armazenar o aumento da vida do personagem conforme o item usado.
    public int mudarVida[] = new int[10];
    //Vetor usado para armazenar o aumento da mana do personagem conforme o item usado.
    public int mudarMana[] = new int[10];

    //Construtor usado para criar uma loja de itens vazia.
    public LojaI() {
    }

    //Método usado para abrir a loja de itens; e nela, comprar itens ou vender itens comuns ou itens de monstros.
    //Se o personagem tiver dinheiro suficiente para comprar o item escolhido, conseguirá comprar;
    //se não, será exibida uma mensagem dizendo que o personagem não possui dinheiro suficiente.
    //Se o usuário escolher vender um item, o código perguntará se ele quer vender um item comum(comprado própria loja),
    //ou um item de monstro(adiquirido em batalhas). A única forma primária de conseguir dinheiro é por esses itens de monstros.
    public void abrirLojaI(Personagem personagem, Mochila mochila) {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Seja bem-vindo à loja de itens!");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Você quer comprar ou vender itens?");
        System.out.println("Digite 1 para comprar , 2 para vender ou 3 para sair da loja.");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("ITENS");
            System.out.println("");
            System.out.println("01-" + item[0] + " $ " + preco[0]);
            System.out.println("02-" + item[1] + " $ " + preco[1]);
            System.out.println("03-" + item[2] + " $ " + preco[2]);
            System.out.println("04-" + item[3] + " $ " + preco[3]);
            System.out.println("05-" + item[4] + " $ " + preco[4]);
            System.out.println("06-" + item[5] + " $ " + preco[5]);
            System.out.println("07-" + item[6] + " $ " + preco[6]);
            System.out.println("08-" + item[7] + " $ " + preco[7]);
            System.out.println("09-" + item[8] + " $ " + preco[8]);
            System.out.println("10-" + item[9] + " $ " + preco[9]);
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Qual o número do item que você deseja comprar?");
            System.out.println("Ou digite 0 para sair da loja.");
            int escolha2 = sc.nextInt();
            if (escolha2 == 1) {
                if (item[0] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[0] + "?");
                    System.out.println("Isso custrá $ " + preco[0] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[0]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[0]);
                                mochila.mudarVida[0] = mudarVida[0];
                                mochila.mudarMana[0] = mudarMana[0];
                                mochila.precoRevenda[0] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[0]);
                                mochila.mudarVida[1] = mudarVida[0];
                                mochila.mudarMana[1] = mudarMana[0];
                                mochila.precoRevenda[1] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[0]);
                                mochila.mudarVida[2] = mudarVida[0];
                                mochila.mudarMana[2] = mudarMana[0];
                                mochila.precoRevenda[2] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[0]);
                                mochila.mudarVida[3] = mudarVida[0];
                                mochila.mudarMana[3] = mudarMana[0];
                                mochila.precoRevenda[3] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[0]);
                                mochila.mudarVida[4] = mudarVida[0];
                                mochila.mudarMana[4] = mudarMana[0];
                                mochila.precoRevenda[4] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[0]);
                                mochila.mudarVida[5] = mudarVida[0];
                                mochila.mudarMana[5] = mudarMana[0];
                                mochila.precoRevenda[5] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[0]);
                                mochila.mudarVida[6] = mudarVida[0];
                                mochila.mudarMana[6] = mudarMana[0];
                                mochila.precoRevenda[6] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[0]);
                                mochila.mudarVida[7] = mudarVida[0];
                                mochila.mudarMana[7] = mudarMana[0];
                                mochila.precoRevenda[7] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[0]);
                                mochila.mudarVida[8] = mudarVida[0];
                                mochila.mudarMana[8] = mudarMana[0];
                                mochila.precoRevenda[8] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[0]);
                                mochila.mudarVida[9] = mudarVida[0];
                                mochila.mudarMana[9] = mudarMana[0];
                                mochila.precoRevenda[9] = preco[0] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[0] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[0]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 2) {
                if (item[1] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[1] + "?");
                    System.out.println("Isso custrá $ " + preco[1] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[1]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[1]);
                                mochila.mudarVida[0] = mudarVida[1];
                                mochila.mudarMana[0] = mudarMana[1];
                                mochila.precoRevenda[0] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[1]);
                                mochila.mudarVida[1] = mudarVida[1];
                                mochila.mudarMana[1] = mudarMana[1];
                                mochila.precoRevenda[1] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[1]);
                                mochila.mudarVida[2] = mudarVida[1];
                                mochila.mudarMana[2] = mudarMana[1];
                                mochila.precoRevenda[2] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[1]);
                                mochila.mudarVida[3] = mudarVida[1];
                                mochila.mudarMana[3] = mudarMana[1];
                                mochila.precoRevenda[3] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[1]);
                                mochila.mudarVida[4] = mudarVida[1];
                                mochila.mudarMana[4] = mudarMana[1];
                                mochila.precoRevenda[4] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[1]);
                                mochila.mudarVida[5] = mudarVida[1];
                                mochila.mudarMana[5] = mudarMana[1];
                                mochila.precoRevenda[5] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[1]);
                                mochila.mudarVida[6] = mudarVida[1];
                                mochila.mudarMana[6] = mudarMana[1];
                                mochila.precoRevenda[6] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[1]);
                                mochila.mudarVida[7] = mudarVida[1];
                                mochila.mudarMana[7] = mudarMana[1];
                                mochila.precoRevenda[7] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[1]);
                                mochila.mudarVida[8] = mudarVida[1];
                                mochila.mudarMana[8] = mudarMana[1];
                                mochila.precoRevenda[8] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[1]);
                                mochila.mudarVida[9] = mudarVida[1];
                                mochila.mudarMana[9] = mudarMana[1];
                                mochila.precoRevenda[9] = preco[1] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[1] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[1]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 3) {
                if (item[2] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[2] + "?");
                    System.out.println("Isso custrá $ " + preco[2] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[2]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[2]);
                                mochila.mudarVida[0] = mudarVida[2];
                                mochila.mudarMana[0] = mudarMana[2];
                                mochila.precoRevenda[0] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[2]);
                                mochila.mudarVida[1] = mudarVida[2];
                                mochila.mudarMana[1] = mudarMana[2];
                                mochila.precoRevenda[1] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[2]);
                                mochila.mudarVida[2] = mudarVida[2];
                                mochila.mudarMana[2] = mudarMana[2];
                                mochila.precoRevenda[2] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[2]);
                                mochila.mudarVida[3] = mudarVida[2];
                                mochila.mudarMana[3] = mudarMana[2];
                                mochila.precoRevenda[3] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[2]);
                                mochila.mudarVida[4] = mudarVida[2];
                                mochila.mudarMana[4] = mudarMana[2];
                                mochila.precoRevenda[4] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[2]);
                                mochila.mudarVida[5] = mudarVida[2];
                                mochila.mudarMana[5] = mudarMana[2];
                                mochila.precoRevenda[5] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[2]);
                                mochila.mudarVida[6] = mudarVida[2];
                                mochila.mudarMana[6] = mudarMana[2];
                                mochila.precoRevenda[6] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[2]);
                                mochila.mudarVida[7] = mudarVida[2];
                                mochila.mudarMana[7] = mudarMana[2];
                                mochila.precoRevenda[7] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[2]);
                                mochila.mudarVida[8] = mudarVida[2];
                                mochila.mudarMana[8] = mudarMana[2];
                                mochila.precoRevenda[8] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[2]);
                                mochila.mudarVida[9] = mudarVida[2];
                                mochila.mudarMana[9] = mudarMana[2];
                                mochila.precoRevenda[9] = preco[2] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[2] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[2]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 4) {
                if (item[3] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[3] + "?");
                    System.out.println("Isso custrá $ " + preco[3] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[3]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[3]);
                                mochila.mudarVida[0] = mudarVida[3];
                                mochila.mudarMana[0] = mudarMana[3];
                                mochila.precoRevenda[0] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[3]);
                                mochila.mudarVida[1] = mudarVida[3];
                                mochila.mudarMana[1] = mudarMana[3];
                                mochila.precoRevenda[1] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[3]);
                                mochila.mudarVida[2] = mudarVida[3];
                                mochila.mudarMana[2] = mudarMana[3];
                                mochila.precoRevenda[2] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[3]);
                                mochila.mudarVida[3] = mudarVida[3];
                                mochila.mudarMana[3] = mudarMana[3];
                                mochila.precoRevenda[3] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[3]);
                                mochila.mudarVida[4] = mudarVida[3];
                                mochila.mudarMana[4] = mudarMana[3];
                                mochila.precoRevenda[4] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[3]);
                                mochila.mudarVida[5] = mudarVida[3];
                                mochila.mudarMana[5] = mudarMana[3];
                                mochila.precoRevenda[5] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[3]);
                                mochila.mudarVida[6] = mudarVida[3];
                                mochila.mudarMana[6] = mudarMana[3];
                                mochila.precoRevenda[6] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[3]);
                                mochila.mudarVida[7] = mudarVida[3];
                                mochila.mudarMana[7] = mudarMana[3];
                                mochila.precoRevenda[7] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[3]);
                                mochila.mudarVida[8] = mudarVida[3];
                                mochila.mudarMana[8] = mudarMana[3];
                                mochila.precoRevenda[8] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[3]);
                                mochila.mudarVida[9] = mudarVida[3];
                                mochila.mudarMana[9] = mudarMana[3];
                                mochila.precoRevenda[9] = preco[3] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[3] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[3]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 5) {
                if (item[4] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[4] + "?");
                    System.out.println("Isso custrá $ " + preco[4] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[4]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[4]);
                                mochila.mudarVida[0] = mudarVida[4];
                                mochila.mudarMana[0] = mudarMana[4];
                                mochila.precoRevenda[0] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[4]);
                                mochila.mudarVida[1] = mudarVida[4];
                                mochila.mudarMana[1] = mudarMana[4];
                                mochila.precoRevenda[1] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[4]);
                                mochila.mudarVida[2] = mudarVida[4];
                                mochila.mudarMana[2] = mudarMana[4];
                                mochila.precoRevenda[2] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[4]);
                                mochila.mudarVida[3] = mudarVida[4];
                                mochila.mudarMana[3] = mudarMana[4];
                                mochila.precoRevenda[3] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[4]);
                                mochila.mudarVida[4] = mudarVida[4];
                                mochila.mudarMana[4] = mudarMana[4];
                                mochila.precoRevenda[4] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[4]);
                                mochila.mudarVida[5] = mudarVida[4];
                                mochila.mudarMana[5] = mudarMana[4];
                                mochila.precoRevenda[5] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[4]);
                                mochila.mudarVida[6] = mudarVida[4];
                                mochila.mudarMana[6] = mudarMana[4];
                                mochila.precoRevenda[6] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[4]);
                                mochila.mudarVida[7] = mudarVida[4];
                                mochila.mudarMana[7] = mudarMana[4];
                                mochila.precoRevenda[7] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[4]);
                                mochila.mudarVida[8] = mudarVida[4];
                                mochila.mudarMana[8] = mudarMana[4];
                                mochila.precoRevenda[8] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[4]);
                                mochila.mudarVida[9] = mudarVida[4];
                                mochila.mudarMana[9] = mudarMana[4];
                                mochila.precoRevenda[9] = preco[4] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[4] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[4]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 6) {
                if (item[5] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[5] + "?");
                    System.out.println("Isso custrá $ " + preco[5] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[5]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[5]);
                                mochila.mudarVida[0] = mudarVida[5];
                                mochila.mudarMana[0] = mudarMana[5];
                                mochila.precoRevenda[0] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[5]);
                                mochila.mudarVida[1] = mudarVida[5];
                                mochila.mudarMana[1] = mudarMana[5];
                                mochila.precoRevenda[1] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[5]);
                                mochila.mudarVida[2] = mudarVida[5];
                                mochila.mudarMana[2] = mudarMana[5];
                                mochila.precoRevenda[2] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[5]);
                                mochila.mudarVida[3] = mudarVida[5];
                                mochila.mudarMana[3] = mudarMana[5];
                                mochila.precoRevenda[3] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[5]);
                                mochila.mudarVida[4] = mudarVida[5];
                                mochila.mudarMana[4] = mudarMana[5];
                                mochila.precoRevenda[4] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[5]);
                                mochila.mudarVida[5] = mudarVida[5];
                                mochila.mudarMana[5] = mudarMana[5];
                                mochila.precoRevenda[5] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[5]);
                                mochila.mudarVida[6] = mudarVida[5];
                                mochila.mudarMana[6] = mudarMana[5];
                                mochila.precoRevenda[6] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[5]);
                                mochila.mudarVida[7] = mudarVida[5];
                                mochila.mudarMana[7] = mudarMana[5];
                                mochila.precoRevenda[7] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[5]);
                                mochila.mudarVida[8] = mudarVida[5];
                                mochila.mudarMana[8] = mudarMana[5];
                                mochila.precoRevenda[8] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[5]);
                                mochila.mudarVida[9] = mudarVida[5];
                                mochila.mudarMana[9] = mudarMana[5];
                                mochila.precoRevenda[9] = preco[5] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[5] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[5]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 7) {
                if (item[6] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[6] + "?");
                    System.out.println("Isso custrá $ " + preco[6] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[6]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[6]);
                                mochila.mudarVida[0] = mudarVida[6];
                                mochila.mudarMana[0] = mudarMana[6];
                                mochila.precoRevenda[0] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[6]);
                                mochila.mudarVida[1] = mudarVida[6];
                                mochila.mudarMana[1] = mudarMana[6];
                                mochila.precoRevenda[1] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[6]);
                                mochila.mudarVida[2] = mudarVida[6];
                                mochila.mudarMana[2] = mudarMana[6];
                                mochila.precoRevenda[2] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[6]);
                                mochila.mudarVida[3] = mudarVida[6];
                                mochila.mudarMana[3] = mudarMana[6];
                                mochila.precoRevenda[3] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[6]);
                                mochila.mudarVida[4] = mudarVida[6];
                                mochila.mudarMana[4] = mudarMana[6];
                                mochila.precoRevenda[4] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[6]);
                                mochila.mudarVida[5] = mudarVida[6];
                                mochila.mudarMana[5] = mudarMana[6];
                                mochila.precoRevenda[5] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[6]);
                                mochila.mudarVida[6] = mudarVida[6];
                                mochila.mudarMana[6] = mudarMana[6];
                                mochila.precoRevenda[6] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[6]);
                                mochila.mudarVida[7] = mudarVida[6];
                                mochila.mudarMana[7] = mudarMana[6];
                                mochila.precoRevenda[7] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[6]);
                                mochila.mudarVida[8] = mudarVida[6];
                                mochila.mudarMana[8] = mudarMana[6];
                                mochila.precoRevenda[8] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[6]);
                                mochila.mudarVida[9] = mudarVida[6];
                                mochila.mudarMana[9] = mudarMana[6];
                                mochila.precoRevenda[9] = preco[6] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[6] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[6]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 8) {
                if (item[7] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[7] + "?");
                    System.out.println("Isso custrá $ " + preco[7] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[7]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[7]);
                                mochila.mudarVida[0] = mudarVida[7];
                                mochila.mudarMana[0] = mudarMana[7];
                                mochila.precoRevenda[0] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[7]);
                                mochila.mudarVida[1] = mudarVida[7];
                                mochila.mudarMana[1] = mudarMana[7];
                                mochila.precoRevenda[1] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[7]);
                                mochila.mudarVida[2] = mudarVida[7];
                                mochila.mudarMana[2] = mudarMana[7];
                                mochila.precoRevenda[2] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[7]);
                                mochila.mudarVida[3] = mudarVida[7];
                                mochila.mudarMana[3] = mudarMana[7];
                                mochila.precoRevenda[3] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[7]);
                                mochila.mudarVida[4] = mudarVida[7];
                                mochila.mudarMana[4] = mudarMana[7];
                                mochila.precoRevenda[4] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[7]);
                                mochila.mudarVida[5] = mudarVida[7];
                                mochila.mudarMana[5] = mudarMana[7];
                                mochila.precoRevenda[5] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[7]);
                                mochila.mudarVida[6] = mudarVida[7];
                                mochila.mudarMana[6] = mudarMana[7];
                                mochila.precoRevenda[6] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[7]);
                                mochila.mudarVida[7] = mudarVida[7];
                                mochila.mudarMana[7] = mudarMana[7];
                                mochila.precoRevenda[7] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[7]);
                                mochila.mudarVida[8] = mudarVida[7];
                                mochila.mudarMana[8] = mudarMana[7];
                                mochila.precoRevenda[8] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[7]);
                                mochila.mudarVida[9] = mudarVida[7];
                                mochila.mudarMana[9] = mudarMana[7];
                                mochila.precoRevenda[9] = preco[7] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[7] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[7]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 9) {
                if (item[8] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[8] + "?");
                    System.out.println("Isso custrá $ " + preco[8] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[8]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[8]);
                                mochila.mudarVida[0] = mudarVida[8];
                                mochila.mudarMana[0] = mudarMana[8];
                                mochila.precoRevenda[0] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[8]);
                                mochila.mudarVida[1] = mudarVida[8];
                                mochila.mudarMana[1] = mudarMana[8];
                                mochila.precoRevenda[1] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[8]);
                                mochila.mudarVida[2] = mudarVida[8];
                                mochila.mudarMana[2] = mudarMana[8];
                                mochila.precoRevenda[2] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[8]);
                                mochila.mudarVida[3] = mudarVida[8];
                                mochila.mudarMana[3] = mudarMana[8];
                                mochila.precoRevenda[3] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[8]);
                                mochila.mudarVida[4] = mudarVida[8];
                                mochila.mudarMana[4] = mudarMana[8];
                                mochila.precoRevenda[4] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[8]);
                                mochila.mudarVida[5] = mudarVida[8];
                                mochila.mudarMana[5] = mudarMana[8];
                                mochila.precoRevenda[5] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[8]);
                                mochila.mudarVida[6] = mudarVida[8];
                                mochila.mudarMana[6] = mudarMana[8];
                                mochila.precoRevenda[6] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[8]);
                                mochila.mudarVida[7] = mudarVida[8];
                                mochila.mudarMana[7] = mudarMana[8];
                                mochila.precoRevenda[7] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[8]);
                                mochila.mudarVida[8] = mudarVida[8];
                                mochila.mudarMana[8] = mudarMana[8];
                                mochila.precoRevenda[8] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[8]);
                                mochila.mudarVida[9] = mudarVida[8];
                                mochila.mudarMana[9] = mudarMana[8];
                                mochila.precoRevenda[9] = preco[8] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[8] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[8]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 10) {
                if (item[9] == null) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da loja está vazio!");
                } else {
                    System.out.println("Você quer comprar um(a) " + item[9] + "?");
                    System.out.println("Isso custrá $ " + preco[9] + ".");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar.");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        if (personagem.getDinheiro() >= preco[9]) {
                            if (mochila.item[0] == null) {
                                mochila.item[0] = (item[9]);
                                mochila.mudarVida[0] = mudarVida[9];
                                mochila.mudarMana[0] = mudarMana[9];
                                mochila.precoRevenda[0] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else if (mochila.item[1] == null) {
                                mochila.item[1] = (item[9]);
                                mochila.mudarVida[1] = mudarVida[9];
                                mochila.mudarMana[1] = mudarMana[9];
                                mochila.precoRevenda[1] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else if (mochila.item[2] == null) {
                                mochila.item[2] = (item[9]);
                                mochila.mudarVida[2] = mudarVida[9];
                                mochila.mudarMana[2] = mudarMana[9];
                                mochila.precoRevenda[2] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else if (mochila.item[3] == null) {
                                mochila.item[3] = (item[9]);
                                mochila.mudarVida[3] = mudarVida[9];
                                mochila.mudarMana[3] = mudarMana[9];
                                mochila.precoRevenda[3] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else if (mochila.item[4] == null) {
                                mochila.item[4] = (item[9]);
                                mochila.mudarVida[4] = mudarVida[9];
                                mochila.mudarMana[4] = mudarMana[9];
                                mochila.precoRevenda[4] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else if (mochila.item[5] == null) {
                                mochila.item[5] = (item[9]);
                                mochila.mudarVida[5] = mudarVida[9];
                                mochila.mudarMana[5] = mudarMana[9];
                                mochila.precoRevenda[5] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else if (mochila.item[6] == null) {
                                mochila.item[6] = (item[9]);
                                mochila.mudarVida[6] = mudarVida[9];
                                mochila.mudarMana[6] = mudarMana[9];
                                mochila.precoRevenda[6] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else if (mochila.item[7] == null) {
                                mochila.item[7] = (item[9]);
                                mochila.mudarVida[7] = mudarVida[9];
                                mochila.mudarMana[7] = mudarMana[9];
                                mochila.precoRevenda[7] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else if (mochila.item[8] == null) {
                                mochila.item[8] = (item[9]);
                                mochila.mudarVida[8] = mudarVida[9];
                                mochila.mudarMana[8] = mudarMana[9];
                                mochila.precoRevenda[8] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else if (mochila.item[9] == null) {
                                mochila.item[9] = (item[9]);
                                mochila.mudarVida[9] = mudarVida[9];
                                mochila.mudarMana[9] = mudarMana[9];
                                mochila.precoRevenda[9] = preco[9] / 2;
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM(A) " + item[9] + "!");
                                personagem.setDinheiro(personagem.getDinheiro() - preco[9]);
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                        } else {
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Você não tem dinheiro suficiente para comprar esse item!");
                        }
                    } else if (escolha3 == 2) {
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println("Ok! Volte sempre!");
                    }
                }
            } else if (escolha2 == 0) {
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("Tudo bem! Volte sempre!");
            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (escolha == 2) {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Você quer vender itens comuns ou itens de monstros?");
            System.out.println("Digite 1 para vender itens comuns ou 2 para itens de monstros:");
            int escolha1 = sc.nextInt();
            if (escolha1 == 1) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("VENDER-ITENS");
                System.out.println("");
                System.out.println("01-" + mochila.item[0] + " $" + mochila.precoRevenda[0]);
                System.out.println("02-" + mochila.item[1] + " $" + mochila.precoRevenda[1]);
                System.out.println("03-" + mochila.item[2] + " $" + mochila.precoRevenda[2]);
                System.out.println("04-" + mochila.item[3] + " $" + mochila.precoRevenda[3]);
                System.out.println("05-" + mochila.item[4] + " $" + mochila.precoRevenda[4]);
                System.out.println("06-" + mochila.item[5] + " $" + mochila.precoRevenda[5]);
                System.out.println("07-" + mochila.item[6] + " $" + mochila.precoRevenda[6]);
                System.out.println("08-" + mochila.item[7] + " $" + mochila.precoRevenda[7]);
                System.out.println("09-" + mochila.item[8] + " $" + mochila.precoRevenda[8]);
                System.out.println("10-" + mochila.item[9] + " $" + mochila.precoRevenda[9]);
                System.out.println("---------------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("Qual o número do item que você quer vender?");
                System.out.println("Digite 0 para sair da loja.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (mochila.item[0] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[0] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[0]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[0]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[0] + "POR $" + mochila.precoRevenda[0]);
                            mochila.item[0] = (null);
                            mochila.precoRevenda[0] = 0;
                            mochila.mudarVida[0] = 0;
                            mochila.mudarMana[0] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 2) {
                    if (mochila.item[1] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[1] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[1]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[1]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[1] + "POR $" + mochila.precoRevenda[1]);
                            mochila.item[1] = (null);
                            mochila.precoRevenda[1] = 0;
                            mochila.mudarVida[1] = 0;
                            mochila.mudarMana[1] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 3) {
                    if (mochila.item[2] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[2] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[2]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[2]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[2] + "POR $" + mochila.precoRevenda[2]);
                            mochila.item[2] = (null);
                            mochila.precoRevenda[2] = 0;
                            mochila.mudarVida[2] = 0;
                            mochila.mudarMana[2] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 4) {
                    if (mochila.item[3] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[3] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[3]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[3]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[3] + "POR $" + mochila.precoRevenda[3]);
                            mochila.item[3] = (null);
                            mochila.precoRevenda[3] = 0;
                            mochila.mudarVida[3] = 0;
                            mochila.mudarMana[3] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 5) {
                    if (mochila.item[4] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[4] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[4]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[4]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[4] + "POR $" + mochila.precoRevenda[4]);
                            mochila.item[4] = (null);
                            mochila.precoRevenda[4] = 0;
                            mochila.mudarVida[4] = 0;
                            mochila.mudarMana[4] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 6) {
                    if (mochila.item[5] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[6] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[6]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[6]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[6] + "POR $" + mochila.precoRevenda[6]);
                            mochila.item[6] = (null);
                            mochila.precoRevenda[6] = 0;
                            mochila.mudarVida[6] = 0;
                            mochila.mudarMana[6] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 7) {
                    if (mochila.item[6] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[6] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[6]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[6]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[6] + "POR $" + mochila.precoRevenda[6]);
                            mochila.item[6] = (null);
                            mochila.precoRevenda[6] = 0;
                            mochila.mudarVida[6] = 0;
                            mochila.mudarMana[6] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 8) {
                    if (mochila.item[7] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[7] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[7]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[7]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[7] + "POR $" + mochila.precoRevenda[7]);
                            mochila.item[7] = (null);
                            mochila.precoRevenda[7] = 0;
                            mochila.mudarVida[7] = 0;
                            mochila.mudarMana[7] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 9) {
                    if (mochila.item[8] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[8] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[8]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[8]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[8] + "POR $" + mochila.precoRevenda[8]);
                            mochila.item[8] = (null);
                            mochila.precoRevenda[8] = 0;
                            mochila.mudarVida[8] = 0;
                            mochila.mudarMana[8] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 10) {
                    if (mochila.item[9] == null) {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.item[9] + "?");
                        System.out.println("Você poderá vender esse item por $ " + mochila.precoRevenda[9]);
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoRevenda[9]);
                            System.out.println("VOCÊ VENDEU " + mochila.item[9] + "POR $" + mochila.precoRevenda[9]);
                            mochila.item[9] = (null);
                            mochila.precoRevenda[9] = 0;
                            mochila.mudarVida[9] = 0;
                            mochila.mudarMana[9] = 0;
                        } else if (escolha3 == 2) {
                            System.out.println("--------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha1 == 2) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("VENDER-ITENS-DE-MONSTROS");
                System.out.println("");
                System.out.println("01-" + mochila.itemMonstro[0] + " $" + mochila.precoItemMonstro[0]);
                System.out.println("02-" + mochila.itemMonstro[1] + " $" + mochila.precoItemMonstro[1]);
                System.out.println("03-" + mochila.itemMonstro[2] + " $" + mochila.precoItemMonstro[2]);
                System.out.println("04-" + mochila.itemMonstro[3] + " $" + mochila.precoItemMonstro[3]);
                System.out.println("05-" + mochila.itemMonstro[4] + " $" + mochila.precoItemMonstro[4]);
                System.out.println("06-" + mochila.itemMonstro[5] + " $" + mochila.precoItemMonstro[5]);
                System.out.println("07-" + mochila.itemMonstro[6] + " $" + mochila.precoItemMonstro[6]);
                System.out.println("08-" + mochila.itemMonstro[7] + " $" + mochila.precoItemMonstro[7]);
                System.out.println("09-" + mochila.itemMonstro[8] + " $" + mochila.precoItemMonstro[8]);
                System.out.println("10-" + mochila.itemMonstro[9] + " $" + mochila.precoItemMonstro[9]);
                System.out.println("---------------------------------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("Qual o número do item que você quer vender?");
                System.out.println("Digite 0 para fechar a loja.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (mochila.itemMonstro[0] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[0] + " por $" + mochila.precoItemMonstro[0] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[0] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[0]);
                            mochila.itemMonstro[0] = null;
                            mochila.precoItemMonstro[0] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 2) {
                    if (mochila.itemMonstro[1] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[1] + " por $" + mochila.precoItemMonstro[1] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[1] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[1]);
                            mochila.itemMonstro[1] = null;
                            mochila.precoItemMonstro[1] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 3) {
                    if (mochila.itemMonstro[2] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[2] + " por $" + mochila.precoItemMonstro[2] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[2] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[2]);
                            mochila.itemMonstro[2] = null;
                            mochila.precoItemMonstro[2] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 4) {
                    if (mochila.itemMonstro[3] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[3] + " por $" + mochila.precoItemMonstro[3] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[3] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[3]);
                            mochila.itemMonstro[3] = null;
                            mochila.precoItemMonstro[3] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 5) {
                    if (mochila.itemMonstro[4] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[4] + " por $" + mochila.precoItemMonstro[4] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[4] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[4]);
                            mochila.itemMonstro[4] = null;
                            mochila.precoItemMonstro[4] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 6) {
                    if (mochila.itemMonstro[5] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[5] + " por $" + mochila.precoItemMonstro[5] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[5] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[5]);
                            mochila.itemMonstro[5] = null;
                            mochila.precoItemMonstro[5] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 7) {
                    if (mochila.itemMonstro[6] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[6] + " por $" + mochila.precoItemMonstro[6] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[6] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[6]);
                            mochila.itemMonstro[6] = null;
                            mochila.precoItemMonstro[6] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 8) {
                    if (mochila.itemMonstro[7] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[7] + " por $" + mochila.precoItemMonstro[7] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[7] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[7]);
                            mochila.itemMonstro[7] = null;
                            mochila.precoItemMonstro[7] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 9) {
                    if (mochila.itemMonstro[8] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[8] + " por $" + mochila.precoItemMonstro[8] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[8] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[8]);
                            mochila.itemMonstro[8] = null;
                            mochila.precoItemMonstro[8] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 10) {
                    if (mochila.itemMonstro[9] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você realmente quer vender " + mochila.itemMonstro[9] + " por $" + mochila.precoItemMonstro[9] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("VOCÊ VENDEU " + mochila.itemMonstro[9] + "!");
                            personagem.setDinheiro(personagem.getDinheiro() + mochila.precoItemMonstro[9]);
                            mochila.itemMonstro[9] = null;
                            mochila.precoItemMonstro[9] = 0;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (escolha == 3) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Ok! Volte sempre!");
        } else {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
        }

    }

}
