package primus.loja;

import java.util.Scanner;
import primus.mochila.Mochila;
import primus.personagem.Personagem;

//Classe para os atributos da loja de equipamentos e o método para abrir a loja de equipamentos.
public class LojaE {

    //Scanner criado para ler o que o usuário digitar.
    Scanner sc = new Scanner(System.in);

    //Vetor usado para armazenar o nome dos capacetes da loja de equipamentos.
    public String head[] = new String[10];
    //Vetor usado para armazenar o preço dos capacetes da loja de equipamentos.
    public int precoH[] = new int[10];
    //Vetor usado para armazenar o aumento da defesa conforme o capacete comprado.
    public int equipHDefesa[] = new int[10];
    //Vetor usado para armazenar a diminuição da agilidade conforme o capacete comprado.
    public int equipHAgilidade[] = new int[10];

    //Vetor usado para armazenar o nome dos peitorais da loja de equipamentos.
    public String body[] = new String[10];
    //Vetor usado para armazenar o preço dos peitorais da loja de equipamentos.
    public int precoB[] = new int[10];
    //Vetor usado para armazenar o aumento da defesa conforme o peitoral comprado.
    public int equipBDefesa[] = new int[10];
    //Vetor usado para armazenar a diminuição da agilidade conforme o peitoral comprado.
    public int equipBAgilidade[] = new int[10];

    //Vetor usado para armazenar o nome das calças da loja de equipamentos.
    public String leggs[] = new String[10];
    //Vetor usado para armazenar o preço das calças da loja de equipamentos.
    public int precoL[] = new int[10];
    //Vetor usado para armazenar o aumento da defesa conforme a calça comprada.
    public int equipLDefesa[] = new int[10];
    //Vetor usado para armazenar a diminuição da agilidade conforme a calça comprada.
    public int equipLAgilidade[] = new int[10];

    //Vetor usado para armazenar o nome das botas da loja de equipamentos.
    public String boots[] = new String[10];
    //Vetor usado para armazenar o preço das botas da loja de equipamentos.
    public int precoBt[] = new int[10];
    //Vetor usado para armazenar o aumento da defesa conforme as botas compradas.
    public int equipBtDefesa[] = new int[10];
    //Vetor usado para armazenar a diminuição da agilidade conforme as botas compradas.
    public int equipBtAgilidade[] = new int[10];

    //Construtor usado para criar uma loja de equipamentos vazia.
    public LojaE() {
    }

    //Método usado para abrir a loja de equipamentos; e nela, comprar um capacete, peitoral, calça ou botas.
    //Se o personagem tiver dinheiro suficiente para comprar o equipamento escolhido, conseguirá comprar;
    //se não, será exibida uma mensagem dizendo que o personagem não possui dinheiro suficiente.
    public void abrirLojaE(Personagem personagem, Mochila mochila) {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Seja bem-vindo à loja de equipamentos!");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Você quer comprar um equipamento?");
        System.out.println("Digite 1 para comprar ou 2 para sair da loja.");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("Você quer comprar um Capacete, Peitoral, Calça ou Botas?");
            System.out.println("Digite 1 para Capacete, 2 para Peitoral, 3 para Calça ou 4 para Botas:");
            int escolha2 = sc.nextInt();
            if (escolha2 == 1) {
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("CAPACETES");
                System.out.println("");
                System.out.println("01-" + head[0] + " | $ " + precoH[0]);
                System.out.println("02-" + head[1] + " | $ " + precoH[1]);
                System.out.println("03-" + head[2] + " | $ " + precoH[2]);
                System.out.println("04-" + head[3] + " | $ " + precoH[3]);
                System.out.println("05-" + head[4] + " | $ " + precoH[4]);
                System.out.println("06-" + head[5] + " | $ " + precoH[5]);
                System.out.println("07-" + head[6] + " | $ " + precoH[6]);
                System.out.println("08-" + head[7] + " | $ " + precoH[7]);
                System.out.println("09-" + head[8] + " | $ " + precoH[8]);
                System.out.println("10-" + head[9] + " | $ " + precoH[9]);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("Qual o número do capacete que você deseja comprar?");
                System.out.println("Ou digite 0 para sair da loja.");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    if (head[0] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[0] + " por $ " + precoH[0] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[0]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[0]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[0];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[0];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[0];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[0];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[0];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[0];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[0];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[0];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[0];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[0];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[0];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[0];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[0];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[0];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[0];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[0];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[0];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[8] = this.equipHAgilidade[0];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[0];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[0];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[0];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[0] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 2) {
                    if (head[1] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[1] + " por $ " + precoH[1] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[1]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[1]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[1];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[1];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[1];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[1];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[1];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[1];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[1];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[1];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[1];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[1];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[1];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[1];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[1];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[1];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[1];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[1];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[1];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[8] = this.equipHAgilidade[1];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[1];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[1];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[1];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[1] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 3) {
                    if (head[2] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[2] + " por $ " + precoH[2] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[2]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[2]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[2];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[2];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[2];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[2];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[2];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[2];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[2];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[2];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[2];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[2];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[2];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[2];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[2];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[2];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[2];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[2];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[2];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[8] = this.equipHAgilidade[2];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[2];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[2];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[2];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[2] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 4) {
                    if (head[3] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[3] + " por $ " + precoH[3] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[3]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[3]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[3];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[3];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[3];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[3];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[3];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[3];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[3];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[3];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[3];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[3];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[3];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[3];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[3];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[3];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[3];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[3];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[3];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[8] = this.equipHAgilidade[3];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[3];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[3];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[3];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[3] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 5) {
                    if (head[4] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[4] + " por $ " + precoH[4] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[4]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[4]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[4];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[4];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[4];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[4];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[4];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[4];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[4];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[4];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[4];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[4];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[4];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[4];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[4];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[4];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[4];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[4];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[4];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[8] = this.equipHAgilidade[4];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[4];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[4];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[4];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[4] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 6) {
                    if (head[5] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[5] + " por $ " + precoH[5] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[5]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[5]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[5];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[5];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[5];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[5];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[5];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[5];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[5];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[5];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[5];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[5];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[5];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[5];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[5];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[5];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[5];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[5];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[5];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[8] = this.equipHAgilidade[5];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[5];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[5];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[5];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[5] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 7) {
                    if (head[6] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[6] + " por $ " + precoH[6] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[6]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[6]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[6];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[6];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[6];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[6];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[6];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[6];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[6];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[6];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[6];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[6];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[6];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[6];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[6];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[6];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[6];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[6];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[6];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[8] = this.equipHAgilidade[6];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[6];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[6];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[6];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[6] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 8) {
                    if (head[7] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[7] + " por $ " + precoH[7] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[7]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[7]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[7];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[7];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[7];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[7];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[7];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[7];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[7];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[7];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[7];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[7];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[7];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[7];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[7];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[7];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[7];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[7];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[7];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[8] = this.equipHAgilidade[7];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[7];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[7];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[7];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[7] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 9) {
                    if (head[8] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[8] + " por $ " + precoH[8] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[8]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[8]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[8];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[8];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[8];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[8];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[8];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[8];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[8];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[8];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[8];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[8];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[8];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[8];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[8];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[8];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[8];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[8];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[8];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[8];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[8];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[8];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[8];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[8] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 10) {
                    if (head[9] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + head[9] + " por $ " + precoH[9] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoH[9]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoH[9]);
                                if (mochila.equipHead[0] == null) {
                                    mochila.equipHead[0] = head[9];
                                    mochila.equipHDefesa[0] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[0] = this.equipHAgilidade[9];
                                } else if (mochila.equipHead[1] == null) {
                                    mochila.equipHead[1] = head[9];
                                    mochila.equipHDefesa[1] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[1] = this.equipHAgilidade[9];
                                } else if (mochila.equipHead[2] == null) {
                                    mochila.equipHead[2] = head[9];
                                    mochila.equipHDefesa[2] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[2] = this.equipHAgilidade[9];
                                } else if (mochila.equipHead[3] == null) {
                                    mochila.equipHead[3] = head[9];
                                    mochila.equipHDefesa[3] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[3] = this.equipHAgilidade[9];
                                } else if (mochila.equipHead[4] == null) {
                                    mochila.equipHead[4] = head[9];
                                    mochila.equipHDefesa[4] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[4] = this.equipHAgilidade[9];
                                } else if (mochila.equipHead[5] == null) {
                                    mochila.equipHead[5] = head[9];
                                    mochila.equipHDefesa[5] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[5] = this.equipHAgilidade[9];
                                } else if (mochila.equipHead[6] == null) {
                                    mochila.equipHead[6] = head[9];
                                    mochila.equipHDefesa[6] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[6] = this.equipHAgilidade[9];
                                } else if (mochila.equipHead[7] == null) {
                                    mochila.equipHead[7] = head[9];
                                    mochila.equipHDefesa[7] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[7] = this.equipHAgilidade[9];
                                } else if (mochila.equipHead[8] == null) {
                                    mochila.equipHead[8] = head[9];
                                    mochila.equipHDefesa[8] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[8] = this.equipHAgilidade[9];
                                } else if (mochila.equipHead[9] == null) {
                                    mochila.equipHead[9] = head[9];
                                    mochila.equipHDefesa[9] = this.equipHDefesa[9];
                                    mochila.equipHAgilidade[9] = this.equipHAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + head[9] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse capacete!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 0) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Tudo bem! Volte sempre!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 2) {
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("PEITORAIS");
                System.out.println("");
                System.out.println("01-" + body[0] + " | $ " + precoB[0]);
                System.out.println("02-" + body[1] + " | $ " + precoB[1]);
                System.out.println("03-" + body[2] + " | $ " + precoB[2]);
                System.out.println("04-" + body[3] + " | $ " + precoB[3]);
                System.out.println("05-" + body[4] + " | $ " + precoB[4]);
                System.out.println("06-" + body[5] + " | $ " + precoB[5]);
                System.out.println("07-" + body[6] + " | $ " + precoB[6]);
                System.out.println("08-" + body[7] + " | $ " + precoB[7]);
                System.out.println("09-" + body[8] + " | $ " + precoB[8]);
                System.out.println("10-" + body[9] + " | $ " + precoB[9]);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("Qual o número do peitoral que você deseja comprar?");
                System.out.println("Ou digite 0 para sair da loja.");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    if (body[0] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[0] + " por $ " + precoB[0] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[0]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[0]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[0];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[0];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[0];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[0];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[0];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[0];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[0];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[0];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[0];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[0];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[0] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 2) {
                    if (body[1] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[1] + " por $ " + precoB[1] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[1]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[1]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[1];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[1];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[1];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[1];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[1];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[1];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[1];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[1];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[1];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[1];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[1] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 3) {
                    if (body[2] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[2] + " por $ " + precoB[2] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[2]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[2]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[2];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[2];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[2];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[2];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[2];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[2];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[2];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[2];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[2];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[2];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[2] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 4) {
                    if (body[3] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[3] + " por $ " + precoB[3] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[3]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[3]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[3];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[3];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[3];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[3];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[3];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[3];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[3];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[3];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[3];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[3];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[3] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 5) {
                    if (body[4] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[4] + " por $ " + precoB[4] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[4]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[4]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[4];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[4];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[4];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[4];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[4];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[4];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[4];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[4];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[4];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[4];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[4] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 6) {
                    if (body[5] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[5] + " por $ " + precoB[5] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[5]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[5]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[5];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[5];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[5];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[5];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[5];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[5];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[5];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[5];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[5];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[5];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[5] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 7) {
                    if (body[6] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[6] + " por $ " + precoB[6] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[6]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[6]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[6];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[6];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[6];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[6];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[6];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[6];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[6];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[6];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[6];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[6];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[6] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 8) {
                    if (body[7] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[7] + " por $ " + precoB[7] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[7]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[7]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[7];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[7];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[7];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[7];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[7];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[7];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[7];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[7];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[7];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[7];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[7] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 9) {
                    if (body[8] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[8] + " por $ " + precoB[8] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[8]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[8]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[8];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[8];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[8];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[8];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[8];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[8];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[8];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[8];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[8];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[8];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[8] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 10) {
                    if (body[9] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar um " + body[9] + " por $ " + precoB[9] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoB[9]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoB[9]);
                                if (mochila.equipBody[0] == null) {
                                    mochila.equipBody[0] = body[9];
                                    mochila.equipBDefesa[0] = equipBDefesa[0];
                                    mochila.equipBAgilidade[0] = equipBAgilidade[0];
                                } else if (mochila.equipBody[1] == null) {
                                    mochila.equipBody[1] = body[9];
                                    mochila.equipBDefesa[1] = equipBDefesa[1];
                                    mochila.equipBAgilidade[1] = equipBAgilidade[1];
                                } else if (mochila.equipBody[2] == null) {
                                    mochila.equipBody[2] = body[9];
                                    mochila.equipBDefesa[2] = equipBDefesa[2];
                                    mochila.equipBAgilidade[2] = equipBAgilidade[2];
                                } else if (mochila.equipBody[3] == null) {
                                    mochila.equipBody[3] = body[9];
                                    mochila.equipBDefesa[3] = equipBDefesa[3];
                                    mochila.equipBAgilidade[3] = equipBAgilidade[3];
                                } else if (mochila.equipBody[4] == null) {
                                    mochila.equipBody[4] = body[9];
                                    mochila.equipBDefesa[4] = equipBDefesa[4];
                                    mochila.equipBAgilidade[4] = equipBAgilidade[4];
                                } else if (mochila.equipBody[5] == null) {
                                    mochila.equipBody[5] = body[9];
                                    mochila.equipBDefesa[5] = equipBDefesa[5];
                                    mochila.equipBAgilidade[5] = equipBAgilidade[5];
                                } else if (mochila.equipBody[6] == null) {
                                    mochila.equipBody[6] = body[9];
                                    mochila.equipBDefesa[6] = equipBDefesa[6];
                                    mochila.equipBAgilidade[6] = equipBAgilidade[6];
                                } else if (mochila.equipBody[7] == null) {
                                    mochila.equipBody[7] = body[9];
                                    mochila.equipBDefesa[7] = equipBDefesa[7];
                                    mochila.equipBAgilidade[7] = equipBAgilidade[7];
                                } else if (mochila.equipBody[8] == null) {
                                    mochila.equipBody[8] = body[9];
                                    mochila.equipBDefesa[8] = equipBDefesa[8];
                                    mochila.equipBAgilidade[8] = equipBAgilidade[8];
                                } else if (mochila.equipBody[9] == null) {
                                    mochila.equipBody[9] = body[9];
                                    mochila.equipBDefesa[9] = equipBDefesa[9];
                                    mochila.equipBAgilidade[9] = equipBAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UM " + body[9] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar esse peitoral!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 0) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Tudo bem! Volte sempre!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 3) {
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("CALÇAS");
                System.out.println("");
                System.out.println("01-" + leggs[0] + " | $ " + precoL[0]);
                System.out.println("02-" + leggs[1] + " | $ " + precoL[1]);
                System.out.println("03-" + leggs[2] + " | $ " + precoL[2]);
                System.out.println("04-" + leggs[3] + " | $ " + precoL[3]);
                System.out.println("05-" + leggs[4] + " | $ " + precoL[4]);
                System.out.println("06-" + leggs[5] + " | $ " + precoL[5]);
                System.out.println("07-" + leggs[6] + " | $ " + precoL[6]);
                System.out.println("08-" + leggs[7] + " | $ " + precoL[7]);
                System.out.println("09-" + leggs[8] + " | $ " + precoL[8]);
                System.out.println("10-" + leggs[9] + " | $ " + precoL[9]);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("Qual o número da calça que você deseja comprar?");
                System.out.println("Ou digite 0 para sair da loja.");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    if (leggs[0] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[0] + " por $ " + precoL[0] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[0]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[0]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[0];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[0];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[0];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[0];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[0];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[0];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[0];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[0];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[0];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[0];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[0] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 2) {
                    if (leggs[1] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[1] + " por $ " + precoL[1] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[1]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[1]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[1];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[1];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[1];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[1];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[1];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[1];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[1];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[1];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[1];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[1];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[1] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 3) {
                    if (leggs[2] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[2] + " por $ " + precoL[2] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[2]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[2]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[2];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[2];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[2];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[2];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[2];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[2];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[2];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[2];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[2];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[2];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[2] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 4) {
                    if (leggs[3] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[3] + " por $ " + precoL[3] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[3]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[3]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[3];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[3];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[3];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[3];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[3];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[3];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[3];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[3];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[3];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[3];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[3] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 5) {
                    if (leggs[4] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[4] + " por $ " + precoL[4] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[4]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[4]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[4];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[4];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[4];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[4];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[4];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[4];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[4];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[4];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[4];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[4];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[4] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 6) {
                    if (leggs[5] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[5] + " por $ " + precoL[5] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[5]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[5]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[5];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[5];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[5];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[5];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[5];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[5];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[5];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[5];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[5];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[5];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[5] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 7) {
                    if (leggs[6] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[6] + " por $ " + precoL[6] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[6]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[6]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[6];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[6];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[6];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[6];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[6];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[6];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[6];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[6];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[6];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[6];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[6] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 8) {
                    if (leggs[7] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[7] + " por $ " + precoL[7] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[7]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[7]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[7];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[7];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[7];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[7];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[7];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[7];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[7];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[7];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[7];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[7];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[7] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 9) {
                    if (leggs[8] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[8] + " por $ " + precoL[8] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[8]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[8]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[8];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[8];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[8];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[8];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[8];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[8];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[8];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[8];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[8];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[8];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[8] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 10) {
                    if (leggs[9] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar uma " + leggs[9] + " por $ " + precoL[9] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoL[9]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoL[9]);
                                if (mochila.equipLeggs[0] == null) {
                                    mochila.equipLeggs[0] = leggs[9];
                                    mochila.equipLDefesa[0] = equipLDefesa[0];
                                    mochila.equipLAgilidade[0] = equipLAgilidade[0];
                                } else if (mochila.equipLeggs[1] == null) {
                                    mochila.equipLeggs[1] = leggs[9];
                                    mochila.equipLDefesa[1] = equipLDefesa[1];
                                    mochila.equipLAgilidade[1] = equipLAgilidade[1];
                                } else if (mochila.equipLeggs[2] == null) {
                                    mochila.equipLeggs[2] = leggs[9];
                                    mochila.equipLDefesa[2] = equipLDefesa[2];
                                    mochila.equipLAgilidade[2] = equipLAgilidade[2];
                                } else if (mochila.equipLeggs[3] == null) {
                                    mochila.equipLeggs[3] = leggs[9];
                                    mochila.equipLDefesa[3] = equipLDefesa[3];
                                    mochila.equipLAgilidade[3] = equipLAgilidade[3];
                                } else if (mochila.equipLeggs[4] == null) {
                                    mochila.equipLeggs[4] = leggs[9];
                                    mochila.equipLDefesa[4] = equipLDefesa[4];
                                    mochila.equipLAgilidade[4] = equipLAgilidade[4];
                                } else if (mochila.equipLeggs[5] == null) {
                                    mochila.equipLeggs[5] = leggs[9];
                                    mochila.equipLDefesa[5] = equipLDefesa[5];
                                    mochila.equipLAgilidade[5] = equipLAgilidade[5];
                                } else if (mochila.equipLeggs[6] == null) {
                                    mochila.equipLeggs[6] = leggs[9];
                                    mochila.equipLDefesa[6] = equipLDefesa[6];
                                    mochila.equipLAgilidade[6] = equipLAgilidade[6];
                                } else if (mochila.equipLeggs[7] == null) {
                                    mochila.equipLeggs[7] = leggs[9];
                                    mochila.equipLDefesa[7] = equipLDefesa[7];
                                    mochila.equipLAgilidade[7] = equipLAgilidade[7];
                                } else if (mochila.equipLeggs[8] == null) {
                                    mochila.equipLeggs[8] = leggs[9];
                                    mochila.equipLDefesa[8] = equipLDefesa[8];
                                    mochila.equipLAgilidade[8] = equipLAgilidade[8];
                                } else if (mochila.equipLeggs[9] == null) {
                                    mochila.equipLeggs[9] = leggs[9];
                                    mochila.equipLDefesa[9] = equipLDefesa[9];
                                    mochila.equipLAgilidade[9] = equipLAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU UMA " + leggs[9] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essa calça!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 0) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Tudo bem! Volte sempre!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else if (escolha2 == 4) {
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("BOTAS");
                System.out.println("");
                System.out.println("01-" + boots[0] + " | $ " + precoBt[0]);
                System.out.println("02-" + boots[1] + " | $ " + precoBt[1]);
                System.out.println("03-" + boots[2] + " | $ " + precoBt[2]);
                System.out.println("04-" + boots[3] + " | $ " + precoBt[3]);
                System.out.println("05-" + boots[4] + " | $ " + precoBt[4]);
                System.out.println("06-" + boots[5] + " | $ " + precoBt[5]);
                System.out.println("07-" + boots[6] + " | $ " + precoBt[6]);
                System.out.println("08-" + boots[7] + " | $ " + precoBt[7]);
                System.out.println("09-" + boots[8] + " | $ " + precoBt[8]);
                System.out.println("10-" + boots[9] + " | $ " + precoBt[9]);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("Qual o número das botas que você deseja comprar?");
                System.out.println("Ou digite 0 para sair da loja.");
                int escolha3 = sc.nextInt();
                if (escolha3 == 1) {
                    if (boots[0] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[0] + " por $ " + precoBt[0] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[0]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[0]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[0];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[0];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[0];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[0];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[0];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[0];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[0];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[0];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[0];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[0];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[0] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 2) {
                    if (boots[1] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[1] + " por $ " + precoBt[1] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[1]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[1]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[1];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[1];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[1];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[1];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[1];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[1];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[1];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[1];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[1];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[1];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[1] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 3) {
                    if (boots[2] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[2] + " por $ " + precoBt[2] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[2]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[2]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[2];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[2];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[2];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[2];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[2];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[2];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[2];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[2];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[2];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[2];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[2] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 4) {
                    if (boots[3] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[3] + " por $ " + precoBt[3] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[3]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[3]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[3];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[3];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[3];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[3];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[3];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[3];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[3];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[3];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[3];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[3];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[3] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 5) {
                    if (boots[4] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[4] + " por $ " + precoBt[4] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[4]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[4]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[4];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[4];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[4];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[4];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[4];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[4];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[4];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[4];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[4];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[4];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[4] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 6) {
                    if (boots[5] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[5] + " por $ " + precoBt[5] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[5]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[5]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[5];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[5];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[5];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[5];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[5];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[5];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[5];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[5];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[5];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[5];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[5] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 7) {
                    if (boots[6] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[6] + " por $ " + precoBt[6] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[6]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[6]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[6];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[6];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[6];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[6];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[6];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[6];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[6];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[6];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[6];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[6];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[6] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 8) {
                    if (boots[7] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[7] + " por $ " + precoBt[7] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[7]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[7]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[7];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[7];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[7];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[7];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[7];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[7];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[7];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[7];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[7];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[7];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[7] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 9) {
                    if (boots[8] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[8] + " por $ " + precoBt[8] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[8]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[8]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[8];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[8];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[8];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[8];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[8];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[8];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[8];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[8];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[8];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[8];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[8] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 10) {
                    if (boots[9] == null) {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("esse espaço da loja está vazio!");
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("Você quer comprar " + boots[9] + " por $ " + precoBt[9] + "?");
                        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
                        int escolha4 = sc.nextInt();
                        if (escolha4 == 1) {
                            if (personagem.getDinheiro() >= precoBt[9]) {
                                personagem.setDinheiro(personagem.getDinheiro() - precoBt[9]);
                                if (mochila.equipBoots[0] == null) {
                                    mochila.equipBoots[0] = boots[9];
                                    mochila.equipBtDefesa[0] = equipBtDefesa[0];
                                    mochila.equipBtAgilidade[0] = equipBtAgilidade[0];
                                } else if (mochila.equipBoots[1] == null) {
                                    mochila.equipBoots[1] = boots[9];
                                    mochila.equipBtDefesa[1] = equipBtDefesa[1];
                                    mochila.equipBtAgilidade[1] = equipBtAgilidade[1];
                                } else if (mochila.equipBoots[2] == null) {
                                    mochila.equipBoots[2] = boots[9];
                                    mochila.equipBtDefesa[2] = equipBtDefesa[2];
                                    mochila.equipBtAgilidade[2] = equipBtAgilidade[2];
                                } else if (mochila.equipBoots[3] == null) {
                                    mochila.equipBoots[3] = boots[9];
                                    mochila.equipBtDefesa[3] = equipBtDefesa[3];
                                    mochila.equipBtAgilidade[3] = equipBtAgilidade[3];
                                } else if (mochila.equipBoots[4] == null) {
                                    mochila.equipBoots[4] = boots[9];
                                    mochila.equipBtDefesa[4] = equipBtDefesa[4];
                                    mochila.equipBtAgilidade[4] = equipBtAgilidade[4];
                                } else if (mochila.equipBoots[5] == null) {
                                    mochila.equipBoots[5] = boots[9];
                                    mochila.equipBtDefesa[5] = equipBtDefesa[5];
                                    mochila.equipBtAgilidade[5] = equipBtAgilidade[5];
                                } else if (mochila.equipBoots[6] == null) {
                                    mochila.equipBoots[6] = boots[9];
                                    mochila.equipBtDefesa[6] = equipBtDefesa[6];
                                    mochila.equipBtAgilidade[6] = equipBtAgilidade[6];
                                } else if (mochila.equipBoots[7] == null) {
                                    mochila.equipBoots[7] = boots[9];
                                    mochila.equipBtDefesa[7] = equipBtDefesa[7];
                                    mochila.equipBtAgilidade[7] = equipBtAgilidade[7];
                                } else if (mochila.equipBoots[8] == null) {
                                    mochila.equipBoots[8] = boots[9];
                                    mochila.equipBtDefesa[8] = equipBtDefesa[8];
                                    mochila.equipBtAgilidade[8] = equipBtAgilidade[8];
                                } else if (mochila.equipBoots[9] == null) {
                                    mochila.equipBoots[9] = boots[9];
                                    mochila.equipBtDefesa[9] = equipBtDefesa[9];
                                    mochila.equipBtAgilidade[9] = equipBtAgilidade[9];
                                } else {
                                    System.out.println("-----------------------------------------------------------------------------------");
                                    System.out.println("Você não tem espaço na mochila!");
                                }
                                System.out.println("-----------------------------------------------------------------------------------------");
                                System.out.println("VOCÊ COMPROU " + boots[9] + "!");
                            } else {
                                System.out.println("----------------------------------------------------------------------------------------------");
                                System.out.println("Você não tem dinheiro suficiente para comprar essas botas!");
                            }
                        } else if (escolha4 == 2) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("Ok! Volte sempre!");
                        } else {
                            System.out.println("---------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                        }
                    }
                } else if (escolha3 == 0) {
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Tudo bem! Volte sempre!");
                } else {
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
                }
            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (escolha == 2) {

        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
        }
    }

}
