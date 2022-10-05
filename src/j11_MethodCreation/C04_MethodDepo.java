package j11_MethodCreation;

public class C04_MethodDepo {
    //main method olmayacak - malzeme tasıyan römork

// her classta main method mecburiyeti yoktur belirli aksiyonlara özel class olabilir

    public static void gecmeNotu(int not){
        if(not>=85){
            System.out.println("agam congrats");
        } else if (not>=70) {
            System.out.println("good");
        } else if (not>=60) {
            System.out.println("normal");
        } else if (not>=45) {
            System.out.println("not bad");
        } else System.out.println("totally bad");

        }
    }






















