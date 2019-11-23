package primus.inimigo;

import java.util.Scanner;
import primus.mochila.Mochila;
import primus.personagem.Personagem;

//Classe para os atributos do inimigo e o método batalhar.
public class Inimigo {

    //Scanner criado para ler o que o usuário digitar.
    Scanner sc = new Scanner(System.in);

    //Atributo para o nome do inimigo.
    private String nome;
    //Atributo para a vida do inimigo.
    private int vida;
    //Atributo para a mana do inimigo.
    private int mana;
    //Atributo para o ataque do inimigo.
    private int ataque;
    //Atributo para a defesa do inimigo.
    private int defesa;
    //Atributo para a agilidade do inimigo.
    private int agilidade;
    //Atributo para a experiência que o personagem consegue após vencer a batalha contra o inimigo.
    private int xpAdquirida;
    //Vetor usado para armazenar os itens que os inimigos largam após perder a batalha.
    public String itemDropado;
    //Vetor usado para armazenar o preco dos itens que os inimigos largam após perder a batalha.
    public int precoItemDropado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getXpAdquirida() {
        return xpAdquirida;
    }

    public void setXpAdquirida(int xpAdquirida) {
        this.xpAdquirida = xpAdquirida;
    }

    public String getItemDropado() {
        return itemDropado;
    }

    public void setItemDropado(String itemDropado) {
        this.itemDropado = itemDropado;
    }

    public int getPrecoItemDropado() {
        return precoItemDropado;
    }

    public void setPrecoItemDropado(int precoItemDropado) {
        this.precoItemDropado = precoItemDropado;
    }

    //Construtor usado para criar um inimigo vazio.
    public Inimigo() {
    }

    //Construtor usado para criar um inimigo inicializando todos os atributos.
    public Inimigo(String nome, int vida, int mana, int ataque, int defesa, int agilidade, int xpAdquirida, String itemDropado, int precoItemDropado) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.ataque = ataque;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.xpAdquirida = xpAdquirida;
        this.itemDropado = itemDropado;
        this.precoItemDropado = precoItemDropado;
    }

    //Método usado para batalhar contra um inimigo.
    //O sistema de batalha funciona com o nível de poder;
    //se o nível de poder do inimigo for maior do que o nível de poder do personagem, o inimigo vence;
    //se não, o personagem vence.
    //Se o personagem perder a batalha, ele precisará ficar 5 minutos na enfermaria sem poder fazer nada.
    //Se o personagem vencer a batalha, ele ganhará experiência e um item que o inimigo largar.
    public void batalhar(Mochila mochila, Personagem personagem, Inimigo inimigo1, Inimigo inimigo2, Inimigo inimigo3, Inimigo inimigo4, Inimigo inimigo5, Inimigo inimigo6) throws InterruptedException {
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("ESCOLHER INIMIGO");
        System.out.println("");
        System.out.println("01-" + inimigo1.nome + " | Nível de Poder: " + ((inimigo1.vida + inimigo1.mana) + (inimigo1.ataque * 2) + (inimigo1.defesa * 2) + (inimigo1.agilidade * 2)));
        System.out.println("02-" + inimigo2.nome + " | Nível de Poder: " + ((inimigo2.vida + inimigo2.mana) + (inimigo2.ataque * 2) + (inimigo2.defesa * 2) + (inimigo2.agilidade * 2)));
        System.out.println("03-" + inimigo3.nome + " | Nível de Poder: " + ((inimigo3.vida + inimigo3.mana) + (inimigo3.ataque * 2) + (inimigo3.defesa * 2) + (inimigo3.agilidade * 2)));
        System.out.println("04-" + inimigo4.nome + " | Nível de Poder: " + ((inimigo4.vida + inimigo4.mana) + (inimigo4.ataque * 2) + (inimigo4.defesa * 2) + (inimigo4.agilidade * 2)));
        System.out.println("05-" + inimigo5.nome + " | Nível de Poder: " + ((inimigo5.vida + inimigo5.mana) + (inimigo5.ataque * 2) + (inimigo5.defesa * 2) + (inimigo5.agilidade * 2)));
        System.out.println("06-" + inimigo6.nome + " | Nível de Poder: " + ((inimigo6.vida + inimigo6.mana) + (inimigo6.ataque * 2) + (inimigo6.defesa * 2) + (inimigo6.agilidade * 2)));
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Qual o número do inimigo que você quer batalhar?");
        System.out.println("Digite 0 para sair da batalhar.");
        int escolha = sc.nextInt();
        if (escolha == 0) {

        } else if (escolha == 1) {
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Você quer batalhar contra " + inimigo1.nome + "?");
            System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
            int escolha2 = sc.nextInt();
            System.out.println("BATALHANDO...");
            Thread.sleep(60000);
            if (escolha2 == 1) {
                if (((inimigo1.vida + inimigo1.mana) + (inimigo1.ataque * 2) + (inimigo1.defesa * 2) + (inimigo1.agilidade * 2)) >= ((personagem.getVida() + personagem.getMana()) + (personagem.getAtaque() * 2) + (personagem.getDefesa() * 2) + (personagem.getAgilidade() * 2))) {
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Infelizmente sua força não foi suficiente...");
                    System.out.println("Você perdeu a batalha.");
                    System.out.println("Agora você precisa ir à enfermaria para se recuperar.");
                    System.out.println("Descanse! Não faça nenhum esforço durante os próximos 5 minutos!");
                    Thread.sleep(300000);
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Parabéns! Você venceu a batalha contra o(a) " + inimigo1.nome + "!");
                    System.out.println("Você ganhou " + inimigo1.xpAdquirida + " de experiência!");
                    System.out.println("Você conseguiu " + inimigo1.itemDropado + " do " + inimigo1.nome + "!");
                    personagem.setExperiencia(personagem.getExperiencia() + inimigo1.xpAdquirida);
                    if (mochila.item[0] == null) {
                        mochila.itemMonstro[0] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[0] = inimigo1.precoItemDropado;
                    } else if (mochila.item[1] == null) {
                        mochila.itemMonstro[1] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[1] = inimigo1.precoItemDropado;
                    } else if (mochila.item[2] == null) {
                        mochila.itemMonstro[2] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[2] = inimigo1.precoItemDropado;
                    } else if (mochila.item[3] == null) {
                        mochila.itemMonstro[3] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[3] = inimigo1.precoItemDropado;
                    } else if (mochila.item[4] == null) {
                        mochila.itemMonstro[4] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[4] = inimigo1.precoItemDropado;
                    } else if (mochila.item[5] == null) {
                        mochila.itemMonstro[5] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[5] = inimigo1.precoItemDropado;
                    } else if (mochila.item[6] == null) {
                        mochila.itemMonstro[6] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[6] = inimigo1.precoItemDropado;
                    } else if (mochila.item[7] == null) {
                        mochila.itemMonstro[7] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[7] = inimigo1.precoItemDropado;
                    } else if (mochila.item[8] == null) {
                        mochila.itemMonstro[8] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[8] = inimigo1.precoItemDropado;
                    } else if (mochila.item[9] == null) {
                        mochila.itemMonstro[9] = inimigo1.itemDropado;
                        mochila.precoItemMonstro[9] = inimigo1.precoItemDropado;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem espaço na mochila, por isso não foi possível guardar o " + inimigo1.itemDropado + "!");
                    }
                }
            } else if (escolha2 == 2) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (escolha == 2) {
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Você quer batalhar contra " + inimigo2.nome + "?");
            System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
            int escolha2 = sc.nextInt();
            System.out.println("BATALHANDO...");
            Thread.sleep(60000);
            if (escolha2 == 1) {
                if (((inimigo2.vida + inimigo2.mana) + (inimigo2.ataque * 2) + (inimigo2.defesa * 2) + (inimigo2.agilidade * 2)) >= ((personagem.getVida() + personagem.getMana()) + (personagem.getAtaque() * 2) + (personagem.getDefesa() * 2) + (personagem.getAgilidade() * 2))) {
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Infelizmente sua força não foi suficiente...");
                    System.out.println("Você perdeu a batalha.");
                    System.out.println("Agora você precisa ir à enfermaria para se recuperar.");
                    System.out.println("Descanse! Não faça nenhum esforço durante os próximos 5 minutos!");
                    Thread.sleep(300000);
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Parabéns! Você venceu a batalha contra o(a) " + inimigo2.nome + "!");
                    System.out.println("Você ganhou " + inimigo2.xpAdquirida + " de experiência!");
                    System.out.println("Você conseguiu " + inimigo2.itemDropado + " do " + inimigo2.nome + "!");
                    personagem.setExperiencia(personagem.getExperiencia() + inimigo2.xpAdquirida);
                    if (mochila.item[0] == null) {
                        mochila.itemMonstro[0] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[0] = inimigo2.precoItemDropado;
                    } else if (mochila.item[1] == null) {
                        mochila.itemMonstro[1] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[1] = inimigo2.precoItemDropado;
                    } else if (mochila.item[2] == null) {
                        mochila.itemMonstro[2] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[2] = inimigo2.precoItemDropado;
                    } else if (mochila.item[3] == null) {
                        mochila.itemMonstro[3] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[3] = inimigo2.precoItemDropado;
                    } else if (mochila.item[4] == null) {
                        mochila.itemMonstro[4] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[4] = inimigo2.precoItemDropado;
                    } else if (mochila.item[5] == null) {
                        mochila.itemMonstro[5] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[5] = inimigo2.precoItemDropado;
                    } else if (mochila.item[6] == null) {
                        mochila.itemMonstro[6] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[6] = inimigo2.precoItemDropado;
                    } else if (mochila.item[7] == null) {
                        mochila.itemMonstro[7] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[7] = inimigo2.precoItemDropado;
                    } else if (mochila.item[8] == null) {
                        mochila.itemMonstro[8] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[8] = inimigo2.precoItemDropado;
                    } else if (mochila.item[9] == null) {
                        mochila.itemMonstro[9] = inimigo2.itemDropado;
                        mochila.precoItemMonstro[9] = inimigo2.precoItemDropado;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem espaço na mochila, por isso não foi possível guardar o " + inimigo2.itemDropado + "!");
                    }
                }
            } else if (escolha2 == 2) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (escolha == 3) {
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Você quer batalhar contra " + inimigo3.nome + "?");
            System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
            int escolha2 = sc.nextInt();
            System.out.println("BATALHANDO...");
            Thread.sleep(60000);
            if (escolha2 == 1) {
                if (((inimigo3.vida + inimigo3.mana) + (inimigo3.ataque * 2) + (inimigo3.defesa * 2) + (inimigo3.agilidade * 2)) >= ((personagem.getVida() + personagem.getMana()) + (personagem.getAtaque() * 2) + (personagem.getDefesa() * 2) + (personagem.getAgilidade() * 2))) {
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Infelizmente sua força não foi suficiente...");
                    System.out.println("Você perdeu a batalha.");
                    System.out.println("Agora você precisa ir à enfermaria para se recuperar.");
                    System.out.println("Descanse! Não faça nenhum esforço durante os próximos 5 minutos!");
                    Thread.sleep(300000);
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Parabéns! Você venceu a batalha contra o(a) " + inimigo3.nome + "!");
                    System.out.println("Você ganhou " + inimigo3.xpAdquirida + " de experiência!");
                    System.out.println("Você conseguiu " + inimigo3.itemDropado + " do " + inimigo3.nome + "!");
                    personagem.setExperiencia(personagem.getExperiencia() + inimigo3.xpAdquirida);
                    if (mochila.item[0] == null) {
                        mochila.itemMonstro[0] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[0] = inimigo3.precoItemDropado;
                    } else if (mochila.item[1] == null) {
                        mochila.itemMonstro[1] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[1] = inimigo3.precoItemDropado;
                    } else if (mochila.item[2] == null) {
                        mochila.itemMonstro[2] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[2] = inimigo3.precoItemDropado;
                    } else if (mochila.item[3] == null) {
                        mochila.itemMonstro[3] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[3] = inimigo3.precoItemDropado;
                    } else if (mochila.item[4] == null) {
                        mochila.itemMonstro[4] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[4] = inimigo3.precoItemDropado;
                    } else if (mochila.item[5] == null) {
                        mochila.itemMonstro[5] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[5] = inimigo3.precoItemDropado;
                    } else if (mochila.item[6] == null) {
                        mochila.itemMonstro[6] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[6] = inimigo3.precoItemDropado;
                    } else if (mochila.item[7] == null) {
                        mochila.itemMonstro[7] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[7] = inimigo3.precoItemDropado;
                    } else if (mochila.item[8] == null) {
                        mochila.itemMonstro[8] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[8] = inimigo3.precoItemDropado;
                    } else if (mochila.item[9] == null) {
                        mochila.itemMonstro[9] = inimigo3.itemDropado;
                        mochila.precoItemMonstro[9] = inimigo3.precoItemDropado;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem espaço na mochila, por isso não foi possível guardar o " + inimigo3.itemDropado + "!");
                    }
                }
            } else if (escolha2 == 2) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (escolha == 4) {
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Você quer batalhar contra " + inimigo4.nome + "?");
            System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
            int escolha2 = sc.nextInt();
            System.out.println("BATALHANDO...");
            Thread.sleep(60000);
            if (escolha2 == 1) {
                if (((inimigo4.vida + inimigo4.mana) + (inimigo4.ataque * 2) + (inimigo4.defesa * 2) + (inimigo4.agilidade * 2)) >= ((personagem.getVida() + personagem.getMana()) + (personagem.getAtaque() * 2) + (personagem.getDefesa() * 2) + (personagem.getAgilidade() * 2))) {
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Infelizmente sua força não foi suficiente...");
                    System.out.println("Você perdeu a batalha.");
                    System.out.println("Agora você precisa ir à enfermaria para se recuperar.");
                    System.out.println("Descanse! Não faça nenhum esforço durante os próximos 5 minutos!");
                    Thread.sleep(300000);
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Parabéns! Você venceu a batalha contra o(a) " + inimigo4.nome + "!");
                    System.out.println("Você ganhou " + inimigo4.xpAdquirida + " de experiência!");
                    System.out.println("Você conseguiu " + inimigo4.itemDropado + " do " + inimigo4.nome + "!");
                    personagem.setExperiencia(personagem.getExperiencia() + inimigo4.xpAdquirida);
                    if (mochila.item[0] == null) {
                        mochila.itemMonstro[0] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[0] = inimigo4.precoItemDropado;
                    } else if (mochila.item[1] == null) {
                        mochila.itemMonstro[1] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[1] = inimigo4.precoItemDropado;
                    } else if (mochila.item[2] == null) {
                        mochila.itemMonstro[2] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[2] = inimigo4.precoItemDropado;
                    } else if (mochila.item[3] == null) {
                        mochila.itemMonstro[3] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[3] = inimigo4.precoItemDropado;
                    } else if (mochila.item[4] == null) {
                        mochila.itemMonstro[4] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[4] = inimigo4.precoItemDropado;
                    } else if (mochila.item[5] == null) {
                        mochila.itemMonstro[5] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[5] = inimigo4.precoItemDropado;
                    } else if (mochila.item[6] == null) {
                        mochila.itemMonstro[6] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[6] = inimigo4.precoItemDropado;
                    } else if (mochila.item[7] == null) {
                        mochila.itemMonstro[7] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[7] = inimigo4.precoItemDropado;
                    } else if (mochila.item[8] == null) {
                        mochila.itemMonstro[8] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[8] = inimigo4.precoItemDropado;
                    } else if (mochila.item[9] == null) {
                        mochila.itemMonstro[9] = inimigo4.itemDropado;
                        mochila.precoItemMonstro[9] = inimigo4.precoItemDropado;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem espaço na mochila, por isso não foi possível guardar o " + inimigo4.itemDropado + "!");
                    }
                }
            } else if (escolha2 == 2) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (escolha == 5) {
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Você quer batalhar contra " + inimigo5.nome + "?");
            System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
            int escolha2 = sc.nextInt();
            System.out.println("BATALHANDO...");
            Thread.sleep(60000);
            if (escolha2 == 1) {
                if (((inimigo5.vida + inimigo5.mana) + (inimigo5.ataque * 2) + (inimigo5.defesa * 2) + (inimigo5.agilidade * 2)) >= ((personagem.getVida() + personagem.getMana()) + (personagem.getAtaque() * 2) + (personagem.getDefesa() * 2) + (personagem.getAgilidade() * 2))) {
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Infelizmente sua força não foi suficiente...");
                    System.out.println("Você perdeu a batalha.");
                    System.out.println("Agora você precisa ir à enfermaria para se recuperar.");
                    System.out.println("Descanse! Não faça nenhum esforço durante os próximos 5 minutos!");
                    Thread.sleep(300000);
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Parabéns! Você venceu a batalha contra o(a) " + inimigo5.nome + "!");
                    System.out.println("Você ganhou " + inimigo5.xpAdquirida + " de experiência!");
                    System.out.println("Você conseguiu " + inimigo5.itemDropado + " do " + inimigo5.nome + "!");
                    personagem.setExperiencia(personagem.getExperiencia() + inimigo5.xpAdquirida);
                    if (mochila.item[0] == null) {
                        mochila.itemMonstro[0] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[0] = inimigo5.precoItemDropado;
                    } else if (mochila.item[1] == null) {
                        mochila.itemMonstro[1] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[1] = inimigo5.precoItemDropado;
                    } else if (mochila.item[2] == null) {
                        mochila.itemMonstro[2] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[2] = inimigo5.precoItemDropado;
                    } else if (mochila.item[3] == null) {
                        mochila.itemMonstro[3] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[3] = inimigo5.precoItemDropado;
                    } else if (mochila.item[4] == null) {
                        mochila.itemMonstro[4] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[4] = inimigo5.precoItemDropado;
                    } else if (mochila.item[5] == null) {
                        mochila.itemMonstro[5] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[5] = inimigo5.precoItemDropado;
                    } else if (mochila.item[6] == null) {
                        mochila.itemMonstro[6] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[6] = inimigo5.precoItemDropado;
                    } else if (mochila.item[7] == null) {
                        mochila.itemMonstro[7] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[7] = inimigo5.precoItemDropado;
                    } else if (mochila.item[8] == null) {
                        mochila.itemMonstro[8] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[8] = inimigo5.precoItemDropado;
                    } else if (mochila.item[9] == null) {
                        mochila.itemMonstro[9] = inimigo5.itemDropado;
                        mochila.precoItemMonstro[9] = inimigo5.precoItemDropado;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem espaço na mochila, por isso não foi possível guardar o " + inimigo5.itemDropado + "!");
                    }
                }
            } else if (escolha2 == 2) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else if (escolha == 6) {
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Você quer batalhar contra " + inimigo6.nome + "?");
            System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
            int escolha2 = sc.nextInt();
            System.out.println("BATALHANDO...");
            Thread.sleep(60000);
            if (escolha2 == 1) {
                if (((inimigo6.vida + inimigo6.mana) + (inimigo6.ataque * 2) + (inimigo6.defesa * 2) + (inimigo6.agilidade * 2)) >= ((personagem.getVida() + personagem.getMana()) + (personagem.getAtaque() * 2) + (personagem.getDefesa() * 2) + (personagem.getAgilidade() * 2))) {
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Infelizmente sua força não foi suficiente...");
                    System.out.println("Você perdeu a batalha.");
                    System.out.println("Agora você precisa ir à enfermaria para se recuperar.");
                    System.out.println("Descanse! Não faça nenhum esforço durante os próximos 5 minutos!");
                    Thread.sleep(300000);
                } else {
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    System.out.println("Parabéns! Você venceu a batalha contra o(a) " + inimigo6.nome + "!");
                    System.out.println("Você ganhou " + inimigo6.xpAdquirida + " de experiência!");
                    System.out.println("Você conseguiu " + inimigo6.itemDropado + " do " + inimigo6.nome + "!");
                    personagem.setExperiencia(personagem.getExperiencia() + inimigo6.xpAdquirida);
                    if (mochila.item[0] == null) {
                        mochila.itemMonstro[0] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[0] = inimigo6.precoItemDropado;
                    } else if (mochila.item[1] == null) {
                        mochila.itemMonstro[1] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[1] = inimigo6.precoItemDropado;
                    } else if (mochila.item[2] == null) {
                        mochila.itemMonstro[2] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[2] = inimigo6.precoItemDropado;
                    } else if (mochila.item[3] == null) {
                        mochila.itemMonstro[3] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[3] = inimigo6.precoItemDropado;
                    } else if (mochila.item[4] == null) {
                        mochila.itemMonstro[4] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[4] = inimigo6.precoItemDropado;
                    } else if (mochila.item[5] == null) {
                        mochila.itemMonstro[5] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[5] = inimigo6.precoItemDropado;
                    } else if (mochila.item[6] == null) {
                        mochila.itemMonstro[6] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[6] = inimigo6.precoItemDropado;
                    } else if (mochila.item[7] == null) {
                        mochila.itemMonstro[7] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[7] = inimigo6.precoItemDropado;
                    } else if (mochila.item[8] == null) {
                        mochila.itemMonstro[8] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[8] = inimigo6.precoItemDropado;
                    } else if (mochila.item[9] == null) {
                        mochila.itemMonstro[9] = inimigo6.itemDropado;
                        mochila.precoItemMonstro[9] = inimigo6.precoItemDropado;
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Você não tem espaço na mochila, por isso não foi possível guardar o " + inimigo6.itemDropado + "!");
                    }
                }
            } else if (escolha2 == 2) {

            } else {
                System.out.println("---------------------------------------------------------------------------------------------------------------------");
                System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
            }
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
        }
    }

}
