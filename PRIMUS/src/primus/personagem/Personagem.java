package primus.personagem;

import java.util.Scanner;

//Classe para os atributos do personagem e métodos como: criarPersonagem, exibirEquip, exibirStatus, subirNivel e treinar.
public class Personagem {

    //Scanner criado para ler o que o usuário digitar.
    Scanner sc = new Scanner(System.in);

    //Atributo para o nome do personagem.
    private String nome;
    //Atributo para a classe do personagem.
    private String classe;
    //Atributo para o nível do personagem, que sempre começa em 1.
    private int nivel = 1;
    //Atributo para a experiência do personagem, que sempre começa em 0 e será nescessária para elevar o nível do personagem.
    private int experiencia = 0;
    //Atributo para o dinheiro do personagem, que sempre começa em 100 e será nescessário para comprar itens, equipamentos e armas nas lojas.
    private int dinheiro = 1000;
    //Atributo para a vida do personagem.
    private int vida;
    //Atributo para a mana do personagem.
    private int mana;
    //Atributo para o ataque do personagem.
    private int ataque;
    //Atributo para a defesa do personagem.
    private int defesa;
    //Atributo para a agilidade do personagem.
    private int agilidade;
    //Atributo para a arma do personagem.
    private String arma;
    //Atributo para aumentar o ataque do personagem conforme a arma usada.
    private int armaMudarAtaque;
    //Atributo para o capacete do personagem.
    private String capacete;
    //Atributo para aumentar a defesa do personagem conforme o capacete usado.
    private int capaceteDefesa;
    //Atributo para diminuir a agilidade do personagem conforme o capacete usado.
    private int capaceteAgilidade;
    //Atributo para o peitoral do personagem.
    private String peitoral;
    //Atributo para aumentar a defesa do personagem conforme o peitoral usado.
    private int peitoralDefesa;
    //Atributo para diminuir a agilidade do personagem conforme o peitoral usado.
    private int peitoralAgilidade;
    //Atributo para a calça do personagem.
    private String calca;
    //Atributo para aumentar a defesa do personagem conforme a calça usada.
    private int calcaDefesa;
    //Atributo para diminuir a agilidade do personagem conforme a calça usada.
    private int calcaAgilidade;
    //Atributo para as botas do personagem.
    private String botas;
    //Atributo para aumentar a defesa do personagem conforme as botas usadas.
    private int botasDefesa;
    //Atributo para diminuir a agilidade do personagem conforme as botas usadas.
    private int botasAgilidade;

    //Método usado para acessar o nome do personagem.
    public String getNome() {
        return nome;
    }

    //Método usado para definir o nome do personagem.
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método usado para acessar a classe do personagem.
    public String getClasse() {
        return classe;
    }

    //Método usado para definir a classe do personagem.
    public void setClasse(String classe) {
        this.classe = classe;
    }

    //Método usado para acessar o nível do personagem.
    public int getNivel() {
        return nivel;
    }

    //Método usado para definir o nível do personagem.
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //Método usado para acessar a experiência do personagem.
    public int getExperiencia() {
        return experiencia;
    }

    //Método usado para definir a experiência do personagem.
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    //Método usado para acessar o dinheiro do personagem.
    public int getDinheiro() {
        return dinheiro;
    }

    //Método usado para definir o dinheiro do personagem.
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    //Método usado para acessar a vida do personagem.
    public int getVida() {
        return vida;
    }

    //Método usado para definir a vida do personagem.
    public void setVida(int vida) {
        this.vida = vida;
    }

    //Método usado para acessar a mana do personagem.
    public int getMana() {
        return mana;
    }

    //Método usado para definir a mana do personagem.
    public void setMana(int mana) {
        this.mana = mana;
    }

    //Método usado para acessar o ataque do personagem.
    public int getAtaque() {
        return ataque;
    }

    //Método usado para definir o ataque do personagem.
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    //Método usado para acessar a defesa do personagem.
    public int getDefesa() {
        return defesa;
    }

    //Método usado para definir a defesa do personagem.
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    //Método usado para acessar a agilidade do personagem.
    public int getAgilidade() {
        return agilidade;
    }

    //Método usado para definir a agilidade do personagem.
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    //Método usado para acessar a arma do personagem.
    public String getArma() {
        return arma;
    }

    //Método usado para definir a arma do personagem.
    public void setArma(String arma) {
        this.arma = arma;
    }

    //Método usado para acessar o capacete do personagem.
    public String getCapacete() {
        return capacete;
    }

    //Método usado para definir o capacete do personagem.
    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    //Método usado para acessar o peitoral do personagem.
    public String getPeitoral() {
        return peitoral;
    }

    //Método usado para definir o peitoral do personagem.
    public void setPeitoral(String peitoral) {
        this.peitoral = peitoral;
    }

    //Método usado para acessar a calça do personagem.
    public String getCalca() {
        return calca;
    }

    //Método usado para definir a calça do personagem.
    public void setCalca(String calca) {
        this.calca = calca;
    }

    //Método usado para acessar as botas do personagem.
    public String getBotas() {
        return botas;
    }

    //Método usado para definir as botas do personagem.
    public void setBotas(String botas) {
        this.botas = botas;
    }

    //Método usado para acessar o aumento na defesa conforme o capacete do personagem.
    public int getCapaceteDefesa() {
        return capaceteDefesa;
    }

    //Método usado para definir o aumento na defesa conforme o capacete do personagem.
    public void setCapaceteDefesa(int capaceteDefesa) {
        this.capaceteDefesa = capaceteDefesa;
    }

    //Método usado para acessar a diminuição da agilidade conforme o capacete do personagem.
    public int getCapaceteAgilidade() {
        return capaceteAgilidade;
    }

    //Método usado para definir a diminuição da agilidade conforme o capacete do personagem.
    public void setCapaceteAgilidade(int capaceteAgilidade) {
        this.capaceteAgilidade = capaceteAgilidade;
    }

    //Método usado para acessar o aumento na defesa conforme o peitoral do personagem.
    public int getPeitoralDefesa() {
        return peitoralDefesa;
    }

    //Método usado para definir o aumento na defesa conforme o peitoral do personagem.
    public void setPeitoralDefesa(int peitoralDefesa) {
        this.peitoralDefesa = peitoralDefesa;
    }

    //Método usado para acessar a diminuição da agilidade conforme o peitoral do personagem.
    public int getPeitoralAgilidade() {
        return peitoralAgilidade;
    }

    //Método usado para definir a diminuição da agilidade conforme o peitoral do personagem.
    public void setPeitoralAgilidade(int peitoralAgilidade) {
        this.peitoralAgilidade = peitoralAgilidade;
    }

    //Método usado para acessar o aumento na defesa conforme a calça do personagem.
    public int getCalcaDefesa() {
        return calcaDefesa;
    }

    //Método usado para definir o aumento na defesa conforme a calça do personagem.
    public void setCalcaDefesa(int calcaDefesa) {
        this.calcaDefesa = calcaDefesa;
    }

    //Método usado para acessar a diminuição da agilidade conforme a calça do personagem.
    public int getCalcaAgilidade() {
        return calcaAgilidade;
    }

    //Método usado para definir a diminuição da agilidade conforme a calça do personagem.
    public void setCalcaAgilidade(int calcaAgilidade) {
        this.calcaAgilidade = calcaAgilidade;
    }

    //Método usado para acessar o aumento na defesa conforme as botas do personagem.
    public int getBotasDefesa() {
        return botasDefesa;
    }

    //Método usado para definir o aumento na defesa conforme as botas do personagem.
    public void setBotasDefesa(int botasDefesa) {
        this.botasDefesa = botasDefesa;
    }

    //Método usado para definir o aumento na defesa conforme as botas do personagem.
    public int getBotasAgilidade() {
        return botasAgilidade;
    }

    //Método usado para definir a diminuição da agilidade conforme as botas do personagem.
    public void setBotasAgilidade(int botasAgilidade) {
        this.botasAgilidade = botasAgilidade;
    }

    //Método usado para acessar o aumento do ataque conforme a arma do personagem.
    public int getArmaMudarAtaque() {
        return armaMudarAtaque;
    }

    //Método usado para definir o aumento do ataque conforme a arma do personagem.
    public void setArmaMudarAtaque(int armaMudarAtaque) {
        this.armaMudarAtaque = armaMudarAtaque;
    }

    //Construtor usado para criar um personagem vazio.
    public Personagem() {

    }

    //Construtor usado para criar um personagem inicializando todos os atributos.
    public Personagem(String nome, String classe, int nivel, int experiencia, int dinheiro, int vida, int mana, int ataque, int defesa, int agilidade, String arma, String capacete, String peitoral, String calca, String botas) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.dinheiro = dinheiro;
        this.vida = vida;
        this.mana = mana;
        this.ataque = ataque;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.arma = arma;
        this.capacete = capacete;
        this.peitoral = peitoral;
        this.calca = calca;
        this.botas = botas;
    }

    //Método usado para a criação do personagem; adicionando seu nome e classe; 
    //além dos atributos vida, mana, ataque, defesa e agilidade que são difetentes para cada classe.
    public void criarPersonagem() throws InterruptedException {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Olá! Eu sou a CREATOR: Criadora Rápida, Eficiente, Agradável, Talentosa, Organizada e Radiante.");
        System.out.println("Vamos criar o seu personagem!");
        System.out.println("Primeiro me diga o seu nome:");
        String n = sc.nextLine();
        this.nome = n;
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(this.nome + ", agora você precisa escolher uma classe...");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("As opções são as seguintes:");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("GUERREIRO: Seu atributo principal é a vida.");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("MAGO: Seu atributo principal é a mana.");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("ESPADACHIM: Seu atributo principal é o ataque.");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("PALADINO: Seu atributo principal é a defesa.");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("NINJA: Seu atributo principal é a agilidade.");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Digite 1 para escolher a classe Guerreiro;");
        System.out.println("Digite 2 para escolher a classe Mago;");
        System.out.println("Digite 3 para escolher a classe Espadachim;");
        System.out.println("Digite 4 para escolher a classe Paladino;");
        System.out.println("Digite 5 para escolher a classe Ninja.");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            this.classe = "Guerreiro";
            this.vida = 20;
            this.mana = 10;
            this.ataque = 5;
            this.defesa = 5;
            this.agilidade = 5;
        } else if (escolha == 2) {
            this.classe = "Mago";
            this.vida = 10;
            this.mana = 20;
            this.ataque = 5;
            this.defesa = 5;
            this.agilidade = 5;
        } else if (escolha == 3) {
            this.classe = "Espadachim";
            this.vida = 10;
            this.mana = 10;
            this.ataque = 10;
            this.defesa = 5;
            this.agilidade = 5;
        } else if (escolha == 4) {
            this.classe = "Paladino";
            this.vida = 10;
            this.mana = 10;
            this.ataque = 5;
            this.defesa = 10;
            this.agilidade = 5;
        } else if (escolha == 5) {
            this.classe = "Ninja";
            this.vida = 10;
            this.mana = 10;
            this.ataque = 5;
            this.defesa = 5;
            this.agilidade = 10;
        } else {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Ótimo! " + this.nome + ", sua classe será " + this.classe + "!");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Seu personagem foi criado!");
        System.out.println("Agora você pode iniciar sua aventura!");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Link Start!.");
        Thread.sleep(5000);
    }

    //Método usado para treinar o personagem.
    //O treinamenro demorará, em minutos, a quantidade de nível do personagem;
    //E ao fim do treinamento o personagem ganhará 25 vezes seu nível, em experiência.
    public void treinar() throws InterruptedException {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Você quer treinar? Você demorará " + this.nivel + " minuto(s) para concluir o treinamento.");
        System.out.println("Digite 1 para confirmar ou 2 para cancelar:");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("TREINANDO...");
            int contador = this.nivel * 60;
            while (contador >= 0) {
                Thread.sleep(1000);
                contador--;
            }
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("Parabéns! Você concluiu o treinamento.");
            this.experiencia = this.experiencia + (this.nivel * 25);
            System.out.println("Você ganhou " + this.nivel * 25 + " de experiência!");
        } else if (escolha == 2) {

        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("ESSA NÃO É UMA OPÇÃO VÁLIDA!");
        }
    }

    //Método usado para aumentar o nível do personagem.
    //Se a experiência do personagem for maior do que seu nível multiplicado por 100, multiplicado por seu nível novamente; o personagem ganhará mais 1 de nível.
    //Se não, será mostrada uma mensagem avisando que a experiência atual do personagem não é suficiente para aumentar seu nível; e será mostrado quanta experiência ainda falta.
    public void subirNivel() {
        if (this.experiencia >= (this.nivel * 100) * this.nivel) {
            this.nivel++;
            if (this.classe == "Guerreiro") {
                this.vida = this.vida + 20;
                this.mana = this.mana + 10;
                this.ataque = this.ataque + 5;
                this.defesa = this.defesa + 5;
                this.agilidade = this.agilidade + 5;
            } else if (this.classe == "Mago") {
                this.vida = this.vida + 10;
                this.mana = this.mana + 20;
                this.ataque = this.ataque + 5;
                this.defesa = this.defesa + 5;
                this.agilidade = this.agilidade + 5;
            } else if (this.classe == "Espadachim") {
                this.vida = this.vida + 10;
                this.mana = this.mana + 10;
                this.ataque = this.ataque + 10;
                this.defesa = this.defesa + 5;
                this.agilidade = this.agilidade + 5;
            } else if (this.classe == "Paladino") {
                this.vida = this.vida + 10;
                this.mana = this.mana + 10;
                this.ataque = this.ataque + 5;
                this.defesa = this.defesa + 10;
                this.agilidade = this.agilidade + 5;
            } else if (this.classe == "Ninja") {
                this.vida = this.vida + 10;
                this.mana = this.mana + 10;
                this.ataque = this.ataque + 5;
                this.defesa = this.defesa + 5;
                this.agilidade = this.agilidade + 10;
            }
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("Parabéns! Você evoluiu para o nível " + this.nivel + "!");
        } else {
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("Você não tem experiência suficiente!");
            System.out.println("Você precisa de mais " + (((this.nivel * 100) * this.nivel) - this.experiencia) + "");
        }
    }

    //Método usado para exibir todos os status do personagem; como nome, classe, nível, experiência, dinheiro, vida, mana, ataque, defesa e agilidade;
    //além de seu nível de poder, que é calculado somando sua vida e mana e somando com: ataque multiplicado por 2, defesa multiplicada por 2 e agilidade multiplicada por 2.
    public void exibirStatus() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println(this.nome);
        System.out.println("");
        System.out.println("CLASSE: " + this.classe);
        System.out.println("NÍVEL: " + this.nivel);
        System.out.println("EXPERIÊNCIA: " + this.experiencia);
        System.out.println("DINHEIRO: " + this.dinheiro);
        System.out.println("VIDA: " + this.vida);
        System.out.println("MANA: " + this.mana);
        System.out.println("ATAQUE: " + this.ataque);
        System.out.println("DEFESA: " + this.defesa);
        System.out.println("AGILIDADE: " + this.agilidade);
        System.out.println("NÍVEL DE PODER: " + ((this.vida + this.mana) + (this.ataque * 2) + (this.defesa * 2) + (this.agilidade * 2)));
    }

    //Método usado para exibir todos os equipamentos já equipados do personagem; como arma, capacete, peitoral, calça e botas.
    public void exibirEquip() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("EQUIPAMENTO");
        System.out.println("");
        System.out.println("ARMA: " + this.arma);
        System.out.println("CAPACETE: " + this.capacete);
        System.out.println("PEITORAL: " + this.peitoral);
        System.out.println("CALÇA: " + this.calca);
        System.out.println("BOTAS: " + this.botas);
    }

}
