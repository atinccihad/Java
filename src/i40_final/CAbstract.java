package i40_final;

public abstract class CAbstract {

    void toplama() {
        System.out.println("Bu method toplama yapr");
    }

    abstract void carpma();

    abstract void bolme();

    void cikarma() {
        System.out.println("Bu method cikarma yapr");
    }


    /*
    bir methodun basina abstract yazarsaniz
    bu methodun child class'lar icin bir standart oldugunu declare ederiz
    ve method body'sine ihtiyac kalmaz
     */
}
