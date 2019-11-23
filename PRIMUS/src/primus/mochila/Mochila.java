package primus.mochila;

import java.util.Scanner;
import primus.personagem.Personagem;

//Classe para os atributos da mochila e métodos como: abrirMochilaE, abrirMochilaI, abrirMochilaM e abrirMochilaA.
public class Mochila {

    //Scanner criado para ler o que o usuário digitar.
    Scanner sc = new Scanner(System.in);

    //Vetor usado para armazenar o nome dos itens da mochila.
    public String item[] = new String[10];
    //Vetor usado para armazenar o aumento da vida do personagem conforme o item usado.
    public int mudarVida[] = new int[10];
    //Vetor usado para armazenar o aumento da mana do personagem conforme o item usado.
    public int mudarMana[] = new int[10];
    //Vetor usado para armazenar o preço de revenda de um item.
    public int precoRevenda[] = new int[10];

    //Vetor usado para armazenar o nome das espadas da mochila.
    public String espada[] = new String[10];
    //Vetor usado para armazenar o aumento do ataque do personagem conforme a espada equipada.
    public int espadaMudarAtaque[] = new int[10];
    //Vetor usado para armazenar o nome das espadas grande da mochila.
    public String espadaG[] = new String[10];
    //Vetor usado para armazenar o aumento do ataque do personagem conforme a espada grande equipada.
    public int espadaGMudarAtaque[] = new int[10];
    //Vetor usado para armazenar o nome dos cajados da mochila.
    public String cajado[] = new String[10];
    //Vetor usado para armazenar o aumento do ataque do personagem conforme o cajado equipado.
    public int cajadoMudarAtaque[] = new int[10];
    //Vetor usado para armazenar o nome das katanas da mochila.
    public String katana[] = new String[10];
    //Vetor usado para armazenar o aumento do ataque do personagem conforme a katana equipada.
    public int katanaMudarAtaque[] = new int[10];

    //Vetor usado para armazenar o nome dos capacetes da mochila.
    public String equipHead[] = new String[10];
    //Vetor usado para armazenar o aumento da defesa do personagem conforme o capacete equipado.
    public int equipHDefesa[] = new int[10];
    //Vetor usado para armazenar a diminuição da agilidade do personagem conforme o capacete equipado.
    public int equipHAgilidade[] = new int[10];

    //Vetor usado para armazenar o nome dos peitorais da mochila.
    public String equipBody[] = new String[10];
    //Vetor usado para armazenar o aumento da defesa do personagem conforme o peitoral equipado.
    public int equipBDefesa[] = new int[10];
    //Vetor usado para armazenar a diminuição da agilidade do personagem conforme o peitoral equipado.
    public int equipBAgilidade[] = new int[10];

    //Vetor usado para armazenar o nome das calças da mochila.
    public String equipLeggs[] = new String[10];
    //Vetor usado para armazenar o aumento da defesa do personagem conforme a calça equipada.
    public int equipLDefesa[] = new int[10];
    //Vetor usado para armazenar a diminuição da agilidade do personagem conforme a calça equipada.
    public int equipLAgilidade[] = new int[10];

    //Vetor usado para armazenar o nome das botas da mochila.
    public String equipBoots[] = new String[10];
    //Vetor usado para armazenar o aumento da defesa do personagem conforme as botas equipadas.
    public int equipBtDefesa[] = new int[10];
    //Vetor usado para armazenar a diminuição da agilidade do personagem conforme as botas equipadas.
    public int equipBtAgilidade[] = new int[10];

    //Vetor usado para armazenar o nome dos itens largados pelos monstros, na mochila.
    public String itemMonstro[] = new String[10];
    //Vetor usado para armazenar o preço dos itens largados pelos monstros.
    public int precoItemMonstro[] = new int[10];

    //Construtor usado para criar uma mochila vazia.
    public Mochila() {
    }

    //Método usado para abrir a mochila de itens; e nela, usar ou jogar fora um item; e aumentar a vida ou mana do personagem conforme o item usado.
    public void abrirMochilaI(Personagem personagem) {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("MOCHILA-ITENS");
        System.out.println("");
        System.out.println("01-" + item[0] + "| VIDA +" + mudarVida[0] + " | MANA +" + mudarMana[0]);
        System.out.println("02-" + item[1] + "| VIDA +" + mudarVida[1] + " | MANA +" + mudarMana[1]);
        System.out.println("03-" + item[2] + "| VIDA +" + mudarVida[2] + " | MANA +" + mudarMana[2]);
        System.out.println("04-" + item[3] + "| VIDA +" + mudarVida[3] + " | MANA +" + mudarMana[3]);
        System.out.println("05-" + item[4] + "| VIDA +" + mudarVida[4] + " | MANA +" + mudarMana[4]);
        System.out.println("06-" + item[5] + "| VIDA +" + mudarVida[5] + " | MANA +" + mudarMana[5]);
        System.out.println("07-" + item[6] + "| VIDA +" + mudarVida[6] + " | MANA +" + mudarMana[6]);
        System.out.println("08-" + item[7] + "| VIDA +" + mudarVida[7] + " | MANA +" + mudarMana[7]);
        System.out.println("09-" + item[8] + "| VIDA +" + mudarVida[8] + " | MANA +" + mudarMana[8]);
        System.out.println("10-" + item[9] + "| VIDA +" + mudarVida[9] + " | MANA +" + mudarMana[9]);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Digite 1 para fechar a mochila, 2 para usar um item ou 3 para largar um item.");
        int escolha = sc.nextInt();
        if (escolha == 1) {

        } else if (escolha == 2) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("Qual o número do item que você quer usar?");
            System.out.println("Digite 0 para fechar a mochila.");
            int escolha2 = sc.nextInt();
            if (escolha2 == 1) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[0] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[0]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[0]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[0] + "!");
                    this.item[0] = null;
                    this.mudarVida[0] = 0;
                    this.mudarMana[0] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 2) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[1] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[1]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[1]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[1] + "!");
                    this.item[1] = null;
                    this.mudarVida[1] = 0;
                    this.mudarMana[1] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 3) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[2] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[2]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[2]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[2] + "!");
                    this.item[2] = null;
                    this.mudarVida[2] = 0;
                    this.mudarMana[2] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 4) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[3] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[3]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[3]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[3] + "!");
                    this.item[3] = null;
                    this.mudarVida[3] = 0;
                    this.mudarMana[3] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 5) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[4] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[4]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[4]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[4] + "!");
                    this.item[4] = null;
                    this.mudarVida[4] = 0;
                    this.mudarMana[4] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 6) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[5] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[5]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[5]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[5] + "!");
                    this.item[5] = null;
                    this.mudarVida[5] = 0;
                    this.mudarMana[5] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 7) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[6] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[6]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[6]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[6] + "!");
                    this.item[6] = null;
                    this.mudarVida[6] = 0;
                    this.mudarMana[6] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 8) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[7] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[7]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[7]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[7] + "!");
                    this.item[7] = null;
                    this.mudarVida[7] = 0;
                    this.mudarMana[7] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 9) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[8] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[8]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[8]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[8] + "!");
                    this.item[8] = null;
                    this.mudarVida[8] = 0;
                    this.mudarMana[8] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 10) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("Você quer usar " + this.item[9] + "?");
                System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    personagem.setVida(personagem.getVida() + this.mudarVida[9]);
                    personagem.setMana(personagem.getMana() + this.mudarMana[9]);
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("VOCÊ USOU " + this.item[9] + "!");
                    this.item[9] = null;
                    this.mudarVida[9] = 0;
                    this.mudarMana[9] = 0;
                } else if (escolha3 == 2) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 0) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (escolha == 3) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("Qual o número do item que você quer largar?");
            int escolha2 = sc.nextInt();
            if (escolha2 == 1) {
                if (item[0] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[0] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[0] + " jogado(a) fora.");
                        item[0] = null;
                        this.mudarVida[0] = 0;
                        this.mudarMana[0] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 2) {
                if (item[1] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[1] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[1] + " jogado(a) fora.");
                        item[1] = null;
                        this.mudarVida[1] = 0;
                        this.mudarMana[1] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 3) {
                if (item[2] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[2] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[2] + " jogado(a) fora.");
                        item[2] = null;
                        this.mudarVida[2] = 0;
                        this.mudarMana[2] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 4) {
                if (item[3] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[3] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[3] + " jogado(a) fora.");
                        item[3] = null;
                        this.mudarVida[3] = 0;
                        this.mudarMana[3] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 5) {
                if (item[4] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[4] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[4] + " jogado(a) fora.");
                        item[4] = null;
                        this.mudarVida[4] = 0;
                        this.mudarMana[4] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 6) {
                if (item[5] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[5] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[5] + " jogado(a) fora.");
                        item[5] = null;
                        this.mudarVida[5] = 0;
                        this.mudarMana[5] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 7) {
                if (item[6] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[6] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[6] + " jogado(a) fora.");
                        item[6] = null;
                        this.mudarVida[6] = 0;
                        this.mudarMana[6] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 8) {
                if (item[7] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[7] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[7] + " jogado(a) fora.");
                        item[7] = null;
                        this.mudarVida[7] = 0;
                        this.mudarMana[7] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 9) {
                if (item[8] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[8] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[8] + " jogado(a) fora.");
                        item[8] = null;
                        this.mudarVida[8] = 0;
                        this.mudarMana[8] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 10) {
                if (item[9] == null) {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila já está vazio!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + item[9] + "?");
                    System.out.println("Você não poderá recuperar esse item!");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println(item[9] + " jogado(a) fora.");
                        item[9] = null;
                        this.mudarVida[9] = 0;
                        this.mudarMana[9] = 0;
                    } else if (escolha3 == 2) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Lembte-se de largar itens que realmente não são importantes!");
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
        }
    }

    //Método usado para abrir a mochila de equipamentos; e nela, equipar um capacete, peitoral, calça ou botas;
    //e aumentar a defesa e diminuir a agilidade do personagem conforme o equipamento equipado.
    public void abrirMochilaE(Personagem personagem) {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("MOCHILA-CAPACETES");
        System.out.println("");
        System.out.println("01-" + equipHead[0] + " | DEFESA +" + this.equipHDefesa[0] + " | AGILIDADE -" + this.equipHAgilidade[0]);
        System.out.println("02-" + equipHead[1] + " | DEFESA +" + this.equipHDefesa[1] + " | AGILIDADE -" + this.equipHAgilidade[1]);
        System.out.println("03-" + equipHead[2] + " | DEFESA +" + this.equipHDefesa[2] + " | AGILIDADE -" + this.equipHAgilidade[2]);
        System.out.println("04-" + equipHead[3] + " | DEFESA +" + this.equipHDefesa[3] + " | AGILIDADE -" + this.equipHAgilidade[3]);
        System.out.println("05-" + equipHead[4] + " | DEFESA +" + this.equipHDefesa[4] + " | AGILIDADE -" + this.equipHAgilidade[4]);
        System.out.println("06-" + equipHead[5] + " | DEFESA +" + this.equipHDefesa[5] + " | AGILIDADE -" + this.equipHAgilidade[5]);
        System.out.println("07-" + equipHead[6] + " | DEFESA +" + this.equipHDefesa[6] + " | AGILIDADE -" + this.equipHAgilidade[6]);
        System.out.println("08-" + equipHead[7] + " | DEFESA +" + this.equipHDefesa[7] + " | AGILIDADE -" + this.equipHAgilidade[7]);
        System.out.println("09-" + equipHead[8] + " | DEFESA +" + this.equipHDefesa[8] + " | AGILIDADE -" + this.equipHAgilidade[8]);
        System.out.println("10-" + equipHead[9] + " | DEFESA +" + this.equipHDefesa[9] + " | AGILIDADE -" + this.equipHAgilidade[9]);
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("MOCHILA-PEITORAIS");
        System.out.println("");
        System.out.println("01-" + equipBody[0] + " | DEFESA +" + this.equipBDefesa[0] + " | AGILIDADE -" + this.equipBAgilidade[0]);
        System.out.println("02-" + equipBody[1] + " | DEFESA +" + this.equipBDefesa[1] + " | AGILIDADE -" + this.equipBAgilidade[1]);
        System.out.println("03-" + equipBody[2] + " | DEFESA +" + this.equipBDefesa[2] + " | AGILIDADE -" + this.equipBAgilidade[2]);
        System.out.println("04-" + equipBody[3] + " | DEFESA +" + this.equipBDefesa[3] + " | AGILIDADE -" + this.equipBAgilidade[3]);
        System.out.println("05-" + equipBody[4] + " | DEFESA +" + this.equipBDefesa[4] + " | AGILIDADE -" + this.equipBAgilidade[4]);
        System.out.println("06-" + equipBody[5] + " | DEFESA +" + this.equipBDefesa[5] + " | AGILIDADE -" + this.equipBAgilidade[5]);
        System.out.println("07-" + equipBody[6] + " | DEFESA +" + this.equipBDefesa[6] + " | AGILIDADE -" + this.equipBAgilidade[6]);
        System.out.println("08-" + equipBody[7] + " | DEFESA +" + this.equipBDefesa[7] + " | AGILIDADE -" + this.equipBAgilidade[7]);
        System.out.println("09-" + equipBody[8] + " | DEFESA +" + this.equipBDefesa[8] + " | AGILIDADE -" + this.equipBAgilidade[8]);
        System.out.println("10-" + equipBody[9] + " | DEFESA +" + this.equipBDefesa[9] + " | AGILIDADE -" + this.equipBAgilidade[9]);
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("MOCHILA-CALÇA");
        System.out.println("");
        System.out.println("01-" + equipLeggs[0] + " | DEFESA +" + this.equipLDefesa[0] + " | AGILIDADE -" + this.equipLAgilidade[0]);
        System.out.println("02-" + equipLeggs[1] + " | DEFESA +" + this.equipLDefesa[1] + " | AGILIDADE -" + this.equipLAgilidade[1]);
        System.out.println("03-" + equipLeggs[2] + " | DEFESA +" + this.equipLDefesa[2] + " | AGILIDADE -" + this.equipLAgilidade[2]);
        System.out.println("04-" + equipLeggs[3] + " | DEFESA +" + this.equipLDefesa[3] + " | AGILIDADE -" + this.equipLAgilidade[3]);
        System.out.println("05-" + equipLeggs[4] + " | DEFESA +" + this.equipLDefesa[4] + " | AGILIDADE -" + this.equipLAgilidade[4]);
        System.out.println("06-" + equipLeggs[5] + " | DEFESA +" + this.equipLDefesa[5] + " | AGILIDADE -" + this.equipLAgilidade[5]);
        System.out.println("07-" + equipLeggs[6] + " | DEFESA +" + this.equipLDefesa[6] + " | AGILIDADE -" + this.equipLAgilidade[6]);
        System.out.println("08-" + equipLeggs[7] + " | DEFESA +" + this.equipLDefesa[7] + " | AGILIDADE -" + this.equipLAgilidade[7]);
        System.out.println("09-" + equipLeggs[8] + " | DEFESA +" + this.equipLDefesa[8] + " | AGILIDADE -" + this.equipLAgilidade[8]);
        System.out.println("10-" + equipLeggs[9] + " | DEFESA +" + this.equipLDefesa[9] + " | AGILIDADE -" + this.equipLAgilidade[9]);
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("MOCHILA-BOTAS");
        System.out.println("");
        System.out.println("01-" + equipBoots[0] + " | DEFESA +" + this.equipBtDefesa[0] + " | AGILIDADE -" + this.equipBtAgilidade[0]);
        System.out.println("02-" + equipBoots[1] + " | DEFESA +" + this.equipBtDefesa[1] + " | AGILIDADE -" + this.equipBtAgilidade[1]);
        System.out.println("03-" + equipBoots[2] + " | DEFESA +" + this.equipBtDefesa[2] + " | AGILIDADE -" + this.equipBtAgilidade[2]);
        System.out.println("04-" + equipBoots[3] + " | DEFESA +" + this.equipBtDefesa[3] + " | AGILIDADE -" + this.equipBtAgilidade[3]);
        System.out.println("05-" + equipBoots[4] + " | DEFESA +" + this.equipBtDefesa[4] + " | AGILIDADE -" + this.equipBtAgilidade[4]);
        System.out.println("06-" + equipBoots[5] + " | DEFESA +" + this.equipBtDefesa[5] + " | AGILIDADE -" + this.equipBtAgilidade[5]);
        System.out.println("07-" + equipBoots[6] + " | DEFESA +" + this.equipBtDefesa[6] + " | AGILIDADE -" + this.equipBtAgilidade[6]);
        System.out.println("08-" + equipBoots[7] + " | DEFESA +" + this.equipBtDefesa[7] + " | AGILIDADE -" + this.equipBtAgilidade[7]);
        System.out.println("09-" + equipBoots[8] + " | DEFESA +" + this.equipBtDefesa[8] + " | AGILIDADE -" + this.equipBtAgilidade[8]);
        System.out.println("10-" + equipBoots[9] + " | DEFESA +" + this.equipBtDefesa[9] + " | AGILIDADE -" + this.equipBtAgilidade[9]);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Digite 1 para fechar a mochila ou 2 para equipar um equipamento:");
        int escolha = sc.nextInt();
        if (escolha == 1) {

        } else if (escolha == 2) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("Você quer equipar um capacete, peitoral, calça ou bota?");
            System.out.println("Digite 1 para capacete;");
            System.out.println("Digite 2 para peitoral;");
            System.out.println("Digite 3 para calça;");
            System.out.println("Digite 4 para Botas");
            int escolha2 = sc.nextInt();
            if (escolha2 == 1) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número do capacete que você quer equipar?");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    if (equipHead[0] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[0]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[0]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[0]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[0] = null;
                        equipHDefesa[0] = 0;
                        equipHAgilidade[0] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[0]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[0]);
                            this.equipHDefesa[0] = CD;
                            this.equipHAgilidade[0] = CA;
                            personagem.setCapacete(equipHead[0]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[0] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 2) {
                    if (equipHead[1] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[1]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[1]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[1]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[1] = null;
                        equipHDefesa[1] = 0;
                        equipHAgilidade[1] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[1]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[1]);
                            this.equipHDefesa[1] = CD;
                            this.equipHAgilidade[1] = CA;
                            personagem.setCapacete(equipHead[1]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[1] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 3) {
                    if (equipHead[2] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[2]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[2]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[2]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[2] = null;
                        equipHDefesa[2] = 0;
                        equipHAgilidade[2] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[2]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[2]);
                            this.equipHDefesa[2] = CD;
                            this.equipHAgilidade[2] = CA;
                            personagem.setCapacete(equipHead[2]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[2] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 4) {
                    if (equipHead[3] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[3]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[3]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[3]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[3] = null;
                        equipHDefesa[3] = 0;
                        equipHAgilidade[3] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[3]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[3]);
                            this.equipHDefesa[3] = CD;
                            this.equipHAgilidade[3] = CA;
                            personagem.setCapacete(equipHead[3]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[3] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 5) {
                    if (equipHead[4] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[4]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[4]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[4]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[4] = null;
                        equipHDefesa[4] = 0;
                        equipHAgilidade[4] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[4]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[4]);
                            this.equipHDefesa[4] = CD;
                            this.equipHAgilidade[4] = CA;
                            personagem.setCapacete(equipHead[4]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[4] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 6) {
                    if (equipHead[5] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[5]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[5]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[5]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[5] = null;
                        equipHDefesa[5] = 0;
                        equipHAgilidade[5] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[5]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[5]);
                            this.equipHDefesa[5] = CD;
                            this.equipHAgilidade[5] = CA;
                            personagem.setCapacete(equipHead[5]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[5] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 7) {
                    if (equipHead[6] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[6]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[6]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[6]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[6] = null;
                        equipHDefesa[6] = 0;
                        equipHAgilidade[6] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[6]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[6]);
                            this.equipHDefesa[6] = CD;
                            this.equipHAgilidade[6] = CA;
                            personagem.setCapacete(equipHead[6]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[6] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 8) {
                    if (equipHead[7] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[7]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[7]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[7]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[7] = null;
                        equipHDefesa[7] = 0;
                        equipHAgilidade[7] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[7]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[7]);
                            this.equipHDefesa[7] = CD;
                            this.equipHAgilidade[7] = CA;
                            personagem.setCapacete(equipHead[7]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[7] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 9) {
                    if (equipHead[8] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[8]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[8]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[8]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[8] = null;
                        equipHDefesa[8] = 0;
                        equipHAgilidade[8] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[8]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[8]);
                            this.equipHDefesa[8] = CD;
                            this.equipHAgilidade[8] = CA;
                            personagem.setCapacete(equipHead[8]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[8] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 10) {
                    if (equipHead[9] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCapacete() == null) {
                        personagem.setCapacete(equipHead[9]);
                        personagem.setCapaceteDefesa(this.equipHDefesa[9]);
                        personagem.setCapaceteAgilidade(this.equipHAgilidade[9]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                        equipHead[9] = null;
                        equipHDefesa[9] = 0;
                        equipHAgilidade[9] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um capacete!");
                        System.out.println("Quer trocar de capacete?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCapacete();
                            int CD = personagem.getCapaceteDefesa();
                            int CA = personagem.getCapaceteAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCapaceteAgilidade());
                            personagem.setCapaceteDefesa(this.equipHDefesa[9]);
                            personagem.setCapaceteAgilidade(this.equipHAgilidade[9]);
                            this.equipHDefesa[9] = CD;
                            this.equipHAgilidade[9] = CA;
                            personagem.setCapacete(equipHead[9]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCapaceteDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCapaceteAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCapacete() + "!");
                            equipHead[9] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                }
            } else if (escolha2 == 2) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número do peitoral que você quer equipar?");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    if (equipBody[0] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[0]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[0]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[0]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[0] = null;
                        equipBDefesa[0] = 0;
                        equipBAgilidade[0] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[0]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[0]);
                            this.equipBDefesa[0] = BD;
                            this.equipBAgilidade[0] = BA;
                            personagem.setPeitoral(equipBody[0]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[0] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 2) {
                    if (equipBody[1] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[1]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[1]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[1]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[1] = null;
                        equipBDefesa[1] = 0;
                        equipBAgilidade[1] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[1]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[1]);
                            this.equipBDefesa[1] = BD;
                            this.equipBAgilidade[1] = BA;
                            personagem.setPeitoral(equipBody[1]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[1] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 3) {
                    if (equipBody[2] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[2]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[2]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[2]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[2] = null;
                        equipBDefesa[2] = 0;
                        equipBAgilidade[2] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[2]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[2]);
                            this.equipBDefesa[2] = BD;
                            this.equipBAgilidade[2] = BA;
                            personagem.setPeitoral(equipBody[2]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[2] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 4) {
                    if (equipBody[3] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[3]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[3]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[3]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[3] = null;
                        equipBDefesa[3] = 0;
                        equipBAgilidade[3] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[3]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[3]);
                            this.equipBDefesa[3] = BD;
                            this.equipBAgilidade[3] = BA;
                            personagem.setPeitoral(equipBody[3]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[3] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 5) {
                    if (equipBody[4] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[4]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[4]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[4]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[4] = null;
                        equipBDefesa[4] = 0;
                        equipBAgilidade[4] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[4]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[4]);
                            this.equipBDefesa[4] = BD;
                            this.equipBAgilidade[4] = BA;
                            personagem.setPeitoral(equipBody[4]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[4] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 6) {
                    if (equipBody[5] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[5]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[5]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[5]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[5] = null;
                        equipBDefesa[5] = 0;
                        equipBAgilidade[5] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[5]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[5]);
                            this.equipBDefesa[5] = BD;
                            this.equipBAgilidade[5] = BA;
                            personagem.setPeitoral(equipBody[5]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[5] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 7) {
                    if (equipBody[6] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[6]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[6]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[6]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[6] = null;
                        equipBDefesa[6] = 0;
                        equipBAgilidade[6] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[6]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[6]);
                            this.equipBDefesa[6] = BD;
                            this.equipBAgilidade[6] = BA;
                            personagem.setPeitoral(equipBody[6]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[6] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 8) {
                    if (equipBody[7] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[7]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[7]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[7]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[7] = null;
                        equipBDefesa[7] = 0;
                        equipBAgilidade[7] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[7]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[7]);
                            this.equipBDefesa[7] = BD;
                            this.equipBAgilidade[7] = BA;
                            personagem.setPeitoral(equipBody[7]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[7] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 9) {
                    if (equipBody[8] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[8]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[8]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[8]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[8] = null;
                        equipBDefesa[8] = 0;
                        equipBAgilidade[8] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[8]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[8]);
                            this.equipBDefesa[8] = BD;
                            this.equipBAgilidade[8] = BA;
                            personagem.setPeitoral(equipBody[8]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[8] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 10) {
                    if (equipBody[9] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getPeitoral() == null) {
                        personagem.setPeitoral(equipBody[9]);
                        personagem.setPeitoralDefesa(this.equipBDefesa[9]);
                        personagem.setPeitoralAgilidade(this.equipBAgilidade[9]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                        equipBody[9] = null;
                        equipBDefesa[9] = 0;
                        equipBAgilidade[9] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um peitoral!");
                        System.out.println("Quer trocar de peitoral?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getPeitoral();
                            int BD = personagem.getPeitoralDefesa();
                            int BA = personagem.getPeitoralAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getPeitoralAgilidade());
                            personagem.setPeitoralDefesa(this.equipBDefesa[9]);
                            personagem.setPeitoralAgilidade(this.equipBAgilidade[9]);
                            this.equipBDefesa[9] = BD;
                            this.equipBAgilidade[9] = BA;
                            personagem.setPeitoral(equipBody[9]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getPeitoralDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getPeitoralAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getPeitoral() + "!");
                            equipBody[9] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                }
            } else if (escolha2 == 3) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número da calça que você quer equipar?");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    if (equipLeggs[0] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[0]);
                        personagem.setCalcaDefesa(this.equipLDefesa[0]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[0]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[0] = null;
                        equipLDefesa[0] = 0;
                        equipLAgilidade[0] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[0]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[0]);
                            this.equipLDefesa[0] = LD;
                            this.equipLAgilidade[0] = LA;
                            personagem.setCalca(equipLeggs[0]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[0] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 2) {
                    if (equipLeggs[1] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[1]);
                        personagem.setCalcaDefesa(this.equipLDefesa[1]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[1]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[1] = null;
                        equipLDefesa[1] = 0;
                        equipLAgilidade[1] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[1]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[1]);
                            this.equipLDefesa[1] = LD;
                            this.equipLAgilidade[1] = LA;
                            personagem.setCalca(equipLeggs[1]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[1] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 3) {
                    if (equipLeggs[2] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[2]);
                        personagem.setCalcaDefesa(this.equipLDefesa[2]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[2]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[2] = null;
                        equipLDefesa[2] = 0;
                        equipLAgilidade[2] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[2]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[2]);
                            this.equipLDefesa[2] = LD;
                            this.equipLAgilidade[2] = LA;
                            personagem.setCalca(equipLeggs[2]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[2] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 4) {
                    if (equipLeggs[3] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[3]);
                        personagem.setCalcaDefesa(this.equipLDefesa[3]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[3]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[3] = null;
                        equipLDefesa[3] = 0;
                        equipLAgilidade[3] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[3]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[3]);
                            this.equipLDefesa[3] = LD;
                            this.equipLAgilidade[3] = LA;
                            personagem.setCalca(equipLeggs[3]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[3] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 5) {
                    if (equipLeggs[4] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[4]);
                        personagem.setCalcaDefesa(this.equipLDefesa[4]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[4]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[4] = null;
                        equipLDefesa[4] = 0;
                        equipLAgilidade[4] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[4]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[4]);
                            this.equipLDefesa[4] = LD;
                            this.equipLAgilidade[4] = LA;
                            personagem.setCalca(equipLeggs[4]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[4] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 6) {
                    if (equipLeggs[5] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[5]);
                        personagem.setCalcaDefesa(this.equipLDefesa[5]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[5]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[5] = null;
                        equipLDefesa[5] = 0;
                        equipLAgilidade[5] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[5]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[5]);
                            this.equipLDefesa[5] = LD;
                            this.equipLAgilidade[5] = LA;
                            personagem.setCalca(equipLeggs[5]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[5] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 7) {
                    if (equipLeggs[6] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[6]);
                        personagem.setCalcaDefesa(this.equipLDefesa[6]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[6]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[6] = null;
                        equipLDefesa[6] = 0;
                        equipLAgilidade[6] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[6]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[6]);
                            this.equipLDefesa[6] = LD;
                            this.equipLAgilidade[6] = LA;
                            personagem.setCalca(equipLeggs[6]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[6] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 8) {
                    if (equipLeggs[7] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[7]);
                        personagem.setCalcaDefesa(this.equipLDefesa[7]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[7]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[7] = null;
                        equipLDefesa[7] = 0;
                        equipLAgilidade[7] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[7]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[7]);
                            this.equipLDefesa[7] = LD;
                            this.equipLAgilidade[7] = LA;
                            personagem.setCalca(equipLeggs[7]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[7] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 9) {
                    if (equipLeggs[8] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[8]);
                        personagem.setCalcaDefesa(this.equipLDefesa[8]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[8]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[8] = null;
                        equipLDefesa[8] = 0;
                        equipLAgilidade[8] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[8]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[8]);
                            this.equipLDefesa[8] = LD;
                            this.equipLAgilidade[8] = LA;
                            personagem.setCalca(equipLeggs[8]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[8] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 10) {
                    if (equipLeggs[9] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getCalca() == null) {
                        personagem.setCalca(equipLeggs[9]);
                        personagem.setCalcaDefesa(this.equipLDefesa[9]);
                        personagem.setCalcaAgilidade(this.equipLAgilidade[9]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                        equipLeggs[9] = null;
                        equipLDefesa[9] = 0;
                        equipLAgilidade[9] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma calça!");
                        System.out.println("Quer trocar de calça?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getCalca();
                            int LD = personagem.getCalcaDefesa();
                            int LA = personagem.getCalcaAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getCalcaAgilidade());
                            personagem.setCalcaDefesa(this.equipLDefesa[9]);
                            personagem.setCalcaAgilidade(this.equipLAgilidade[9]);
                            this.equipLDefesa[9] = LD;
                            this.equipLAgilidade[9] = LA;
                            personagem.setCalca(equipLeggs[9]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getCalcaDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getCalcaAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getCalca() + "!");
                            equipLeggs[9] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                }
            } else if (escolha2 == 4) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número das botas que você quer equipar?");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    if (equipBoots[0] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[0]);
                        personagem.setBotasDefesa(this.equipBtDefesa[0]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[0]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[0] = null;
                        equipBtDefesa[0] = 0;
                        equipBtAgilidade[0] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[0]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[0]);
                            this.equipBtDefesa[0] = BTD;
                            this.equipBtAgilidade[0] = BTA;
                            personagem.setBotas(equipBoots[0]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[0] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 2) {
                    if (equipBoots[1] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[1]);
                        personagem.setBotasDefesa(this.equipBtDefesa[1]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[1]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[1] = null;
                        equipBtDefesa[1] = 0;
                        equipBtAgilidade[1] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[1]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[1]);
                            this.equipBtDefesa[1] = BTD;
                            this.equipBtAgilidade[1] = BTA;
                            personagem.setBotas(equipBoots[1]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[1] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 3) {
                    if (equipBoots[2] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[2]);
                        personagem.setBotasDefesa(this.equipBtDefesa[2]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[2]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[2] = null;
                        equipBtDefesa[2] = 0;
                        equipBtAgilidade[2] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[2]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[2]);
                            this.equipBtDefesa[2] = BTD;
                            this.equipBtAgilidade[2] = BTA;
                            personagem.setBotas(equipBoots[2]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[2] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 4) {
                    if (equipBoots[3] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[3]);
                        personagem.setBotasDefesa(this.equipBtDefesa[3]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[3]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[3] = null;
                        equipBtDefesa[3] = 0;
                        equipBtAgilidade[3] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[3]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[3]);
                            this.equipBtDefesa[3] = BTD;
                            this.equipBtAgilidade[3] = BTA;
                            personagem.setBotas(equipBoots[3]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[3] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 5) {
                    if (equipBoots[4] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[4]);
                        personagem.setBotasDefesa(this.equipBtDefesa[4]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[4]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[4] = null;
                        equipBtDefesa[4] = 0;
                        equipBtAgilidade[4] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[4]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[4]);
                            this.equipBtDefesa[4] = BTD;
                            this.equipBtAgilidade[4] = BTA;
                            personagem.setBotas(equipBoots[4]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[4] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 6) {
                    if (equipBoots[5] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[5]);
                        personagem.setBotasDefesa(this.equipBtDefesa[5]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[5]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[5] = null;
                        equipBtDefesa[5] = 0;
                        equipBtAgilidade[5] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[5]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[5]);
                            this.equipBtDefesa[5] = BTD;
                            this.equipBtAgilidade[5] = BTA;
                            personagem.setBotas(equipBoots[5]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[5] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 7) {
                    if (equipBoots[6] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[6]);
                        personagem.setBotasDefesa(this.equipBtDefesa[6]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[6]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[6] = null;
                        equipBtDefesa[6] = 0;
                        equipBtAgilidade[6] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[6]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[6]);
                            this.equipBtDefesa[6] = BTD;
                            this.equipBtAgilidade[6] = BTA;
                            personagem.setBotas(equipBoots[6]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[6] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 8) {
                    if (equipBoots[7] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[7]);
                        personagem.setBotasDefesa(this.equipBtDefesa[7]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[7]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[7] = null;
                        equipBtDefesa[7] = 0;
                        equipBtAgilidade[7] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[7]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[7]);
                            this.equipBtDefesa[7] = BTD;
                            this.equipBtAgilidade[7] = BTA;
                            personagem.setBotas(equipBoots[7]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[7] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 9) {
                    if (equipBoots[8] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[8]);
                        personagem.setBotasDefesa(this.equipBtDefesa[8]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[8]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[8] = null;
                        equipBtDefesa[8] = 0;
                        equipBtAgilidade[8] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[8]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[8]);
                            this.equipBtDefesa[8] = BTD;
                            this.equipBtAgilidade[8] = BTA;
                            personagem.setBotas(equipBoots[8]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[8] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 10) {
                    if (equipBoots[9] == null) {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da mochila está vazio!");
                    } else if (personagem.getBotas() == null) {
                        personagem.setBotas(equipBoots[9]);
                        personagem.setBotasDefesa(this.equipBtDefesa[9]);
                        personagem.setBotasAgilidade(this.equipBtAgilidade[9]);
                        personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                        personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                        System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                        equipBoots[9] = null;
                        equipBtDefesa[9] = 0;
                        equipBtAgilidade[9] = 0;
                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando botas!");
                        System.out.println("Quer trocar de botas?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            String temp = personagem.getBotas();
                            int BTD = personagem.getBotasDefesa();
                            int BTA = personagem.getBotasAgilidade();
                            personagem.setDefesa(personagem.getDefesa() - personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() + personagem.getBotasAgilidade());
                            personagem.setBotasDefesa(this.equipBtDefesa[9]);
                            personagem.setBotasAgilidade(this.equipBtAgilidade[9]);
                            this.equipBtDefesa[9] = BTD;
                            this.equipBtAgilidade[9] = BTA;
                            personagem.setBotas(equipBoots[9]);
                            personagem.setDefesa(personagem.getDefesa() + personagem.getBotasDefesa());
                            personagem.setAgilidade(personagem.getAgilidade() - personagem.getBotasAgilidade());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getBotas() + "!");
                            equipBoots[9] = temp;
                        } else if (escolha4 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                }
            }
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
        }
    }

    //Método usado para abrir a mochila de itens largados pelos monstros e largar um desses itens.
    public void abrirMochilaM() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("MOCHILA-ITENS-DE-MONSTROS");
        System.out.println("");
        System.out.println("01-" + itemMonstro[0]);
        System.out.println("02-" + itemMonstro[1]);
        System.out.println("03-" + itemMonstro[2]);
        System.out.println("04-" + itemMonstro[3]);
        System.out.println("05-" + itemMonstro[4]);
        System.out.println("06-" + itemMonstro[5]);
        System.out.println("07-" + itemMonstro[6]);
        System.out.println("08-" + itemMonstro[7]);
        System.out.println("09-" + itemMonstro[8]);
        System.out.println("10-" + itemMonstro[9]);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Digite 1 para fechar a mochila ou 2 para largar um item.");
        int escolha = sc.nextInt();
        if (escolha == 1) {

        } else if (escolha == 2) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("Qual o número do item que você quer largar?");
            System.out.println("Digite 0 para fechar a mochila.");
            int escolha2 = sc.nextInt();
            if (escolha2 == 1) {
                if (itemMonstro[0] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[0] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[0] + "!");
                        itemMonstro[0] = null;
                        precoItemMonstro[0] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 2) {
                if (itemMonstro[1] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[1] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[1] + "!");
                        itemMonstro[1] = null;
                        precoItemMonstro[1] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 3) {
                if (itemMonstro[2] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[2] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[2] + "!");
                        itemMonstro[2] = null;
                        precoItemMonstro[2] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 4) {
                if (itemMonstro[3] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[3] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[3] + "!");
                        itemMonstro[3] = null;
                        precoItemMonstro[3] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 5) {
                if (itemMonstro[4] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[4] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[4] + "!");
                        itemMonstro[4] = null;
                        precoItemMonstro[4] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 6) {
                if (itemMonstro[5] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[5] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[5] + "!");
                        itemMonstro[5] = null;
                        precoItemMonstro[5] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 7) {
                if (itemMonstro[6] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[6] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[6] + "!");
                        itemMonstro[6] = null;
                        precoItemMonstro[6] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 8) {
                if (itemMonstro[7] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[7] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[7] + "!");
                        itemMonstro[7] = null;
                        precoItemMonstro[7] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 9) {
                if (itemMonstro[8] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[8] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[8] + "!");
                        itemMonstro[8] = null;
                        precoItemMonstro[8] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 10) {
                if (itemMonstro[9] == null) {
                    System.out.println("------------------------------------------------------------------------------------------------------");
                    System.out.println("Esse espaço da mochila está vazio!");
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Você realmente quer largar " + itemMonstro[9] + "?");
                    System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                    int escolha3 = sc.nextInt();
                    if (escolha3 == 1) {
                        System.out.println("-----------------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ JOGOU FORA " + itemMonstro[9] + "!");
                        itemMonstro[9] = null;
                        precoItemMonstro[9] = 0;
                    } else if (escolha3 == 2) {

                    } else {
                        System.out.println("---------------------------------------------------------------------------------------------------------------------");
                        System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                    }
                }
            } else if (escolha2 == 0) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
        }

    }

    //Método usado para abrir a loja de armas, que mostrará armas diferentes dependendo da classe do personagem;
    //se a classe do personagem for espadachim, a mochila mostrará espadas comuns; se for guerreiro ou paladino, mostrará espadas grandes; se for mago, mostrará cajados; e se for ninja, mostrará katanas.
    //O método também possibilita equipar uma arma, aumentando o ataque do personagem conforme a arma equipada.
    public void abritMochilaA(Personagem personagem) {
        if (personagem.getClasse() == "Espadachim") {
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("ESPADAS");
            System.out.println("");
            System.out.println("01-" + espada[0] + " | ATAQUE +" + espadaMudarAtaque[0]);
            System.out.println("02-" + espada[1] + " | ATAQUE +" + espadaMudarAtaque[1]);
            System.out.println("03-" + espada[2] + " | ATAQUE +" + espadaMudarAtaque[2]);
            System.out.println("04-" + espada[3] + " | ATAQUE +" + espadaMudarAtaque[3]);
            System.out.println("05-" + espada[4] + " | ATAQUE +" + espadaMudarAtaque[4]);
            System.out.println("06-" + espada[5] + " | ATAQUE +" + espadaMudarAtaque[5]);
            System.out.println("07-" + espada[6] + " | ATAQUE +" + espadaMudarAtaque[6]);
            System.out.println("08-" + espada[7] + " | ATAQUE +" + espadaMudarAtaque[7]);
            System.out.println("09-" + espada[8] + " | ATAQUE +" + espadaMudarAtaque[8]);
            System.out.println("10-" + espada[9] + " | ATAQUE +" + espadaMudarAtaque[9]);
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("Digite 1 para fechar a mochila ou 2 para equipar uma espada:");
            int escolha = sc.nextInt();
            if (escolha == 2) {
                System.out.println("----------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número da espada que você quer equipar?");
                System.out.println("Digite 0 para fechar a mochila.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (espada[0] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[0]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[0]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[0] = null;
                        espadaMudarAtaque[0] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[0]);
                            this.espadaMudarAtaque[0] = AA;
                            personagem.setArma(espada[0]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[0] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 2) {
                    if (espada[1] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[1]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[1]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[1] = null;
                        espadaMudarAtaque[1] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[1]);
                            this.espadaMudarAtaque[1] = AA;
                            personagem.setArma(espada[1]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[1] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 3) {
                    if (espada[2] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[2]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[2]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[2] = null;
                        espadaMudarAtaque[2] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[2]);
                            this.espadaMudarAtaque[2] = AA;
                            personagem.setArma(espada[2]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[2] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 4) {
                    if (espada[3] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[3]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[3]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[3] = null;
                        espadaMudarAtaque[3] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[3]);
                            this.espadaMudarAtaque[3] = AA;
                            personagem.setArma(espada[3]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[3] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 5) {
                    if (espada[4] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[4]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[4]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[4] = null;
                        espadaMudarAtaque[4] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[4]);
                            this.espadaMudarAtaque[4] = AA;
                            personagem.setArma(espada[4]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[4] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 6) {
                    if (espada[5] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[5]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[5]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[5] = null;
                        espadaMudarAtaque[5] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[5]);
                            this.espadaMudarAtaque[5] = AA;
                            personagem.setArma(espada[5]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[5] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 7) {
                    if (espada[6] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[6]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[6]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[6] = null;
                        espadaMudarAtaque[6] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[6]);
                            this.espadaMudarAtaque[6] = AA;
                            personagem.setArma(espada[6]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[6] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 8) {
                    if (espada[7] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[7]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[7]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[7] = null;
                        espadaMudarAtaque[7] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[7]);
                            this.espadaMudarAtaque[7] = AA;
                            personagem.setArma(espada[7]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[7] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 9) {
                    if (espada[8] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[8]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[8]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[8] = null;
                        espadaMudarAtaque[8] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[8]);
                            this.espadaMudarAtaque[8] = AA;
                            personagem.setArma(espada[8]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[8] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 10) {
                    if (espada[9] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espada[9]);
                        personagem.setArmaMudarAtaque(espadaMudarAtaque[9]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espada[9] = null;
                        espadaMudarAtaque[9] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada!");
                        System.out.println("Você quer trocar de espada?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaMudarAtaque[9]);
                            this.espadaMudarAtaque[9] = AA;
                            personagem.setArma(espada[9]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espada[9] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha == 1) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (personagem.getClasse() == "Guerreiro" || personagem.getClasse() == "Paladino") {
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("ESPADAS-GRANDES");
            System.out.println("");
            System.out.println("01-" + espadaG[0] + " | ATAQUE +" + espadaGMudarAtaque[0]);
            System.out.println("02-" + espadaG[1] + " | ATAQUE +" + espadaGMudarAtaque[1]);
            System.out.println("03-" + espadaG[2] + " | ATAQUE +" + espadaGMudarAtaque[2]);
            System.out.println("04-" + espadaG[3] + " | ATAQUE +" + espadaGMudarAtaque[3]);
            System.out.println("05-" + espadaG[4] + " | ATAQUE +" + espadaGMudarAtaque[4]);
            System.out.println("06-" + espadaG[5] + " | ATAQUE +" + espadaGMudarAtaque[5]);
            System.out.println("07-" + espadaG[6] + " | ATAQUE +" + espadaGMudarAtaque[6]);
            System.out.println("08-" + espadaG[7] + " | ATAQUE +" + espadaGMudarAtaque[7]);
            System.out.println("09-" + espadaG[8] + " | ATAQUE +" + espadaGMudarAtaque[8]);
            System.out.println("10-" + espadaG[9] + " | ATAQUE +" + espadaGMudarAtaque[9]);
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("Digite 1 para fechar a mochila ou 2 para equipar uma espada grande:");
            int escolha = sc.nextInt();
            if (escolha == 2) {
                System.out.println("----------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número da espada grande que você quer equipar?");
                System.out.println("Digite 0 para fechar a mochila.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (espadaG[0] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[0]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[0]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[0] = null;
                        espadaGMudarAtaque[0] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[0]);
                            this.espadaGMudarAtaque[0] = AA;
                            personagem.setArma(espadaG[0]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[0] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 2) {
                    if (espadaG[1] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[1]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[1]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[1] = null;
                        espadaGMudarAtaque[1] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[1]);
                            this.espadaGMudarAtaque[1] = AA;
                            personagem.setArma(espadaG[1]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[1] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 3) {
                    if (espadaG[2] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[2]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[2]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[2] = null;
                        espadaGMudarAtaque[2] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[2]);
                            this.espadaGMudarAtaque[2] = AA;
                            personagem.setArma(espadaG[2]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[2] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 4) {
                    if (espadaG[3] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[3]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[3]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[3] = null;
                        espadaGMudarAtaque[3] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[3]);
                            this.espadaGMudarAtaque[3] = AA;
                            personagem.setArma(espadaG[3]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[3] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 5) {
                    if (espadaG[4] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[4]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[4]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[4] = null;
                        espadaGMudarAtaque[4] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[4]);
                            this.espadaGMudarAtaque[4] = AA;
                            personagem.setArma(espadaG[4]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[4] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 6) {
                    if (espadaG[5] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[5]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[5]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[5] = null;
                        espadaGMudarAtaque[5] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[5]);
                            this.espadaGMudarAtaque[5] = AA;
                            personagem.setArma(espadaG[5]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[5] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 7) {
                    if (espadaG[6] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[6]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[6]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[6] = null;
                        espadaGMudarAtaque[6] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[6]);
                            this.espadaGMudarAtaque[6] = AA;
                            personagem.setArma(espadaG[6]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[6] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 8) {
                    if (espadaG[7] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[7]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[7]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[7] = null;
                        espadaGMudarAtaque[7] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[7]);
                            this.espadaGMudarAtaque[7] = AA;
                            personagem.setArma(espadaG[7]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[7] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 9) {
                    if (espadaG[8] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[8]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[8]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[8] = null;
                        espadaGMudarAtaque[8] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[8]);
                            this.espadaGMudarAtaque[8] = AA;
                            personagem.setArma(espadaG[8]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[8] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 10) {
                    if (espadaG[9] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(espadaG[9]);
                        personagem.setArmaMudarAtaque(espadaGMudarAtaque[9]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        espadaG[9] = null;
                        espadaGMudarAtaque[9] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma espada grande!");
                        System.out.println("Você quer trocar de espada grande?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.espadaGMudarAtaque[9]);
                            this.espadaGMudarAtaque[9] = AA;
                            personagem.setArma(espadaG[9]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            espadaG[9] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha == 1) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (personagem.getClasse() == "Mago") {
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("CAJADOS");
            System.out.println("");
            System.out.println("01-" + cajado[0] + " | ATAQUE +" + cajadoMudarAtaque[0]);
            System.out.println("02-" + cajado[1] + " | ATAQUE +" + cajadoMudarAtaque[1]);
            System.out.println("03-" + cajado[2] + " | ATAQUE +" + cajadoMudarAtaque[2]);
            System.out.println("04-" + cajado[3] + " | ATAQUE +" + cajadoMudarAtaque[3]);
            System.out.println("05-" + cajado[4] + " | ATAQUE +" + cajadoMudarAtaque[4]);
            System.out.println("06-" + cajado[5] + " | ATAQUE +" + cajadoMudarAtaque[5]);
            System.out.println("07-" + cajado[6] + " | ATAQUE +" + cajadoMudarAtaque[6]);
            System.out.println("08-" + cajado[7] + " | ATAQUE +" + cajadoMudarAtaque[7]);
            System.out.println("09-" + cajado[8] + " | ATAQUE +" + cajadoMudarAtaque[8]);
            System.out.println("10-" + cajado[9] + " | ATAQUE +" + cajadoMudarAtaque[9]);
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("Digite 1 para fechar a mochila ou 2 para equipar um cajado:");
            int escolha = sc.nextInt();
            if (escolha == 2) {
                System.out.println("----------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número do cajado que você quer equipar?");
                System.out.println("Digite 0 para fechar a mochila.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (cajado[0] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[0]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[0]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[0] = null;
                        cajadoMudarAtaque[0] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[0]);
                            this.cajadoMudarAtaque[0] = AA;
                            personagem.setArma(cajado[0]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[0] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 2) {
                    if (cajado[1] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[1]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[1]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[1] = null;
                        cajadoMudarAtaque[1] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[1]);
                            this.cajadoMudarAtaque[1] = AA;
                            personagem.setArma(cajado[1]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[1] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 3) {
                    if (cajado[2] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[2]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[2]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[2] = null;
                        cajadoMudarAtaque[2] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[2]);
                            this.cajadoMudarAtaque[2] = AA;
                            personagem.setArma(cajado[2]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[2] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 4) {
                    if (cajado[3] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[3]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[3]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[3] = null;
                        cajadoMudarAtaque[3] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[3]);
                            this.cajadoMudarAtaque[3] = AA;
                            personagem.setArma(cajado[3]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[3] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 5) {
                    if (cajado[4] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[4]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[4]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[4] = null;
                        cajadoMudarAtaque[4] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[4]);
                            this.cajadoMudarAtaque[4] = AA;
                            personagem.setArma(cajado[4]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[4] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 6) {
                    if (cajado[5] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[5]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[5]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[5] = null;
                        cajadoMudarAtaque[5] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[5]);
                            this.cajadoMudarAtaque[5] = AA;
                            personagem.setArma(cajado[5]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[5] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 7) {
                    if (cajado[6] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[6]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[6]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[6] = null;
                        cajadoMudarAtaque[6] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[6]);
                            this.cajadoMudarAtaque[6] = AA;
                            personagem.setArma(cajado[6]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[6] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 8) {
                    if (cajado[7] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[7]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[7]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[7] = null;
                        cajadoMudarAtaque[7] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[7]);
                            this.cajadoMudarAtaque[7] = AA;
                            personagem.setArma(cajado[7]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[7] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 9) {
                    if (cajado[8] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[8]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[8]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[8] = null;
                        cajadoMudarAtaque[8] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[8]);
                            this.cajadoMudarAtaque[8] = AA;
                            personagem.setArma(cajado[8]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[8] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 10) {
                    if (cajado[9] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(cajado[9]);
                        personagem.setArmaMudarAtaque(cajadoMudarAtaque[9]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        cajado[9] = null;
                        cajadoMudarAtaque[9] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando um cajado!");
                        System.out.println("Você quer trocar de cajado?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.cajadoMudarAtaque[9]);
                            this.cajadoMudarAtaque[9] = AA;
                            personagem.setArma(cajado[9]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            cajado[9] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha == 1) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (personagem.getClasse() == "Ninja") {
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("");
            System.out.println("KATANAS");
            System.out.println("");
            System.out.println("01-" + katana[0] + " | ATAQUE +" + katanaMudarAtaque[0]);
            System.out.println("02-" + katana[1] + " | ATAQUE +" + katanaMudarAtaque[1]);
            System.out.println("03-" + katana[2] + " | ATAQUE +" + katanaMudarAtaque[2]);
            System.out.println("04-" + katana[3] + " | ATAQUE +" + katanaMudarAtaque[3]);
            System.out.println("05-" + katana[4] + " | ATAQUE +" + katanaMudarAtaque[4]);
            System.out.println("06-" + katana[5] + " | ATAQUE +" + katanaMudarAtaque[5]);
            System.out.println("07-" + katana[6] + " | ATAQUE +" + katanaMudarAtaque[6]);
            System.out.println("08-" + katana[7] + " | ATAQUE +" + katanaMudarAtaque[7]);
            System.out.println("09-" + katana[8] + " | ATAQUE +" + katanaMudarAtaque[8]);
            System.out.println("10-" + katana[9] + " | ATAQUE +" + katanaMudarAtaque[9]);
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("Digite 1 para fechar a mochila ou 2 para equipar uma katana:");
            int escolha = sc.nextInt();
            if (escolha == 2) {
                System.out.println("----------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número da katana que você quer equipar?");
                System.out.println("Digite 0 para fechar a mochila.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (katana[0] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[0]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[0]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[0] = null;
                        katanaMudarAtaque[0] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[0]);
                            this.katanaMudarAtaque[0] = AA;
                            personagem.setArma(katana[0]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[0] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 2) {
                    if (katana[1] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[1]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[1]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[1] = null;
                        katanaMudarAtaque[1] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[1]);
                            this.katanaMudarAtaque[1] = AA;
                            personagem.setArma(katana[1]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[1] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 3) {
                    if (katana[2] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[2]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[2]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[2] = null;
                        katanaMudarAtaque[2] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[2]);
                            this.katanaMudarAtaque[2] = AA;
                            personagem.setArma(katana[2]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[2] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 4) {
                    if (katana[3] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[3]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[3]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[3] = null;
                        katanaMudarAtaque[3] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[3]);
                            this.katanaMudarAtaque[3] = AA;
                            personagem.setArma(katana[3]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[3] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 5) {
                    if (katana[4] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[4]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[4]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[4] = null;
                        katanaMudarAtaque[4] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[4]);
                            this.katanaMudarAtaque[4] = AA;
                            personagem.setArma(katana[4]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[4] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 6) {
                    if (katana[5] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[5]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[5]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[5] = null;
                        katanaMudarAtaque[5] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[5]);
                            this.katanaMudarAtaque[5] = AA;
                            personagem.setArma(katana[5]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[5] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 7) {
                    if (katana[6] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[6]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[6]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[6] = null;
                        katanaMudarAtaque[6] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[6]);
                            this.katanaMudarAtaque[6] = AA;
                            personagem.setArma(katana[6]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[6] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 8) {
                    if (katana[7] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[7]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[7]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[7] = null;
                        katanaMudarAtaque[7] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[7]);
                            this.katanaMudarAtaque[7] = AA;
                            personagem.setArma(katana[7]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[7] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 9) {
                    if (katana[8] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[8]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[8]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[8] = null;
                        katanaMudarAtaque[8] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[8]);
                            this.katanaMudarAtaque[8] = AA;
                            personagem.setArma(katana[8]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[8] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 10) {
                    if (katana[9] == null) {
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço na mochila está vazio!");
                    } else if (personagem.getArma() == null) {
                        personagem.setArma(katana[9]);
                        personagem.setArmaMudarAtaque(katanaMudarAtaque[9]);
                        personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                        katana[9] = null;
                        katanaMudarAtaque[9] = 0;
                    } else {
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("Você já está usando uma katana!");
                        System.out.println("Você quer trocar de katana?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            String temp = personagem.getArma();
                            int AA = personagem.getArmaMudarAtaque();
                            personagem.setAtaque(personagem.getAtaque() - personagem.getArmaMudarAtaque());
                            personagem.setArmaMudarAtaque(this.katanaMudarAtaque[9]);
                            this.katanaMudarAtaque[9] = AA;
                            personagem.setArma(katana[9]);
                            personagem.setAtaque(personagem.getAtaque() + personagem.getArmaMudarAtaque());
                            System.out.println("VOCÊ EQUIPOU " + personagem.getArma() + "!");
                            katana[9] = temp;
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha == 1) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        }
    }

}
