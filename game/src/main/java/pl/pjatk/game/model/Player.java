package pl.pjatk.game.model;

public class Player {

    private int id;
    private String nickname;
    private int health;
    private int mana;
    private int attack;

    public Player() {
    }

    public Player(int id, String nickname, int health, int mana, int attack) {
        this.id = id;
        this.nickname = nickname;
        this.health = health;
        this.mana = mana;
        this.attack = attack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
