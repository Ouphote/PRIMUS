package primus.loja;

import java.util.Scanner;
import primus.mochila.Mochila;
import primus.personagem.Personagem;

//Classe para os atributos da loja de armas e o método de abrir a loja de armas.
public class LojaA {

    //Scanner criado para ler o que o usuário digitar.
    Scanner sc = new Scanner(System.in);

    //Vetor usado para armazenar o nome das espadas da loja de armas.
    public String espada[] = new String[10];
    //Vetor usado para armazenar o preço das espadas da loja de armas.
    public int precoEspada[] = new int[10];
    //Vetor usado para armazenar o aumento do ataque conforme a espada comprada.
    public int espadaMudarAtaque[] = new int[10];

    //Vetor usado para armazenar o nome das espadas grandes da loja de armas.
    public String espadaG[] = new String[10];
    //Vetor usado para armazenar o preço das espadas grandes da loja de armas.
    public int precoEspadaG[] = new int[10];
    //Vetor usado para armazenar o aumento do ataque conforme a espada grande comprada.
    public int espadaGMudarAtaque[] = new int[10];

    //Vetor usado para armazenar o nome dos cajados da loja de armas.
    public String cajado[] = new String[10];
    //Vetor usado para armazenar o preço dos cajados da loja de armas.
    public int precoCajado[] = new int[10];
    //Vetor usado para armazenar o aumento do ataque conforme o cajado comprado.
    public int cajadoMudarAtaque[] = new int[10];

    //Vetor usado para armazenar o nome das katanas da loja de armas.
    public String katana[] = new String[10];
    //Vetor usado para armazenar o preço das katanas da loja de armas.
    public int precoKatana[] = new int[10];
    //Vetor usado para armazenar o aumento do ataque conforme a katana comprada.
    public int katanaMudarAtaque[] = new int[10];

    //Construtor usado para criar uma loja de armas vazia.
    public LojaA() {

    }

    //Método usado para abrir a loja de armas; e nela comprar uma arma.
    //Se a classe do personagem for Espadachim, a loja venderá espadas;
    //se for Guerreiro ou Paladino, a loja venderá espadas grandes;
    //se for Mago, a loja venderá cajados;
    //e se for ninja, venderá katanas.
    //Se o personagem tiver dinheiro suficiente para comprar a arma escolhida, conseguirá comprar;
    //se não, será exibida uma mensagem dizendo que o personagem não possui dinheiro suficiente.
    public void abrirLojaA(Mochila mochila, Personagem personagem) {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Seja bem-vindo à loja de armas!");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Você quer comprar uma arma?");
        System.out.println("Digite 1 para comprar ou 2 para sair da loja.");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            if (personagem.getClasse() == "Espadachim") {
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("ESPADAS");
                System.out.println("");
                System.out.println("01-" + espada[0] + " | ATAQUE +" + espadaMudarAtaque[0] + " | $" + precoEspada[0]);
                System.out.println("02-" + espada[1] + " | ATAQUE +" + espadaMudarAtaque[1] + " | $" + precoEspada[1]);
                System.out.println("03-" + espada[2] + " | ATAQUE +" + espadaMudarAtaque[2] + " | $" + precoEspada[2]);
                System.out.println("04-" + espada[3] + " | ATAQUE +" + espadaMudarAtaque[3] + " | $" + precoEspada[3]);
                System.out.println("05-" + espada[4] + " | ATAQUE +" + espadaMudarAtaque[4] + " | $" + precoEspada[4]);
                System.out.println("06-" + espada[5] + " | ATAQUE +" + espadaMudarAtaque[5] + " | $" + precoEspada[5]);
                System.out.println("07-" + espada[6] + " | ATAQUE +" + espadaMudarAtaque[6] + " | $" + precoEspada[6]);
                System.out.println("08-" + espada[7] + " | ATAQUE +" + espadaMudarAtaque[7] + " | $" + precoEspada[7]);
                System.out.println("09-" + espada[8] + " | ATAQUE +" + espadaMudarAtaque[8] + " | $" + precoEspada[8]);
                System.out.println("10-" + espada[9] + " | ATAQUE +" + espadaMudarAtaque[9] + " | $" + precoEspada[9]);
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número da espada que você quer comprar?");
                System.out.println("Digite 0 para fechar a loja.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (espada[0] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[0]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[0] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[0] + " por $" + precoEspada[0] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[0];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[0];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[0];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[0];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[0];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[0];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[0];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[0];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[0];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[0];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[0];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[0];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[0];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[0];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[0];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[0];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[0];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[0];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[0];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[0];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[0]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 2) {
                    if (espada[1] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[1]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[1] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[1] + " por $" + precoEspada[1] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[1];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[1];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[1];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[1];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[1];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[1];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[1];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[1];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[1];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[1];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[1];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[1];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[1];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[1];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[1];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[1];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[1];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[1];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[1];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[1];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[1]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 3) {
                    if (espada[2] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[2]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[2] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[2] + " por $" + precoEspada[2] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[2];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[2];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[2];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[2];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[2];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[2];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[2];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[2];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[2];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[2];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[2];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[2];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[2];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[2];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[2];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[2];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[2];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[2];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[2];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[2];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[2]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 4) {
                    if (espada[3] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[3]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[3] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[3] + " por $" + precoEspada[3] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[3];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[3];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[3];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[3];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[3];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[3];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[3];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[3];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[3];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[3];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[3];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[3];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[3];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[3];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[3];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[3];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[3];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[3];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[3];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[3];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[3]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 5) {
                    if (espada[4] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[4]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[4] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[4] + " por $" + precoEspada[4] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[4];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[4];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[4];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[4];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[4];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[4];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[4];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[4];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[4];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[4];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[4];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[4];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[4];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[4];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[4];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[4];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[4];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[4];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[4];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[4];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[4]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 6) {
                    if (espada[5] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[5]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[5] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[5] + " por $" + precoEspada[5] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[5];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[5];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[5];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[5];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[5];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[5];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[5];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[5];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[5];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[5];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[5];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[5];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[5];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[5];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[5];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[5];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[5];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[5];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[5];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[5];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[5]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 7) {
                    if (espada[6] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[6]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[6] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[6] + " por $" + precoEspada[6] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[6];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[6];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[6];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[6];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[6];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[6];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[6];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[6];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[6];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[6];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[6];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[6];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[6];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[6];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[6];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[6];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[6];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[6];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[6];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[6];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[6]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 8) {
                    if (espada[7] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[7]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[7] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[7] + " por $" + precoEspada[7] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[7];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[7];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[7];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[7];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[7];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[7];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[7];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[7];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[7];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[7];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[7];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[7];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[7];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[7];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[7];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[7];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[7];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[7];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[7];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[7];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[7]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 9) {
                    if (espada[8] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[8]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[8] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[0] + " por $" + precoEspada[8] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[8];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[8];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[8];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[8];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[8];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[8];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[8];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[8];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[8];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[8];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[8];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[8];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[8];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[8];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[8];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[8];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[8];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[8];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[8];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[8];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[8]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 10) {
                    if (espada[9] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspada[9]) {
                        System.out.println("Você realmente quer comprar essa espada por $" + precoEspada[9] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espada[9] + " por $" + precoEspada[9] + "!");
                            if (mochila.espada[0] == null) {
                                mochila.espada[0] = espada[9];
                                mochila.espadaMudarAtaque[0] = espadaMudarAtaque[9];
                            } else if (mochila.espada[1] == null) {
                                mochila.espada[1] = espada[9];
                                mochila.espadaMudarAtaque[1] = espadaMudarAtaque[9];
                            } else if (mochila.espada[2] == null) {
                                mochila.espada[2] = espada[9];
                                mochila.espadaMudarAtaque[2] = espadaMudarAtaque[9];
                            } else if (mochila.espada[3] == null) {
                                mochila.espada[3] = espada[9];
                                mochila.espadaMudarAtaque[3] = espadaMudarAtaque[9];
                            } else if (mochila.espada[4] == null) {
                                mochila.espada[4] = espada[9];
                                mochila.espadaMudarAtaque[4] = espadaMudarAtaque[9];
                            } else if (mochila.espada[5] == null) {
                                mochila.espada[5] = espada[9];
                                mochila.espadaMudarAtaque[5] = espadaMudarAtaque[9];
                            } else if (mochila.espada[6] == null) {
                                mochila.espada[6] = espada[9];
                                mochila.espadaMudarAtaque[6] = espadaMudarAtaque[9];
                            } else if (mochila.espada[7] == null) {
                                mochila.espada[7] = espada[9];
                                mochila.espadaMudarAtaque[7] = espadaMudarAtaque[9];
                            } else if (mochila.espada[8] == null) {
                                mochila.espada[8] = espada[9];
                                mochila.espadaMudarAtaque[8] = espadaMudarAtaque[9];
                            } else if (mochila.espada[9] == null) {
                                mochila.espada[9] = espada[9];
                                mochila.espadaMudarAtaque[9] = espadaMudarAtaque[9];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspada[9]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada!");
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (personagem.getClasse() == "Mago") {
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("CAJADOS");
                System.out.println("");
                System.out.println("01-" + cajado[0] + " | ATAQUE +" + cajadoMudarAtaque[0] + " | $" + precoCajado[0]);
                System.out.println("02-" + cajado[1] + " | ATAQUE +" + cajadoMudarAtaque[1] + " | $" + precoCajado[1]);
                System.out.println("03-" + cajado[2] + " | ATAQUE +" + cajadoMudarAtaque[2] + " | $" + precoCajado[2]);
                System.out.println("04-" + cajado[3] + " | ATAQUE +" + cajadoMudarAtaque[3] + " | $" + precoCajado[3]);
                System.out.println("05-" + cajado[4] + " | ATAQUE +" + cajadoMudarAtaque[4] + " | $" + precoCajado[4]);
                System.out.println("06-" + cajado[5] + " | ATAQUE +" + cajadoMudarAtaque[5] + " | $" + precoCajado[5]);
                System.out.println("07-" + cajado[6] + " | ATAQUE +" + cajadoMudarAtaque[6] + " | $" + precoCajado[6]);
                System.out.println("08-" + cajado[7] + " | ATAQUE +" + cajadoMudarAtaque[7] + " | $" + precoCajado[7]);
                System.out.println("09-" + cajado[8] + " | ATAQUE +" + cajadoMudarAtaque[8] + " | $" + precoCajado[8]);
                System.out.println("10-" + cajado[9] + " | ATAQUE +" + cajadoMudarAtaque[9] + " | $" + precoCajado[9]);
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número do cajado que você quer comprar?");
                System.out.println("Digite 0 para fechar a loja.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (cajado[0] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[0]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[0] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[0] + " por $" + precoCajado[0] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[0];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[0];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[0];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[0];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[0];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[0];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[0];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[0];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[0];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[0];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[0];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[0];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[0];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[0];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[0];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[0];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[0];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[0];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[0];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[0];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[0]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 2) {
                    if (cajado[1] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[1]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[1] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[1] + " por $" + precoCajado[1] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[1];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[1];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[1];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[1];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[1];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[1];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[1];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[1];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[1];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[1];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[1];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[1];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[1];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[1];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[1];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[1];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[1];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[1];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[1];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[1];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[1]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 3) {
                    if (cajado[2] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[2]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[2] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[2] + " por $" + precoCajado[2] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[2];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[2];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[2];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[2];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[2];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[2];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[2];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[2];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[2];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[2];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[2];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[2];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[2];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[2];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[2];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[2];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[2];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[2];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[2];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[2];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[2]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 4) {
                    if (cajado[3] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[3]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[3] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[3] + " por $" + precoCajado[3] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[3];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[3];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[3];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[3];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[3];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[3];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[3];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[3];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[3];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[3];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[3];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[3];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[3];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[3];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[3];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[3];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[3];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[3];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[3];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[3];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[3]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 5) {
                    if (cajado[4] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[4]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[4] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[4] + " por $" + precoCajado[4] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[4];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[4];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[4];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[4];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[4];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[4];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[4];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[4];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[4];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[4];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[4];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[4];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[4];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[4];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[4];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[4];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[4];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[4];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[4];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[4];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[4]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 6) {
                    if (cajado[5] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[5]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[5] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[5] + " por $" + precoCajado[5] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[5];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[5];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[5];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[5];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[5];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[5];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[5];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[5];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[5];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[5];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[5];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[5];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[5];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[5];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[5];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[5];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[5];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[5];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[5];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[5];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[5]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 7) {
                    if (cajado[6] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[6]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[6] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[6] + " por $" + precoCajado[6] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[6];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[6];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[6];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[6];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[6];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[6];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[6];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[6];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[6];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[6];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[6];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[6];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[6];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[6];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[6];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[6];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[6];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[6];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[6];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[6];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[6]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 8) {
                    if (cajado[7] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[7]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[7] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[7] + " por $" + precoCajado[7] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[7];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[7];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[7];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[7];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[7];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[7];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[7];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[7];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[7];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[7];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[7];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[7];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[7];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[7];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[7];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[7];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[7];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[7];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[7];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[7];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[7]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 9) {
                    if (cajado[8] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[8]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[8] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[0] + " por $" + precoCajado[8] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[8];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[8];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[8];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[8];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[8];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[8];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[8];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[8];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[8];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[8];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[8];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[8];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[8];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[8];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[8];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[8];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[8];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[8];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[8];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[8];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[8]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 10) {
                    if (cajado[9] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoCajado[9]) {
                        System.out.println("Você realmente quer comprar esse cajado por $" + precoCajado[9] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + cajado[9] + " por $" + precoCajado[9] + "!");
                            if (mochila.cajado[0] == null) {
                                mochila.cajado[0] = cajado[9];
                                mochila.cajadoMudarAtaque[0] = cajadoMudarAtaque[9];
                            } else if (mochila.cajado[1] == null) {
                                mochila.cajado[1] = cajado[9];
                                mochila.cajadoMudarAtaque[1] = cajadoMudarAtaque[9];
                            } else if (mochila.cajado[2] == null) {
                                mochila.cajado[2] = cajado[9];
                                mochila.cajadoMudarAtaque[2] = cajadoMudarAtaque[9];
                            } else if (mochila.cajado[3] == null) {
                                mochila.cajado[3] = cajado[9];
                                mochila.cajadoMudarAtaque[3] = cajadoMudarAtaque[9];
                            } else if (mochila.cajado[4] == null) {
                                mochila.cajado[4] = cajado[9];
                                mochila.cajadoMudarAtaque[4] = cajadoMudarAtaque[9];
                            } else if (mochila.cajado[5] == null) {
                                mochila.cajado[5] = cajado[9];
                                mochila.cajadoMudarAtaque[5] = cajadoMudarAtaque[9];
                            } else if (mochila.cajado[6] == null) {
                                mochila.cajado[6] = cajado[9];
                                mochila.cajadoMudarAtaque[6] = cajadoMudarAtaque[9];
                            } else if (mochila.cajado[7] == null) {
                                mochila.cajado[7] = cajado[9];
                                mochila.cajadoMudarAtaque[7] = cajadoMudarAtaque[9];
                            } else if (mochila.cajado[8] == null) {
                                mochila.cajado[8] = cajado[9];
                                mochila.cajadoMudarAtaque[8] = cajadoMudarAtaque[9];
                            } else if (mochila.cajado[9] == null) {
                                mochila.cajado[9] = cajado[9];
                                mochila.cajadoMudarAtaque[9] = cajadoMudarAtaque[9];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoCajado[9]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar esse cajado!");
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (personagem.getClasse() == "Guerreiro" || personagem.getClasse() == "Paladino") {
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("ESPADAS-GRANDES");
                System.out.println("");
                System.out.println("01-" + espadaG[0] + " | ATAQUE +" + espadaGMudarAtaque[0] + " | $" + precoEspadaG[0]);
                System.out.println("02-" + espadaG[1] + " | ATAQUE +" + espadaGMudarAtaque[1] + " | $" + precoEspadaG[1]);
                System.out.println("03-" + espadaG[2] + " | ATAQUE +" + espadaGMudarAtaque[2] + " | $" + precoEspadaG[2]);
                System.out.println("04-" + espadaG[3] + " | ATAQUE +" + espadaGMudarAtaque[3] + " | $" + precoEspadaG[3]);
                System.out.println("05-" + espadaG[4] + " | ATAQUE +" + espadaGMudarAtaque[4] + " | $" + precoEspadaG[4]);
                System.out.println("06-" + espadaG[5] + " | ATAQUE +" + espadaGMudarAtaque[5] + " | $" + precoEspadaG[5]);
                System.out.println("07-" + espadaG[6] + " | ATAQUE +" + espadaGMudarAtaque[6] + " | $" + precoEspadaG[6]);
                System.out.println("08-" + espadaG[7] + " | ATAQUE +" + espadaGMudarAtaque[7] + " | $" + precoEspadaG[7]);
                System.out.println("09-" + espadaG[8] + " | ATAQUE +" + espadaGMudarAtaque[8] + " | $" + precoEspadaG[8]);
                System.out.println("10-" + espadaG[9] + " | ATAQUE +" + espadaGMudarAtaque[9] + " | $" + precoEspadaG[9]);
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número da espada grande que você quer comprar?");
                System.out.println("Digite 0 para fechar a loja.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (espadaG[0] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[0]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[0] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[0] + " por $" + precoEspadaG[0] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[0];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[0];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[0];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[0];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[0];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[0];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[0];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[0];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[0];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[0];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[0];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[0];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[0];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[0];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[0];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[0];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[0];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[0];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[0];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[0];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[0]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 2) {
                    if (espadaG[1] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[1]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[1] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[1] + " por $" + precoEspadaG[1] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[1];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[1];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[1];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[1];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[1];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[1];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[1];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[1];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[1];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[1];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[1];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[1];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[1];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[1];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[1];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[1];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[1];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[1];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[1];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[1];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[1]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 3) {
                    if (espadaG[2] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[2]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[2] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[2] + " por $" + precoEspadaG[2] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[2];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[2];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[2];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[2];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[2];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[2];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[2];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[2];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[2];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[2];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[2];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[2];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[2];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[2];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[2];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[2];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[2];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[2];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[2];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[2];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[2]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 4) {
                    if (espadaG[3] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[3]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[3] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[3] + " por $" + precoEspadaG[3] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[3];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[3];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[3];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[3];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[3];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[3];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[3];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[3];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[3];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[3];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[3];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[3];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[3];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[3];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[3];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[3];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[3];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[3];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[3];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[3];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[3]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 5) {
                    if (espadaG[4] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[4]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[4] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[4] + " por $" + precoEspadaG[4] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[4];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[4];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[4];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[4];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[4];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[4];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[4];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[4];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[4];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[4];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[4];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[4];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[4];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[4];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[4];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[4];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[4];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[4];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[4];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[4];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[4]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 6) {
                    if (espadaG[5] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[5]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[5] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[5] + " por $" + precoEspadaG[5] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[5];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[5];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[5];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[5];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[5];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[5];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[5];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[5];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[5];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[5];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[5];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[5];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[5];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[5];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[5];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[5];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[5];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[5];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[5];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[5];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[5]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 7) {
                    if (espadaG[6] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[6]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[6] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[6] + " por $" + precoEspadaG[6] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[6];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[6];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[6];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[6];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[6];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[6];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[6];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[6];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[6];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[6];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[6];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[6];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[6];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[6];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[6];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[6];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[6];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[6];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[6];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[6];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[6]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 8) {
                    if (espadaG[7] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[7]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[7] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[7] + " por $" + precoEspadaG[7] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[7];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[7];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[7];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[7];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[7];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[7];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[7];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[7];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[7];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[7];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[7];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[7];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[7];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[7];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[7];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[7];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[7];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[7];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[7];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[7];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[7]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 9) {
                    if (espadaG[8] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[8]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[8] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[0] + " por $" + precoEspadaG[8] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[8];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[8];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[8];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[8];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[8];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[8];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[8];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[8];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[8];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[8];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[8];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[8];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[8];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[8];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[8];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[8];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[8];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[8];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[8];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[8];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[8]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 10) {
                    if (espadaG[9] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoEspadaG[9]) {
                        System.out.println("Você realmente quer comprar essa espada grande por $" + precoEspadaG[9] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + espadaG[9] + " por $" + precoEspadaG[9] + "!");
                            if (mochila.espadaG[0] == null) {
                                mochila.espadaG[0] = espadaG[9];
                                mochila.espadaGMudarAtaque[0] = espadaGMudarAtaque[9];
                            } else if (mochila.espadaG[1] == null) {
                                mochila.espadaG[1] = espadaG[9];
                                mochila.espadaGMudarAtaque[1] = espadaGMudarAtaque[9];
                            } else if (mochila.espadaG[2] == null) {
                                mochila.espadaG[2] = espadaG[9];
                                mochila.espadaGMudarAtaque[2] = espadaGMudarAtaque[9];
                            } else if (mochila.espadaG[3] == null) {
                                mochila.espadaG[3] = espadaG[9];
                                mochila.espadaGMudarAtaque[3] = espadaGMudarAtaque[9];
                            } else if (mochila.espadaG[4] == null) {
                                mochila.espadaG[4] = espadaG[9];
                                mochila.espadaGMudarAtaque[4] = espadaGMudarAtaque[9];
                            } else if (mochila.espadaG[5] == null) {
                                mochila.espadaG[5] = espadaG[9];
                                mochila.espadaGMudarAtaque[5] = espadaGMudarAtaque[9];
                            } else if (mochila.espadaG[6] == null) {
                                mochila.espadaG[6] = espadaG[9];
                                mochila.espadaGMudarAtaque[6] = espadaGMudarAtaque[9];
                            } else if (mochila.espadaG[7] == null) {
                                mochila.espadaG[7] = espadaG[9];
                                mochila.espadaGMudarAtaque[7] = espadaGMudarAtaque[9];
                            } else if (mochila.espadaG[8] == null) {
                                mochila.espadaG[8] = espadaG[9];
                                mochila.espadaGMudarAtaque[8] = espadaGMudarAtaque[9];
                            } else if (mochila.espadaG[9] == null) {
                                mochila.espadaG[9] = espadaG[9];
                                mochila.espadaGMudarAtaque[9] = espadaGMudarAtaque[9];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoEspadaG[9]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa espada grande!");
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (personagem.getClasse() == "Ninja") {
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("KATANAS");
                System.out.println("");
                System.out.println("01-" + katana[0] + " | ATAQUE +" + katanaMudarAtaque[0] + " | $" + precoKatana[0]);
                System.out.println("02-" + katana[1] + " | ATAQUE +" + katanaMudarAtaque[1] + " | $" + precoKatana[1]);
                System.out.println("03-" + katana[2] + " | ATAQUE +" + katanaMudarAtaque[2] + " | $" + precoKatana[2]);
                System.out.println("04-" + katana[3] + " | ATAQUE +" + katanaMudarAtaque[3] + " | $" + precoKatana[3]);
                System.out.println("05-" + katana[4] + " | ATAQUE +" + katanaMudarAtaque[4] + " | $" + precoKatana[4]);
                System.out.println("06-" + katana[5] + " | ATAQUE +" + katanaMudarAtaque[5] + " | $" + precoKatana[5]);
                System.out.println("07-" + katana[6] + " | ATAQUE +" + katanaMudarAtaque[6] + " | $" + precoKatana[6]);
                System.out.println("08-" + katana[7] + " | ATAQUE +" + katanaMudarAtaque[7] + " | $" + precoKatana[7]);
                System.out.println("09-" + katana[8] + " | ATAQUE +" + katanaMudarAtaque[8] + " | $" + precoKatana[8]);
                System.out.println("10-" + katana[9] + " | ATAQUE +" + katanaMudarAtaque[9] + " | $" + precoKatana[9]);
                System.out.println("------------------------------------------------------------------------------------------------------------");
                System.out.println("Qual o número da katana que você quer comprar?");
                System.out.println("Digite 0 para fechar a loja.");
                int escolha2 = sc.nextInt();
                if (escolha2 == 1) {
                    if (katana[0] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[0]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[0] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[0] + " por $" + precoKatana[0] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[0];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[0];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[0];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[0];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[0];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[0];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[0];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[0];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[0];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[0];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[0];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[0];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[0];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[0];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[0];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[0];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[0];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[0];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[0];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[0];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[0]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 2) {
                    if (katana[1] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[1]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[1] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[1] + " por $" + precoKatana[1] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[1];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[1];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[1];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[1];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[1];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[1];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[1];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[1];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[1];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[1];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[1];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[1];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[1];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[1];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[1];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[1];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[1];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[1];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[1];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[1];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[1]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 3) {
                    if (katana[2] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[2]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[2] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[2] + " por $" + precoKatana[2] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[2];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[2];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[2];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[2];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[2];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[2];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[2];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[2];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[2];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[2];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[2];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[2];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[2];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[2];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[2];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[2];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[2];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[2];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[2];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[2];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[2]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 4) {
                    if (katana[3] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[3]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[3] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[3] + " por $" + precoKatana[3] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[3];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[3];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[3];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[3];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[3];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[3];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[3];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[3];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[3];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[3];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[3];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[3];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[3];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[3];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[3];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[3];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[3];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[3];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[3];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[3];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[3]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 5) {
                    if (katana[4] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[4]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[4] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[4] + " por $" + precoKatana[4] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[4];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[4];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[4];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[4];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[4];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[4];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[4];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[4];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[4];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[4];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[4];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[4];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[4];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[4];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[4];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[4];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[4];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[4];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[4];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[4];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[4]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 6) {
                    if (katana[5] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[5]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[5] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[5] + " por $" + precoKatana[5] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[5];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[5];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[5];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[5];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[5];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[5];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[5];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[5];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[5];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[5];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[5];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[5];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[5];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[5];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[5];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[5];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[5];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[5];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[5];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[5];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[5]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 7) {
                    if (katana[6] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[6]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[6] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[6] + " por $" + precoKatana[6] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[6];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[6];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[6];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[6];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[6];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[6];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[6];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[6];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[6];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[6];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[6];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[6];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[6];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[6];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[6];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[6];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[6];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[6];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[6];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[6];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[6]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 8) {
                    if (katana[7] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[7]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[7] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[7] + " por $" + precoKatana[7] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[7];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[7];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[7];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[7];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[7];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[7];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[7];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[7];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[7];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[7];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[7];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[7];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[7];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[7];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[7];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[7];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[7];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[7];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[7];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[7];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[7]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 9) {
                    if (katana[8] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[8]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[8] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[0] + " por $" + precoKatana[8] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[8];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[8];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[8];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[8];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[8];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[8];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[8];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[8];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[8];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[8];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[8];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[8];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[8];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[8];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[8];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[8];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[8];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[8];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[8];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[8];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[8]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 10) {
                    if (katana[9] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else if (personagem.getDinheiro() >= precoKatana[9]) {
                        System.out.println("Você realmente quer comprar essa katana por $" + precoKatana[9] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha3 = sc.nextInt();
                        if (escolha3 == 1) {
                            System.out.println("----------------------------------------------------------------------------------------------");
                            System.out.println("Você comprou " + katana[9] + " por $" + precoKatana[9] + "!");
                            if (mochila.katana[0] == null) {
                                mochila.katana[0] = katana[9];
                                mochila.katanaMudarAtaque[0] = katanaMudarAtaque[9];
                            } else if (mochila.katana[1] == null) {
                                mochila.katana[1] = katana[9];
                                mochila.katanaMudarAtaque[1] = katanaMudarAtaque[9];
                            } else if (mochila.katana[2] == null) {
                                mochila.katana[2] = katana[9];
                                mochila.katanaMudarAtaque[2] = katanaMudarAtaque[9];
                            } else if (mochila.katana[3] == null) {
                                mochila.katana[3] = katana[9];
                                mochila.katanaMudarAtaque[3] = katanaMudarAtaque[9];
                            } else if (mochila.katana[4] == null) {
                                mochila.katana[4] = katana[9];
                                mochila.katanaMudarAtaque[4] = katanaMudarAtaque[9];
                            } else if (mochila.katana[5] == null) {
                                mochila.katana[5] = katana[9];
                                mochila.katanaMudarAtaque[5] = katanaMudarAtaque[9];
                            } else if (mochila.katana[6] == null) {
                                mochila.katana[6] = katana[9];
                                mochila.katanaMudarAtaque[6] = katanaMudarAtaque[9];
                            } else if (mochila.katana[7] == null) {
                                mochila.katana[7] = katana[9];
                                mochila.katanaMudarAtaque[7] = katanaMudarAtaque[9];
                            } else if (mochila.katana[8] == null) {
                                mochila.katana[8] = katana[9];
                                mochila.katanaMudarAtaque[8] = katanaMudarAtaque[9];
                            } else if (mochila.katana[9] == null) {
                                mochila.katana[9] = katana[9];
                                mochila.katanaMudarAtaque[9] = katanaMudarAtaque[9];
                            } else {
                                System.out.println("-----------------------------------------------------------------------------------");
                                System.out.println("Você não tem espaço na mochila!");
                            }
                            personagem.setDinheiro(personagem.getDinheiro() - precoKatana[9]);
                        } else if (escolha3 == 2) {

                        } else {
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem dinheiro suficiente para comprar essa katana!");
                    }
                } else if (escolha2 == 0) {

                } else {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            }
        } else if (escolha == 2) {

        } else {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
        }
    }

}
