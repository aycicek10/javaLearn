package j33_Interface;

public interface dısDonanım {
    public void kapı();// abs method
    void kaporta();// abs method

    String renk="gırmızı";// public static final variable

    public default String sisLamp(){// default concrete method
        return "sisli havada dikkat";
    }

    static void agaMethodu(){
        System.out.println("agam sensiz olamaaz");
    }

    static void anten(){
        System.out.println("agam yine antin kuntin islerdesin");
    }

//    dısDonanım obj = new dısDonanım();// obj olamaz
/*
    public static void main(String[] args) { // *** bad practice *** projede tek bir main method ve main class kullanılmalı
        System.out.println("renk = " + renk);
        agaMethodu();// static method call edildi
    }

 */




}
