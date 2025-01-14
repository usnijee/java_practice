package lecture.interfacee;

// Practice
// 아래 GreenOrc 클래스와 NPCSystem, UserSystem 인터페이스를 이용하여
// OrkNPC1, OrkUser1 클래스를 만들어보세요.


abstract class GreenOrc {
    public final String SKIN_COLOR = "녹색";
    public int health;
    public int attackDamage;
    public int defense;

    public abstract void setHealth();
    public abstract void setDamage();
    public abstract void setDefense();
}

interface NPCSystem {
    public abstract void conversationSystem();
    public abstract void questionSystem();
}

interface UserSystem {
    public abstract void partySystem();
    public abstract void tradeSystem();
}

// OrkNPC1 클래스
class OrkNPC1 extends GreenOrc implements NPCSystem, UserSystem {

    @Override
    public void setHealth() {
        System.out.println("health!");
        this.health = 100;
    }

    @Override
    public void setDamage() {
        System.out.println("damage!");
        this.attackDamage = 20;
    }

    @Override
    public void setDefense() {
        System.out.println("defense!");
        this.defense = 70;
    }

    @Override
    public void conversationSystem() {
        System.out.println("conversation!");
    }

    @Override
    public void questionSystem() {
        System.out.println("question!");
    }

    @Override
    public void partySystem() {
        System.out.println("partySystem!");
    }

    @Override
    public void tradeSystem() {

    }
}


public class Practice {
    public static void main(String[] args) {
        // Test code
        // No test code
    }
}
